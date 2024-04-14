package com.main.chatapp;
import java.util.*;

class ChatServer {
    private Map<String, User> usersMap;
    private Map<String, List<String>> blockedUsers;

    public ChatServer() {
        usersMap = new HashMap<>();
        blockedUsers = new HashMap<>();
    }

    public void addUser(User user) {usersMap.put(user.getUsername(), user);}
    public void removeUser(User user) {usersMap.remove(user.getUsername());}

    public void sendMessage(Message message) {
        User sender = usersMap.get(message.getSender());
        List<User> recipients = message.getRecipients();

        for (User recipient : recipients) {
            if (!isUserBlocked(recipient.getUsername(), sender.getUsername())) {
                recipient.receiveMessage(message);
            }
            else{System.out.println("Blocked");}
        }

        if (sender != null) {
            sender.getChatHistory().addMessage(message);
        }
    }

    public void blockUser(String blocker, String blockedUser) {
        blockedUsers.computeIfAbsent(blocker, k -> new ArrayList<>()).add(blockedUser);
    }

    private boolean isUserBlocked(String recipient, String sender) {
        List<String> blockedList = blockedUsers.get(recipient);
        return blockedList != null && blockedList.contains(sender);
    }
}
