package com.vendingmachine.States;

import java.util.List;

import com.vendingmachine.*;

public class Idle implements StateOfVendingMachine{
    private VendingMachine vendingMachine;

    public Idle(VendingMachine vendingMachine){this.vendingMachine = vendingMachine;}

    @Override
    public void insertCash(double amount) {
        System.out.println("Please select a snack first.");
    }

    @Override
    public void selectSnack(String snackName) {
        List<Snack> snacks = vendingMachine.getSnacks();
        for (Snack snack : snacks) {
            if (snack.getName().equals(snackName)) {
                vendingMachine.setState(new WaitingForMoney(vendingMachine, snack));
                System.out.println("Selected snack: " + snackName);
                return;
            }
        }
        System.out.println("Snack not available.");
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Please select a snack first.");
    }
    
}
