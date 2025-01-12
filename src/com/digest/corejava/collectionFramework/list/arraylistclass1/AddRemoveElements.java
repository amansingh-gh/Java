package com.digest.corejava.collectionFramework.list.arraylistclass1;

import java.util.ArrayList;
import java.util.List;

public class AddRemoveElements {
    static void displayCall(int i, List<String> lists) {
        for (String item : lists) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Math.max(10, 20);
        List<String> list = new ArrayList<>();
        list.add("Aman");
        list.add("Kumar");
        list.add("Singh");
        displayCall(1, list);
        // Adding element
        list.add(Integer.valueOf(1), "kumars");
        displayCall(1, list);
    }
}
