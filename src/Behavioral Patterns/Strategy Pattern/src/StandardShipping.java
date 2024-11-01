// StandardShipping.java
// Class for standard shipping strategy.


class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) { // Calculate shipping cost
        return weight * 1.0; // Standard rate
    }
}
