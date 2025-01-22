package com.digest.corejava.java.collectionFramework.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
//        part of the queue interface
//        order elements based on their natural ordering (for primitives lowes first)
//        custom comparator for customized ordering
//        doesn't allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(20);
        pq.add(30);
//        System.out.println(pq.remove());
//        System.out.println(pq.peek());
        System.out.print(" " + pq); // not sorted
        System.out.println();

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}
