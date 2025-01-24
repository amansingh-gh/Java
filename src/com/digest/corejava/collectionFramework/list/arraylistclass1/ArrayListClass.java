package com.digest.corejava.collectionFramework.list.arraylistclass1;


import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(22);
        list.add(11);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element is: " + list.get(i));
        }
        for (int x : list) {
            System.out.println(x);
        }
        System.out.println(list.contains(20));
        list.remove(2);
        list.add(420);
        list.add(0, 70);

        list.set(0, 80);    // Replace value with given index value ( i.e: 0 ).

        for (int x : list) {      // Iterate on each element and prints.
            System.out.print(x + " , ");
        }

        System.out.println(list); // prints the array of list.
    }
}
