package com.digest.corejava.Basics;

public class recursion {
    public static int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);    // recursion call
    }
    public static int sumofNatural(int x){
        if(x==0) return 0;
        return x+sumofNatural(x-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sumofNatural(100));
    }
}