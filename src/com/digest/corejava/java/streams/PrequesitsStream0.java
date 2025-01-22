package com.digest.corejava.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class PrequesitsStream0 {
    public static void main(String[] args) {

        // Lambda Expression
        MathOperation sumOperation = (a, b) -> a + b;
        System.out.println(sumOperation.operate(2, 5));

        // Predicate
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));
        Predicate<String> isA = str -> str.toUpperCase().startsWith("A");
        System.out.println(isA.test("a"));

        // Function
        Function<Integer, Integer> doubleIt = x -> x * x;
        System.out.println(doubleIt.apply(100));  // doubling
        Function<Integer, Integer> tripleIt = x -> x * x * x;
        System.out.println(tripleIt.apply(5));  //tripling
        System.out.println(doubleIt.andThen(tripleIt).apply(5));  // double then triple
        System.out.println(doubleIt.compose(tripleIt).apply(5));  // triple then double
        Function<Integer, Integer> iden = Function.identity();
        System.out.println(iden.apply(21));   // return the same output


        // Consumer
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(5);
        List<Integer> list = Arrays.asList(12, 13, 45, 80);
        Consumer<List<Integer>> printList = x -> {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        };
        printList.accept(list);


        // Supplier
        Supplier<Integer> giveHello = () -> 23;
        System.out.println(giveHello.get());


        // BiPredicate, BiFunction, // BiConsumer
        BiPredicate<Integer, Integer> chkEvn = (x, y) -> (x + y) % 2 == 0;
        System.out.println(chkEvn.test(2, 6));


        // Unary Operator
        // Binary Operator


        // Method Reference
        List<String> students = Arrays.asList("Ram", "Shyam", "Sman");
        students.forEach(System.out::println);

        // Constructor reference
        List<String> name = Arrays.asList("A", "B", "C");
        name.stream().map(MobilePhones::new).collect(Collectors.toList());
    }

}

class MobilePhones {
    String name;

    public MobilePhones(String name) {
        this.name = name;
    }
}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
