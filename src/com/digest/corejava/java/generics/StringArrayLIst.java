package com.digest.corejava.java.generics;

import java.util.ArrayList;

public class StringArrayLIst {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        // Declering arraylist
//        ArrayList list = new ArrayList();
//        // arraylist mae object type ke values ham store kr skte hai
//        // Initializing arraylist
//        list.add(55);
//        list.add("Hey");
//        list.add(4.5);
//
//
//        String str = (String) list.get(0);
//        System.out.println(str);
//
//        Integer num = (Integer) list.get(1);
//        System.out.println(num);


        // To overcome the thread safety we use generics here
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Singh");
        list2.add("aa");
        String s1 = list2.get(1);
        System.out.println(s1);


    }
}
