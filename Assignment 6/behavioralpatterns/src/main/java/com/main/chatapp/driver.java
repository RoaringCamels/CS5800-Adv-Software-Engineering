package com.main.chatapp;
import java.util.*;

public class Driver {
    public static void main(String[] args) throws Exception {
        ChatServer server = new ChatServer();
        User user1 = new User(server);
        User user2 = new User(server);
        User user3 = new User(server);

        System.out.println("\n===== Demonstrating basic chat functions =====");
        user1.setUsername("Bill");
        user2.setUsername("Bob");
        user3.setUsername("Beremy");

        user1.sendMessage("Hello everyone! -from Bill", user2, user3);

        user3.sendMessage("Go away -from Beremy", user1);

        System.out.println("\n===== Demonstrating block function =====");
        server.blockUser("Beremy", "Bill");
        user1.sendMessage("HELLO AGAIN! -from Bill", user2, user3);

        System.out.println("\n===== Undoing Message =====");
        System.out.println("----- Chat History before undo -----");
        server.displayChatHistory(user1);
        user1.undoMessage();
        System.out.println("----- Chat History after undo -----");
        server.displayChatHistory(user1);

        System.out.println("\n===== Viewing Chat History =====");
        server.displayChatHistory(user2);

        System.out.println("\n===== Iterating through Chat History =====");
        iterateChatHistory(user1);
    }

    private static void iterateChatHistory(User user) {
        ChatHistory chatHistory = user.getChatHistory();
        System.out.println("===== Chat History for " + user.getUsername() + " =====");
        Iterator<Message> iterator = chatHistory.iterator(user);
        while (iterator.hasNext()) {
            Message message = iterator.next();
            System.out.println(message.getSender() + ": " + message.getMessageContent());
        }
    }
    
}
