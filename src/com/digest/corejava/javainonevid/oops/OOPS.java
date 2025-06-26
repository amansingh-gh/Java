package com.digest.corejava.javainonevid.oops;

public class OOPS {
    public static void main(String[] args) {
        // Abstraction
    Animal cat = new Cat();
    cat.sayHello();
    cat.SayBye();

    // Interface
        Smartphone smt = new Smartphone();
        smt.makeCall();
        smt.playMusic();
    }
}

// ABSTRACTION
abstract class Animal{
    abstract void sayHello();
    abstract void SayBye();
}

class Cat extends Animal{

    @Override
    void sayHello() {
        System.out.println("CAT HIE MEOW");
    }

    @Override
    void SayBye() {
        System.out.println("CAT BIE MEOW");
    }
}


// Inerface
interface Mobile{
    void makeCall();
}
interface MusicPlayer{
    void playMusic();
}

class Smartphone implements Mobile,MusicPlayer{

    @Override
    public void makeCall() {
        System.out.println("Making Calls");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music");
    }
}