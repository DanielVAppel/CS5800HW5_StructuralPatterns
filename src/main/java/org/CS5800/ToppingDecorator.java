package org.CS5800;

public abstract class ToppingDecorator implements FoodItem {
    protected final FoodItem foodItem;

    public ToppingDecorator(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription();
    }
}
