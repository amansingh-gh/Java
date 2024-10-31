package com.learningpackage.JavaAdvance.exceptions.CustomException;

public class CustomException {
    private double Balance;  // 500

    public CustomException(double Amount){
        this.Balance = Amount;  // 500
    }
    public void withdraw(double amount)throws Exception{  // 200
        if(amount > Balance){ //200>500
            throw new InsufficientBalance(amount);
        }
        Balance = Balance - amount; // 300 =  500 - 200
        System.out.println("The Final amount is: "+Balance);
    }
}