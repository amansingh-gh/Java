package com.learningpackage.JavaAdvance.JavaDSA;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 2, 1, 3 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int c_index = arr[i] - 1;
            if (arr[i] != arr[c_index]) {
                swap(arr, i, c_index);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}