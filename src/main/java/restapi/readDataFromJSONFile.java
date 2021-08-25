/**package restapi;

import jdk.nashorn.internal.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class readDataFromJSONFile {
    public static void main(String[] args) throws FileNotFoundException {
        JSONParser jsonParser = new JSONParser("vv")
        FileReader reader = new FileReader("employee.json");
        jsonParser.parse(reader);
    }
}
**/