class Parent{
    void show(){
        System.out.println("This is from parent");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("This is from child class");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();
        p1.show();
        c1.display();
    }
}