import java.util.*;
public class LearnSets {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(40);
        s1.add(20);
        s1.add(30);
        s1.add(10);
        s1.add(20);
        System.out.println(s1);

        Set<String> s2 = new HashSet<>();
        s2.add("AA");
        s2.add("AB");
        System.out.println(s2);
    }    
} 