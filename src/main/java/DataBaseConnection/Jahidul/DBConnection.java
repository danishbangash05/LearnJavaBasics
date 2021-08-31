package DataBaseConnection.Jahidul;

import java.sql.*;

public class DBConnection {
    public static void main(String[] args) throws SQLException {

        String userName = "postgres";
        String password = "postgres2101";
        String hostName = "database-1.cen58y5cse53.us-east-1.rds.amazonaws.com";
        String portNumber = "5432";
        String database = "dvdrental";
        String query = "SELECT actor_id, first_name, last_name, last_update FROM public.actor;";
        // jdbc:postgresql://host:port/database
        String url = "jdbc:postgresql://" + hostName +":"+ portNumber + "/" + database ;

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            System.out.println(resultSet.getString("first_name"));
        }
    }
}
