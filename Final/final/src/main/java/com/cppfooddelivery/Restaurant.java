package com.cppfooddelivery;

import com.cppfooddelivery.observer.Observer;
import com.cppfooddelivery.observer.Subject;

import java.util.*;

public class Restaurant implements Subject{
    private String name;
    private String address;
    private String county;
    private OperatingHours operatingHours;
    private String cuisine;
    private Menu menu;

    private List<Observer> observers;

    public Restaurant (String name, String address, String county, OperatingHours operatingHours, String cuisine, Menu menu){
        this.name = name;
        this.address = address;
        this.county = county;
        this.operatingHours = operatingHours;
        this.cuisine = cuisine;
        this.menu = menu;
        this.observers = new ArrayList<>();
    }

    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getCounty() {return county;}
    public OperatingHours getOperatingHours() {return operatingHours;}
    public String getCuisine() {return cuisine;}
    public Menu getMenu() {return menu;}

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer obs : observers) {
            obs.update(message);
        }
    }
}
