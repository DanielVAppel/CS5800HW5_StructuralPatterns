import static org.junit.jupiter.api.Assertions.*;

import org.CS5800.*;
import org.junit.jupiter.api.Test;

class OrderTest {

    @Test
    void testCalculateTotalCost() {
        Order order = new Order();

        FoodItem burger = new BaseFoodItem("Burger", 5.0);
        burger = new Cheese(burger);
        order.addFoodItem(burger);

        FoodItem fries = new BaseFoodItem("Fries", 2.5);
        fries = new Bacon(fries);
        order.addFoodItem(fries);


        assertEquals(10.0, order.calculateTotalCost(), "The total cost of the order should be $9.0");
    }
}
