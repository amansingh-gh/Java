package com.digest.corejava.Basics;

import java.util.*;
public class q1_print1 {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        for ( int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}