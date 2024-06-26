package com.main.chatapp;
import java.util.*;

public class ChatServer {
    private List<User> usersList;
    private Map<String, List<String>> blockedUsers;

    public ChatServer() {
        usersList = new ArrayList<>();
        blockedUsers = new HashMap<>();
    }

    public void addUser(User user) {usersList.add(user);}
    public void removeUser(User user) {usersList.remove(user);}
    public Collection<User> getUsers() {return usersList;}


    public void sendMessage(Message message, User... recipients) {
        User sender = message.getSender();

        for (User recipient : recipients) {
            if (recipient != sender && !isUserBlocked(recipient.getUsername(), sender.getUsername())) {
                recipient.receiveMessage(message);
            }
        }

        if (sender != null) {
            sender.getChatHistory().addMessage(message);
        }
    }

    public void blockUser(String blocker, String blockedUser) {
        blockedUsers.computeIfAbsent(blocker, k -> new ArrayList<>()).add(blockedUser);
    }

    public boolean isUserBlocked(String recipient, String sender) {
        List<String> blockedList = blockedUsers.get(recipient);
        return blockedList != null && blockedList.contains(sender);
    }

    public void displayChatHistory(User user) {
        ChatHistory chatHistory = user.getChatHistory();
        System.out.println("Chat History for " + user.getUsername() + ":");
        for (Message message : chatHistory.getMessages()) {
            System.out.println(message.getSender().getUsername() + ": " + message.getMessageContent());
        }
    }
}