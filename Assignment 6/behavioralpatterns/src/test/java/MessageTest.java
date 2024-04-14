import static org.junit.Assert.*;
import org.junit.Test;

import com.main.chatapp.ChatServer;
import com.main.chatapp.Message;
import com.main.chatapp.MessageMemento;
import com.main.chatapp.User;

import java.util.Arrays;

public class MessageTest {
    @Test
    public void testGetSender() {
        User sender = new User(new ChatServer());
        Message message = new Message(sender, Arrays.asList(new User(new ChatServer())), "Test message");
        assertEquals(sender, message.getSender());
    }

    @Test
    public void testGetRecipients() {
        User sender = new User(new ChatServer());
        User recipient1 = new User(new ChatServer());
        User recipient2 = new User(new ChatServer());
        Message message = new Message(sender, Arrays.asList(recipient1, recipient2), "Test message");
        assertEquals(2, message.getRecipients().size());
        assertTrue(message.getRecipients().contains(recipient1));
        assertTrue(message.getRecipients().contains(recipient2));
    }

    @Test
    public void testGetMessageContent() {
        User sender = new User(new ChatServer());
        Message message = new Message(sender, Arrays.asList(new User(new ChatServer())), "Test message");
        assertEquals("Test message", message.getMessageContent());
    }

    @Test
    public void testGetTimestamp() {
        User sender = new User(new ChatServer());
        Message message = new Message(sender, Arrays.asList(new User(new ChatServer())), "Test message");
        assertTrue(message.getTimestamp() > 0);
    }

    @Test
    public void testSetSender() {
        User sender = new User(new ChatServer());
        Message message = new Message(null, Arrays.asList(new User(new ChatServer())), "Test message");
        message.setSender(sender);
        assertEquals(sender, message.getSender());
    }

    @Test
    public void testSetRecipients() {
        User sender = new User(new ChatServer());
        User recipient1 = new User(new ChatServer());
        User recipient2 = new User(new ChatServer());
        Message message = new Message(sender, null, "Test message");
        message.setRecipients(Arrays.asList(recipient1, recipient2));
        assertEquals(2, message.getRecipients().size());
        assertTrue(message.getRecipients().contains(recipient1));
        assertTrue(message.getRecipients().contains(recipient2));
    }

    @Test
    public void testSetMessageContent() {
        User sender = new User(new ChatServer());
        Message message = new Message(sender, Arrays.asList(new User(new ChatServer())), null);
        message.setMessageContent("Updated message content");
        assertEquals("Updated message content", message.getMessageContent());
    }

    @Test
    public void testSetTimestamp() {
        User sender = new User(new ChatServer());
        Message message = new Message(sender, Arrays.asList(new User(new ChatServer())), "Test message");
        long newTimestamp = System.currentTimeMillis();
        message.setTimestamp(newTimestamp);
        assertEquals(newTimestamp, message.getTimestamp());
    }

    @Test
    public void testCreateMementoAndRestoreFromMomento() {
        User sender = new User(new ChatServer());
        Message message = new Message(sender, Arrays.asList(new User(new ChatServer())), "Test message");
        MessageMemento memento = message.createMemento();
        message.restoreFromMomento(memento);
        assertEquals("Test message", message.getMessageContent());
    }

    @Test
    public void testToString() {
        User sender = new User(new ChatServer());
        Message message = new Message(sender, Arrays.asList(new User(new ChatServer())), "Test message");
        assertEquals(sender + ": " + "Test message", message.toString());
    }
}
