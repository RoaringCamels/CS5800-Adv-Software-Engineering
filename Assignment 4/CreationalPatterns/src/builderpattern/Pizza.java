package builderpattern;
import java.util.*;

public class Pizza {
    private String pizzaChain;
    private String size;

    //toppingns
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

    public Pizza(String pizzaChain, String size, boolean pepperoni, boolean sausage, boolean mushrooms, boolean bacon, boolean onions, boolean extraCheese, boolean peppers, boolean chicken, boolean olives, boolean spinach,
        boolean tomatoAndBasil, boolean beef, boolean ham, boolean pesto, boolean spicyPork, boolean hamAndPineapple){
        this.pizzaChain = pizzaChain;
        this.size = size;
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.bacon = bacon;
        this.onions = onions;
        this.extraCheese = extraCheese;
        this.peppers = peppers;
        this.chicken =chicken;
        this.olives = olives;
        this.spinach = spinach;
        this.tomatoAndBasil = tomatoAndBasil;
        this.beef = beef;
        this.ham = ham;
        this.pesto = pesto;
        this.spicyPork = spicyPork;
        this.hamAndPineapple = hamAndPineapple;
    }
    
    public void eat(){
        System.out.println("Pizza chain: " + pizzaChain);
        System.out.println("Size: " + size);

        List<String> toppingsList = getToppingsList();
        System.out.println("Toppings: " + String.join(", ", toppingsList));
        System.out.println("--------------------------------\n");
    }

    private List<String> getToppingsList() {
        List<String> toppings = new ArrayList<>();
        
        if (pepperoni) toppings.add("Pepperoni");
        if (sausage) toppings.add("Sausage");
        if (mushrooms) toppings.add("Mushrooms");
        if (bacon) toppings.add("Bacon");
        if (onions) toppings.add("Onions");
        if (extraCheese) toppings.add("Extra Cheese");
        if (peppers) toppings.add("Peppers");
        if (chicken) toppings.add("Chicken");
        if (olives) toppings.add("Olives");
        if (spinach) toppings.add("Spinach");
        if (tomatoAndBasil) toppings.add("Tomato and Basil");
        if (beef) toppings.add("Beef");
        if (ham) toppings.add("Ham");
        if (pesto) toppings.add("Pesto");
        if (spicyPork) toppings.add("Spicy Pork");
        if (hamAndPineapple) toppings.add("Ham and Pineapple");

        return toppings;
    }
}
