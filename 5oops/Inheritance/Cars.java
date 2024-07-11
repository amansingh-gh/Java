public class Cars extends MethodOverriding{
    // lower show function overwrites the show function (this is called overriding)
    void show(){
        // super.show();
       
        System.out.println("This show function is invoked from cars class");
    }

    Cars(){
        super(5);
        System.out.println("This is weee there");
    }

    String color="Black";
    public static void main(String[] args) {

        Cars obj1 = new Cars();

        System.out.println(obj1.wheelsCount);
        obj1.speed = 120;
        obj1.model  = "Tesla";

        // obj1.show();
        System.out.println(obj1.color);

    }
}