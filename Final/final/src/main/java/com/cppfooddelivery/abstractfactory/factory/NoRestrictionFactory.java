package com.cppfooddelivery.abstractfactory.factory;
import com.cppfooddelivery.abstractfactory.carbs.*;
import com.cppfooddelivery.abstractfactory.protein.*;
import com.cppfooddelivery.abstractfactory.fats.*;

import java.util.*;

public class NoRestrictionFactory implements DietPlanFactory{
    Random random = new Random();

    @Override
    public Carbs createCarbs() {
        int randomNum = random.nextInt(4);

        if (randomNum == 0){
            return new Cheese();
        } else if (randomNum == 1){
            return new Bread();
        } else if (randomNum == 2){
            return new Lentils();
        } else if (randomNum == 3){
            return new Pistachio();
        }
        else throw new UnsupportedOperationException("Unimplemented method 'createCarbs' in NoRestrictionFactory.");
    }

    @Override
    public Protein createProtein() {
        int randomNum = random.nextInt(4);

        if (randomNum == 0){
            return new Beef();
        } else if (randomNum == 1){
            return new Chicken();
        } else if (randomNum == 2){
            return new Fish();
        } else if (randomNum == 3){
            return new Tofu();
        }
        else throw new UnsupportedOperationException("Unimplemented method 'createProtein' in NoRestrictionFactory.");
    }

    @Override
    public Fats createFats() {
        int randomNum = random.nextInt(4);

        if (randomNum == 0){
            return new Avocado();
        } else if (randomNum == 1){
            return new Peanuts();
        } else if (randomNum == 2){
            return new SourCream();
        } else if (randomNum == 3){
            return new Tuna();
        }
        else throw new UnsupportedOperationException("Unimplemented method 'createFats' in NoRestrictionFactory.");
    }
    
}
