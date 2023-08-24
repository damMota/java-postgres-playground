package com.example.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static final String CLASSNAME = "org.postgresql.Driver";
    private static final String PASSWORD = "";
    private static final String USERNAME = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";

    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName(CLASSNAME);//PODE SER SUPRIMIDO
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
    
}
