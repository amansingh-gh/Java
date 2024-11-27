public class mainn {

    public static int count = 50;

    private String name = "Hritik";
    
    boolean canBeChanged = false;

    public void setName(String name){
        if(canBeChanged){
            this.name = name;
        }
    }


    public static void printHello(){
        System.out.println("Hello everyone");
    }

    public String getName(){
        return name;
    }

    
}
