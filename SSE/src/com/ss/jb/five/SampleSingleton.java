package com.ss.jb.five;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Purpose of this assignment is to find the Singleton class that involves sql

public class SampleSingleton {

    // Private initial variables
    private static Connection conn = null;
    private static SampleSingleton instance = null;
    
    // Method to get connection
    public Connection getConnection() {
        return conn;
    }

    public static SampleSingleton getInstance() throws SQLException {
        
        // Creates instance of Singleton class
        if (instance == null) {
            instance = new SampleSingleton();
            
            // Checks to see if connection object has been closed and creates an instance
        } else if (instance.getConnection().isClosed()) {
            instance = new SampleSingleton();
        }
        return instance;
    }
}
