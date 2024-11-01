// ExpressShipping.java
// Class for express shipping strategy.


class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) { // Calculate shipping cost
        return weight * 1.5; // Express rate
    }
}
