package com.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Snack> snacks = new ArrayList<>();
        snacks.add(new Snack("Coke", 1.25, 3));
        snacks.add(new Snack("Pepsi", 1.0, 5));
        snacks.add(new Snack("Cheetos", 1.75, 2));
        snacks.add(new Snack("Doritos", 1.5, 4));
        snacks.add(new Snack("KitKat", 1.25, 1));
        snacks.add(new Snack("Snickers", 1.75, 1));

        VendingMachine vendingMachine = new VendingMachine(snacks);

        // inserting the cash and choosing snickers - there is only 1 snicker
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertCash(1.75);
        vendingMachine.dispenseSnack();
        System.out.println("----------------------");

        // inserting the cash and choosing snickers - there are 0 snickers now
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertCash(1.75);
        vendingMachine.dispenseSnack();
        System.out.println("----------------------");

        // getting a coke
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertCash(1.75);
        vendingMachine.dispenseSnack();
        System.out.println("----------------------");
    }
}