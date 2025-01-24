package com.digest.corejava.collectionFramework.map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        map.put(1, "Sam");
        map.put(2, "Sabun");
        map.put(3, "Subh");
        map.put(4, "Putti");
        System.out.println(map);
        System.out.println(map.get(77));
        System.out.println(map.get(77));
        System.out.println(map.containsKey(5));

        Set<Integer> integer = map.keySet();
        for (int i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

        map.remove(1);
        System.out.println(map);
    }
}