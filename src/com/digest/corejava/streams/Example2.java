package com.digest.corejava.streams;

import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {

//        Ex: Filtering and collecting namess
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "Smith", "Kal");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

//        Ex: squaring and sorting numbers
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(nums1.stream().map(x -> x * x).sorted().toList());

//        Ex: Summing vlaues
        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(nums2.stream().reduce((Integer::sum)).get());

//        Ex: Count the string
        String sentence = "Hey Buddy";
        System.out.println(sentence.chars().filter(x -> x == 'H').count());
    }
}