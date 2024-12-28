package com.digest.corejava.WrapperGenericClass;

public class WrapperClass {

    public static void main(String[] args) {
        Integer obj = new Integer(5);
        Integer obj2 = Integer.valueOf(90);

        Integer obj3 = obj;  //autoboxing

        int val = obj3;     // unboxing
        System.out.println(val);

        // we can convert string into int || string into boolean
        Integer num1 = new Integer("100");
        System.out.println(num1*5);

        Boolean bool1 = new Boolean("true");
        System.out.println(bool1);
    }
}
