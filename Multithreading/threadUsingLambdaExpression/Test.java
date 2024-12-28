package com.digest.corejava.Multithreading.threadUsingLambdaExpression;

public class Test {
    public static void main(String[] args) {

        // Lower line commented becuase there is only one abstract method in EngineeringStudent class.
//        EngineeringStudent engineeringStudent = new EngineeringStudent();
//        String nameHai = engineeringStudent.geetBio("RAM");
//        System.out.println(nameHai);

        // Lowerr line commented becuase it converted it into lambda expression
//        Student engineeringStudent = new Student() {
//            @Override
//            public String geetBio(String name) {
//                return name + " is Engineering Student";
//            }
//        };
        Student lawStudent = (name,roll) -> {
            return name + " is law student and roll is "+ roll;
        };
        String bio = lawStudent.geetBio("RAMMUU", 21);
        System.out.println(bio);
    }
}
