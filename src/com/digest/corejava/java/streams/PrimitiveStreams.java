package com.digest.corejava.java.streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(nums);
        System.out.println(stream);
        System.out.println(IntStream.range(1, 5).boxed().collect(Collectors.toList())); // 5 Exclusive
        System.out.println(IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList())); // 5 Inclusive

        DoubleStream doubles = new Random().doubles(5);
        System.out.println(doubles.boxed().toList());

        IntStream ints = new Random().ints(5);
        System.out.println(ints.boxed().toList());
    }
}
