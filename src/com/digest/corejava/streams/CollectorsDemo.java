package com.digest.corejava.streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Alice", "Bob", "Panther", "Amla", "Alice");
//        1. Collecting to a List
        List<String> res = list1.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

//        2. Collecting to a set
        Set<String> list2 = list1.stream()
                .filter(names -> names.startsWith("A"))
                .collect(Collectors.toSet());
        System.out.println(list2);

//        3. COllecting ot a specified collections
        ArrayDeque<String> collect = list1.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println(collect);

//        4. Joining Strings
//        concatenate stream elements into a single String
        String collect1 = list1.stream().map(String::toUpperCase).collect(Collectors.joining(" , "));
        System.out.println(collect1);

//        5. Summarizing Data
//        Generates statistical summary (count, sum, min, average, max)
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11, 18, 13);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());

        //        6. Calculating Average
        Double collect2 = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(collect2);

//        7. Counting Elements
        System.out.println(numbers.stream().collect(Collectors.counting()));

//        8. Grouping Elements
        List<String> words = Arrays.asList("Mine", "Hello", "Cool");
        System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length())));

//      9. Partitioning Element
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 3)));

//        10. Mapping and Collecting
        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));

//        Examples
//        Ex - 1 : Collecting names by length
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "Panher", "Kal", "Sanu", "Prtim");
        System.out.println(names.stream().collect(Collectors.groupingBy(x -> x.length() > 4)));

//        Ex-2: Counting word occurences
        String sentence = "Hello world hello java world";
        Map<String, Long> collect3 = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect3);

//        Ex - 3 : Partitioning Even and odd Numbers
        List<Integer> list12 = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(list12.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));

//        Ex - 4 :: Summing values in a map
        Map<String, Integer> items = new HashMap<>();
        items.put("Aplle", 20);
        items.put("Banana", 10);
        items.put("Kiwi", 15);
        System.out.println(items.values().stream().collect(Collectors.summarizingInt(x -> x)));

//        Ex-5 :: Creating a Map from Stream Elements
        List<String > fruits = Arrays.asList("Apple","Banana","Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(x->x.toUpperCase(),x->x.length())));
    }
}
