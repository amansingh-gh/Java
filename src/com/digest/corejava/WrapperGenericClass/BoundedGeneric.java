package com.digest.corejava.WrapperGenericClass;

public class BoundedGeneric {
    public static void main(String[] args) {
        BoundedGeneric obj = new BoundedGeneric();
        obj.typeTest(1223);
    }    

    // Adds the bounding using "extends Number"
    <E extends Number> void typeTest(E data){
        System.out.println(data);
    }
}
