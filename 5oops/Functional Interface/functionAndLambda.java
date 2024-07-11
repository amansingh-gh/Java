public class functionAndLambda {
    public static void main(String[] args) {
        
        // outer obj = () ->{
            
        // };
    }
}

class outer{
    
    interface Sample{
        default void show(){
            System.out.println("Hey this is from under show method");
        }
    }
}