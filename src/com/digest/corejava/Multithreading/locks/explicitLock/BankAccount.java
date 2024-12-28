package com.digest.corejava.Multithreading.locks.explicitLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw" + amount);
        try{
        if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
            if (balance >= amount) {
                try {
                    System.out.println(Thread.currentThread().getName() + " processing amount");
                    Thread.sleep(3000);
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " Completed Withdraw, Remaining balance is:  " + balance);
                } catch (Exception e) {
                    Thread.currentThread().interrupt();

                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " Insufficient Balance");
            }
        }
        else{
            System.out.println("Could not acquire the lock will try again later");
        }
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }
}