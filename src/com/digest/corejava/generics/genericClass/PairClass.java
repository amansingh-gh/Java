package com.digest.corejava.generics.genericClass;

public class PairClass<K, V> {
    public K key;
    public V value;

    public PairClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        PairClass<String, Integer> pairClass = new PairClass<>("Ailce", 20);
        System.out.println(pairClass.getKey());
        System.out.println(pairClass.getValue());
    }

}
