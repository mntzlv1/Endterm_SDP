// OvernightShipping.java
// Class for overnight shipping strategy.
class OvernightShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) { // Calculate shipping cost
        return weight * 2.0; // Overnight rate
    }
}
