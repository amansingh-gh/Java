package com.digest.corejava.java.Multithreading.executorFramework;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        int numberOfSystem = 4;
        CyclicBarrier barrier = new CyclicBarrier(numberOfSystem, new Runnable() {
            @Override
            public void run() {
                System.out.println("All Tasks are Completed.");
            }
        });
        Thread webServer =  new Thread(new Subsystem("web server", 1000, barrier));
        Thread Database = new Thread(new Subsystem("DB", 2000, barrier));
        Thread MessageSending = new Thread(new Subsystem("MessageSending", 2000, barrier));

        webServer.start();
        Database.start();
        MessageSending.start();

    }
}
class Subsystem implements Runnable{
    private String name;
    private int initializerTime;
    private CyclicBarrier barrier;

    public Subsystem(String name, int initializer, CyclicBarrier barrier) {
        this.name = name;
        this.initializerTime = initializerTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try{
            System.out.println(name + " initilization started !");
            Thread.sleep(initializerTime);
            System.out.println(name + " initilization completed");
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}