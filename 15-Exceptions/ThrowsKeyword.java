package com.learningpackage.JavaAdvance.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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