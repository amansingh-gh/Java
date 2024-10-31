package com.learningpackage.JavaAdvance.oops.Encapsulation;

public class TestingStudnet {
    public static void main(String[] args) {
        Student student = new Student();

        student.setAge(122);
        System.out.println(student.getAge());

        student.setRollNo(20);
        System.out.println("Your roll no. is: "+student.getRollNo());

        student.setName("");
        System.out.print("Your name is: "+student.getName(""));
    }
}