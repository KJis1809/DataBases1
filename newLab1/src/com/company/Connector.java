package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connector {

    ConnectionToDB connectionToDB;
    public Connector() {
        connectionToDB = new ConnectionToDB();
    }

    public void selectTables() {
        try {
            Connection connection = connectionToDB.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM Products join Departments on Products.Departments_idDepartments = Departments.idDepartments");
            while (rs.next()) {
                System.out.println(rs.getRow() + ". " + rs.getString("nameOfProduct") +
                        ", " + rs.getString("productPrice") +
                        ", " + rs.getString("nameOfDepartments"));
            }
            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
