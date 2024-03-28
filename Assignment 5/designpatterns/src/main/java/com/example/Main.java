package com.example;

import com.example.customer.CustomerOrder;
import com.example.customer.LoyaltyStatus;
import com.example.customer.fooditems.Burger;
import com.example.customer.fooditems.FoodItem;
import com.example.customer.fooditems.Fries;
import com.example.customer.fooditems.toppings.Cheese;
import com.example.customer.fooditems.toppings.Kethcup;

public class Main {
    public static void main(String[] args) {
        FoodItem burger = new Burger();
        FoodItem fries = new Fries();

        // Decorator
        burger = new Cheese(burger);
        burger = new Kethcup(burger);;

        CustomerOrder customer1 = new CustomerOrder();
        customer1.addItem(burger);
        customer1.addItem(fries);

        double totalCost = customer1.getTotalCost();
        System.out.println("Cost without discount: $" + totalCost);

        LoyaltyStatus loyaltyStatus = new LoyaltyStatus();
        totalCost = loyaltyStatus.applyDiscount(totalCost, "GOLD");

        System.out.println("Cost with discount: $" + totalCost);
    }
}