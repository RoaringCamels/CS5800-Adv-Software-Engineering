import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.cppfooddelivery.*;

public class RestaurantTest {
    OperatingHours hours = new OperatingHours(LocalTime.of(1,0), LocalTime.of(22,0));
    Menu menu = new Menu();
    Restaurant res = new Restaurant("Theater", "789 Street St.", "San Bernardino", hours, "Mexican", menu);

    @Test
    void testRestaurantName() {
        String expected = "Theater";
        String actual = res.getName();
        assertEquals(expected, actual);
    }

    @Test
    void testRestaurantAddress() {
        String expected = "789 Street St.";
        String actual = res.getAddress();
        assertEquals(expected, actual);
    }

    @Test
    void testRestaurantCounty() {
        String expected = "San Bernardino";
        String actual = res.getCounty();
        assertEquals(expected, actual);
    }

    @Test
    void testRestaurantCuisine() {
        String expected = "Mexican";
        String actual = res.getCuisine();
        assertEquals(expected, actual);
    }

}
