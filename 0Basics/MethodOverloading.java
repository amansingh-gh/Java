class Calculator{
    public int add(int num1,int num2){
        return num1 + num2;
    }

    public int add(int num1,int num2, int num3){
        return num1 + num2 + num3;
    }

    public int add(int num1,int num2, int num3, int num4){
        return num1 + num2+ num3+num4;
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        Calculator cal  = new Calculator();

        int res2 = cal.add(5,3,4,5);

        System.out.println(res2);
    }
}