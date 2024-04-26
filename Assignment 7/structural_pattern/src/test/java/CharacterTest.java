import static org.junit.Assert.*;
import org.junit.Test;

import com.example.CharacterProperties;
import com.example.Character;


public class CharacterTest {
     @Test
    public void testConstructorAndDisplay() {
        CharacterProperties properties = new CharacterProperties("Arial", "Red", 12);
        Character character = new Character('a', properties);
        assertNotNull(character);
    }
}
