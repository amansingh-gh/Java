package com.digest.corejava.java.collectionFramework.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    //    double-ended queue
//    allows insertion and removal of elements from both ends.
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.offerFirst(30);
        deque.offerLast(40);

        System.out.println(deque.stream().toList());  // 30,10,20,40
        System.out.println(deque.removeFirst());

    }
}
