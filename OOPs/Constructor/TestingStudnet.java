package com.learningpackage.JavaAdvance.oops.Constructor;

public class TestingStudnet {
    public static void main(String[] args) {
        Student student = new Student("Ram",15,14);
        System.out.println("Name is: "+student.getName());
        System.out.println("Age is: "+student.getAge());
        System.out.println("Roll is: "+student.getRollNo());

    }
}