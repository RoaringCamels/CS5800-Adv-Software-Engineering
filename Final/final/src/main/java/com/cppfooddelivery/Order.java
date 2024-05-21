package com.cppfooddelivery;

import java.time.LocalTime;
import com.cppfooddelivery.fooditems.FoodItemComponent;

public class Order {
    private Customer customer;
    private Restaurant restaurant;
    private FoodItemComponent foodItem;
    private Driver driver;
    private LocalTime orderTime;
    private LocalTime pickupTime;
    private LocalTime deliveryTime;
    private String status;

    public Order(Customer customer, Restaurant restaurant, FoodItemComponent foodItem) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.foodItem = foodItem;
        this.orderTime = LocalTime.now();
        this.status = "Placed";
        this.orderTime = LocalTime.now();
        System.out.println(customer + " order has been created.");
    }

    public String getStatus() { return status; }
    public Customer getCustomer() { return customer; }
    public Restaurant getRestaurant() { return restaurant; }
    public FoodItemComponent getFoodItem() { return foodItem; }
    public Driver getDriver() { return driver; }
    public LocalTime getOrderTime() { return orderTime; }
    public LocalTime getPickupTime() { return pickupTime; }
    public LocalTime getDeliveryTime() { return deliveryTime; }

    public void assignDriver(Driver driver) {
        this.driver = driver;
        this.status = "Driver Assigned";
    }

    public void pickUp() {
        this.pickupTime = LocalTime.now();
        this.status = "Picked Up";
    }

    public void deliver() {
        this.deliveryTime = LocalTime.now();
        this.status = "Delivered";
    }

    private void notifyRestaurant() {
        if (restaurant != null) {
            restaurant.notifyObservers("New order placed at " + restaurant.getName());
        }
    }
}