package com.cppfooddelivery.observer;

public class CustomerObserver implements Observer {
    private String customerName;

    public CustomerObserver(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + customerName + ": " + message);
    }
}
