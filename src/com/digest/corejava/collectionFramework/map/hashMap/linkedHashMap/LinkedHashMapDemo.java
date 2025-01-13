package com.digest.corejava.collectionFramework.map.hashMap.linkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(15, .5f, true);
        linkedHashMap.put("orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 30);
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Amit", 100);
        hashMap.put("SOnu", 200);
        hashMap.put("Ruha", 300);
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>(hashMap);
        for (Map.Entry<String, Integer> entryy : map2.entrySet()) {
            System.out.println(entryy.getKey() + " " + entryy.getValue());
        }
        map2.put("Monu", 22);
        System.out.println("NEW");
        for (Map.Entry<String, Integer> entryy : map2.entrySet()) {
            System.out.println(entryy.getKey() + " " + entryy.getValue());
        }
    }
}
