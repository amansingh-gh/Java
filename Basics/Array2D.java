package com.digest.corejava.Basics;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        System.out.print("Enter the number of row: ");
        row = sc.nextInt();
        System.out.print("Enter the number of col: ");
        col = sc.nextInt();
        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Entering the " + i + "row: ");
                System.out.print("Entering the " + j + "col: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing the row and col matrix:: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
