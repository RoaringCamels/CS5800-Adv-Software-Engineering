package com.main.chatapp;
import java.util.*;

public class User implements IterableByUser{
    private String username;
    private ChatServer chatServer;
    private ChatHistory chatHistory;
    private Message lastSentMessage;

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
        lastSentMessage = message;
    }

    public void receiveMessage(Message message) {
        System.out.println(username + " received message: " + message.getMessageContent());
        chatHistory.addMessage(message);
    }

    public void undoMessage() {
        if (lastSentMessage != null) {
            MessageMemento memento = lastSentMessage.createMemento();
            
            chatHistory.removeMessage(lastSentMessage);
            lastSentMessage = null;

            System.out.println("Message undone.");

            System.out.println("Restoring message from memento...");
            lastSentMessage = new Message(this, new ArrayList<>(), "");
            lastSentMessage.restoreFromMomento(memento);
        } else {
            System.out.println("No message to undo.");
        }
    }

    @Override
    public Iterator<Message> iterator(User userToSearchWith) {
        return chatHistory.iterator(userToSearchWith);
    }

    @Override
    public String toString() {
        return username;
    }

}
