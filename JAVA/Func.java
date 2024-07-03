class Calculator{
    public int twosum(int n1,int n2){
        return n1+n2;
    }
}

public class Func {
    public static void main(String[] args) {
        int num1 = 90;
        int num2 = 10;

        Calculator cal = new Calculator();
        int res = cal.twosum(num1,num2);

        System.out.println("The two sum is : "+res);
    }
}