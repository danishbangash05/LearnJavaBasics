package CSVOperations;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CsvReaderWithHeaderAutoDetection {
    public static String csvSample = "src/main/java/csvoperations/sample.csv";

    public static void main(String[] args) {
        try(Reader reader = Files.newBufferedReader(Paths.get(csvSample));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withIgnoreHeaderCase()
                    .withTrim())
        ){
            for (CSVRecord csvRecord: csvParser) {
                //Accessing values by Header Names
                String id = csvRecord.get("ID");
                String firstName = csvRecord.get("FirstName");
                String lastname = csvRecord.get("LastName");

                System.out.println("Employee - " + csvRecord.getRecordNumber());
                System.out.println("________________________");
                System.out.println("ID - " + id);
                System.out.println("FirstName - " + firstName);
                System.out.println("Lastname - " + lastname);
                System.out.println("_______________________");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
