package com.main.chatapp;

public class MessageMemento {
    private String message;
    private long timestamp;

    public MessageMemento(String message, long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {return message;}
    public long getTimestamp() {return timestamp;}

    public void setMessage(String message){this.message = message;}
    public void setTimestamp(long timestamp) {this.timestamp = timestamp;}
}

