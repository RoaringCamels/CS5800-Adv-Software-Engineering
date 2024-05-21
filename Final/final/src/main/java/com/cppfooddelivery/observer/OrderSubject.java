package com.cppfooddelivery.observer;

import java.util.ArrayList;
import java.util.List;

public class OrderSubject {
    private static OrderSubject instance;
    private List<Observer> observers;

    private OrderSubject() {
        observers = new ArrayList<>();
    }

    public static synchronized OrderSubject getInstance() {
        if (instance == null) {
            instance = new OrderSubject();
        }
        return instance;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}