package com.learningpackage.JavaAdvance.oops.Inheritance.Janwar;

public class Animal {
     private String name;
     private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("Animal is Eating food");
    }


    public void sayHi(){
        System.out.println("Nothing Sound");
    }
}
