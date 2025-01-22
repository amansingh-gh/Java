package com.digest.corejava.java.collectionFramework.list.linkedListClass3;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);
        linkedList.add(15);

        System.out.println(linkedList);
        linkedList.addFirst(0);  // 0(1)
        System.out.println(linkedList);
        linkedList.addLast(100);
        System.out.println(linkedList);
        linkedList.removeIf(x -> x % 2 == 0);
        System.out.println(linkedList);


        // Working of remoeAll() Method.
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Dog", "Cat", "Lion"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog"));
        linkedList.removeAll(animalsToRemove);
        System.out.println(animalsToRemove);
    }
}
