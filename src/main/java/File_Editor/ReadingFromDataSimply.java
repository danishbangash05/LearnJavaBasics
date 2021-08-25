package File_Editor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromDataSimply {
    public static void main(String[] args) {
        File data = new File("danish.json");
        try {
            Scanner sc = new Scanner(data);
            while (sc.hasNextLine()){
                String dan = sc.nextLine();
                System.out.println(dan);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
