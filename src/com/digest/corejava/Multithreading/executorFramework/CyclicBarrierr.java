package com.digest.corejava.Multithreading.executorFramework;

import java.util.concurrent.*;

public class CyclicBarrierr {
    public static void main(String[] args) throws Exception, InterruptedException {

        int numberOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);
        CyclicBarrier barrier = new CyclicBarrier(numberOfServices);
        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));
        System.out.println("Main");
        executorService.shutdown();

    }
}

class DependentService implements Callable<String> {
    private final CyclicBarrier barrier;

    public DependentService(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " service started.");
        Thread.sleep(1000); // Simulate service startup time
        System.out.println(Thread.currentThread().getName() + " is waiting at the barrier.");
        barrier.await();
        return "OK";
    }
}