package com.example;

public class Main {
    public static void main(String[] args) {
        FoodItem burger = new Burger();
        FoodItem fries = new Fries();

        FoodItem burgerWithCheese = new Cheese(burger);
        FoodItem friesWithCheese = new Cheese(fries);

        CustomerOrder customer1 = new CustomerOrder();
        customer1.addItem(burgerWithCheese);
        customer1.addItem(friesWithCheese);

        double totalCost = customer1.getTotalCost();

        LoyaltyStatus status = new LoyaltyStatus();
        boolean isLoyalCustomer = true;

        double discountedCost = status.applyDiscount(totalCost, isLoyalCustomer);

        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Discounted Cost: $" + discountedCost);
    }
}