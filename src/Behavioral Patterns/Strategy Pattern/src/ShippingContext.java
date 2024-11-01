// ShippingContext.java
// Class to use different shipping strategies.


class ShippingContext {
    private ShippingStrategy strategy;

    public void setShippingStrategy(ShippingStrategy strategy) { // Set the strategy
        this.strategy = strategy; // Update strategy
    }

    public double calculateShipping(double weight) {
        return strategy.calculateShippingCost(weight);
    }
}
