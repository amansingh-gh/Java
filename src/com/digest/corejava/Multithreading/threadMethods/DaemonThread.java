package com.digest.corejava.Multithreading.threadMethods;

public class DaemonThread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("DAEMON THREAD.......");
        }
    }

    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread();
        t1.setDaemon(true);
        t1.start();
        System.out.println("MAIN DONE>>>>>>>>");
    }
}
