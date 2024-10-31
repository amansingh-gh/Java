package com.learningpackage.JavaAdvance.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
// Forcefully throwring error we use throw keyword
public class ThrowKeyword {
    public static void main(String[] args) throws FileNotFoundException {
        method2();
        System.out.println("Hey");
    }
    public static void method2() throws FileNotFoundException {
        try{
            FileReader fileReader = new FileReader("a.txt");
        }catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
            throw new FileNotFoundException("File not found"+ e);
        }
    }
}