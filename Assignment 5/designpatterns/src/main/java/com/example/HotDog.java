package com.example;

public class HotDog implements FoodItem{
    double basePrice = 6.0;

    @Override
    public double getPrice() {return basePrice;}

    @Override
    public String getDescription() {return "Hot Dog";}
    
}
