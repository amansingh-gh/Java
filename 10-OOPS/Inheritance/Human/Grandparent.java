package com.learningpackage.JavaAdvance.oops.Inheritance.Human;

public class Grandparent {
    private String name;
    private int age;
    private boolean hasSuperPower;

    public boolean HasSuperPower() {
        return hasSuperPower;
    }

    public Grandparent(){
        hasSuperPower = false;
        System.out.println("GrandParent constructor called");
    }

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
}
