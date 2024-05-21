package com.cppfooddelivery.abstractfactory;
import com.cppfooddelivery.abstractfactory.factory.*;

public class DietPlanFactorySingleton {
    private static DietPlanFactory carbFactory;
    private static DietPlanFactory proteinFactory;
    private static DietPlanFactory fatsFactory;
    
    private DietPlanFactorySingleton() {}

    public static DietPlanFactory getCarbFactory() {
        if (carbFactory == null) {
            carbFactory = new NoRestrictionFactory();
        }
        return carbFactory;
    }

    public static DietPlanFactory getProteinFactory() {
        if (proteinFactory == null) {
            proteinFactory = new NoRestrictionFactory();
        }
        return proteinFactory;
    }

    public static DietPlanFactory getFatsFactory() {
        if (fatsFactory == null) {
            fatsFactory = new NoRestrictionFactory();
        }
        return fatsFactory;
    }

    public static void setCarbFactory(DietPlanFactory carbFactory) {
        DietPlanFactorySingleton.carbFactory = carbFactory;
    }

    public static void setProteinFactory(DietPlanFactory proteinFactory) {
        DietPlanFactorySingleton.proteinFactory = proteinFactory;
    }

    public static void setFatsFactory(DietPlanFactory fatsFactory) {
        DietPlanFactorySingleton.fatsFactory = fatsFactory;
    }
}