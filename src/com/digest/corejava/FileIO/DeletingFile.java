package com.digest.corejava.FileIO;

import java.io.File;

public class DeletingFile {
    public static void main(String[] args) {
        File newFile = new File("newTxtFile.txt");
        if(newFile.delete()){
            System.out.println("Deleted "+newFile.getName());
        }
        else{
            System.out.println("Something went Wrong while deleting the file");
        }
    }
}
