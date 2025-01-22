package com.digest.corejava.java.Exceptions;

import java.io.FileReader;

public class ThrowsKeyword {
    public static void main(String[] args) throws Exception {
        method2();
        System.out.println("HEy");
    }

    public static void method2() throws Exception {
        method1();
    }

    public static void method1() throws Exception {
        FileReader fileReader = new FileReader("a.txt");
    }
}