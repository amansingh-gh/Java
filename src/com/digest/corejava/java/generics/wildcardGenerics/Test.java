package com.digest.corejava.java.generics.wildcardGenerics;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

    }

    public void printArray(ArrayList<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
