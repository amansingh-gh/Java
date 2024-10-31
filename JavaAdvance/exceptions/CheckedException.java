package com.learningpackage.JavaAdvance.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
