package com.digest.corejava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class interMediiateOperation2 {
    public static void main(String[] args) {

//        filter
        List<String> lists = Arrays.asList("Akshit", "Sam", "Sabun", "Aashmi");
        Stream<String> filteredStream = lists.stream().filter(x -> x.startsWith("A"));
        // no filtering at this time
        long res = filteredStream.count();
        System.out.println(res);

//       2. map
        Stream<String> stringStream = lists.stream().map(String::toUpperCase);
        List<String> upperString = stringStream.collect(Collectors.toList());
        System.out.println(upperString);

//       3. sorted
        Stream<String> sortedStream = lists.stream().sorted();
        Stream<String> sortedStreamUsingComparator = lists.stream().sorted((a, b) -> a.length() - b.length());
        List<String> finalList = sortedStreamUsingComparator.collect(Collectors.toList());
        System.out.println(finalList);


//        4. Distinct
//        eg-1
        System.out.println(lists.stream().filter(x -> x.startsWith("A")).count());

//        eg-2
        List<Person> peoples = Arrays.asList(
                new Person("Sam", 26),
                new Person("Baha", 32),
                new Person("Sam", 26)
        );
        peoples.stream().distinct().forEach(System.out::println);

//        5. limit
        System.out.println(Stream.iterate(1, x -> x + 1).limit(500));

//        6. skip
        Stream<Integer> limit = Stream.iterate(1, x -> x + 1).skip(10).limit(50);
        limit.forEach(x -> System.out.println("Limit: " + x));

//        7. peek
//        Performs an action on each element as it is consumed.
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();

//        6. flatMap
//        handle streams of collections. lists or arrays where each element is itself a collection
        List<List<String>> listofLists = Arrays.asList(
                Arrays.asList("Apple", "Kiwi"),
                Arrays.asList("JackFruit", "orange"),
                Arrays.asList("Banana", "kali")
        );
        System.out.println(listofLists
                .get(0)
                .get(1)
                .toUpperCase());

        System.out.println(listofLists
                .stream()
                .flatMap(x -> x.stream())
                .map(String::toUpperCase)
                .toList());


    }
}

class Person {
    public String name;
    public int age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}