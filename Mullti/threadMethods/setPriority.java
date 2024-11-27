package com.learningpackage.JavaAdvance.Mullti.threadMethods;

public class setPriority extends Thread {
    public setPriority(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + "+ - count: " + i);
            try {

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
//        setPriority t1 = new setPriority("Normal");
        setPriority l = new setPriority("Low Priority");
        setPriority m = new setPriority("Medium Priority");
        setPriority h = new setPriority("High Priority");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}