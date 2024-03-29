package com.example.customer;
import java.util.*;

import com.example.customer.fooditems.FoodItem;

public class CustomerOrder {
    private List<FoodItem> items = new ArrayList<>();
    private LoyaltyStatus loyaltyStatus;

    public void addItem(FoodItem item){items.add(item);}

    public void setLoyaltyStatus(LoyaltyStatus loyaltyStatus){this.loyaltyStatus = loyaltyStatus;}

    public double getTotalCost(String status){
        double totalCost = 0.0;
        for (FoodItem item : items) {
            totalCost += item.getPrice();
        }
        if (loyaltyStatus != null) {
            totalCost = loyaltyStatus.applyDiscount(totalCost, status);
        }
        return totalCost;
    }
}
