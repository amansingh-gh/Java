import java.util.Scanner;
public class pascal{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enteer the row size of Pascal Traingle");
        for (int i=0; i<row; i++) 
        {
            for(int space=row; space>i; space--)
            System.out.print(" ");
            num=1;
            for (int j=0; j<=i; j++) 
            {
                System.out.print(num + " ");
                num=num*(i-j)/(j+i);
            }
            System.out.println("\n");
        }
    }
}