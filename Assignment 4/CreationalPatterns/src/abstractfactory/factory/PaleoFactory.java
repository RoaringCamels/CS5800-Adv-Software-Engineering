package abstractfactory.factory;

import java.util.Random;

import abstractfactory.carbs.Carbs;
import abstractfactory.carbs.Pistachio;
import abstractfactory.fats.Avocado;
import abstractfactory.fats.Fats;
import abstractfactory.fats.Peanuts;
import abstractfactory.fats.Tuna;
import abstractfactory.protein.Beef;
import abstractfactory.protein.Chicken;
import abstractfactory.protein.Fish;
import abstractfactory.protein.Protein;

public class PaleoFactory implements DietPlanFactory{
    Random random = new Random();

    @Override
    public Carbs createCarbs() {
        return new Pistachio();
    }

    @Override
    public Protein createProtein() {
        int randomNum = random.nextInt(3);

        if (randomNum == 0){
            return new Beef();
        } else if (randomNum == 1){
            return new Chicken();
        } else if (randomNum == 2){
            return new Fish();
        } 
        else throw new UnsupportedOperationException("Unimplemented method 'createProtein' in PaleoFactory.");
    }

    @Override
    public Fats createFats() {
        int randomNum = random.nextInt(3);

        if (randomNum == 0){
            return new Avocado();
        } else if (randomNum == 1){
            return new Peanuts();
        } else if (randomNum == 2){
            return new Tuna();
        }
        else throw new UnsupportedOperationException("Unimplemented method 'createFats' in PaleoFactory.");
    }
    
}
