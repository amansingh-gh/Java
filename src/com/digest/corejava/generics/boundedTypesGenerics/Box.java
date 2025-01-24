package com.digest.corejava.generics.boundedTypesGenerics;

// <T extends Number>  is bounded type generics

public class Box<T extends Number> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(10);
    }
}
