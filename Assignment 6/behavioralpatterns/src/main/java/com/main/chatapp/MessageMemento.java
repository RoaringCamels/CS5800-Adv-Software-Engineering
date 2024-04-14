package com.main.chatapp;

class MessageMemento {
    private Message message;

    public MessageMemento(Message message) {
        this.message = message;
    }

    public Message getState() {return message;}

    public void setState(Message message){this.message = message;}
}

