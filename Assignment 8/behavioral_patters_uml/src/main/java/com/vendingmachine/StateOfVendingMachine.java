package com.vendingmachine;

public interface StateOfVendingMachine {
    public void insertCash(double cashAmount);
    public void selectSnack(String snackName);
    public void dispenseSnack();
}
