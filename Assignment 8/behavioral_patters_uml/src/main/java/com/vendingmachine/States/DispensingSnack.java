package com.vendingmachine.States;

import com.vendingmachine.*;

public class DispensingSnack implements StateOfVendingMachine{
    private VendingMachine vendingMachine;
    private Snack selectedSnack;
    private double amountInserted;

    public DispensingSnack(VendingMachine vendingMachine, Snack selectedSnack, double amountInserted) {
        this.vendingMachine = vendingMachine;
        this.selectedSnack = selectedSnack;
        this.amountInserted = amountInserted;
    }

    @Override
    public void insertCash(double amount) {
        System.out.println("Already waiting for money. Cannot insert more money.");
    }

    @Override
    public void selectSnack(String snackName) {
        System.out.println("Already dispensing a snack. Cannot select another snack.");
    }

    @Override
    public void dispenseSnack() {
        vendingMachine.getSnackDispenser().handleRequest(selectedSnack, amountInserted);
        vendingMachine.setState(new Idle(vendingMachine));
    }
}
