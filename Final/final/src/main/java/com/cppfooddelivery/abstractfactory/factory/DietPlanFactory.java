package com.cppfooddelivery.abstractfactory.factory;
import com.cppfooddelivery.abstractfactory.carbs.*;
import com.cppfooddelivery.abstractfactory.protein.*;
import com.cppfooddelivery.abstractfactory.fats.*;

public interface DietPlanFactory {
    Carbs createCarbs();

    Protein createProtein();

    Fats createFats();
}
