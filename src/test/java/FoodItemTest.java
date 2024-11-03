import static org.junit.jupiter.api.Assertions.*;

import org.CS5800.Bacon;
import org.CS5800.BaseFoodItem;
import org.CS5800.Cheese;
import org.CS5800.FoodItem;
import org.junit.jupiter.api.Test;

class FoodItemTest {

    @Test
    void testBaseFoodItemCost() {
        FoodItem burger = new BaseFoodItem("Burger", 5.0);
        assertEquals(5.0, burger.getCost(), "The base price of the burger should be $5.0");
    }

    @Test
    void testCheeseToppingCost() {
        FoodItem burger = new BaseFoodItem("Burger", 5.0);
        burger = new Cheese(burger);
        assertEquals(6.0, burger.getCost(), "The cost of burger with cheese should be $6.0");
    }

    @Test
    void testMultipleToppingsCost() {
        FoodItem burger = new BaseFoodItem("Burger", 5.0);
        burger = new Cheese(burger);
        burger = new Bacon(burger);
        assertEquals(7.5, burger.getCost(), "The cost of burger with cheese and bacon should be $7.5");
    }
}

