package com.digest.corejava.generics;

public class Box {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.setValue(1);
        String i = (String) box.getValue();
        System.out.println(i);
    }
}
