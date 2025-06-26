package com.digest.corejava.javainonevid.multithreading;

public class withMultithreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Count thread1 = new Count();


        Sum sum = new Sum();
        Thread thread2 = new Thread(sum);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Time taken is: " + (System.currentTimeMillis() - startTime) + "ms");


    }

}
