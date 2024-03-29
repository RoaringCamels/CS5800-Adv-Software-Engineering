package com.example.customer;

public class LoyaltyStatus {
    public double applyDiscount(double totalCost, String status) {
        double discount = 0.0;
        switch (status) {
            case "REGULAR":
                discount = 0.0;
                break;
            case "GOLD":
                discount = 0.1;
                break;
            case "EXECUTIVE":
                discount = 0.5;
                break;
            default:
                discount = 0.0;
                break;
        }
        return totalCost - (totalCost * discount);
    }
}


