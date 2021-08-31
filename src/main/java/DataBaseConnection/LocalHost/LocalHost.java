package DataBaseConnection.LocalHost;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LocalHost {

    public static void main(String[] args) throws SQLException {
        connectPostgresql();
    }

    public static void connectPostgresql() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/dvdrental";
        String user = "postgres";
        String password = "1";
        String query = "SELECT actor_id, first_name, last_name, last_update FROM public.actor;";

        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            System.out.println(resultSet.getString("first_name"));
        }

        List<Map<String, String>> listOfRecord = new ArrayList<>();
//        Map<String, String> hashMap = new HashMap<>();
//        while (resultSet.next()) {
//            hashMap.put("actor_id", resultSet.getString("actor_id"));
//            hashMap.put("first_name", resultSet.getString("first_name"));
//            hashMap.put("last_name", resultSet.getString("last_name"));
//            hashMap.put("last_update", resultSet.getString("last_update"));
//            listOfRecord.add(hashMap);
//        }
//
//        System.out.println(listOfRecord.size());
//        //listOfRecord.get(199);
//
//        for(Map.Entry<String, String> entry : hashMap.entrySet()){
//            System.out.println(entry.getKey() + ", " + entry.getValue());
//        }



    }
}

