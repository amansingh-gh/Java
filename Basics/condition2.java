package com.digest.corejava.Basics;

import java.util.*;
public class condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();
        switch(button) {
         case 1: System.out.println("Asus");
         break ;
         case 2: System.out.println("TUF");
         break ;
         case 3 : System.out.println("Gaming");
         break;
         default : System.out.println("Wrong Number You choose");
        }

          }
}