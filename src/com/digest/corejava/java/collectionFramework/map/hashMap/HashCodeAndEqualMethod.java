package com.digest.corejava.java.collectionFramework.map.hashMap;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Bob", 1);
        Person p2 = new Person("ALice", 2);
        Person p3 = new Person("Bob", 1);
        map.put(p1, "Engineer");
        map.put(p2, "Doctor");
        map.put(p3, "Lawer");

        System.out.println("HashMap Size : " + map.size());
        System.out.println("Value for p1: " + map.get(p1));
        System.out.println("Value for p3: " + map.get(p3));
    }
}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name, other.getName());

    }
}
