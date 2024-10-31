package com.learningpackage.JavaAdvance.interfaces.animal;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}