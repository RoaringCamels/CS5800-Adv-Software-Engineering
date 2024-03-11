package abstractfactory.factory;

import java.util.Random;

import abstractfactory.carbs.Bread;
import abstractfactory.carbs.Carbs;
import abstractfactory.carbs.Lentils;
import abstractfactory.carbs.Pistachio;
import abstractfactory.fats.Avocado;
import abstractfactory.fats.Fats;
import abstractfactory.fats.Peanuts;
import abstractfactory.protein.Protein;
import abstractfactory.protein.Tofu;

public class VeganFactory implements DietPlanFactory{
    Random random = new Random();

    @Override
    public Carbs createCarbs() {
        int randomNum = random.nextInt(3);

        if (randomNum == 0){
            return new Bread();
        } else if (randomNum == 1){
            return new Lentils();
        } else if (randomNum == 2){
            return new Pistachio();
        }
        else throw new UnsupportedOperationException("Unimplemented method 'createCarbs' in VeganFactory.");
    }

    @Override
    public Protein createProtein() {
        return new Tofu();
    }

    @Override
    public Fats createFats() {
        int randomNum = random.nextInt(2);

        if (randomNum == 0){
            return new Avocado();
        } else if (randomNum == 1){
            return new Peanuts();
        }
        else throw new UnsupportedOperationException("Unimplemented method 'createFats' in VeganFactory.");
    }
}
