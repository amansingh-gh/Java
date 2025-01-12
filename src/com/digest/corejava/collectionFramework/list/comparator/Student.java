package com.digest.corejava.collectionFramework.list.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("BOB", 5.2));
        students.add(new Student("KAL", 7.5));
        students.add(new Student("SAM", 9.3));
        students.add(new Student("AUTH", 5.5));

        students.sort((a, b) -> (int) (a.getGpa() - b.getGpa()));
        for (Student s : students) {
            System.out.println(s.getName() + " : " + s.getGpa());
        }
        System.out.println("CHange:: ");
        Comparator<Student> comparator  = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);

        for (Student s : students) {
            System.out.println(s.getName() + " : " + s.getGpa());
        }
    }
}
