package com.learningpackage.JavaAdvance.oops.Constructor;

public class Student {

    // Encapsulation is the mechanism through which we can wrapping the data members and member method of a class in a single unit called encapsulation.

    private String name;
    private int RollNo;
    private int age;

    public Student(String name, int RollNo, int age){
        this.age = age;
        this.RollNo = RollNo;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int RollNo){
        this.RollNo = RollNo;
    }
    public int getRollNo(){
        return RollNo;
    }
}