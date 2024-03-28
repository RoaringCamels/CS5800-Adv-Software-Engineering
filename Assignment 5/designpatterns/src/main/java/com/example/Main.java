package com.example;

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
        System.out.println("Total cost before discount: $" + totalCost);

        LoyaltyStatus loyaltyStatus = new LoyaltyStatus();
        totalCost = loyaltyStatus.applyDiscount(totalCost, "GOLD");

        System.out.println("Total cost after discount: $" + totalCost);
    }
}