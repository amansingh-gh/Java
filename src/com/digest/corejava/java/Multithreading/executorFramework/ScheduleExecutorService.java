package com.digest.corejava.java.Multithreading.executorFramework;

import java.util.concurrent.*;

public class ScheduleExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService schedular = Executors.newScheduledThreadPool(1);
        //Method 1 (schedular.schedule)
//        schedular.schedule(() -> System.out.println("Task executed Successfully after 5 sec delay !"), 5, TimeUnit.SECONDS);
//        schedular.shutdown();


        //Method 2 (schedular.scheduleAtFixedRate)
//        schedular.scheduleAtFixedRate(() -> System.out.println("Task executed Successfully  after Every 5 sec delay !"), 5, 1,TimeUnit.SECONDS);


        //Method 3 ( schedular.schedularWithFixedDelay())
        ScheduledFuture<?> scheduledFuture = schedular.scheduleWithFixedDelay(() -> System.out.println("Task executed Successfully  after Every 5 sec delay !"), 1, 3, TimeUnit.SECONDS);

        schedular.schedule(() -> {
            System.out.println("Initiating Shutdown.. ");
            schedular.shutdown();
        }, 15, TimeUnit.SECONDS);

    }
}