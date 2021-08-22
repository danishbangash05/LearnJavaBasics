package File_Editor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class jsonReader {
    public static void main(String[] args) {
        File readfile = new File("sample.json");
        try {
            Scanner sc = new Scanner(readfile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
