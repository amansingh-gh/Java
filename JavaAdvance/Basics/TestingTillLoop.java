package com.learningpackage.JavaAdvance.Basics;
import java.util.Scanner;

public class TestingTillLoop {
    public static void main(String[] args) {
    int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num1: ");
        num1 = sc.nextInt();
        System.out.print("Enter the value of num2: ");
        num2 = sc.nextInt();
        sum = num1+num2;
        if(sum>100){
            System.out.println("Your result is "+sum+" above then 100");
        }
        else{
            System.out.println("sum is below then 100");
        }
    }
}
