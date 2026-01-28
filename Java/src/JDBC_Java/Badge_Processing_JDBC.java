package JDBC_Java;

import java.sql.*;
import java.util.Scanner;

public class Badge_Processing_JDBC {

    private static final String url = "jdbc:mysql://127.0.0.1:3306/MYDB";
    private static final String username = "root";
    private static final String password = "password";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

//        Using Statement -
//        try {
//            Connection conn = DriverManager.getConnection(url, username, password);
//            Statement statement = conn.createStatement();
//            Scanner sc = new Scanner(System.in);
//            while (true) {
//                System.out.println("Enter name: ");
//                String name = sc.next();
//                System.out.println("Enter age: ");
//                int age = sc.nextInt();
//                System.out.println("Enter marks: ");
//                double marks = sc.nextDouble();
//                System.out.println("Enter more data(Y/N)");
//                String choice = sc.next();
//
//                String query = String.format("INSERT INTO STUDENTS(name, age, marks) VALUES ('%s', %d, %f)", name, age,marks);
//                statement.addBatch(query);
//
//                if (choice.toUpperCase().equals("N")) {
//                    break;
//                }
//            }
//
//            int[] arr = statement.executeBatch();
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == 0) {
//                    System.out.println("Query: " + i + " not executed successfully!!");
//                }
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }

//        Using Prepared Statement -
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO STUDENTS(name, age, marks) VALUES(?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Enter name: ");
                String name = sc.next();
                System.out.println("Enter age: ");
                int age = sc.nextInt();
                System.out.println("Enter marks: ");
                double marks = sc.nextDouble();
                System.out.println("Enter more data(Y/N)");
                String choice = sc.next();
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, age);
                preparedStatement.setDouble(3, marks);

                preparedStatement.addBatch();
                if (choice.toUpperCase().equals("N")) {
                    break;
                }
            }

            int arr[] = preparedStatement.executeBatch();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    System.out.println("Query: " + i + " not executed successfully!");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
