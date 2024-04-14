import static org.junit.Assert.*;
import org.junit.Test;

import com.main.chatapp.MessageMemento;

public class MessageMementoTest {
    @Test
    public void testConstructorAndGetters() {
        String messageContent = "Test message";
        long timestamp = System.currentTimeMillis();
        MessageMemento memento = new MessageMemento(messageContent, timestamp);

        assertEquals(messageContent, memento.getMessage());
        assertEquals(timestamp, memento.getTimestamp());
    }

    @Test
    public void testSetters() {
        MessageMemento memento = new MessageMemento("Initial message", 0);

        memento.setMessage("Updated message");
        assertEquals("Updated message", memento.getMessage());

        long newTimestamp = System.currentTimeMillis();
        memento.setTimestamp(newTimestamp);
        assertEquals(newTimestamp, memento.getTimestamp());
    }
}
