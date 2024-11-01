// CreditCard.java
// Class representing a credit card payment.
class CreditCard implements Payment {
    private String cardNumber; // Card number

    public CreditCard(String cardNumber) { // Constructor
        this.cardNumber = cardNumber; // Initialize card number
    }

    @Override
    public void pay(double amount) { // Process credit card payment
        System.out.println("Paid $" + amount + " using Credit Card: " + cardNumber);
    }
}
