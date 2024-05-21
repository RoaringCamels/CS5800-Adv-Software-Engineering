package com.cppfooddelivery.fooditems.toppings;
import com.cppfooddelivery.fooditems.*;

public class Cheese extends FoodItemDecorator {
    public Cheese(FoodItemComponent foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", with cheese";
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 1.50;
    }

    @Override
    public String getName() {
        return "Cheese";
    }
}
