package com.digest.corejava.java.Exceptions.CustomException;

import com.digest.corejava.java.Exceptions.CheckedException;

public class Test extends CheckedException {
    public static void main(String[] args) {
        CustomException account = new CustomException(500);
        try{
        account.withdraw(200);
            System.out.println("Withdrawal Success !!");
        }catch (Exception e){
            System.out.println("Something error");
        }
    }
}