package org.CS5800;

public class RestaurantDriver {
    public static void main(String[] args) {
        // Create base food items
        FoodItem burger = new BaseFoodItem("Burger", 5.0);
        FoodItem fries = new BaseFoodItem("Fries", 2.5);

        // Add toppings
        burger = new Cheese(burger); // Burger with Cheese
        burger = new Bacon(burger); // Burger with Cheese and Bacon

        fries = new Cheese(fries); // Fries with Cheese

        // Create an order and add items
        Order order = new Order();
        order.addFoodItem(burger);
        order.addFoodItem(fries);

        // Calculate total before discount
        double totalCost = order.calculateTotalCost();
        System.out.println("Total Cost (before discount): $" + totalCost);

        // Apply loyalty discount
        LoyaltyDiscount discount = new LoyaltyDiscount();
        double finalCost = discount.applyDiscount(totalCost, "gold");
        System.out.println("Total Cost (after gold discount): $" + finalCost);
    }
}
