package com.digest.corejava.java.Multithreading.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsnewCachedThreadPool {
    public static void main(String[] args) {
        // newCachedThreadPool : adjusts dynamically pool size,
        //                       threads created when needed and terminated after 60S of inactive activity
        //                        newCachedThreadPool is used when we don't know the load and how many task allocated
        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}
