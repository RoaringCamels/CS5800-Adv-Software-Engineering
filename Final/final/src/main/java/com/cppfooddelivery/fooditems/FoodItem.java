package com.cppfooddelivery.fooditems;

public class FoodItem implements FoodItemComponent{
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public double getCost() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
