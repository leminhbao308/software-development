package org.group06.utils;

public class DatabaseConstant {
    public static final String HOST = "localhost"; // Địa chỉ host MongoDB
    public static final int PORT = 1433;
    public static final String DATABASE_NAME = "QLQA"; // Tên cơ sở dữ liệu
    public static final String USERNAME = "sa"; // Tên người dùng
    public static final String PASSWORD = "sapassword"; // Mật khẩu người dùng

    // Các collection (bảng) trong cơ sở dữ liệu
    public static final String USERS_COLLECTION = "users";
    public static final String PRODUCTS_COLLECTION = "products";
    // ... Khai báo các collection khác (nếu có)

    public static final String JDBC_URL = "jdbc:sqlserver://" + HOST + ":" + PORT + ";databaseName=" + DATABASE_NAME + ";Encrypt=True;TrustServerCertificate=True";

    private DatabaseConstant() {
        // Để ngăn việc tạo đối tượng instance của lớp này
    }
}
