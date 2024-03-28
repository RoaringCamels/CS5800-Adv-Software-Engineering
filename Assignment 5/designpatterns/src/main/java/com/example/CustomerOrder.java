package com.example;
import java.util.*;

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
