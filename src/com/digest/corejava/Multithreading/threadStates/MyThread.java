package com.digest.corejava.Multithreading.threadStates;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();       // NEW
        System.out.println(t1.getState());
        t1.start();                           // RUNNABLE
        System.out.println(t1.getState());
        t1.sleep(100);                 // TIMED_WAITING
        System.out.println(t1.getState());
        t1.join();   // main method will wait t1 to get finish.
        System.out.println(t1.getState());              // TERMINATED

    }
}
