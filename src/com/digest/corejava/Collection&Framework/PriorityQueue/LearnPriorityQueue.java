import java.util.*;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> obj1 = new PriorityQueue<>();
        obj1.add(30);
        obj1.add(10);
        obj1.add(60);
        obj1.add(20);
        obj1.add(50);
        System.out.println(obj1);
        System.out.println(obj1.poll());
    }    
}
