public class ternary{
    public static void main(String[] args) {
        int num1 = 500;
        int num2 = 800;
        String res = num1<=1000 && num2 <=500 ? "It is under 1001" : "This is too high";
        System.out.println(res);
    }
}