import static org.junit.Assert.*;

import org.junit.Test;

import com.vendingmachine.Snack;

public class SnackTest {
    @Test
    public void testGetName() {
        Snack snack = new Snack("Coke", 1.25, 3);
        assertEquals("Coke", snack.getName());
    }

    @Test
    public void testGetQuantity() {
        Snack snack = new Snack("Coke", 1.25, 3);
        assertEquals(3, snack.getQuantity());
    }

    @Test
    public void testReduceQuantity() {
        Snack snack = new Snack("Coke", 1.25, 3);
        snack.reduceQuantity(1);
        assertEquals(2, snack.getQuantity());
    }
}
