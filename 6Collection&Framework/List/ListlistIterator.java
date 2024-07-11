import java.util.*;

public class ListlistIterator {
    public static void main(String[] args) {
        List<String> obj = new ArrayList<>();
        obj.add("Mango");
        obj.add("Kiwi");
        obj.add("Grapes");

        // for loop iteration
        for(int i=0; i<obj.size(); i++){
            System.out.println("The fruits names are: "+obj.get(i));
        }

        // forEach loop
        for(String fruit : obj){
            System.out.println("Printing fruits name by forEach loop: "+fruit);
        }

        // listIterator
        Iterator<String> fe = obj.iterator();
        while (fe.hasNext()) {
            System.out.println(fe.next());
        }

        // subList method
        try {
            System.out.println(obj.subList(1,8));
        } catch (Exception e) {
            System.out.println("You are out of bound");
        }
    }
}
