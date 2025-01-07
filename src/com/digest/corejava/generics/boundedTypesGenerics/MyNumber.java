package com.digest.corejava.generics.boundedTypesGenerics;

interface printable {
    void print();
}

class MyNumber extends Number implements printable {
    private final int value;

    MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("My number is: " + value);
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    class Box<T extends Number & printable> {

    }

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(12);
//        Box<MyNumber> box = new Box<>(myNumber);
    }
}