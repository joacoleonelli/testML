package com.jleonelli.sistemaSolar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JobCondicionesClimaticas {
  public static void main(String[] args) {
    System.out.println("-------- MySQL JDBC Connection Testing ------------");

    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      System.out.println("Where is your MySQL JDBC Driver?");
      e.printStackTrace();
      return;
    }

    System.out.println("MySQL JDBC Driver Registered!");
    Connection connection = null;

    try {
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testML","root", "root");
      if (connection != null) {
        System.out.println("You made it, take control your database now!");
        // the mysql insert statement
        String query = " insert into condiciones_climaticas (dia, clima, esPicoMaximoLluvia)"
            + " values (?, ?, ?)";
        
        // create the mysql insert preparedstatement
        PreparedStatement preparedStmt = connection.prepareStatement(query);
        preparedStmt.setString(1, "Barney");
        preparedStmt.setString (2, "Rubble");
        preparedStmt.setBoolean(4, false);
        preparedStmt.setInt(5, 5000);
        
        // execute the preparedstatement
        preparedStmt.execute();
      } else {
        System.out.println("Failed to make connection!");
      }
    } catch (SQLException e) {
      System.out.println("Connection Failed! Check output console");
      e.printStackTrace();
      return;
    }

  }
}
