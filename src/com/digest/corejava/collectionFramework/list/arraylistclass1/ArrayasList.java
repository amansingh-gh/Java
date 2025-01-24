package com.digest.corejava.collectionFramework.list.arraylistclass1;

// Returns a fixed-size list, and we can't add element, we only replaces the element.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayasList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // In the upper paraenthesis we can give the capacity or collection/list, like I passed in line number : 21.
        System.out.println(list.getClass().getName());

        //  M-1
        List<String> list1 = Arrays.asList("Monday", "Tuesday");
//        list1.add("SUNDAY !");
        System.out.println(list1.get(1));

        //  M-2
        String array[] = {"Apple", "Banana"};
        List<String> list2 = Arrays.asList(array);
        for (String x : array) {
            System.out.print(x + "\n");
        }
    }
}