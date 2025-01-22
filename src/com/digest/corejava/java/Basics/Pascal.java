package com.digest.corejava.java.Basics;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for Pascal's Triangle:");
        num = sc.nextInt(); // Take input for the number of rows

        for (int i = 0; i < num; i++) {
            // Print spaces for alignment
            for (int space = num; space > i; space--) {
                System.out.print(" ");
            }

            int value = 1; // First value in each row is always 1

            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1); // Calculate next value
            }

            System.out.println(); // Move to the next line
        }

        sc.close(); // Close the scanner
    }
}
