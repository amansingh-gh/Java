package com.learningpackage.JavaAdvance.oops.Encapsulation;

public class TestingBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setAccountNumber(1234567890);
        bank.deposit(-20);
        bank.withdraw(100.99);
        bank.deposit(101.10);
        bank.withdraw(1.10);
        System.out.println(bank.getBalance());
        bank.withdraw(1.10);
        System.out.println(bank.getBalance());
        System.out.println(bank.getAccountNumber());
        System.out.println(Bank.pi);
    }
}
