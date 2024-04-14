import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.main.chatapp.ChatServer;
import com.main.chatapp.Message;
import com.main.chatapp.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserTest {
    private ChatServer chatServer;
    private User user1;
    private User user2;

    @Before
    public void setUp() {
        chatServer = new ChatServer();
        user1 = new User(chatServer);
        user2 = new User(chatServer);
        user1.setUsername("User1");
        user2.setUsername("User2");
    }

    @Test
    public void testGetUsername() {
        assertEquals("User1", user1.getUsername());
        assertEquals("User2", user2.getUsername());
    }

    @Test
    public void testSendMessage() {
        user1.sendMessage("Hello", user2);

        List<Message> user2Messages = user2.getChatHistory().getMessages();
        assertEquals(1, user2Messages.size());
        assertEquals("Hello", user2Messages.get(0).getMessageContent());
    }

    @Test
    public void testReceiveMessage() {
        Message message = new Message(user2, new ArrayList<>(), "Message content");

        user1.receiveMessage(message);

        List<Message> user1Messages = user1.getChatHistory().getMessages();
        assertEquals(1, user1Messages.size());
        assertEquals("Message content", user1Messages.get(0).getMessageContent());
    }

    @Test
    public void testUndoMessage() {
        user1.sendMessage("Undo me", user2);
        assertEquals(1, user1.getChatHistory().getMessages().size());

        user1.undoMessage();
        assertEquals(0, user1.getChatHistory().getMessages().size());
    }

    @Test
    public void testIterator() {
        user1.sendMessage("Hello", user2);
        user1.sendMessage("How are you?", user2);

        Iterator<Message> iterator = user1.iterator(user2);
        List<Message> messages = new ArrayList<>();
        while (iterator.hasNext()) {
            messages.add(iterator.next());
        }

        assertEquals(2, messages.size());
    }
}
