package com.hospital;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnect {

    private static final String url;
    private static final String user;
    private static final String pass;

    static {
        Properties props = new Properties();
        try (InputStream input = DBConnect.class.getClassLoader().getResourceAsStream("db.properties")) {
            if (input == null) {
                throw new ExceptionInInitializerError("db.properties not found on classpath");
            }
            props.load(input);
        } catch (IOException e) {
            throw new ExceptionInInitializerError("Failed to load db.properties: " + e.getMessage());
        }
        url  = props.getProperty("db.url");
        user = props.getProperty("db.user");
        pass = props.getProperty("db.password");
    }

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Database connection failed: " + e.getMessage());
            return null;
        }
    }
}
