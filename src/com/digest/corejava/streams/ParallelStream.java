package com.digest.corejava.streams;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> list1 = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorialList = list1.stream().map(ParallelStream::factorial).toList();
//        List<Long> factorialList = list1.stream().map(ParallelStream::factorial).sequential().toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by sequential stream: " + (endTime - startTime) + "ms");


        startTime = System.currentTimeMillis();
        factorialList = list1.parallelStream().map(ParallelStream::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by Parallel stream: " + (endTime - startTime) + "ms");


        //    commutative sum : {1,2,3,4,5} -> {1,3,6,10,15}
        List<Integer> commutativeInt = Arrays.asList(1, 2, 3, 4, 5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> commutativeSum = commutativeInt.parallelStream().map(x -> sum.addAndGet(x)).toList();
        System.out.println(commutativeSum);
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result += i;
        }
        return result;
    }
}