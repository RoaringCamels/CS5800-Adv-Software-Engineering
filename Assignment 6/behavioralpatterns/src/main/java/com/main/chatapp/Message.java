package com.main.chatapp;

import java.util.*;

public class Message {
    private User sender;
    private List<User> recipients;
    private long timestamp;
    private String messageContent;

    public Message(User sender, List<User> recipients, String messageContent){
        this.sender = sender;
        this.recipients = recipients;
        this.timestamp = System.currentTimeMillis();
        this.messageContent = messageContent;
    }

    public User getSender(){return sender;}
    public List<User> getRecipients(){return recipients;}
    public String getMessageContent(){return messageContent;}
    public long getTimestamp(){return timestamp;}

    public void setSender(User sender) {this.sender = sender;}
    public void setRecipients(List<User> recipients) {this.recipients = recipients;}
    public void setTimestamp(long timestamp) {this.timestamp = timestamp;}
    public void setMessageContent(String messageContent) {this.messageContent = messageContent;}

    public void print(){
        System.out.println("Sender: " + sender);
        System.out.println("Recipients: " + recipients);
        System.out.println("Timestamp: " + timestamp);
        System.out.println("Message: " + messageContent);
    }

    public MessageMemento createMemento(){
        return new MessageMemento(messageContent, timestamp);
    }

    public void restoreFromMomento(MessageMemento memento){
        this.messageContent = memento.getMessage();
        this.timestamp = memento.getTimestamp();
    }

    @Override
    public String toString() {
        return sender + ": " + messageContent;
    }

}
