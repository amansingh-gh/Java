package com.digest.corejava.generics.genericConstructors;

public class Main {
    public <T extends Number> Main(T Value) {

    }

    public static void main(String[] args) {
        Box box = new Box(12);
    }
}