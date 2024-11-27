package com.learningpackage.JavaAdvance.staticc;

public class Student {
    private String name ;
    private int roll;

    public static int count, limit1;
    public Student(){
        count++;
    }
    static {
//        System.out.println("This is static");
        count = 90;
        limit1 = 20;
    }

    public void counter(){
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public static void getCountTotal(){
        System.out.println("The total student object is: "+count);
    }
}
