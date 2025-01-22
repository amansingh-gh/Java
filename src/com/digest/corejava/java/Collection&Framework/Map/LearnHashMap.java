import  java.util.*;
public class LearnHashMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();



        map.put("IN", "India");
        map.put("US", "United States");

        // keySet() method
        Set<String> keys = map.keySet();
        System.out.println(keys);

        map2.put("One","1");
        map2.put("two","2");
        map2.put("three","3");

        Set<Map.Entry<String, String>> entries = map2.entrySet();
        for(Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ", "+ entry.getValue());
        }

        System.out.println(map);

        map.remove("IN");
        System.out.println(map);

        System.out.println(map.containsKey("US"));  // Returns true or false

        System.out.println("Combinig two maps:: ");
        map.putAll(map2);
        System.out.println(map);

        System.out.println(map2.containsKey("One"));

        System.out.println(map.replace("One", "ONE"));
        System.out.println(map.keySet());  // Returns the key set
        System.out.println(map.values());  // Returns the value set
        System.out.println(map.entrySet());  // Returns the key and value set

        System.out.println(keys);
    }   
}
