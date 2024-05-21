import org.junit.jupiter.api.Test;
import com.cppfooddelivery.abstractfactory.DietPlan;
import com.cppfooddelivery.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    Customer customer = new Customer("Enzo Ferarri", "123 Temple Ave.", "Los Angeles County", DietPlan.NO_RESTRICTION);

    @Test
    void testDriverName() {
        String expected = "Enzo Ferarri";
        String actual = customer.getName();
        assertEquals(expected, actual);
    }

    @Test
    void testDriverAddress() {
        String expected = "123 Temple Ave.";
        String actual = customer.getAddress();
        assertEquals(expected, actual);
    }

    @Test
    void testDriverCounty() {
        String expected = "Los Angeles County";
        String actual = customer.getCounty();
        assertEquals(expected, actual);
    }

    @Test
    void testDriverShift() {
        DietPlan expected = DietPlan.NO_RESTRICTION;
        DietPlan actual = customer.getDietplan();
        assertEquals(expected, actual);
    }

}
