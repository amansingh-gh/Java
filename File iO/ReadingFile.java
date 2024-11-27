
import java.io.File;
import java.util.Scanner;

public class ReadingFile{
    public static void main(String[] args) {
        File myFile = new File("newTxtFile.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Something went Wrong !!");
        }
    }    
}
