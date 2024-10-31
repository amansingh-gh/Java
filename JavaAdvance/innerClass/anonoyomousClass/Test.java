package com.learningpackage.JavaAdvance.innerClass.anonoyomousClass;

public class Test {
    public static void main(String[] args) {
        ShoppingKart shoppingKart = new ShoppingKart(1000.12);
        shoppingKart.processPayment(new Payment(){
            @Override
            public void pay(double amount) {
                System.out.println("Paid "+amount + " from Credit Card");
            }
        });

        shoppingKart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid "+amount + " using PayPal");
            }
        });
    }
}