package com.cppfooddelivery;
import java.util.*;

import com.cppfooddelivery.fooditems.FoodItemComponent;

public class CPPFoodDelivery {
    private static CPPFoodDelivery instance = null;
    private List<Customer> customersList;
    private List<Restaurant> restaurantsList;
    private List<Driver> driversList;
    private List<Order> ordersList;

    private CPPFoodDelivery(){
        customersList = new ArrayList<>();
        restaurantsList = new ArrayList<>();
        driversList = new ArrayList<>();
        ordersList = new ArrayList<>();
    }

    public static CPPFoodDelivery getInstance(){
        if (instance == null){
            instance = new CPPFoodDelivery();
        }
        return instance;
    }

    public List<Customer> getCustomersList() {return customersList;}
    public List<Restaurant> getRestaurantsList() {return restaurantsList;}
    public List<Driver> getDriversList() {return driversList;}
    public List<Order> getOrdersList() {return ordersList;}

    public void addCustomer(Customer newCustomer){customersList.add(newCustomer);}
    public void addRestaurant(Restaurant newRestaurant){restaurantsList.add(newRestaurant);}
    public void addDriver(Driver newDriver){driversList.add(newDriver);}

    public void placeOrder(Customer customer, Restaurant restaurant, FoodItemComponent foodItem) {
        Order order = new Order(customer, restaurant, foodItem);
        ordersList.add(order);
        restaurant.notifyObservers("New order placed at " + restaurant.getName());
        System.out.println("Order placed by " + customer.getName() + " for " + foodItem.getName() + " at " + restaurant.getName());
    }

    public void assignDriverToOrder(Order order) {
        if (driversList.isEmpty()) {
            System.out.println("No drivers available for order from " + order.getCustomer().getName());
            return;
        }
    
        boolean assigned = false;
        int index = 0;
    
        while (!assigned && index < driversList.size()) {
            Driver driver = driversList.get(index);
            if (driver.isAvailable(order.getOrderTime(), order.getRestaurant().getOperatingHours(), order.getRestaurant())) {
                order.assignDriver(driver);
                System.out.println("Driver " + driver.getName() + " assigned to order for " + order.getCustomer().getName());
                assigned = true;
            } else {
                index++;
            }
        }
    
        if (!assigned) {
            System.out.println("No available drivers for order from " + order.getCustomer().getName());
        }
    }    

    public void pickUpOrder(Order order) {
        Driver assignedDriver = order.getDriver(); // Get the assigned driver from the order
        if (assignedDriver != null) { // Check if the assigned driver is not null
            System.out.println("Driver " + assignedDriver.getName() + " picked up the order for " + order.getCustomer().getName());
        } else {
            System.out.println("No driver assigned to pick up the order for " + order.getCustomer().getName());
        }
    }

    public void deliverOrder(Order order) {
        Driver assignedDriver = order.getDriver(); // Get the assigned driver from the order
        if (assignedDriver != null) { // Check if the assigned driver is not null
            System.out.println("Driver " + assignedDriver.getName() + " delivered the order for " + order.getCustomer().getName());
        } else {
            System.out.println("No driver assigned to deliver the order for " + order.getCustomer().getName());
        }
    }
    
}