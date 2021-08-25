package read_write;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class WriteToJSON {
    public static void main(String[] args) {
        JSONObject animalsKingdom = new JSONObject();
        animalsKingdom.put("Insects", "cockroaches, Bugs, Flies, etc");
        animalsKingdom.put("Reptiles", "Snakes, Lizards. Crocs, etc");
        animalsKingdom.put("Birds", "Parrots, Sparrows, Pigeon, etc" );
        animalsKingdom.put("Mammals", "Dogs, Cats, Cows etc");

        JSONArray insects = new JSONArray();
        insects.add("ants, butterflies, caterpillars, fleas, bees, and ladybugs");
        animalsKingdom.put("Insects", insects);

        JSONArray reptiles = new JSONArray();
        reptiles.add("Alligator, Bearded Dragon, Blue Iguana, Box Turtle");
        animalsKingdom.put("Reptiles", reptiles);

        JSONArray birds = new JSONArray();
        birds.add("Bare-headed laughingthrush, Bare-legged owl, Bare-legged swiftlet, Bare-nec");
        animalsKingdom.put("Birds", birds);

        JSONArray mammals = new JSONArray();
        mammals.add("Aardvark, Baboon, Camel, Dall sheep, Fin whale, Harp");
        animalsKingdom.put("Mammals", mammals);

        try (FileWriter file = new FileWriter("AnimalsKingdom.json")){
            file.write(animalsKingdom.toJSONString());
            file.flush();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
