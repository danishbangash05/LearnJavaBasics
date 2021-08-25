package File_Editor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadingSimpleTextFile {
    public static void main(String[] args) {
        // File readfile = new File("Danish.txt");
        //        try {
        //            Scanner sc = new Scanner(readfile);
        //            while (sc.hasNextLine()){
        //                String line = sc.nextLine();
        //                System.out.println(line);
        //            }
        //            sc.close();
        //        } catch (FileNotFoundException e) {
        //            e.printStackTrace();
        //        }

        File readfile = new File("reader.txt");
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
