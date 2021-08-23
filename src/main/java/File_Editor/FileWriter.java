package File_Editor;

import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) {
            try {
                java.io.FileWriter file = new java.io.FileWriter("Demo.json");
                file.write("[\n" +
                        "  {\n" +
                        "    \"no\": 1,\n" +
                        "    \"name\": \"Berry Marks\",\n" +
                        "    \"age\": 39,\n" +
                        "    \"tel\": \"(547) 465-5478\",\n" +
                        "    \"email\": \"darren.howell@altenwerth.net\"\n" +
                        "  },\n" +
                        "  {\n" +
                        "    \"no\": 2,\n" +
                        "    \"name\": \"Mabel Yost\",\n" +
                        "    \"age\": 49,\n" +
                        "    \"tel\": \"+12982162817\",\n" +
                        "    \"email\": \"mcglynn.bianka@senger.com\"\n" +
                        "  },\n" +
                        "  {\n" +
                        "    \"no\": 3,\n" +
                        "    \"name\": \"Forest Cartwright\",\n" +
                        "    \"age\": 46,\n" +
                        "    \"tel\": \"783.404.5960 x374\",\n" +
                        "    \"email\": \"hermann50@gmail.com\"\n" +
                        "  }");
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

