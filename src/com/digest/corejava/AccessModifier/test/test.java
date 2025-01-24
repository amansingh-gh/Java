package com.digest.corejava.AccessModifier.test;

import com.digest.corejava.AccessModifier.school.Student;

public class test {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 12;
        student.name = "kelly";
//        student.sayHello();
        Student.sayHello();

    }
}