package com.digest.corejava.java.interfaces.animal;

public interface Animal {
    public abstract void eat();
    void sleep();
    public static void info(){
        System.out.println("This is Animal Info Instance");
    }
    public default void run(){
        System.out.println("Animal is Running");
    }
     default void running(){
        this.eat();
        this.sleep();
         System.out.println("Someone is running");
     }
}