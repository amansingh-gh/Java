public class Abst{
    public static void main(String[] args) {
        // Vehicle obj = new Vehicle();
        Car c1 = new Car();
        c1.wheelsCount();
        c1.brake(4);
    }
}


abstract class Vehicle{
     abstract void wheelsCount();
     abstract int brake(int wheels);
}

class Car extends Vehicle{
    @Override
    void wheelsCount(){
        System.out.println("Car is Accelarated");
    }

    @Override
    int brake(int wheels){
        System.out.println("Brakes applied");
        return wheels;
    }

}