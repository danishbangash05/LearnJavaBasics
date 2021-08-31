package CSVOperations;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CsvGenerator2 {public static String csvSample = "src/main/java/CSVOperations/sample2.csv";

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(csvSample));
        CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
        try (CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("FirstName", "LastName", "Zipcode"));) {
            csvPrinter.printRecord("Danish", "Bangash", 12345);
            csvPrinter.printRecord("Hamza", "sohrab", 23456);
            csvPrinter.printRecord("Jadid", "Anwar", 34567);
            csvPrinter.printRecord("Khairul", "Choudrhy", 45678);
            csvPrinter.printRecord("Jahidul", "Islam", 56789);
            csvPrinter.flush();
        }

    }
}
