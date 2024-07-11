class BluePrint {

    public static int count = 0;

    public BluePrint(){
        count++;
    }
}

public class BluePrints{
    public static void main(String[] args) {
        BluePrint obj = new BluePrint();
        BluePrint obj2 = new BluePrint();
        System.out.println(BluePrint.count);
    }
}
