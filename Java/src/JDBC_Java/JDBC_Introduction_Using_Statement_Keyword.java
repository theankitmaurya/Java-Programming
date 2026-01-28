package JDBC_Java;

import java.sql.*;

public class JDBC_Introduction_Using_Statement_Keyword {

    private static final String url = "jdbc:mysql://127.0.0.1:3306/MYDB";
    private static final String username = "root";
    private static final String password = "password";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement statement = conn.createStatement();
//            To retrieve data from Database
            String query1 = "SELECT * FROM STUDENTS";
            ResultSet resultSet = statement.executeQuery(query1);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Marks: " + marks);
            }

//            To Insert value in the Database
            String query2 = String.format("INSERT INTO STUDENTS(name, age, marks) VALUES('%s', %o, %f)", "Raj", 19, 95.4);

            int rowsAffected1 = statement.executeUpdate(query2);
            if (rowsAffected1 > 0) {
                System.out.println("Data Inserted Successfully");
            } else {
                System.out.println("Data not Inserted");
            }

//            To Update inside the Database
            String query3 = String.format("UPDATE STUDENTS SET marks = %f WHERE id = %d", 96.2, 2);

            int rowsAffected2 = statement.executeUpdate(query3);
            if (rowsAffected2 > 0) {
                System.out.println("Data Updated Successfully");
            } else {
                System.out.println("Data not Updated");
            }

//            To Delete value from the Database
            String query4 = "DELETE FROM STUDENTS WHERE ID = 2";

            int rowsAffected4 = statement.executeUpdate(query4);
            if (rowsAffected4 > 0) {
                System.out.println("Data Deleted Successfully");
            } else {
                System.out.println("Data not deleted");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
