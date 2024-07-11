public class anaon{
    outerClass outt = new outerClass(){
        @Override
        void sing(){
            System.out.println("Guitar");
        }
    };
}

class outerClass{
    void sing(){
        System.out.println("Playing song");
    }
}