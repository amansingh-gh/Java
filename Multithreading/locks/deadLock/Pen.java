//package com.learningpackage.JavaAdvance.multithreading.locks.deadLock;
//
//// Pen class represents a resource with synchronized methods
//public class Pen {
//    // Synchronized method: One thread at a time can use this method
//    public synchronized void writeWithPenAndPaper(Paper paper) {
//        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to write on paper");
//
//        // Simulating deadlock by calling synchronized method on another object
//        System.out.println(Thread.currentThread().getName() + " is waiting for paper to finish writing");
//        paper.finishWriting();
//    }
//
//    // Another synchronized method
//    public synchronized void finishWriting() {
//        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
//    }
//}
//
//// Paper class represents another resource with synchronized methods
//class Paper {
//    // Synchronized method: One thread at a time can use this method
//    public synchronized void writeWithPaperAndPen(Pen pen) {
//        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to write with pen");
//
//        // Simulating deadlock by calling synchronized method on another object
//        System.out.println(Thread.currentThread().getName() + " is waiting for pen to finish writing");
//        pen.finishWriting();
//    }
//
//    // Another synchronized method
//    public synchronized void finishWriting() {
//        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
//    }
//}
//
//// Task1 tries to write using pen and paper
//class Task1 implements Runnable {
//    private Pen pen;
//    private Paper paper;
//
//    public Task1(Pen pen, Paper paper) {
//        this.pen = pen;
//        this.paper = paper;
//    }
//
//    @Override
//    public void run() {
//        // Task1 writes with pen and paper
//        pen.writeWithPenAndPaper(paper);
//    }
//}
//
//// Task2 tries to write using paper and pen
//class Task2 implements Runnable {
//    private Pen pen;
//    private Paper paper;
//
//    public Task2(Pen pen, Paper paper) {
//        this.pen = pen;
//        this.paper = paper;
//    }
//
//    @Override
//    public void run() {
//        // Task2 writes with paper and pen
//        paper.writeWithPaperAndPen(pen);
//    }
//}
//
//// Deadlock class demonstrates the issue
//public class Deadlock {
//    public static void main(String[] args) {
//        // Creating shared resources
//        Pen pen = new Pen();
//        Paper paper = new Paper();
//
//        // Creating tasks with shared resources
//        Task1 task1 = new Task1(pen, paper);
//        Task2 task2 = new Task2(pen, paper);
//
//        // Starting threads
//        Thread thread1 = new Thread(task1, "Thread-1");
//        Thread thread2 = new Thread(task2, "Thread-2");
//
//        thread1.start();
//        thread2.start();
//
//        // Observing potential deadlock
//    }
//}
