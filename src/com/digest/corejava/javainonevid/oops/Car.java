package com.digest.corejava.javainonevid.oops;

public class Car {
    private String color;
    private int speed;

//    public Car(String color){
//        this.color = color;
//    }

    void drive(){
        System.out.println("Car is driving");
    }
    
    public void setSpeed(int speed){
        if(speed<0){
            System.out.println("NOT POSSIBLE !!");
        }else{
        this.speed = speed;
        }
    }
    public int getSpeed(){
        return speed;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

}