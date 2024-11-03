package org.CS5800;

public class Cheese extends ToppingDecorator {
    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 1.0; // Cheese costs an additional $1
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", Cheese";
    }
}