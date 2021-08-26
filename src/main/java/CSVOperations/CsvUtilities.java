//package csvoperations;
//
//import com.opencsv.CSVReader;
//import java.io. * ;
//import java.util.List;
//public class CsvUtilities {
//    /**
//     * public static void main(String[] args) throws Exception {
//     * Scanner sc = new Scanner(new File("C:\\Users\\Dell\\Desktop\\data.csv"));
//     * //parsing a CSV file into the constructor of Scanner class
//     * sc.useDelimiter(",");
//     * //setting comma as delimiter pattern
//     * while (sc.hasNext()) {
//     * System.out.print(sc.next());
//     * }
//     * sc.close();
//     * //closes the scanner
//     * }
//     **/
//    public static void main(String[] args) throws FileNotFoundException {
//        readSta
//        {
//            public static void readStandardCSVFile () {
//            String fileName = "src/main/java/csvoperations/data.csv";
//            try {
//                CSVReader csvReader = new CSVReader(new FileReader(fileName));
//                List<String[]> reader = csvReader.readAll();
//                System.out.println(reader.size());
//                //For Each loop can only iterate Object Elements of an array
//                //Getting index1
//
//                for (int i = 0; i < reader.size(); i++) {
//                    String[] record = reader.get(i);
//                    System.out.println(record);
//                    for (String str : record) {
//                        System.out.println(str);
//                    }
//                }
//            } catch (IOException e) {
//                System.out.println(e);
//            }
//        }
//        }
//    }
//}
