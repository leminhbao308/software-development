package org.group06.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConstant {

    private static final String JDBC_URL = "jdbc:sqlserver://localhost:1433;databaseName=QLQA;Encrypt=True;TrustServerCertificate=True;sendStringParametersAsUnicode=false";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "sapassword";

    public static Connection getConnection() {
        try {
            // Kết nối đến cơ sở dữ liệu
            return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            return null;
        }
    }
}

