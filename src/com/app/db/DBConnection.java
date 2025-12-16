package com.app.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/login_system";
    private static final String USER = "root";
    private static final String PASS = "Prince@123";

    public static Connection getConnection() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);

        } catch (Exception e) {
            e.printStackTrace();
        }
    return null;
    }
    
}