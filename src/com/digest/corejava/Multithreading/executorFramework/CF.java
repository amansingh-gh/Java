package com.digest.corejava.Multithreading.executorFramework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CF {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("WORKER THREAD");
            } catch (Exception e) {

            }
            return "OK";
        });
        String s = null;
        try {
            s = completableFuture.get();
//            s = completableFuture.getNow("NOOO");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println(s);
        System.out.println("MAIN");
    }
}