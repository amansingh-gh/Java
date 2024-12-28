package com.digest.corejava.Multithreading.executorFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceInvokeAll {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Callable<Integer> callable1 = () -> {
            Thread.sleep(100);
            System.out.println("Task 1 Done");
            return 1;
        };

        Callable<Integer> callable2 = () -> {
            System.out.println("Task 2 Done");
            return 2;
        };
        Callable<Integer> callable3 = () -> {

            System.out.println("Task 3 Done");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);
        // Here is a interesting thing in invokeAll() method, this method blocks all other methods to execute the entire task given
        List<Future<Integer>> futures = null;
        try {
//            futures = executorService.invokeAll(list);
//            futures = executorService.invokeAll(list, 1, TimeUnit.MILLISECONDS);
//            futures = executorService.invokeAll(list);  // only one task completed rest will cancelled.
            futures = executorService.invokeAll(list);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (Future<Integer> f : futures) {
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {

            } catch (ExecutionException e) {

            } catch (CancellationException e) {

            }
        }
        executorService.shutdown();
        System.out.println("Hello World !!");
    }
}
