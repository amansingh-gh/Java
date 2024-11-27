public class RunTimeOverriding {
    public static void main(String[] args) {
        MethodOverRiding obj1 = new MethodOverRiding();
        MO1 obj2 = new MO1();
        MO2 obj3 = new MO2();

        obj1.speak();
        obj2.speak();
        obj3.speak();
    }
}

class MethodOverRiding{
    void speak(){
        System.out.println("SOUT from line 3: Speaking");
    }
}
class  MO1 extends MethodOverRiding{
    void speak(){
        System.out.println("Sout from line 14 MO1");
    }
}

class MO2 extends MethodOverRiding{
    void speak(){
        System.out.println("SOut from line 20 MO2");
    }
}


