import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CompleteUnitTest.class, DriverTest.class, CustomerTest.class, RestaurantTest.class})
public class CompleteUnitTest {
}