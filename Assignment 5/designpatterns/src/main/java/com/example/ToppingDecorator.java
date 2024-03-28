package com.example;

abstract class ToppingDecorator implements FoodItem{
    protected FoodItem foodItem;

    public ToppingDecorator(FoodItem foodItem){this.foodItem = foodItem;}

    @Override
    public double getPrice(){return foodItem.getPrice();}

    @Override
    public String getDescription(){return foodItem.getDescription();}
}