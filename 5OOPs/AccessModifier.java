
public class AccessModifier {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.method();
        // a1.method2();  This line gives error because it is a private class (we can't call private methods from other class)
    }
}

class Animal {

    String name = "HUII";
    int age = 20;

    public void method() {
        System.out.println(name);
    }
    private void method2(){
        System.out.println(age);
    }

}
