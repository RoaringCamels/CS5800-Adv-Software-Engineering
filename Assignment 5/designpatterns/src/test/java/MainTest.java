import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.Burger;
import com.example.Cheese;
import com.example.CustomerOrder;
import com.example.FoodItem;
import com.example.Fries;
import com.example.LoyaltyStatus;

public class MainTest {

    @Test
    public void testBurgerWithCheese() {
        FoodItem burger = new Burger();
        FoodItem burgerWithCheese = new Cheese(burger);

        assertEquals(10.5, burgerWithCheese.getPrice(), 0.01);
        assertEquals("Burger with Cheese", burgerWithCheese.getDescription());
    }

    @Test
    public void testFriesWithCheese() {
        FoodItem fries = new Fries();
        FoodItem friesWithCheese = new Cheese(fries);

        assertEquals(4.5, friesWithCheese.getPrice(), 0.01);
        assertEquals("Fries with Cheese", friesWithCheese.getDescription());
    }

    @Test
    public void testCustomerOrderTotalCost() {
        FoodItem burger = new Burger();
        FoodItem fries = new Fries();

        CustomerOrder order = new CustomerOrder();
        order.addItem(burger);
        order.addItem(fries);

        assertEquals(14.0, order.getTotalCost(), 0.01);
    }

    @Test
    public void testLoyaltyStatusDiscount() {
        LoyaltyStatus status = new LoyaltyStatus();

        // Test with loyal customer
        double discountedCostForLoyal = status.applyDiscount(100.0, true);
        assertEquals(90.0, discountedCostForLoyal, 0.01);

        // Test with non-loyal customer
        double discountedCostForNonLoyal = status.applyDiscount(100.0, false);
        assertEquals(100.0, discountedCostForNonLoyal, 0.01);
    }
}

