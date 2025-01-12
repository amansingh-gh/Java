package com.digest.corejava.collectionFramework.list.vector4;

import java.util.Vector;

public class VectorThreadSafe {
    public static void main(String[] args) {
        Vector<Integer> vect1 = new Vector<>(5,2);
        vect1.add(10);
        vect1.add(1);
        vect1.add(1);
        vect1.add(1);
        vect1.add(1);
        vect1.add(1);
        System.out.println(vect1);
        System.out.println(vect1.capacity());
        System.out.println(vect1.isEmpty());
        System.out.println(vect1.removeFirst());
        System.out.println(vect1);

    }
}
