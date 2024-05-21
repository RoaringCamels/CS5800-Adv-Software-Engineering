package com.cppfooddelivery.fooditems.toppings;
import com.cppfooddelivery.fooditems.*;

public class Guacamole extends FoodItemDecorator {
    public Guacamole(FoodItemComponent foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", with Guacamole";
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 1.50;
    }

    @Override
    public String getName() {
        return "Guacamole";
    }
}
