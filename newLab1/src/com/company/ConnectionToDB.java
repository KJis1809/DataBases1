package com.company;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionToDB {
    public Connection getConnection() {
        try {
            String userName = "root";
            String password = "Nissan350z!";
            String url = "jdbc:mysql://localhost:3306/shop";
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connecting...");

            return connection;
        } catch (Exception e) {
            System.out.println("Problem: " + e);
        }

        return null;
    }
}
