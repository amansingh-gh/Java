class Car{
    String name;
    int year;

    public Car(String name, int year){
        this.name = name;
        this.year = year;
    }
}

public class ObjectClass{
    public static void main(String[] args) {
        Car obj = new Car("Tesla", 2024);
        System.out.println(obj.name);
        obj.name = "TATA";
        System.out.println(obj.name);
    }
}
