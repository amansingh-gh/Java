package com.digest.corejava.Multithreading.stThreadThroughImplementing;

public class World2Imp implements Runnable {
    @Override
    public void run() {
        for (; ; ) {
            System.out.println("World");
        }
    }
}