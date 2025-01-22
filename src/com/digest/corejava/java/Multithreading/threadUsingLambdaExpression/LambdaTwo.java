package com.digest.corejava.java.Multithreading.threadUsingLambdaExpression;

public class LambdaTwo {
    public static void main(String[] args) {
        Runnable runnable = () ->{
            System.out.println("Hey This is called from lambda function");
        };
    }
}
