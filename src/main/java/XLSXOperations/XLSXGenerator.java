package XLSXOperations;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class XLSXGenerator {
    public static String xlsxSample = "src/main/java/XLSXOperations/sample.xlsx";

    public XLSXGenerator() throws IOException {
    }

    public static void main(String[] args) throws Exception {

        FileInputStream input = new FileInputStream(new File(xlsxSample));
        XSSFWorkbook workbook = new XSSFWorkbook(input);
        XSSFSheet sheet = workbook.getSheetAt(0);
        //Creating Our first Row Here
        XSSFRow row1 = sheet.createRow(0);  /// This is our first row
        XSSFCell row1Cell1 = row1.createCell(0); // this is our first cell in row 1
        row1Cell1.setCellValue("Employee ID - ");

        XSSFCell row1Cell2 = row1.createCell(1);
        row1Cell2.setCellValue("FirstName - ");
        XSSFCell row1Cell3 = row1.createCell(2);
        row1Cell3.setCellValue("LastName - ");

        XSSFCell row1Cell4 = row1.createCell(3);
        row1Cell4.setCellValue("ZipCode - ");

        //Creating our second Row here now
        XSSFRow row2 = sheet.createRow(1);
        XSSFCell row2Cell1 = row2.createCell(0);
        row2Cell1.setCellValue("1");

        XSSFCell row2Cell2 = row2.createCell(1);
        row2Cell2.setCellValue("Danish");

        XSSFCell row2Cell3 = row2.createCell(2);
        row2Cell3.setCellValue("Bangash");

        XSSFCell row2Cell4 = row2.createCell(3);
        row2Cell4.setCellValue("12345");

        //Creating our Third Row here now
        XSSFRow row3 = sheet.createRow(2);
        XSSFCell row3Cell1 = row3.createCell(0);
        row3Cell1.setCellValue("2");

        XSSFCell row3Cell2 = row3.createCell(1);
        row3Cell2.setCellValue("Hamza");

        XSSFCell row3Cell3 = row3.createCell(2);
        row3Cell3.setCellValue("Sohrab");

        XSSFCell row3Cell4 = row3.createCell(3);
        row3Cell4.setCellValue("23456");

        //Creating our Fourth Row here now
        XSSFRow row4 = sheet.createRow(3);
        XSSFCell row4Cell1 = row4.createCell(0);
        row4Cell1.setCellValue("2");

        XSSFCell row4Cell2 = row4.createCell(1);
        row4Cell2.setCellValue("Hamza");

        XSSFCell row4Cell3 = row4.createCell(2);
        row4Cell3.setCellValue("Sohrab");

        XSSFCell row4Cell4 = row4.createCell(3);
        row4Cell4.setCellValue("23456");

        input.close();
        FileOutputStream output = new FileOutputStream(new File(xlsxSample));
        workbook.write(output);
        output.close();
        System.out.println("Your File is Successfully Generated");

}
}



