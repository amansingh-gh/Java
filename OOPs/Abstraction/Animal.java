package com.learningpackage.JavaAdvance.oops.Abstraction;

public abstract class Animal {
    private String Name;
    private int age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void sayHello();

    public void sleep(){
        System.out.println("ZZzzz.....");
    }
}