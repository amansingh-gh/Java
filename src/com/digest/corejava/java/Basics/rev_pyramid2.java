package com.digest.corejava.java.Basics;

import java.util.*;
public class rev_pyramid2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        for (int i=z; i<=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
           System.out.println();
        }
    }
}