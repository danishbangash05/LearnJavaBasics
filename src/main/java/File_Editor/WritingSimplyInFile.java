package File_Editor;

import java.io.FileWriter;
import java.io.IOException;

public class WritingSimplyInFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("Danish.txt");
            fileWriter.write("Hi My Name is Danish Bangash and I have been learning QA Engineering with Izaan IT\n Thank You");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
