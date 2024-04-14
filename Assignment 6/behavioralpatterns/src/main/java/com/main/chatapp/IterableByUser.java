package com.main.chatapp;
import java.util.*;

public interface IterableByUser {
    Iterator<Message> iterator(User userToSearchWith);
}
