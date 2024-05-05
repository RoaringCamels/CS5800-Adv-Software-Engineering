package com.vendingmachine;

public class SnackDispenser implements SnackDispenserHandler{
    private SnackDispenserHandler nextHandler;

    @Override
    public void setNextHandler(SnackDispenserHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void handleRequest(Snack snack, double amountInserted) {
        if (snack.getQuantity() > 0 && amountInserted >= snack.getPrice()) {
            snack.reduceQuantity(1);
            double change = amountInserted - snack.getPrice();
            if (change > 0) {
                System.out.println("Dispensing " + snack.getName() + ". Change: $" + change);
            } else {
                System.out.println("Dispensing " + snack.getName());
            }
        } else if (nextHandler != null) {
            nextHandler.handleRequest(snack, amountInserted);
        } else {
            System.out.println("Snack not available or insufficient funds. Returning money.");
        }
    }
}
