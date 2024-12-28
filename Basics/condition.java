package com.digest.corejava.Basics;

import java.util.*;
public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();
        switch(button) {
            case 1 : System.out.println("Aman");
            break;
            case 2 : System.out.println("Kumar");
            break;
            case 3 : System.out.println("Singh");
            break;
            default : System.out.println("Not valid");
        }
     }
}