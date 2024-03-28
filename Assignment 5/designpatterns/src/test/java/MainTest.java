import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.customer.CustomerOrder;
import com.example.customer.LoyaltyStatus;
import com.example.customer.fooditems.Burger;
import com.example.customer.fooditems.FoodItem;
import com.example.customer.fooditems.Fries;
import com.example.customer.fooditems.toppings.Cheese;

public class MainTest {

    @Test
    public void testFoodItemCost() {
        FoodItem burger = new Burger();
        assertEquals(10.0, burger.getPrice(), 0.001);

        FoodItem fries = new Fries();
        assertEquals(4.0, fries.getPrice(), 0.001);
    }

    @Test
    public void testToppingsCost() {
        FoodItem burger = new Burger();
        burger = new Cheese(burger);
        assertEquals(11.0, burger.getPrice(), 0.001);
    }

    @Test
    public void testOrderTotalCost() {
        CustomerOrder order = new CustomerOrder();
        FoodItem burger = new Burger();
        FoodItem fries = new Fries();
        burger = new Cheese(burger);

        order.addItem(burger);
        order.addItem(fries);

        assertEquals(15.0, order.getTotalCost(), 0.001);
    }

    @Test
    public void testDiscountCalculation() {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus();
        double totalCost = 100.0;

        // Test discount for regular customer
        assertEquals(100.0, loyaltyStatus.applyDiscount(totalCost, "REGULAR"), 0.001);

        // Test discount for gold customer
        assertEquals(90.0, loyaltyStatus.applyDiscount(totalCost, "GOLD"), 0.001);

        // Test discount for platinum customer
        assertEquals(85.0, loyaltyStatus.applyDiscount(totalCost, "PLATINUM"), 0.001);
    }
}

