package DataBaseConnection;

import java.sql.*;

public class DBConnection {
    public static void main(String[] args) throws SQLException {
        String userName = "postgres";
        String password = "postgres2101";
        String endPoint = "database-1.cen58y5cse53.us-east-1.rds.amazonaws.com";
        String port = "5432";
        String dataBase = "dvdrental";
        String query = "SELECT actor_id, first_name, last_name, last_update FROM public.actor;";
        String url = "jdbc:postgresql://" + endPoint +":"+ port + "/" + dataBase ;

        Connection c = DriverManager.getConnection(url, userName, password);
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(query);
        while (rs.next()){
        System.out.println(rs.getString("first_name"));

        }
    }
}
