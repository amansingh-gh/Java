package com.digest.corejava.java.innerClass.anonoyomousClass;

public class ShoppingKart {
    private double totalAmount;

    public ShoppingKart(double totalAmount){
        this.totalAmount = totalAmount;
    }
    public void processPayment(Payment PaymentMethod){
        PaymentMethod.pay(totalAmount);
    }
}