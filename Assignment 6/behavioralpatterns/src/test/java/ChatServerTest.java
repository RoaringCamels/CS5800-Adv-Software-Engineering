import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.main.chatapp.ChatServer;
import com.main.chatapp.Message;
import com.main.chatapp.User;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ChatServerTest {
    private ChatServer chatServer;

    @Before
    public void setUp() {
        chatServer = new ChatServer();
    }

    @Test
    public void testAddUser() {
        User user = new User(chatServer);

        chatServer.addUser(user);

        assertTrue(chatServer.getUsers().contains(user));
    }

    @Test
    public void testRemoveUser() {
        User user = new User(chatServer);
        chatServer.addUser(user);

        chatServer.removeUser(user);

        assertFalse(chatServer.getUsers().contains(user));
    }

    @Test
    public void testSendMessage() {
        User sender = new User(chatServer);
        User recipient = new User(chatServer);
        Message message = new Message(sender, new ArrayList<>(), "Test message");

        chatServer.sendMessage(message, recipient);

        assertTrue(recipient.getChatHistory().getMessages().contains(message));
    }

    @Test
    public void testBlockUser() {
        String blocker = "Blocker";
        String blockedUser = "BlockedUser";

        chatServer.blockUser(blocker, blockedUser);

        assertTrue(chatServer.isUserBlocked(blockedUser, blocker));
    }

    @Test
    public void testDisplayChatHistory() {
        User user = new User(chatServer);
        Message message1 = new Message(user, new ArrayList<>(), "Message 1");
        Message message2 = new Message(user, new ArrayList<>(), "Message 2");
        user.getChatHistory().addMessage(message1);
        user.getChatHistory().addMessage(message2);

        // Redirect System.out to check printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        chatServer.displayChatHistory(user);

        String expectedOutput = "Chat History for " + user.getUsername() + ":\n" +
                                message1.getSender().getUsername() + ": " + message1.getMessageContent() + "\n" +
                                message2.getSender().getUsername() + ": " + message2.getMessageContent() + "\n";

        assertEquals(expectedOutput, outContent.toString());
    }
}
