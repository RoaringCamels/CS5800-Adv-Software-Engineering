import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import com.vendingmachine.*;

public class VendingMachineTest {

    @Test
    public void testSelectSnack() {
        List<Snack> snacks = new ArrayList<>();
        snacks.add(new Snack("Coke", 1.25, 3));
        snacks.add(new Snack("Pepsi", 1.0, 5));

        VendingMachine vendingMachine = new VendingMachine(snacks);
        vendingMachine.selectSnack("Coke");
        assertEquals("Coke", vendingMachine.getSnacks().get(0).getName());
    }

    @Test
    public void testDispenseSnack() {
        List<Snack> snacks = new ArrayList<>();
        snacks.add(new Snack("Coke", 1.25, 3));

        VendingMachine vendingMachine = new VendingMachine(snacks);
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertCash(1.25);
        vendingMachine.dispenseSnack();
        assertEquals(2, vendingMachine.getSnacks().get(0).getQuantity());
    }
}
