package com.learningpackage.JavaAdvance.oops.Polymorphism;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(12);
        dog.setName("Carrot");
        dog.eat();
        dog.sayHi();
        dog.getName();
        dog.sum(5,15);   // Method overloading
    }
}
