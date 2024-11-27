//package com.learningpackage.JavaAdvance.multithreading.locks.readWriteLock;
//
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReadWriteLock;
//import java.util.concurrent.locks.ReentrantReadWriteLock;
//
//public class ReadWrite {
//    private int count = 0;
//    private final ReadWriteLock lock = new ReentrantReadWriteLock();
//    private final Lock readLock = lock.readLock();
//    private final Lock writeLock = lock.writeLock();
//
//    public void counter() {
//        writeLock.lock();
//        try {
//            count++;
//        } catch (Exception e) {
//
//        } finally {
//            writeLock.unlock();
//        }
//    }
//
//    public int getCount() {
//        readLock.lock();
//        try {
//            return count;
//        } finally {
//            readLock.unlock();
//        }
//    }
//
//    public static void main(String[] args) {
//        ReadWriteLock counter = new ReadWriteLock() {
//
//            Runnable readTask = new Runnable() {
//                @Override
//                public void run() {
//                    for(int i=0; i<10; i++){
////                        System.out.println(Thread.currentThread().getName()+ " read: "+counter.);
//                    }
//                }
//            }
//
//            @Override
//            public Lock readLock() {
//                return null;
//            }
//
//            @Override
//            public Lock writeLock() {
//                return null;
//            }
//        }
//    }
//
//}
