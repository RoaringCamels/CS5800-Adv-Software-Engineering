import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.main.chatapp.ChatHistory;
import com.main.chatapp.Message;
import com.main.chatapp.User;
import com.main.chatapp.ChatServer;

public class ChatHistoryTest {
    private ChatHistory chatHistory;

    @Before
    public void setUp() {
        chatHistory = new ChatHistory();
    }

    @Test
    public void testAddMessage() {
        Message message = new Message(new User(new ChatServer()), new ArrayList<>(), "Test message");

        chatHistory.addMessage(message);

        List<Message> messages = chatHistory.getMessages();
        assertTrue(messages.contains(message));
        assertEquals(1, messages.size());
    }

    @Test
    public void testRemoveMessage() {
        Message message = new Message(new User(new ChatServer()), new ArrayList<>(), "Test message");
        chatHistory.addMessage(message);

        chatHistory.removeMessage(message);

        List<Message> messages = chatHistory.getMessages();
        assertFalse(messages.contains(message));
        assertEquals(0, messages.size());
    }

    @Test
    public void testIterator() {
        User user1 = new User(new ChatServer());
        User user2 = new User(new ChatServer());

        Message message1 = new Message(user1, new ArrayList<>(), "Message 1");
        Message message2 = new Message(user2, new ArrayList<>(), "Message 2");
        Message message3 = new Message(user1, new ArrayList<>(), "Message 3");

        chatHistory.addMessage(message1);
        chatHistory.addMessage(message2);
        chatHistory.addMessage(message3);

        List<Message> user1Messages = new ArrayList<>();
        Iterator<Message> iterator = chatHistory.iterator(user1);
        while (iterator.hasNext()) {
            user1Messages.add(iterator.next());
        }

        assertEquals(2, user1Messages.size());
        assertTrue(user1Messages.contains(message1));
        assertTrue(user1Messages.contains(message3));
        assertFalse(user1Messages.contains(message2));
    }

    @Test
    public void testGetMessages() {
        Message message1 = new Message(new User(new ChatServer()), new ArrayList<>(), "Test message 1");
        Message message2 = new Message(new User(new ChatServer()), new ArrayList<>(), "Test message 2");

        chatHistory.addMessage(message1);
        chatHistory.addMessage(message2);

        List<Message> messages = chatHistory.getMessages();

        assertEquals(2, messages.size());
        assertTrue(messages.contains(message1));
        assertTrue(messages.contains(message2));
    }
}
