package com.digest.corejava.Pattern;

public class p1{
    public static void main(String[] args) {
        pattern_1(6);
    }

    static void pattern_1(int n){
        for(int i = 0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}