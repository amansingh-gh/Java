package com.digest.corejava.Exceptions;

public class division {
    public static void main(String[] args) {
        int a = 10, b=0;
        for(int i=1; i<10; i++){
            try{
                System.out.print(i +" ," );
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Out of bound");
            }
        }
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
