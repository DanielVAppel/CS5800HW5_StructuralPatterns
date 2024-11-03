package org.CS5800;

public class Bacon extends ToppingDecorator {
    public Bacon(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 1.5; // Bacon costs an additional $1.5
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", Bacon";
    }
}
