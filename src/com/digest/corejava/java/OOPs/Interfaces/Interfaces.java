package com.digest.corejava.java.OOPs.Interfaces;

public class Interfaces{
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.walk();
        System.out.println(Animal.legs);
    }
}

interface Human{
    void walk();
}

interface Animal{ 
    void eats();

    // Both the below lines are works same in interface
    // public static final int legs = 4;
    int legs = 4;
}

class Monkey implements Animal, Human{
    
    @Override
    public void eats(){
        System.out.println("Monkey Eating Bananas");
    }

    @Override
    public void walk(){
        System.out.println("Monkey Walking");
    }
}