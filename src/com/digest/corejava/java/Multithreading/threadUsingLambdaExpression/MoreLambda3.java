package com.digest.corejava.java.Multithreading.threadUsingLambdaExpression;

public class MoreLambda3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i=0; i<100; i++){
                System.out.println(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=1000; i<2001; i++){
                System.out.println(i);
            }
        });
        t1.start();
        t2.start();
    }
}
