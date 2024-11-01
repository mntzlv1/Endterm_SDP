// PayPalAdapter.java
// Adapter class to allow PayPal to be used as a Payment method.
class PayPalAdapter implements Payment {
    private PayPal payPal; // PayPal instance

    public PayPalAdapter(PayPal payPal) { // Constructor
        this.payPal = payPal; // Initialize PayPal
    }

    @Override
    public void pay(double amount) { // Use PayPal to make a payment
        payPal.makePayment(amount); // Call PayPal's makePayment method
    }
}
