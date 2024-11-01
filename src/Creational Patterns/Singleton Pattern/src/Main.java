import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Laptop Company Console!");
        System.out.print("Enter client name: ");
        String clientName = scanner.nextLine();

        Client client = new Client(clientName);

        System.out.print("Choose laptop model (Dell / HP / Lenovo): ");
        String model = scanner.nextLine();

        LaptopInventory inventory = LaptopInventory.getInstance();
        Laptop laptop = inventory.getLaptop(model);

        if (laptop != null) {
            client.purchaseLaptop(laptop);
            System.out.println(client.getName() + " has paid $" + laptop.getPrice() + " and purchased the " + laptop.getModel() + ".");
        } else {
            System.out.println("Model unavailable.");
        }
    }
}


// This is the entry point of the application where the user interacts with the system.
// It allows clients to select a laptop model and processes the purchase.

//The Singleton Pattern ensures that a class has only one instance.
// In this laptop inventory project, i used this pattern to manage the LaptopInventory class

// Amina Tuzelova SE-2303


