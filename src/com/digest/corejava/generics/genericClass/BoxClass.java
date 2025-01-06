package com.digest.corejava.generics.genericClass;

// We can write anything in the position of T like T,P,K,X etc.
// Also, we can write anything but convention says write in one letter only.
public class BoxClass<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


    public static void main(String[] args) {
        BoxClass<Integer> BoxClass = new BoxClass<>();
        BoxClass.setValue(23);
        int res = BoxClass.getValue();
        System.out.println(res);
    }
}

