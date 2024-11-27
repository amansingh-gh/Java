package com.learningpackage.JavaAdvance.Mullti.locks.intrisicLock;

public class BankAccount {
    private int balance = 100;

    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw: " + amount);
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " procedding amount");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Completed Withdraw, Remaining balance is:  " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + "Insufficient Balance");
        }
    }

}
