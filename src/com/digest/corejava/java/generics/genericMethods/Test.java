package com.digest.corejava.java.generics.genericMethods;

public class Test {
    public static void main(String[] args) {
        Integer[] intArry = {10, 20, 30, 40, 50};
        printArray(intArry);

        display("23");
    }

    // Display
    public static <T> void display(T element) {
        System.out.println("Generic display " + element);
    }

    public static void display(Integer element) {
        System.out.println("Integer display: " + element);
    }


    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}