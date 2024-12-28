package com.digest.corejava.Pattern;// package DSA.Patterns;

public class p3 {
    public static void main(String[] args) {
        pattern_3(5);
    }
    static void pattern_3(int n){
        for(int i =1; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
