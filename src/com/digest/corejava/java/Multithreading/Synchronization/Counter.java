package com.digest.corejava.java.Multithreading.Synchronization;

public class Counter {
    private int count = 0;

    // Synchronized Method
//    public synchronized void increment(){
//        count++;
//    }


    // Synchronized Block
    public void increment(){
        synchronized (this){
        count++;
        }
    }

    public int getCount(){
        return count;
    }
}
