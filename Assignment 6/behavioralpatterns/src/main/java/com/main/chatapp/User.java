package com.main.chatapp;
import java.util.*;

public class User {
    private String username;
    private ChatServer chatServer;
    private ChatHistory chatHistory;
    private MessageMemento memento;

    public User(String username, ChatServer chatServer){
        this.username = username;
        this.chatServer = chatServer;
        this.chatHistory = new ChatHistory();
        chatServer.registerUser(this);
    }

    public String getUsername() {return username;}
    public User getUser(){return this;}
    public ChatServer getChatServer(){return chatServer;}
    public ChatHistory getChatHistory(){return chatHistory;}

    public void setUsername(String username) {this.username = username;}
    public void setChatServer(ChatServer chatServer) {this.chatServer = chatServer;}
    public void setChatHistory(ChatHistory chatHistory) {this.chatHistory = chatHistory;}

    public void sendMessage(List<User> recipients, String messageContent) {
        Message message = new Message(this.username, recipients, messageContent);
        chatHistory.addMessage(message);
        chatServer.sendMessage(message);
        saveMessageState(message);
    }

    public void saveMessageState(Message messageToSave){
        memento = new MessageMemento(messageToSave);
    }

    public void receiveMessage(Message message) {
        System.out.println(username + " received message: " + message.getMessageContent());
        chatHistory.addMessage(message);
    }

    public void undoMessage() {
        if (memento != null) {
            Message message = memento.getState();
            chatHistory.removeMessage(message);
            memento = null;
        }
    }

    public void blockUser(User user, User blockedUser){
        chatServer.blockUser();
    }
}
