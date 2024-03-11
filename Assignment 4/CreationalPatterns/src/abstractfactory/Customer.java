package abstractfactory;

import abstractfactory.carbs.Carbs;
import abstractfactory.factory.DietPlanFactory;
import abstractfactory.factory.NoRestrictionFactory;
import abstractfactory.factory.NutAllergyFactory;
import abstractfactory.factory.PaleoFactory;
import abstractfactory.factory.VeganFactory;
import abstractfactory.fats.Fats;
import abstractfactory.protein.Protein;

public class Customer {
    private String name;
    private DietPlan dietPlan;

    public Customer(String name, DietPlan dietPlan){
        this.name = name;
        this.dietPlan = dietPlan;
    }

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
}
