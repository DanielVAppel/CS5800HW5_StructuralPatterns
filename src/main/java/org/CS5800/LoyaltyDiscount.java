package org.CS5800;

public class LoyaltyDiscount {
    public double applyDiscount(double totalCost, String loyaltyStatus) {
        double discount = switch (loyaltyStatus.toLowerCase()) {
            case "gold" -> 0.20; // 20% discount for gold members
            case "silver" -> 0.10; // 10% discount for silver members
            case "bronze" -> 0.05; // 5% discount for bronze members
            default -> 0.0; // No discount for non-loyalty members
        };
        return totalCost * (1 - discount);
    }
}
