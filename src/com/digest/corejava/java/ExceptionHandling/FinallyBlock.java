package com.digest.corejava.java.ExceptionHandling;

public class  FinallyBlock{
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Hello World!!");

        try{
            System.out.println(a[8]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This is finally block, this will run everytime");
        }
        System.out.println("Biee World !!");
    }
}