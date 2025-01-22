package com.digest.corejava.java.Multithreading.executorFramework;

import java.util.concurrent.*;

public class ExecutorNewSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> future = executorService.submit(() -> {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 42;
        });
        Integer i = null;
        try {
            i = (Integer) future.get(1, TimeUnit.SECONDS);
            System.out.println(future.isDone());
            System.out.println(i);
        } catch (TimeoutException | InterruptedException | ExecutionException e) {
            System.out.println("Exception occured : "+e);
        }
    }
}