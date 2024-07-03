public class MethodOverloading {
    public static void main(String[] args) {
        Greet hi = new Greet();
        hi.greetings("Tom");
    }
}

class Greet{
    String name;

    void greetings(){
        System.out.println("Hi Good Morning");
    }

    void greetings(String name){
        System.out.println("Good Morning "+ name + " !!");
    }
} 