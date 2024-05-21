package com.cppfooddelivery.fooditems;

public abstract class FoodItemDecorator implements FoodItemComponent {
    public FoodItemComponent foodItem;

    public FoodItemDecorator(FoodItemComponent foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription();
    }

    @Override
    public double getCost() {
        return foodItem.getCost();
    }
}
