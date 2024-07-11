import java.util.ArrayList;
import java.util.List;

public class collectionAndList{
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(40);
        list1.add(30);
        list1.add(1);

        list2.add(1);
        list2.add(2);
        list2.add(3);

        // System.out.println(list1);
        // System.out.println(list1.contains(40));
        // System.out.println(list1.size());
        // list1.remove(2);
        // System.out.println(list1);
        // System.out.println(list1.remove(Integer.valueOf(30)));
        // System.out.println(list1);

        // list1.addAll(list2);
        list1.retainAll(list2);
        System.out.println(list1);

    }
}