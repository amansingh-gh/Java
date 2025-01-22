package com.digest.corejava.java.collectionFramework.list.copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyArray {
    public static void main(String[] args) {
        ArrayList<Integer> arry = new ArrayList<>();
        arry.add(21);
        arry.add(22);
        arry.add(24);
        arry.add(25);
        System.out.println("Original ArrayList: " + arry);

        // To avoid ConcurrentModificationException, collect changes and apply later
        ArrayList<Integer> toAdd = new ArrayList<>();
        for (Integer i : arry) {
            if (i.equals(24)) {
                toAdd.add(23);
            }
        }
        arry.addAll(toAdd); // Apply changes after iteration
        System.out.println("Now ArrayList is: " + arry);

        // Using CopyOnWriteArrayList
        CopyOnWriteArrayList<Integer> arry1 = new CopyOnWriteArrayList<>();
        arry1.add(21);
        arry1.add(22);
        arry1.add(24);
        arry1.add(25);
        System.out.println("Original CopyOnWriteArrayList: " + arry1);


        // Below loop runs in snapshot after iteration ends copied array ko original array ke barabar kr diya jata hai
        for (Integer i : arry1) {
            if (i.equals(24)) {
                arry1.add(23); // This is safe with CopyOnWriteArrayList
                System.out.println("Ending");
            }
        }
        System.out.println("Now CopyOnWriteArrayList is: " + arry1);
    }
}
