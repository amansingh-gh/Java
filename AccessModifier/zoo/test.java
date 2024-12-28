package com.digest.corejava.AccessModifier.zoo;

public class test {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobby");
        dog.makeSound();
        dog.changeSound("Woof");
        dog.setDogSound("Hue");
        dog.makeSound();
    }
}