package com.example.customer;
import java.util.*;

import com.example.customer.fooditems.FoodItem;

public class CustomerOrder {
    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item){items.add(item);}

    public double getTotalCost(){
        double totalCost = 0.0;
        for(FoodItem item: items){
            totalCost += item.getPrice();
        }
        return totalCost;
    }
}
