package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Products {

    ConnectionToDB connectionToDB;
    public Products() {
        connectionToDB = new ConnectionToDB();
    }

    public void selectProducts() {
        try {
            Connection connection = connectionToDB.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Products");
            while (rs.next()) {
                System.out.println(rs.getRow() + ". " + rs.getString("nameOfProduct") +
                        ", " + rs.getString("productPrice"));
            }
            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}