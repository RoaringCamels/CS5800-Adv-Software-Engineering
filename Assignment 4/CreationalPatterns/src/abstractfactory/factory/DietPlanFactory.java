package abstractfactory.factory;

import abstractfactory.carbs.Carbs;
import abstractfactory.fats.Fats;
import abstractfactory.protein.Protein;

public interface DietPlanFactory {
    Carbs createCarbs();

    Protein createProtein();

    Fats createFats();
}
