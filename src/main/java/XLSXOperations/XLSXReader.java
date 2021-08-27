package XLSXOperations;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class XLSXReader {
    public static String xlsxSample = "src/main/java/XLSXOperations/sample.xlsx";

    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream(new File(xlsxSample));
        XSSFWorkbook workbook = new XSSFWorkbook(input);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator ite = sheet.rowIterator();
        while (ite.hasNext()){
            Row row = (Row) ite.next();
            Iterator<Cell> cite = row.cellIterator();
            while (cite.hasNext()){
                Cell c = cite.next();
                System.out.println(c.toString() + "  ");
            }
            System.out.println();
        }
        input.close();
    }
}
