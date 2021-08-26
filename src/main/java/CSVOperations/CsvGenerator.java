package CSVOperations;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CsvGenerator {
    public static String csvSample = "src/main/java/csvoperations/sample2.csv";

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(csvSample));
        CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
        try (CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("ID", "FirstName", "LastName", "Zipcode"));) {
            csvPrinter.printRecord("1", "Danish", "Bangash", 12345);
            csvPrinter.printRecord("2", "Hamza", "sohrab", 23456);
            csvPrinter.printRecord("3", "Jadid", "Anwar", 34567);
            csvPrinter.printRecord("4", "Khairul", "Choudrhy", 45678);
            csvPrinter.printRecord("5", "Jahidul", "Islam", 56789);
            csvPrinter.flush();
        }

    }
}
