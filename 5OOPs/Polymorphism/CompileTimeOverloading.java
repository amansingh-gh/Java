public class CompileTimeOverloading{
    public static void main(String[] args) {
        Operations cal = new Operations();
        cal.calculateValue(12, 8, 10);
    }
}

class Operations{
    void  calculateValue(int a, int b){
        System.out.println(a+b);
    }
    void  calculateValue(int a, int b,  int c){
        System.out.println(a+b+c);
    }
    void  calculateValue(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
}

