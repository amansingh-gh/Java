package com.digest.corejava.javainonevid.oops;

public class Test {
    public static void main(String[] args) {
        Car myCar = new Car();
//        myCar.speed  = 10;
        myCar.setSpeed(-12);
        myCar.setColor("BABY PINK");
        myCar.drive();

        System.out.println("Car color is: "+myCar.getColor());
        System.out.println("Car color is: "+myCar.getSpeed());
    }
}
