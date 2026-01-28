package JDBC_Java;

import java.sql.*;
import java.util.*;

public class Transaction_Handling {

    private static final String url = "jdbc:mysql://127.0.0.1:3306/TRANSACTIONS";
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
            conn.setAutoCommit(false);
            String debitQuery = "UPDATE ACCOUNTS SET balance = balance - ? WHERE account_number = ?";
            String creditQuery = "UPDATE ACCOUNTS SET balance = balance + ? WHERE account_number = ?";
            PreparedStatement debitPreparedStatement = conn.prepareStatement(debitQuery);
            PreparedStatement creditPreparedStatement = conn.prepareStatement(creditQuery);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Account Number: ");
            int accountNumber = sc.nextInt();
            System.out.println("Enter Amount: ");
            double amount = sc.nextDouble();
            debitPreparedStatement.setDouble(1, amount);
            debitPreparedStatement.setInt(2, accountNumber);
            creditPreparedStatement.setDouble(1, amount);
            creditPreparedStatement.setInt(2, 102);
            debitPreparedStatement.executeUpdate();
            creditPreparedStatement.executeUpdate();
            if (isSufficient(conn, accountNumber, amount)) {
                conn.commit();
                System.out.println("Transaction Successful");
            } else {
                conn.rollback();
                System.out.println("Transaction Failed!!");
            }
            creditPreparedStatement.close();
            debitPreparedStatement.close();
            sc.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static boolean isSufficient(Connection conn, int account_number, double amount) {
        try {
            String query = "SELECT balance FROM ACCOUNTS WHERE account_number = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, account_number);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                double currentBalance = resultSet.getDouble("balance");
                if (amount > currentBalance) {
                    return false;
                } else {
                    return true;
                }
            }
            resultSet.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}