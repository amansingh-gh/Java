package com.learningpackage.JavaAdvance.wrapperClass;

import java.util.ArrayList;
import java.util.List;

public class Wrap {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(5);
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1, 50);
        for (Integer number : list) {
            System.out.println(list);
        }
    }
}