package com.digest.corejava.Multithreading;

class SharedObj {
    private boolean flag = false;

    public void setFlagTrue() {
        System.out.println("Writer thread made the Flag is true !");
        flag = true;
    }

    public void printFlagTrue() {
        while (!flag) {
            // do nothing !!
        }
        System.out.println("Flag is true now !");
    }
}

public class VolatileMemory {
    public static void main(String[] args) {
        SharedObj sharedObj = new SharedObj();
        Thread WriterThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        });
        Thread readerThread = new Thread(() -> sharedObj.printFlagTrue());
        WriterThread.start();
        readerThread.start();
    }
}
