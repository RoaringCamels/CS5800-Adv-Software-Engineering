package com.cppfooddelivery;

import java.util.*;
import com.cppfooddelivery.fooditems.*;
public class Menu {
    private ArrayList<FoodItemComponent> foodItemList;

    public Menu(){
        this.foodItemList = new ArrayList<FoodItemComponent>();
    }

    public List<FoodItemComponent> getFoodItemList() {return foodItemList;}

    public void add(FoodItemComponent item) {foodItemList.add(item);}
}
