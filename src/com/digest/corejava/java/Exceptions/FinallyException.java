package com.digest.corejava.java.Exceptions;

public class FinallyException {
    public static void main(String[] args) {
        System.out.println(divide(5,2));
    }
    public static int divide(int a, int b){
        try{
            return a/b;
        }catch (Exception e){
            return -1;
        }finally {
            System.out.println("Either try or catch the finally block is executed always");
        }
    }
}
