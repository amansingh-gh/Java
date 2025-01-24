package com.digest.corejava.Basics;

import java.util.*;
public class pyramid_2pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        for ( int i=1; i<=x; i++) {
            for ( int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}