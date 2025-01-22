package com.digest.corejava.java.Multithreading.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsFixedThreadPool {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 10; i++) {
             int finalI = i;
            executor.submit(() -> {
                long result = fact(finalI);
                System.out.println("Factorial of " + finalI + " is: " + result);
            });
        }
        executor.shutdown();
        try {
//            executor.awaitTermination(100, TimeUnit.SECONDS);
            while (!executor.awaitTermination(10, TimeUnit.MILLISECONDS)){
                System.out.println("Waiting......");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
    }
        private static long fact(long n) {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
