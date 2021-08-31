package read_write;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class ReadToJSON {
    public static void main(String[] args) {
        org.json.simple.parser.JSONParser animals = new JSONParser();
        try (FileReader read = new FileReader("AnimalsKingdom.json")){
            Object obj = animals.parse(read);

            JSONObject ak = (JSONObject) obj;
            ak.get("Reptiles");
            System.out.println(ak.get("Reptiles"));
            Object rep = ak.get("Reptiles").toString();
            System.out.println(rep);
            Set<Object> keySet = ak.keySet();
            for (Object ks : keySet) {
                System.out.println(ks);
            }
            ak.keySet();

        } catch (Exception e){
            System.out.println(e);
        }

    }
}
