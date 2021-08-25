package File_Editor;

import java.io.File;
import java.io.IOException;

public class SimpleTextFileCreation {
    public static void main(String[] args) {
        File myFile = new File("Danish.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
    }
}
