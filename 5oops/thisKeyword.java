public class thisKeyword {
    public static void main(String[] args) {
        Complex num1 = new Complex(2,5);
        num1.print();
    }
}

class Complex{
    int a;
    int b;

    public Complex(int a, int b){
        this.a = a;
        this.b = b;
    }
    void print(){
        System.out.println("a and b are: "+(a+b));

    }
}