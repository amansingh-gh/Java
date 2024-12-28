package com.digest.corejava.Basics;

public class EnhancedLoop {
    public static void main(String[] args) {
        int num[] = new int[4];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        
        for(int i : num){
            System.out.println(i);
        }
    }
}
