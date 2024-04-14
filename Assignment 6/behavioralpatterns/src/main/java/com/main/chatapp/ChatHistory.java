package com.main.chatapp;
import java.util.*;

class ChatHistory {
    private List<Message> messages;

    public ChatHistory() {this.messages = new ArrayList<>();}

    public void addMessage(Message message) {messages.add(message);}

    public List<Message> getMessages() {return messages;}

    public void removeMessage(Message message) {messages.remove(message);}
}
