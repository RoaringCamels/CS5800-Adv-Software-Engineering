package com.main.chatapp;

import java.util.*;

public class searchMessageByUser implements Iterator<Message>{
    private Iterator<Message> iterator;

    public searchMessageByUser(Iterator<Message> iterator){this.iterator = iterator;}

    @Override
    public boolean hasNext() {return iterator.hasNext();}

    @Override
    public Message next() {return iterator.next();}
    
}
