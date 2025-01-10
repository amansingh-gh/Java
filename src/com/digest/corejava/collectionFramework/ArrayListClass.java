package com.digest.corejava.collectionFramework;


import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(22);
        list.add(11);
        for(int i=0; i<list.size(); i++){
            System.out.println("Element is: "+ list.get(i));
        }
    }
}
