package com.digest.corejava.Multithreading.stThreadThroughExtendThreadClass;

public class World extends Thread {
    @Override
    public void run() {
        for (; ; ) {
//            System.out.println("World");
            System.out.println(Thread.currentThread().getName());
        }
    }
}