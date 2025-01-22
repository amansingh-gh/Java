package com.digest.corejava.java.Multithreading.threadMethods;

public class MyThread extends Thread{
    @Override
    public void run() {   // 2nd method
        System.out.println("Thread is Running");
        for(int i=0; i<=5; i++){
            try{
            Thread.sleep(1000);   // 3rd method
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1  = new MyThread();
        t1.start(); // 1st method
        t1.join();   // 4th method , t1 wait for main method when it is ended
    }
}

// Thread Methods: start, run, sleep, join, setPriority