import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import com.vendingmachine.*;
import com.vendingmachine.States.DispensingSnack;

public class DispensingSnackTest {
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
    public void testInsertCash() {
        VendingMachine vendingMachine = new VendingMachine(new ArrayList<>());
        Snack snack = new Snack("Coke", 1.25, 3);
        vendingMachine.setState(new DispensingSnack(vendingMachine, snack, 1.25));
        vendingMachine.insertCash(1.0);
        assertEquals("Already waiting for money. Cannot insert more money.\n", outContent.toString());
    }

    @Test
    public void testSelectSnack() {
        VendingMachine vendingMachine = new VendingMachine(new ArrayList<>());
        Snack snack = new Snack("Coke", 1.25, 3);
        vendingMachine.setState(new DispensingSnack(vendingMachine, snack, 1.25));
        vendingMachine.selectSnack("Pepsi");
        assertEquals("Already dispensing a snack. Cannot select another snack.\n", outContent.toString());
    }

    @Test
    public void testDispenseSnack() {
        List<Snack> snacks = new ArrayList<>();
        Snack snack = new Snack("Coke", 1.25, 3);
        snacks.add(snack);

        VendingMachine vendingMachine = new VendingMachine(snacks);
        vendingMachine.setState(new DispensingSnack(vendingMachine, snack, 1.25));
        vendingMachine.dispenseSnack();
        assertEquals("Snack not available or insufficient funds. Returning money.\n", outContent.toString());
    }
}
