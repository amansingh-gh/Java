public class ThrowsCheck {
    public static void main(String[] args) {
        int a[] = new int[5];
        try{
            checkFunc(a);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }    
    static int checkFunc(int a[]) throws ArithmeticException{
        return a[8];
    }
}

