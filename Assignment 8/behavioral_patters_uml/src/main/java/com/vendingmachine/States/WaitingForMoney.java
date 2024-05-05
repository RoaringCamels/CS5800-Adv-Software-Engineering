package com.vendingmachine.States;

import com.vendingmachine.*;

public class WaitingForMoney implements StateOfVendingMachine{
    private VendingMachine vendingMachine;
    private Snack selectedSnack;

    public WaitingForMoney(VendingMachine vendingMachine, Snack selectedSnack) {
        this.vendingMachine = vendingMachine;
        this.selectedSnack = selectedSnack;
    }

    @Override
    public void insertCash(double amount) {
        double price = selectedSnack.getPrice();
        if (amount >= price) {
            vendingMachine.setState(new DispensingSnack(vendingMachine, selectedSnack, amount));
            System.out.println("Money inserted: $" + amount);
            vendingMachine.dispenseSnack();
        } else {
            System.out.println("Insufficient money inserted. Please insert $" + price + " or more.");
        }
    }

    @Override
    public void selectSnack(String snackName) {
        System.out.println("Snack already selected.");
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Please insert money first.");
    }
}
