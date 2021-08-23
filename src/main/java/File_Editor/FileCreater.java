package File_Editor;

import java.io.File;
import java.io.IOException;

public class FileCreater {
    public static void main(String[] args) {
        File creatingNewJavaFile = new File("Demo.txt");
        try {
            creatingNewJavaFile.createNewFile();
        }
        catch (IOException e){
            System.out.println("Unable to create a new file");
        }

    }
}
