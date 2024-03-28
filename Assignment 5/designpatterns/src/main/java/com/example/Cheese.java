package com.example;

public class Cheese extends ToppingDecorator{
    private double price = 0.5;

    public Cheese(FoodItem foodItem) {super(foodItem);}

    @Override
    public double getPrice(){return super.getPrice() + price;}

    @Override
    public String getDescription(){return super.getDescription() + " with Cheese";}
    
}
