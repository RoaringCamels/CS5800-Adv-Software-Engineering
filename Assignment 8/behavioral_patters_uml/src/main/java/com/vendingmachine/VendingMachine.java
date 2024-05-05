package com.vendingmachine;

import java.util.List;

import com.vendingmachine.States.Idle;

public class VendingMachine implements StateOfVendingMachine{
    private StateOfVendingMachine state;
    private List<Snack> snacks;
    private SnackDispenserHandler snackDispenser;

    public VendingMachine(List<Snack> snacks) {
        this.snacks = snacks;
        snackDispenser = new SnackDispenser();
        state = new Idle(this);
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public List<Snack> getSnacks() {
        return snacks;
    }

    public void dispenseSnack() {
        state.dispenseSnack();
    }

    public SnackDispenserHandler getSnackDispenser() {
        return snackDispenser;
    }

    @Override
    public void insertCash(double amount) {
        state.insertCash(amount);
    }

    @Override
    public void selectSnack(String snackName) {
        state.selectSnack(snackName);
    }
}
