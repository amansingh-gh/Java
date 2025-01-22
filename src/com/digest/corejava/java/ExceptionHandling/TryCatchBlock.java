package com.digest.corejava.java.ExceptionHandling;

public class TryCatchBlock{
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println(a[0]);


        try{
            // int res = 40/0;
            System.out.println(a[5]);
        }
        // catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
        //     System.out.println(e);
        //     System.out.println(e.getMessage());
        // }

        catch(Exception e){
            System.out.println("All exception printing, " + e.getMessage());
        }

    }
}