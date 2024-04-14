package com.main.chatapp;

public class Driver {
    public static void main(String[] args) throws Exception {
        ChatServer server = new ChatServer();
        User user1 = new User(server);
        User user2 = new User(server);
        User user3 = new User(server);

        user1.setUsername("Bill");
        user2.setUsername("Bob");
        user3.setUsername("Beremy");

        user1.sendMessage("Hello everyone!");
        System.out.println("----------------------");
        
    }
}
