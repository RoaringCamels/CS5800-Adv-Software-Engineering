package com.example.customer.fooditems;

public class Fries implements FoodItem{
    double basePrice = 4.0;

    @Override
    public double getPrice() {return basePrice;}

    @Override
    public String getDescription() {return "Fries";}
    
}