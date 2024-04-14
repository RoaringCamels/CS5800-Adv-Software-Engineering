package com.main.chatapp;
import java.util.*;

class ChatHistory {
    private List<Message> messages;

    public ChatHistory() {
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public Message getLastMessage() {
        if (!messages.isEmpty()) {
            return messages.get(messages.size() - 1);
        }
        return null;
    }

    public void removeLastMessage() {
        if (!messages.isEmpty()) {
            messages.remove(messages.size() - 1);
        }
    }
}
