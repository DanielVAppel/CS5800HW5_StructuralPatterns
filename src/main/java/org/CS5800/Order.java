package org.CS5800;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<FoodItem> foodItems = new ArrayList<>();

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public double calculateTotalCost() {
        double total = 0.0;
        for (FoodItem item : foodItems) {
            total += item.getCost();
        }
        return total;
    }
}
