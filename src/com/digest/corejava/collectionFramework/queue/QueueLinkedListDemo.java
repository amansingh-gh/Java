package com.digest.corejava.collectionFramework.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueLinkedListDemo {
    public static void main(String[] args) {

        Queue<Integer> queue1 = new LinkedList<>();
        System.out.println(queue1.size());
        queue1.add(1);
        System.out.println(queue1.remove());  // throw exception if empty
        System.out.println(queue1.poll());   // null if empty

//        System.out.println(queue1.element());
        System.out.println(queue1.peek());    // null

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(100));
        System.out.println(queue2.offer(101));

        System.out.println(queue2.add(222) );  // throws exception because the seat is for only 2.
        System.out.println(queue2.offer(19));  //  false
    }
}
