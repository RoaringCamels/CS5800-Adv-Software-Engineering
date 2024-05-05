package com.vendingmachine;

public interface SnackDispenserHandler {
    void setNextHandler(SnackDispenserHandler handler);
    void handleRequest(Snack snack, double amountInserted);
}
