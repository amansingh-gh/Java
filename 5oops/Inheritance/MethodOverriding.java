public class MethodOverriding{
    int wheel=4;
    int speed=2000;
    String model;

    int wheelsCount;

    MethodOverriding(){
        System.out.println("This is mettt here");
    }
    MethodOverriding(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("This is mettt with wheelss");
    }

    void start(){
        System.out.println("Vehicle is started");
    }
}