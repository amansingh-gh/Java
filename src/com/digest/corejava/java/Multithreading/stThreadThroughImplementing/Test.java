package com.digest.corejava.java.Multithreading.stThreadThroughImplementing;

public class Test {
    public static void main(String[] args) {
        World2Imp world2Imp = new World2Imp();
        Thread t1 = new Thread(world2Imp);
        t1.start();
        for (; ; ) {
            System.out.println("HElloWW");
        }
    }
}