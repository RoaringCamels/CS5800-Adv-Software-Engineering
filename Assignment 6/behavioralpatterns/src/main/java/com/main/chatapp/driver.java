package com.main.chatapp;
import java.util.*;

public class Driver {
    public static void main(String[] args) throws Exception {
        ChatServer server = new ChatServer();
        server.addUser()
        User user1 = new User("Adam", server);
        User user2 = new User("Bob", server);
        User user3 = new User("Charles", server);

        user3.sendMessage(List.of("Adam", "Bob"), "This is Charles");
        user1.sendMessage(List.of("Charles"), "Hello this is Adam");
        user2.sendMessage(List.of("Charles"), "Hello this is Bob");
        System.out.println("----------------------");
        
    }
}
