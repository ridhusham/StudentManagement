package com.example.StudentManagement.database;

import java.sql.Connection;
import java.sql.SQLException;

public class MySqlDAO {
  private Connection connection= DatabaseConnection.getConnection();

    public MySqlDAO() throws SQLException {


    }
}
