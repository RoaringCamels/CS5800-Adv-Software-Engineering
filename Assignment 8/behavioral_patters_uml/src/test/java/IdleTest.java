import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import com.vendingmachine.*;
import com.vendingmachine.States.Idle;

public class IdleTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testInsertMoney() {
        VendingMachine vendingMachine = new VendingMachine(new ArrayList<>());
        vendingMachine.setState(new Idle(vendingMachine));
        vendingMachine.insertCash(1.0);
        assertEquals("Please select a snack first.\n", outContent.toString());
    }

    @Test
    public void testSelectSnack() {
        VendingMachine vendingMachine = new VendingMachine(new ArrayList<>());
        vendingMachine.setState(new Idle(vendingMachine));
        vendingMachine.selectSnack("Coke");
        assertEquals("Snack not available.\n", outContent.toString());
    }

    @Test
    public void testDispenseSnack() {
        VendingMachine vendingMachine = new VendingMachine(new ArrayList<>());
        vendingMachine.setState(new Idle(vendingMachine));
        vendingMachine.dispenseSnack();
        assertEquals("Please select a snack first.\n", outContent.toString());
    }
}
