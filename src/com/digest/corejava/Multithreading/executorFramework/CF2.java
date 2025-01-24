package com.digest.corejava.Multithreading.executorFramework;

import java.util.concurrent.CompletableFuture;

public class CF2 {
    public static void main(String[] args) {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("WORKER THREAD 1");
            } catch (Exception e) {

            }
            return "OK";
        });

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("WORKER THREAD 2");
            } catch (Exception e) {

            }
            return "OK";
        });

        CompletableFuture<Void> f =CompletableFuture.allOf(f1,f2);
        f.join();

        System.out.println("MAIN");
    }
}
