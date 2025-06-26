package com.digest.corejava.javainonevid.multithreading;

public class Sum implements Runnable {
    @Override
    public void run() {
        int sum=0;
        for(int i=0; i<1000000000; i++){
            sum+=i;
        }
    }
}
