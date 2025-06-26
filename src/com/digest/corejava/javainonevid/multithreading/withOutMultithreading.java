package com.digest.corejava.javainonevid.multithreading;

public class withOutMultithreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 1000000000; i++) {
            sum = sum+ i;
        }
        System.out.println("Sum is: " + sum);

        int count = 0;
        for (int i = 0; i < 500000000; i++) {
            if (i % 10 == 7) {
                count++;
            }
        }
        System.out.println("Coutn is: " + count);
        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime)+"ms");
    }
}
