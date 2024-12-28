package com.digest.corejava.Basics;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        System.out.print("Enter the row: ");
        row = sc.nextInt();
        int[][] arr = new int[row][];

        System.out.println("Entering the jagged value from the user:: ");
        for (int i = 0; i < row; i++) {
            System.out.println("Enter the col : ");
            int col = sc.nextInt();
            arr[i] = new int[col];
            System.out.println("Enter the elements for row " + (i + 1) + ":");
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing the jagged array:: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
    }
}
}
