package com.learningpackage.JavaAdvance.exceptions.CustomException;

public class InsufficientBalance extends Exception{
    private double amount;
    public InsufficientBalance(double amount) {
        super("What do you want.");
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
}