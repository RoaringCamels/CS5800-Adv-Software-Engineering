public class Driver{
    public static void main(String[] args) {
        //------------------------------------ PART 1 -----------------------------------------------
        Pizza pizza1 = new PizzaBuilder()
        .setPizzaChain("Pizza Hut")
        .setSize("Small").setBacon(true)
        .setBeef(true).setChicken(true)
        .bakePizza();

        Pizza pizza2 = new PizzaBuilder()
        .setPizzaChain("Pizza Hut")
        .setSize("Medium")
        .setBacon(true)
        .setBeef(true)
        .setChicken(true)
        .setExtraCheese(true)
        .setHam(true)
        .setOnions(true)
        .bakePizza();

        Pizza pizza3 = new PizzaBuilder()
        .setPizzaChain("Pizza Hut")
        .setSize("Large")
        .setBacon(true)
        .setBeef(true)
        .setChicken(true)
        .setOnions(true)
        .setMushrroms(true)
        .setPesto(true)
        .setSausage(true)
        .setOlives(true)
        .setPesto(true)
        .bakePizza();

        pizza1.eat();
        pizza2.eat();
        pizza3.eat();

        //------------------------------------ PART 2 -----------------------------------------------
        Pizza Hut1 = new PizzaBuilder()
        .setPizzaChain("Pizza Hut")
        .setSize("Large")
        .setBacon(true)
        .setBeef(true)
        .setChicken(true)
        .bakePizza();

        Pizza Hut2 = new PizzaBuilder()
        .setPizzaChain("Pizza Hut")
        .setSize("Small")
        .setBacon(true)
        .setBeef(true)
        .bakePizza();

        Pizza LC1 = new PizzaBuilder()
        .setPizzaChain("Little Caesars")
        .setSize("Medium")
        .setBacon(true)
        .setBeef(true)
        .setChicken(true)
        .setOnions(true)
        .setMushrroms(true)
        .setPesto(true)
        .setSausage(true)
        .setOlives(true)
        .bakePizza();

        Pizza LC2 = new PizzaBuilder()
        .setPizzaChain("Little Caesars")
        .setSize("Medium")
        .setBacon(true)
        .setBeef(true)
        .setMushrroms(true)
        .setPesto(true)
        .setSausage(true)
        .setOlives(true)
        .bakePizza();

        Pizza Dominos1 = new PizzaBuilder()
        .setPizzaChain("Dominos")
        .setSize("Small")
        .setBacon(true)
        .bakePizza();

        Pizza Dominos2 = new PizzaBuilder()
        .setPizzaChain("Dominos")
        .setSize("Small")
        .setBacon(true)
        .setPesto(true)
        .setMushrroms(true)
        .bakePizza();


        Hut1.eat();
        Hut2.eat();;
        LC1.eat();
        LC2.eat();
        Dominos1.eat();
        Dominos2.eat();
    }
}
