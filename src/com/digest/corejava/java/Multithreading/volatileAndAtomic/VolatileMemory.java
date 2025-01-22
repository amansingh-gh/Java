package com.digest.corejava.java.Multithreading.volatileAndAtomic;

class SharedObj {
    // using volatile keyword to give permission to read directly from the main memory.
    // if volatile keyword is not written it means they says read the value from the cache.
    // if programs are complex then we don't use volatile.
    private volatile boolean flag = false;

    public void setFlagTrue() {
        System.out.println("Writer thread made the Flag is true !");
        flag = true;
    }

    public void printIfFlagTrue() {
        while (!flag) {
            // do nothing !!
        }
        System.out.println("Flag is true now !");
    }
}

public class VolatileMemory {
    public static void main(String[] args) {
        SharedObj sharedObj = new SharedObj();
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
                sharedObj.setFlagTrue(); // Update the flag after sleep
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread readerThread = new Thread(() -> sharedObj.printIfFlagTrue());
        writerThread.start();
        readerThread.start();
    }
}
