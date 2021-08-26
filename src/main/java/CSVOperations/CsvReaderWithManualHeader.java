package CSVOperations;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CsvReaderWithManualHeader {
    public static String csvSample = "src/main/java/csvoperations/sample.csv";

    public static void main(String[] args) {
        try(Reader reader = Files.newBufferedReader(Paths.get(csvSample));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withHeader("ID", "FirstName", "LastName", "Zipcode")
                    .withIgnoreHeaderCase().withTrim())
        ) {
            for (CSVRecord csvRecord: csvParser) {
                // Accessing values by the names assigned to each column
                String id = csvRecord.get("ID");
                String firstName = csvRecord.get("FirstName");
                String lastName = csvRecord.get("LastName");
                String zipCode = csvRecord.get("Zipcode");

                System.out.println("Employee No - " + csvRecord.getRecordNumber());
                System.out.println("***************");
                System.out.println("ID - " + id);
                System.out.println("FirstName - " + firstName);
                System.out.println("LastName - " + lastName);
                System.out.println("Zipcode - " + zipCode);
                System.out.println("*******************\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
