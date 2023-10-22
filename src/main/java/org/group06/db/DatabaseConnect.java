package org.group06.db;

import org.group06.utils.DatabaseConstant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Kết nối đến cơ sở dữ liệu
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            connection = DriverManager.getConnection(DatabaseConstant.JDBC_URL, DatabaseConstant.USERNAME, DatabaseConstant.PASSWORD);
            System.out.println("Kết nối thành công!");

            // Thực hiện các câu lệnh SQL hoặc công việc khác ở đây (nếu cần).

        } catch (SQLException e) {
            System.err.println("Kết nối thất bại: " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Lỗi khi đóng kết nối: " + e.getMessage());
                }
            }
        }
    }
}
