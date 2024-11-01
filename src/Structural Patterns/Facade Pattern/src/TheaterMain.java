// TheaterMain.java
// Main class to interact with the home theater system.
import java.util.Scanner;

public class TheaterMain {
    public static void main(String[] args) { // Main method
        Scanner scanner = new Scanner(System.in);
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(); // Create the facade

        boolean running = true;
        while (running) {
            System.out.println("1. Watch a movie");
            System.out.println("2. End the movie");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    homeTheater.watchMovie(); // Set up for watching a movie
                    break;
                case 2:
                    homeTheater.endMovie();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting..."); // Exit message
                    break;
                default:
                    System.out.println("Invalid option. Please try again."); // Handle invalid input
                    break;
            }
        }
        scanner.close();
    }
}
