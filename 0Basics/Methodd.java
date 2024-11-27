class Computer{
    public void mymusic(){
        System.out.println("Starting Music Player.......");
    }
    public String myPen(int cost){
        if(cost>=10){
        return "PEN";
        }
        else{
            return "Price is too low";
        }
    }
}
public class Methodd {
    
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.mymusic();
        
        String res = obj.myPen(10);
        System.out.println(res);
    }
}
