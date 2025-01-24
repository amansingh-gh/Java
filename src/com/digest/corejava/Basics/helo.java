package com.digest.corejava.Basics;

import java.util.Scanner;

class helo{
    public static void main(String a[]){
        // Basics
        System.out.println("Hey this is new java");
        System.out.println("Sum is "+5+4);

        // Variable
        int num = 60;
        System.out.println(num);

        float marks   = 89.22f;
        System.out.println(marks);

        char c = 'a';
        c++;
        System.out.println(c);

        // Typecasting
        float f = 95.89f;
        int ff = (int)f;
        System.out.println(ff);

        // Operators - Arithmetic, Comparison, conditional, ternary, logical, relational
        int xx = 60;
        if(xx==60){
            System.out.println("hh");
        }
        System.out.println("Enter the value of yy: ");
        Scanner sc = new Scanner(System.in);
        int yy = sc.nextInt();

        System.out.println("Enter the value of zz: ");
        Scanner scx = new Scanner(System.in);
        int zz = scx.nextInt();
        if(yy>100){
            System.out.println("yy is greater");
        }
        else if(zz>100){
            System.out.println("zz is greater");
        }
        else{
            System.out.println("Invalid");
        }
    }
}