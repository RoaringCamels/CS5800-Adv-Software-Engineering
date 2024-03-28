package com.example;

import java.util.List;

public class Cheese implements Topping {
    private FoodItem foodItem;
    private double toppingCost = 1.0;

    public Cheese(FoodItem foodItem) {
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
