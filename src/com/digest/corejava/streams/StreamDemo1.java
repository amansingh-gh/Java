package com.digest.corejava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> isEven = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(isEven.stream().filter(x -> x % 2 == 0).count());

//   Creating Stream
//        1. From Collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();

//        2. From Arrays
        String[] array = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array);

//        3. Using Stream.of()
        Stream<String> stream2 = Stream.of("A", "b", "C");

//        4. Infinite Streams
        Stream<Integer> gene = Stream.generate(() -> 1);
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(50).collect(Collectors.toList());
        System.out.println(collect);
    }
}