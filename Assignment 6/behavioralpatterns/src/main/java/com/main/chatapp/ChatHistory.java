package com.main.chatapp;
import java.util.*;

public class ChatHistory implements IterableByUser{
    private List<Message> messages;

    public ChatHistory() {this.messages = new ArrayList<>();}

    public void addMessage(Message message) {messages.add(message);}

    public List<Message> getMessages() {return messages;}

    public void removeMessage(Message message) {messages.remove(message);}

    @Override
    public Iterator<Message> iterator(User userToSearchWith) {
        return new MessageIterator(messages, userToSearchWith);
    }

    private static class MessageIterator implements Iterator<Message> {
        private List<Message> messages;
        private User userToSearchWith;
        private int currentIndex;

        public MessageIterator(List<Message> messages, User userToSearchWith) {
            this.messages = messages;
            this.userToSearchWith = userToSearchWith;
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            while (currentIndex < messages.size()) {
                Message message = messages.get(currentIndex);
                if (message.getSender().equals(userToSearchWith) || message.getRecipients().contains(userToSearchWith)) {
                    return true;
                }
                currentIndex++;
            }
            return false;
        }

        @Override
        public Message next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more messages");
            }
            return messages.get(currentIndex++);
        }
    }
}
