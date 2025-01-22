package com.digest.corejava.java.Multithreading.executorFramework;

import java.util.concurrent.CountDownLatch;


public class CountDownLatchMethodRunnable {
    public static void main(String[] args) throws Exception, InterruptedException {
        int numberOfServices = 3;
        CountDownLatch latch = new CountDownLatch(numberOfServices);
        for (int i=0; i<numberOfServices; i++){
            new Thread(new DependentService(latch)).start();
        }
        latch.await();
        System.out.println("Main");


        try {
            latch.await(); // Wait for all services to complete
            System.out.println("All services are up and running!");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted while waiting for services.");
        } finally {
//            executorService.shutdown();
        }
    }

    static class DependentService implements Runnable {
        private final CountDownLatch latch;

        public DependentService(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run()  {
            try {
                System.out.println(Thread.currentThread().getName() + " service started.");
                try {
                    Thread.sleep(2000); // Simulate service startup time
                } catch (InterruptedException e) {
                }
                System.out.println(Thread.currentThread().getName() + " service completed.");
            } finally {
                latch.countDown(); // Decrement the latch count
            }
            }
    }
}
