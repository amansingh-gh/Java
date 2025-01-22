package com.digest.corejava.java.collectionFramework.map.hashMap.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcahceDemo<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUcahceDemo(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUcahceDemo<String, Integer> studentMap = new LRUcahceDemo<>(3);
        studentMap.put("Bob", 25);
        studentMap.put("Kal", 29);
        studentMap.put("Charlie", 35);
        studentMap.put("Panther", 50);

        studentMap.get("Bob");
        System.out.println(studentMap);
    }
}
