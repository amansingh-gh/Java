import java.util.LinkedList;
import java.util.Queue;

public class LearnQueueInterface {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(12);
        q1.offer(13);
        q1.offer(14);

        System.out.println(q1.poll());
        System.out.println(q1);
        System.out.println(q1.peek());
    }
}
