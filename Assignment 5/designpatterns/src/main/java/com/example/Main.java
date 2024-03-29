package com.example;

import com.example.customer.CustomerOrder;
import com.example.customer.LoyaltyStatus;
import com.example.customer.fooditems.Burger;
import com.example.customer.fooditems.FoodItem;
import com.example.customer.fooditems.Fries;
import com.example.customer.fooditems.HotDog;
import com.example.customer.fooditems.toppings.Cheese;
import com.example.customer.fooditems.toppings.Kethcup;

public class Main {
    public static void main(String[] args) {
        FoodItem burger = new Burger(); // 10
        FoodItem fries = new Fries(); // 4
        FoodItem hotDog = new HotDog(); // 6

        burger = new Cheese(burger); // cheese = 1, kethup = 0.5
        burger = new Kethcup(burger);
        hotDog = new Kethcup(hotDog);

        CustomerOrder customer1 = new CustomerOrder();
        customer1.addItem(burger);
        customer1.addItem(fries);

        CustomerOrder customer2 = new CustomerOrder();
        customer2.addItem(fries);

        LoyaltyStatus statusCustomer1 = new LoyaltyStatus();
        LoyaltyStatus statusCustomer2 = new LoyaltyStatus();

        customer1.setLoyaltyStatus(statusCustomer1);
        customer2.setLoyaltyStatus(statusCustomer2);

        System.out.println("Customer 1 total cost: $" + customer1.getTotalCost("REGULAR"));// 10 + 1 + 0.5 + 4 = 15.5 with no discount
        System.out.println("Customer 2 total cost: $" + customer2.getTotalCost("EXECUTIVE"));// 4 with half off discount
    }
}