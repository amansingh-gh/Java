public class Constructor{
    public static void main(String[] args) {
       Complex num1 = new Complex(5,2);
       num1.print();
    }
}

class Complex{
    int a;
    int b;

    // constructor
    public Complex(int a, int b){
        // a = 0;
        // b = 0;
        this.a = a;
        this.b = b;
    }

    void print(){
        System.out.println("Hey whts'upp, and value of a + b is: "+(a+b));
    }
}