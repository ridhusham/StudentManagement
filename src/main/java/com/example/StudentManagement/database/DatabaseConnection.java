package com.example.StudentManagement.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection("jdbc:mysql://localhost/notes","root","root");

    }
}
