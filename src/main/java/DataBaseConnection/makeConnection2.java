package DataBaseConnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class makeConnection2 {
//    public static void main(String[] args) throws IOException {
//        readProperties();
//    }
    public static Properties readProperties() throws IOException{
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("src/main/resources/app.properties");
        properties.load(inputStream);
        System.out.println(properties);
        inputStream.close();
        return properties;
    }

}
