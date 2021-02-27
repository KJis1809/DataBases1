package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Departments {

    ConnectionToDB connectionToDB;
    public Departments() {
        connectionToDB = new ConnectionToDB();
    }

    public void selectDepartments() {
        try {
            Connection connection = connectionToDB.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Departments");
            while (rs.next()) {
                System.out.println(rs.getRow() + ". " + rs.getString("nameOfDepartments"));
            }
            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}