// PaymentProcessor.java
// Class that handles the payment process.
import java.util.Scanner; // Import Scanner for user input

class PaymentProcessor {
    public static void main(String[] args) { // Main method
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Pay with Credit Card"); // credit card
            System.out.println("2. Pay with PayPal"); // PayPal
            System.out.println("3. Exit"); // exit
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your card number: ");
                    String cardNumber = scanner.nextLine();
                    System.out.print("Enter amount to pay: ");
                    double amount = scanner.nextDouble();
                    Payment creditCardPayment = new CreditCard(cardNumber);
                    creditCardPayment.pay(amount);
                    break;
                case 2:
                    System.out.print("Enter your PayPal email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter amount to pay: ");
                    amount = scanner.nextDouble();
                    Payment payPalPayment = new PayPalAdapter(new PayPal(email));
                    payPalPayment.pay(amount);
                    break;
                case 3:
                    running = false; // Exit the loop
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again."); // Handle invalid input
                    break;
            }
        }
        scanner.close();
    }
}
