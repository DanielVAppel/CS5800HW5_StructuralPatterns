package org.CS5800;

public class BaseFoodItem implements FoodItem {
    private final String description;
    private final double basePrice;

    public BaseFoodItem(String description, double basePrice) {
        this.description = description;
        this.basePrice = basePrice;
    }

    @Override
    public double getCost() {
        return basePrice;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
