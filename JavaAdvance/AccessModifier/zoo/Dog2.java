package com.learningpackage.JavaAdvance.AccessModifier.zoo;

public class Dog2 extends Animal2 {
    public Dog2(String name){
    super(name, "bark");
    }
    public void setDogSound(String newSound){
        changeSound(newSound);
    }
}
