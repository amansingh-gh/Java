package com.learningpackage.JavaAdvance.AccessModifier.zoo;

public class Animal2 {
    private String name;
    protected String sound;

    public Animal2(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }
    public void makeSound(){
        System.out.println(name + " makes a sound: " + sound);
    }
    protected void changeSound(String newSound){
        this.sound = newSound;
    }
}
