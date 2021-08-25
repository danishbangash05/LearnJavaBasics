package read_write;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WritingInClass {
    public static void main(String[] args) {
        JSONObject emp1 = new JSONObject();
        emp1.put("FirstName", "Danish");
        emp1.put("LastName", "Bangash");
        emp1.put("MobileNo#", 1234567890);
        emp1.put("Address", "House no, xyx, Town State Zipcode Country");
        emp1.put("Email", "danish@gmail.com");
        JSONObject employee1 = new JSONObject();
        employee1.put("Employee", emp1);

        JSONObject emp2 = new JSONObject();
        emp2.put("FirstName", "Hamza");
        emp2.put("LastName", "Sohrab");
        emp2.put("MobileNo#", 987654321);
        emp2.put("Address", "House no, abc, Town State Zipcode Country");
        emp2.put("Email", "hamza@gmail.com");
        JSONObject employee2 = new JSONObject();
        employee2.put("Employee", emp2);

        JSONArray empList = new JSONArray();
        empList.add(employee1);
        empList.add(employee2);

        try(FileWriter file = new FileWriter("EmployeeDetails.json")){
            file.write(empList.toJSONString());
            file.flush();
        } catch (IOException error) {
            System.out.println(error);
        }
    }
}
