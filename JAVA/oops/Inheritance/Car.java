public class Car extends Vehicle{
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheel = 4;
        obj.speed = 200;

        System.out.println(obj.wheel);
        System.out.println(obj.speed);
        obj.show();
    }
}