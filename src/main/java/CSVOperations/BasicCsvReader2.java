package CSVOperations;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BasicCsvReader2 {
    public static String csvSample = "src/main/java/CSVOperations/data.csv";

    public static void main(String[] args) {
        try(Reader reader = Files.newBufferedReader(Paths.get(csvSample));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())){
            for (CSVRecord csvRecord: csvParser) {
                // Accessing values by column index
                String firstName = csvRecord.get(0);
                String lastName = csvRecord.get(1);
                String zipCode = csvRecord.get(2);

                System.out.println("Employee" + csvRecord.getRecordNumber());
                System.out.println("----------------------");
                System.out.println("FirstName: " + firstName);
                System.out.println("LastName: " + lastName);
                System.out.println("Zipcode: " + zipCode);
                System.out.println("-------------------\n");
            }
        }
        catch (Exception e) {
            System.out.println(e);;
        }
    }
}
