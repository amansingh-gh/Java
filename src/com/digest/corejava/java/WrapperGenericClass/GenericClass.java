package com.digest.corejava.java.WrapperGenericClass;

public class GenericClass{
    public static void main(String[] args) {
       Dog<Integer, String> d1 = new Dog<>(10, "Tom"); 
       System.out.println(d1.funCall());       
    }
}

class Dog<E,V>{
    E id;
    V name;

    public Dog(E id, V name){
        this.id = id;
        this.name = name;
    }
    E funCall(){
        return id;
    }

}