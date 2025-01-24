package com.digest.corejava.collectionFramework.list.comparator2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class comClass {
    static class MyStringComparator1 implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o2.length() - o1.length();
        }
    }

    class MyComparator2 implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(244);
        list.add(29);
        list.add(44);
        list.sort(null);
        for (int i : list) {
            System.out.println(i);
        }


//        List<String> list1 = new ArrayList<>();
//        list1.add("AKS");
//        list1.add("VKA");
//        list1.add("BKS");
////        list1.sort(new MyComparator1());
//        for (String i : list1) {
//            System.out.println(i);
//        }

//        List<String> words = Arrays.asList("SAM", "Sabun", "AKS", "BKS");
        List<Integer> words = Arrays.asList(21,22,32,54,1,23);
//        words.sort(new MyStringComparator1());
        words.sort((a,b)->{
//           return a.length()-b.length();
            return b-a;
        });
        System.out.println(words);
    }
}
