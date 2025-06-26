package com.digest.corejava.javainonevid.multithreading;

public class Count extends Thread {
    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 500000000; i++) {
            if (i % 10 == 7) {
                count++;
            }
        }
    }
}