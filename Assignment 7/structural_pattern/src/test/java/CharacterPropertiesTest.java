import static org.junit.Assert.*;
import org.junit.Test;

import com.example.CharacterProperties;

public class CharacterPropertiesTest {
    @Test
    public void testConstructorAndGetters() {
        CharacterProperties properties = new CharacterProperties("Arial", "Red", 12);
        assertEquals("Arial", properties.getFont());
        assertEquals("Red", properties.getColor());
        assertEquals(12, properties.getSize());
    }
}
