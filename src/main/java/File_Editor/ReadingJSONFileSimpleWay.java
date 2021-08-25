package File_Editor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingJSONFileSimpleWay {
    public static void main(String[] args) {
        File read = new File("Demo.json");
        try {
            Scanner sc = new Scanner(read);
            while (sc.hasNextLine()){
                String reading = sc.nextLine();
                System.out.println(reading);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
