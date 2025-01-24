package com.digest.corejava.ExceptionHandling;

import java.util.Scanner;

public class ThrowKeyword{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");

        try {
            
            int age = sc.nextInt();
            if(age>100){
                throw new CustomException("Age is greater then 100");
            }
            else{
                System.out.println("Your age is: "+age);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}

class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}