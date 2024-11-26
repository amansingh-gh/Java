package com.learningpackage.JavaAdvance.oops.Encapsulation;

public class Bank {
    private long accountNumber;
    private double balance;

    public static final double pi = 3.14159;

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited amount: "+amount);
        }
        else{
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawl Amount: "+amount);
        }
        else{
            System.out.println("Insufficient Balance in Your account");
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
