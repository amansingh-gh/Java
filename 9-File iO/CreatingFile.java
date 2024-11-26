import java.io.File;
import java.io.IOException;

public class CreatingFile{
    public static void main(String[] args) throws IOException  {
        File myFile = new File("newTxtFile.txt");
        try {
            myFile.createNewFile();
        } catch (Exception e) {
            System.out.println("Unable to creating new file");
        }
    }
}