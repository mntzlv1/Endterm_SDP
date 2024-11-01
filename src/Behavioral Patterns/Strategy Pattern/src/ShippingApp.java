// ShippingApp.java
// Main class to simulate the shipping cost calculation.

import java.util.Scanner;

public class ShippingApp {
    public static void main(String[] args) { // Main method
        ShippingContext shippingContext = new ShippingContext();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose shipping method:");
            System.out.println("1. Standard Shipping");
            System.out.println("2. Express Shipping");
            System.out.println("3. Overnight Shipping");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                running = false;
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter package weight (kg): ");
            double weight = scanner.nextDouble();

            switch (choice) {
                case 1:
                    shippingContext.setShippingStrategy(new StandardShipping()); // Set standard strategy
                    break;
                case 2:
                    shippingContext.setShippingStrategy(new ExpressShipping()); // Set express strategy
                    break;
                case 3:
                    shippingContext.setShippingStrategy(new OvernightShipping()); // Set overnight strategy
                    break;
                default:
                    System.out.println("Invalid option. Please try again."); // Handle invalid input
                    continue;
            }

            double cost = shippingContext.calculateShipping(weight);
            System.out.println("Shipping cost: $" + cost);
        }
        scanner.close();
    }
}


// Amina Tuzelova SE-2303

