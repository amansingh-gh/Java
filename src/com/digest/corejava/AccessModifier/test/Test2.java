package com.digest.corejava.AccessModifier.test;

import com.digest.corejava.AccessModifier.school.Student2;

public class Test2 {
    public static void main(String[] args) {
        Student2 student2 = new Student2();
        student2.name = "Hitesh";
        student2.Age = 20;
        student2.sayHello();
    }
}