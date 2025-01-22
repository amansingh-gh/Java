package com.digest.corejava.java.AccessModifier.zoo;

public class Dog extends Animal {

    public Dog(String name){
        super(name,"Bark");
    }
    public void wagTail(){
        System.out.println(getName() + " is waiting its tail.");
    }

    private String getName(){
        return getClass().getSimpleName();
    }
    protected void setDogSound(String newSound){
        changeSound(newSound);
    }
}