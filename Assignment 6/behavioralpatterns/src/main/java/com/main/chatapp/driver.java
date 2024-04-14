package com.main.chatapp;

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
    }
}
