package com.digest.corejava.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperation4 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 2, 2, 3, 4, 5);

//      1.  Collect
//        List<Integer> collect = list.stream().skip(1).collect(Collectors.toList()); // bpth lines are same.
        List<Integer> collect = list.stream().skip(1).toList();
        System.out.println(collect);

//    2.    forEach
//        list.stream().forEach(x-> System.out.println(x));   // both lines same.
        list.forEach(System.out::println);

//        3. reduce
        Optional<Integer> optionalInteger = list.stream().reduce((x, y) -> x + y);
        System.out.println(optionalInteger.get());

//        4. count

//        5. anyMatch , allMatch, nonMatch
//        Below-mentioned every lines stop when it, find any of the value from the list
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);
        boolean b1 = list.stream().allMatch(x -> x > 0);  // when every element satisfied the condition
        boolean b2 = list.stream().noneMatch(x -> x < 0);  // when every element not satisfied the condition
        System.out.println(b2);

//        6. findFirst, findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());


//        7. toArray()
        Object[] array = Stream.of(1, 2, 3).toArray();


//        8. Min/Max
        List<Integer> listN = Arrays.asList(10, 20, 30, 41, 51, 9, 12);
        System.out.println("Max is: " + Stream.of(2, 44, 96, 69).max(Comparator.naturalOrder()));
        System.out.println("Min is: " + Stream.of(2, 44, 96, 69).min(Comparator.naturalOrder()));

//        9. forEachOrdered
        List<Integer> numbers = Arrays.asList(10, 2, 2, 3, 4, 5);
    }
}