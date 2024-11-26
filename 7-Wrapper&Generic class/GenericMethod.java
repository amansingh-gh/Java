public class GenericMethod {
    public static void main(String[] args) {
        printData(1122333);
        printData("ABCDEFG");

        GenericMethod obj1 = new GenericMethod();
        obj1.<String>funCall("112233");
    }    

    static <E> void printData(E data){
        System.out.println(data);
    }

    
    // Generic Method
    <E> void funCall(E data){
        System.out.println(data);
    }
}
