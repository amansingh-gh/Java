package com.digest.corejava.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluation {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Puth");
        Stream<String> abc = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.length() > 3;
                });
        System.out.println("Before terminal operation");
        List<String> result = abc.collect(Collectors.toList());

        System.out.println("After terminal opertaion");
        System.out.println(result);
    }
}
