package com.digest.corejava.Basics;

import java.util.*;
public class rev_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        for ( int i=x; i>=1; i--) {
            for ( int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}