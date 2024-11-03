import static org.junit.jupiter.api.Assertions.*;

import org.CS5800.LoyaltyDiscount;
import org.junit.jupiter.api.Test;

class LoyaltyDiscountTest {

    @Test
    void testGoldDiscount() {
        LoyaltyDiscount discount = new LoyaltyDiscount();
        double finalCost = discount.applyDiscount(100.0, "gold");
        assertEquals(80.0, finalCost, "The final cost with gold discount should be $80.0");
    }

    @Test
    void testNoDiscount() {
        LoyaltyDiscount discount = new LoyaltyDiscount();
        double finalCost = discount.applyDiscount(100.0, "none");
        assertEquals(100.0, finalCost, "The final cost with no discount should be $100.0");
    }
}
