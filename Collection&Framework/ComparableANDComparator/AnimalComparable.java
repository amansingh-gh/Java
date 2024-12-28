import java.util.*;
public class AnimalComparable {
    public static void main(String[] args) {
        Animal a1 = new Animal(7,"Tommy");
        Animal a2 = new Animal(1,"Zruno");
        Animal a3 = new Animal(5,"Mars");

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);

        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println(dogs);
    }
}
