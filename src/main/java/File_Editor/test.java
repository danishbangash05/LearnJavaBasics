package File_Editor;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class test {
    public static void main(String[] args) {
        JSONObject jo = new JSONObject();
        jo.put("Firstname", "Danish");
        jo.put("Lastname", "Bangash");
        jo.put("Number", 123456789);

        JSONArray details = new JSONArray();
        details.add(jo.toJSONString());
        /**try (FileWriter write  = new FileWriter("test,json"){
            writer.write(details.toJSONString());
            write.flush();
        } catch
        **/
    }
}
