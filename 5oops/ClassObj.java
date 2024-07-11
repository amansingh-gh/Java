public class ClassObj {
    public static void main(String[] args) {
        // creating object
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.age = 1;
        d1.bark();

        Dog d2 =  new Dog();
        d1.name = "Pau";
        d1.age = 1.2;
        d2.run();
    }
}

class Dog {

    // properties
    String name;
    double age;

    // Behaviour
    void bark() {
        System.out.println(name + " is barking and his age is "+ age);
    }

    void run() {
        System.out.println("Dog is running");
    }
}
