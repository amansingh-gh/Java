package com.digest.corejava.java.Multithreading.threadUsingLambdaExpression;

public class Lambda {
    public static void main(String[] args) {

        // Normal Expression
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + " Good to see you");
//            }
//        };

        // Lambda Expression
        Runnable runnable = () -> System.out.println(Thread.currentThread().getName() + " Good to see you");
        Thread t1 = new Thread(runnable, "Thread-1");
        t1.start();
    }
}