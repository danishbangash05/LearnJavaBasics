package DataBaseConnection;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromJSON {
    public static void main(String[] args) throws IOException {
        JSONParser credentials = new JSONParser();
        try (FileReader read = new FileReader("src/main/resources/credentials.json")) {
            Object obj = credentials.parse(read);
            JSONObject un = (JSONObject) obj;
            un.get("userName");
            un.get("password");
            un.get("endPoint");
            System.out.println(un.get(un));
        } catch (FileNotFoundException | ParseException e) {
            e.printStackTrace();
        }
    }
}
