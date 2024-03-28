package com.example;

public class Burger implements FoodItem{
    private double basePrice = 10.0;

    @Override
    public double getPrice() {return basePrice;}

    @Override
    public String getDescription() {return "Burger";}
    
}
