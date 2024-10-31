package com.learningpackage.JavaAdvance.oops.Inheritance.Janwar;

public class Test {
    public static void main(String[] args) {
        Animal bob = new Dog();    // Reference of Parent class
        bob.sayHi();               // So it can only allow methods defined in Parent class

        Dog dog = new Dog();
        dog.sayBie();
    }
}
