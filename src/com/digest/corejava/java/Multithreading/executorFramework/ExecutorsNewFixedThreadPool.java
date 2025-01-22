package com.digest.corejava.java.Multithreading.executorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsNewFixedThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Integer> submit = executorService.submit(()-> 1+2);
        Integer i = submit.get();
        System.out.println("Sum is: "+i);
        executorService.shutdown();
        System.out.println(executorService.isShutdown());
        Thread.sleep(1);
        System.out.println(executorService.isTerminated());
    }
}