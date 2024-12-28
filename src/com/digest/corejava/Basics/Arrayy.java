package com.digest.corejava.Basics;

import java.util.Scanner;

public class Arrayy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[4];

        // to taking input 
        for(int i=0; i<4; i++){
        System.out.println("Enter elements: " + (i+1)+ ": ");
        nums[i] = sc.nextInt();
        }

        // to printing values
        System.out.println("The elements are: ");
        for(int i=0; i<4; i++){
            System.out.println(nums[i] + " ");
        }
    
    }
}