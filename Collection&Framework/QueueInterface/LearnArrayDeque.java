import java.util.ArrayDeque;
public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> obj = new ArrayDeque<>();
        obj.offer(100);
        obj.offer(200);
        obj.offer(300);
        obj.offerLast(500);
        obj.offerFirst(200);
        System.out.println(obj.poll());  // returns first element
    }    
}
