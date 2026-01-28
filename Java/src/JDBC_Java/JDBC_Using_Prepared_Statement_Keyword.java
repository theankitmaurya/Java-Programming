package JDBC_Java;

import java.sql.*;

public class JDBC_Using_Prepared_Statement_Keyword {

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


//            Update the value inside the Database
//            String query1 = "INSERT INTO STUDENTS(name, age, marks) VALUES(?, ?, ?)";
//            PreparedStatement preparedStatement1 = conn.prepareStatement(query1);
//            preparedStatement1.setString(1, "Raj");
//            preparedStatement1.setInt(2, 19);
//            preparedStatement1.setDouble(3, 94.2);
//
//            int rowsAffected = preparedStatement1.executeUpdate();
//            if (rowsAffected > 0) {
//                System.out.println("Data Inserted Successfully");
//            } else {
//                System.out.println("Data not Inserted");
//            }

//            To retrieve the data from the Database
//            String query2 = "SELECT marks FROM STUDENTS WHERE id = ?";
//            PreparedStatement preparedStatement2 = conn.prepareStatement(query2);
//            preparedStatement2.setInt(1, 1);
//
//            ResultSet resultSet = preparedStatement2.executeQuery();
//            if (resultSet.next()) {
//                double marks = resultSet.getDouble("marks");
//                System.out.println("Marks: " + marks);
//            } else {
//                System.out.println("Marks not found!");
//            }

//            To Update the data from the Database
//            String query3 = "UPDATE STUDENTS SET marks = ? WHERE id = ?";
//            PreparedStatement preparedStatement3 = conn.prepareStatement(query3);
//            preparedStatement3.setDouble(1, 87.5);
//            preparedStatement3.setInt(2, 3);
//
//            int rowsAffected = preparedStatement3.executeUpdate();
//            if (rowsAffected > 0) {
//                System.out.println("Data Updated Successfully");
//            } else {
//                System.out.println("Data not Updated!");
//            }

//            Delete from the Database
            String query4 = "DELETE FROM STUDENTS WHERE id = ?";
            PreparedStatement preparedStatement4 = conn.prepareStatement(query4);
            preparedStatement4.setDouble(1, 87.5);
//            preparedStatement4.setInt(2, 3);

            int rowsAffected = preparedStatement4.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data Deleted Successfully");
            } else {
                System.out.println("Data not Deleted!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}