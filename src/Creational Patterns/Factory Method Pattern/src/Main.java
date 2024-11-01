import java.util.Scanner;

// This class is the entry point for the application to manage user databases.

public class Main {
    public static void main(String[] args) {  // Main method to run the application
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for input

        System.out.print("Choose Database (SQL / Mongo): ");
        String dbType = scanner.nextLine();

        DatabaseFactory factory = new DatabaseFactory();
        Database db = factory.createDatabase(dbType);

        if (db != null) {
            db.connect();

            boolean continueInput = true;
            while (continueInput) {
                System.out.print("Enter user name: ");
                String userName = scanner.nextLine();

                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // consume newline

                System.out.print("Enter address: ");
                String address = scanner.nextLine();

                User user = new User(userName, age, address);
                db.saveUser(user);  // Save the user to the database

                System.out.print("Add another user? (yes/no): ");
                String choice = scanner.nextLine();
                continueInput = choice.equalsIgnoreCase("yes");
            }
            System.out.println("All users have been saved.");  // Confirm all users saved
        } else {
            System.out.println("Invalid database type.");  // Handle invalid database type
        }
    }
}


//This class is the starting point where the user can choose a database type and input user information.
// It creates the database instance using the factory.

// Amina Tuzelova SE-2303