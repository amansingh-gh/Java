package com.digest.corejava.Basics;

import java.util.Scanner;

public class printingTheTable {
    public static void main(String[] args) {
        int n, size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();

        System.out.print("Enter the size of the talble: ");
        size = sc.nextInt();

        //        Using for loopl
        System.out.println("Printing via for loop");
        for (int i = 1; i <= size; i++) {
            System.out.println("The table of " + n + " x " + i + " is :  " + n * i);
        }

        //    using while loop
        System.out.println("Printing via while loop");
        int i = 1;
        while (i <= size) {
            System.out.println("The table of " + n + " x " + i + " is :  " + n * i);
            i++;
        }
        //      Using do-while loop;
        System.out.println("Prinitng via Do-while loop");
//        int i=1;
        do {
            System.out.println("The table of " + n + " x " + i + " is :  " + n * i);
            i++;
        }
        while (i <= size);
    }
}
