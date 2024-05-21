package com.cppfooddelivery;
import com.cppfooddelivery.abstractfactory.*;
import com.cppfooddelivery.abstractfactory.carbs.*;
import com.cppfooddelivery.abstractfactory.factory.*;
import com.cppfooddelivery.abstractfactory.fats.*;
import com.cppfooddelivery.abstractfactory.protein.*;

public class Customer {
    private String name;
    private String address;
    private String county;
    private DietPlan dietPlan;

    public Customer(String name, String address, String county, DietPlan dietPlan) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.dietPlan = dietPlan;
    }

    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getCounty() {return county;}
    public DietPlan getDietplan() {return dietPlan;}

    public void createMeal(){
        DietPlanFactorySingleton.setCarbFactory(getDietPlanFactory());
        DietPlanFactorySingleton.setProteinFactory(getDietPlanFactory());
        DietPlanFactorySingleton.setFatsFactory(getDietPlanFactory());

        Carbs carbs = DietPlanFactorySingleton.getCarbFactory().createCarbs();
        Protein protein = DietPlanFactorySingleton.getProteinFactory().createProtein();
        Fats fats = DietPlanFactorySingleton.getFatsFactory().createFats();

        System.out.println(name + "'s Meal:");
        System.out.println("Carbs: " + carbs.getFood());
        System.out.println("Protein: " + protein.getFood());
        System.out.println("Fats: " + fats.getFood());
        System.out.println("--------------------");
    }

    private DietPlanFactory getDietPlanFactory() {
        switch (dietPlan) {
            case NO_RESTRICTION:
                return new NoRestrictionFactory();
            case PALEO:
                return new PaleoFactory();
            case VEGAN:
                return new VeganFactory();
            case NUT_ALLERGY:
                return new NutAllergyFactory();
            default:
                throw new IllegalArgumentException("Invalid diet plan.");
        }
    }

    @Override
    public String toString() {
        return name + ", " + address + ", " + county;
    }
}

