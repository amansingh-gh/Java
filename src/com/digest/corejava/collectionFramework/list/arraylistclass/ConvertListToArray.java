package com.digest.corejava.collectionFramework.list.arraylistclass;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Aman");
        list.add("Singh");

        Object[] arrays = list.toArray();
        Integer[] arry1 = list.toArray(new Integer[0]);
    }
}
