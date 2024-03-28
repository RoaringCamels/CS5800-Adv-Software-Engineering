package com.example;

public class LoyaltyStatus {
    public double applyDiscount(double totalCost, boolean isLoyalCustomer){
        if (isLoyalCustomer){
            System.out.println("10% Discount");
            return totalCost * 0.9;
        }
        else{
            System.out.println("No discount");
            return totalCost;
        }
    }
}

