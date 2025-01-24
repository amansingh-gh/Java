package com.digest.corejava.Basics;

import java.util.Scanner;

public class switchh {

    public static void main(String[] args) {
        System.out.print("Enter real number between 1-7 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String res = "";
        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Input");
        }
    }
}
