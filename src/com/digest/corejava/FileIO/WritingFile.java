package com.digest.corejava.FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile{
    public static void main(String[] args) throws IOException  {
        File myFile = new File("newTxtFile.txt");

        FileWriter WriteAFile = new FileWriter("newTxtFile.txt");
        WriteAFile.write("Hey this is new File");
        WriteAFile.close();
    }
}