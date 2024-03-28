package com.example.customer.fooditems.toppings;

import com.example.customer.fooditems.FoodItem;

public class Kethcup implements Topping{
    private FoodItem foodItem;
    private double toppingCost = 0.5;

    public Kethcup(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + toppingCost;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " with Cheese";
    }
}
