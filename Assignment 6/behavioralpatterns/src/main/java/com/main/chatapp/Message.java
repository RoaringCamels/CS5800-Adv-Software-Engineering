package com.main.chatapp;

import java.util.*;

public class Message {
    private String sender;
    private List<User> recipients;
    private long timestamp;
    private String messageContent;

    public Message(String sender, List<User> recipients, String messageContent){
        this.sender = sender;
        this.recipients = recipients;
        this.timestamp = System.currentTimeMillis();
        this.messageContent = messageContent;
    }

    public String getSender(){return sender;}
    public List<User> getRecipients(){return recipients;}
    public String getMessageContent(){return messageContent;}
    public long getTimestamp(){return timestamp;}

    public void setSender(String sender) {this.sender = sender;}
    public void setRecipients(List<User> recipients) {this.recipients = recipients;}
    public void setTimestamp(long timestamp) {this.timestamp = timestamp;}
    public void setMessageContent(String messageContent) {this.messageContent = messageContent;}

    public void print(){
        System.out.println("Sender: " + sender);
        System.out.println("Recipients: " + recipients);
        System.out.println("Timestamp: " + timestamp);
        System.out.println("Message: " + messageContent);
    }
}
