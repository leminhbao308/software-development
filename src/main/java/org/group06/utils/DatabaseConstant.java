package org.group06.utils;

public class DatabaseConstant {
    public static final String HOST = "localhost"; // Địa chỉ host MongoDB
    public static final int PORT = 27017; // Cổng MongoDB
    public static final String DATABASE_NAME = "mydb"; // Tên cơ sở dữ liệu
    public static final String USERNAME = "username"; // Tên người dùng MongoDB (nếu cần)
    public static final String PASSWORD = "password"; // Mật khẩu người dùng MongoDB (nếu cần)

    // Các collection (bảng) trong cơ sở dữ liệu
    public static final String USERS_COLLECTION = "users";
    public static final String PRODUCTS_COLLECTION = "products";
    // ... Khai báo các collection khác (nếu có)

    private DatabaseConstant() {
        // Để ngăn việc tạo đối tượng instance của lớp này
    }
}
