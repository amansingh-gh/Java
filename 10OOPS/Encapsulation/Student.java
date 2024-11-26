package com.learningpackage.JavaAdvance.oops.Encapsulation;

public class Student {

    // Encapsulation is the mechanism through which we can wrapping the data members and member method of a class in a single unit called encapsulation.

    private String name;
    private int RollNo;
    private int age;

    public void setAge(int age){
        if(age<0 || age>120){
            age = 0;
        }
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

   public void setRollNo(int RollNo){
        if(RollNo < 0){
            RollNo = 0;
        }
        this.RollNo = RollNo;
   }
   public int getRollNo(){
        return this.RollNo;
   }

    public String getName(String name) {
        if(name.isEmpty()){
            System.out.println("Invalid Name");
        }
        return this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }
}