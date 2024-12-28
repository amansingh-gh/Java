package com.digest.corejava.Multithreading.executorFramework;

public class DemoFactorial {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[9]; // Move this outside the loop to avoid reinitialization in each iteration

        // Loop to create and start threads
        for (int i = 1; i <= 9; i++) {
            final int finalI = i;
            threads[i - 1] = new Thread(
                    () -> {
                        long result = fact(finalI);
                        System.out.println("Factorial of " + finalI + " is: " + result);
                    }
            );
            threads[i - 1].start();
        }

        // Wait for all threads to finish execution
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
    }

    // Factorial calculation method
    private static long fact(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
