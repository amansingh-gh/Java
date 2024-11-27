import java.util.*;
public class if_else2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();
        if (button==1) {
            System.out.println("Aman");
        }
        else if (button==2) {
            System.out.println("Kumar");
        }
        else if (button==3) {
            System.out.println("Singh");
        }
        else {
            System.out.println("Not valid");
        }
    }
}