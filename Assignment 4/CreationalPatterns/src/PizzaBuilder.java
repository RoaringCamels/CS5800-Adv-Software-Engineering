import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder{
    private String pizzaChain;
    private String size;

    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private boolean bacon;
    private boolean onions;
    private boolean extraCheese;
    private boolean peppers;
    private boolean chicken;
    private boolean olives;
    private boolean spinach;
    private boolean tomatoAndBasil;
    private boolean beef;
    private boolean ham;
    private boolean pesto;
    private boolean spicyPork;
    private boolean hamAndPineapple;

    public PizzaBuilder() {}

    public PizzaBuilder setPizzaChain(String pizzaChain){this.pizzaChain = pizzaChain;return this;}

    public PizzaBuilder setSize(String size){
        if(!isValidSize(size)){throw new IllegalArgumentException("Invalid Pizza size.");}
        this.size = size;return this;
    }

    public PizzaBuilder setPepporni(boolean pepperoni){this.pepperoni = pepperoni;return this;}
    public PizzaBuilder setSausage(boolean sausage){this.sausage = sausage;return this;}
    public PizzaBuilder setMushrroms(boolean mushrooms){this.mushrooms = mushrooms;return this;}
    public PizzaBuilder setBacon(boolean bacon){this.bacon = bacon;return this;}
    public PizzaBuilder setOnions(boolean onions){this.onions = onions;return this;}
    public PizzaBuilder setExtraCheese(boolean extraCheese){this.extraCheese = extraCheese;return this;}
    public PizzaBuilder setChicken(boolean chicken){this.chicken = chicken;return this;}
    public PizzaBuilder setOlives(boolean olives){this.olives = olives;return this;}
    public PizzaBuilder setSpinach(boolean spinach){this.spinach = spinach;return this;}
    public PizzaBuilder setTomatoAndBasil(boolean tomatoAndBasil){this.tomatoAndBasil = tomatoAndBasil;return this;}
    public PizzaBuilder setBeef(boolean beef){this.beef = beef;return this;}
    public PizzaBuilder setHam(boolean ham){this.ham = ham;return this;}
    public PizzaBuilder setPesto(boolean pesto){this.pesto = pesto;return this;}
    public PizzaBuilder setSpicyPork(boolean spicyPork){this.spicyPork = spicyPork;return this;}
    public PizzaBuilder setHamAndPineapple(boolean hamAndPineapple){this.hamAndPineapple = hamAndPineapple;return this;}

    public Pizza bakePizza(){
        if (size == null){throw new IllegalStateException("Pizza size is required.");}
        return new Pizza(pizzaChain, size, pepperoni, sausage, mushrooms, bacon, onions, extraCheese, peppers, chicken, olives, spinach, tomatoAndBasil, beef, ham,pesto, spicyPork, hamAndPineapple);
    }

    private boolean isValidSize(String size){
        String[] validSizes = {"Small", "Medium", "Large"};
        for (String x: validSizes){
            if (x.equalsIgnoreCase(size)){
                return true;
            }
        }
        return false;
    }
}
