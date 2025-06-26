package com.digest.corejava.bootcamp;

import java.util.Scanner;

public class Complex {

    public static int arithCal(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Addition is: " + arithCal(a, b));
    }
}