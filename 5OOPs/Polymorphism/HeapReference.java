class Data{
    int data;
}


public class HeapReference{
    public static void main(String[] args) {
        int a = 5;
        Data num1 = new Data();
        changeFunc(a, num1);
        System.out.println("num1 is "+ num1.data);
        System.out.println("a is " + a);
        
    } 
    static void changeFunc(int a, Data num1){
        a = 500;
        num1.data = 100;
    }
}