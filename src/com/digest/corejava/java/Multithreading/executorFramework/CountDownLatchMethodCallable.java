package com.digest.corejava.java.Multithreading.executorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchMethodCallable {
    public static void main(String[] args) throws Exception, InterruptedException {
        int numberOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);
        CountDownLatch latch = new CountDownLatch(numberOfServices);
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        latch.await();
        System.out.println("Main");
        executorService.shutdown();

//        for (int i = 0; i < numberOfServices; i++) {
//            executorService.submit(new DependentService(latch));
//        }

        try {
            latch.await(); // Wait for all services to complete
            System.out.println("All services are up and running!");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted while waiting for services.");
        } finally {
            executorService.shutdown();
        }
    }

    static class DependentService implements Callable<String> {
        private final CountDownLatch latch;

        public DependentService(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public String call() throws Exception {
            try {
                System.out.println(Thread.currentThread().getName() + " service started.");
                Thread.sleep(2000); // Simulate service startup time
                System.out.println(Thread.currentThread().getName() + " service completed.");
            } finally {
                latch.countDown(); // Decrement the latch count
            }
            return "OK";
        }
    }
}
