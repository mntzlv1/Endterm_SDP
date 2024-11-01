// PayPal.java
// Class representing a PayPal payment.
class PayPal {
    private String email; // PayPal email

    public PayPal(String email) { // Constructor
        this.email = email; // Initialize email
    }

    public void makePayment(double amount) { // Process PayPal payment
        System.out.println("Paid $" + amount + " using PayPal account: " + email);
    }
}
