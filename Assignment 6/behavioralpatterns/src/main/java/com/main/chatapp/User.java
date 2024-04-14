package com.main.chatapp;
import java.util.*;

public class User{
    private String username;
    private ChatServer chatServer;
    private ChatHistory chatHistory;
    private MessageMemento memento;

    public User(ChatServer chatServer){
        this.chatServer = chatServer;
        this.chatHistory = new ChatHistory();
        chatServer.addUser(this);
    }

    public String getUsername() {return username;}
    public User getUser(){return this;}
    public ChatServer getChatServer(){return chatServer;}
    public ChatHistory getChatHistory(){return chatHistory;}

    public void setUsername(String username) {this.username = username;}
    public void setChatServer(ChatServer chatServer) {this.chatServer = chatServer;}
    public void setChatHistory(ChatHistory chatHistory) {this.chatHistory = chatHistory;}

    public void sendMessage(String messageContent, User... recipients) {
        Message message = new Message(this, Arrays.asList(recipients), messageContent);
        chatHistory.addMessage(message);
        chatServer.sendMessage(message, recipients);
        saveMessageState(message);
    }

    public void saveMessageState(Message messageToSave){
        memento = new MessageMemento(messageToSave);
    }

    public void receiveMessage(Message message) {
        System.out.println(username + " received message: " + message.getMessageContent());
        chatHistory.addMessage(message);
    }
}
