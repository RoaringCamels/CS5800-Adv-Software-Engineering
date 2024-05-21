import org.junit.jupiter.api.Test;

import com.cppfooddelivery.Driver;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DriverTest{
    Driver driver = new Driver("Enzo Ferarri", "123 Temple Ave.", "Los Angeles County", "1st Shift");

    @Test
    void testDriverName() {
        String expected = "Enzo Ferarri";
        String actual = driver.getName();
        assertEquals(expected, actual);
    }

    @Test
    void testDriverAddress() {
        String expected = "123 Temple Ave.";
        String actual = driver.getAddress();
        assertEquals(expected, actual);
    }

    @Test
    void testDriverCounty() {
        String expected = "Los Angeles County";
        String actual = driver.getCounty();
        assertEquals(expected, actual);
    }

    @Test
    void testDriverShift() {
        String expected = "1st Shift";
        String actual = driver.getShift();
        assertEquals(expected, actual);
    }

}