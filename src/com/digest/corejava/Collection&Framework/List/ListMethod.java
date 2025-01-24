import java.util.*;
public class ListMethod {
    public static void main(String[] args) {
        List<Integer> obj = new ArrayList<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);

        System.out.println(obj.get(1));
        obj.set(1,200);
        System.out.println(obj);
        obj.add(1,10000);
        System.out.println(obj);
        obj.remove(2);
        System.out.println(obj);
    }    
}
