package com.learningpackage.JavaAdvance.oops.Inheritance.Human;

public class Child extends Parent {

    public Child() {
        super(6);
        System.out.println("Child constructor called");
    }

    public static void main(String[] args) {
          Child child = new Child();
//        Grandparent child = new Child();
//        child.setAge(2);
//        child.setName("child");
//
//
//        //Multi-Level Inheritance  (( We are making object of other extended class ))
//        Parent parent = new Parent();
//        parent.setAge(30);
//        parent.setName("Parent");
//
//        Grandparent grandparent = new Grandparent();
//        grandparent.setName("GrandParent");
//        System.out.println(grandparent.getName());
//        System.out.println(child.HasSuperPower());
    }
}
