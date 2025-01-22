package com.digest.corejava.java.Arraay;

class Student{
    int Roll;
    String Name;
    int Marks;
}
public class ArrayObj{
    public static void main(String[] args) {

        Student s1= new Student();
        s1.Roll = 1;
        s1.Name = "Navin";
        s1.Marks = 99;

        Student s2= new Student();
        s2.Roll = 2;
        s2.Name = "Goru";
        s2.Marks = 89;

        Student s3= new Student();
        s3.Roll = 3;
        s3.Name = "Pratham";
        s3.Marks = 57;

        // System.out.println(s1.Name);
        Student students[] = new Student[3];
        students[0]= s1;
        students[1]= s2;
        students[2]= s3;    

        // for(int i=0; i<students.length; i++){
        //     System.out.println(students[i].Name + " " + students[i].Roll);
        // }

        // for each loop
        for(Student n : students){
            System.out.println(n.Name + " : " + n.Roll);
        }
    }
}