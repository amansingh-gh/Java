package com.digest.corejava.generics.genericConstructors;

public class Box<T extends Number> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box box = new Box(12);
        System.out.println(box.getValue());
    }

}
