package com.learningpackage.JavaAdvance.AccessModifier.test;

import com.learningpackage.JavaAdvance.AccessModifier.school.Student;

public class test {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 12;
        student.name = "kelly";
//        student.sayHello();
        Student.sayHello();

    }
}