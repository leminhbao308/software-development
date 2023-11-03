package org.group06.db;

import org.group06.db.dao.*;
import org.group06.model.entity.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class TestDAO {

    public static void main(String[] args) {
        // Kết nối đến cơ sở dữ liệu
        try (Connection connection = DatabaseConnect.getConnection()) {
            if (connection != null) {
                System.out.println("Kết nối thành công!");
//                testDAO_NhaCungCap(connection);
//                testDAO_NhanVien(connection);
//                test_DAO_QuanAo(connection);
//                test_DAO_KhachHang(connection);
//                test_DAO_KhuyenMai(connection);
//                testDAO_HoaDon(connection);
                    testDAO_ChiTietHoaDon(connection);
            } else {
                System.out.println("Kết nối thất bại.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void testDAO_NhaCungCap(Connection connection) {
        // Tạo đối tượng NhaCungCapDAO
        DAO_NhaCungCap supplierDAO = new DAO_NhaCungCap(connection);

        // Lấy danh sách tất cả nhà cung cấp
        List<NhaCungCap> suppliers = supplierDAO.getAll();
        System.out.println("Danh sách nhà cung cấp:");
        for (NhaCungCap supplier : suppliers) {
            System.out.println(supplier);
        }

        // Thêm một nhà cung cấp mới
//        NhaCungCap newSupplier = new NhaCungCap("NCC002", "Cửa Hàng Quần Áo Nam Nam", "456 Ðường B, Quận 2, TP.HCM", "0900125199");
//        supplierDAO.add(newSupplier);
//        System.out.println("Nhà cung cấp mới đã được thêm.");
//
//        // Cập nhật thông tin một nhà cung cấp
//        NhaCungCap updatedSupplier = supplierDAO.getByID("NCC001");
//        if (updatedSupplier != null) {
//            updatedSupplier.setTenNCC("Công ty Áo Sơ Mi Việt");
//            supplierDAO.update(updatedSupplier);
//            System.out.println("Thông tin nhà cung cấp đã được cập nhật.");
//        }
//
//        // Xóa một nhà cung cấp
//        String supplierIdToDelete = "NCC016";
//        supplierDAO.delete(supplierIdToDelete);
//        System.out.println("Nhà cung cấp có mã " + supplierIdToDelete + " đã bị xóa.");
    }

    private static void testDAO_NhanVien(Connection connection) {
        // Tạo đối tượng NhanVienDAO
        DAO_NhanVien employeeDAO = new DAO_NhanVien(connection);

        // Lấy danh sách tất cả nhân viên
        List<NhanVien> employees = employeeDAO.getAll();
        System.out.println("Danh sách nhân viên:");
        for (NhanVien employee : employees) {
            System.out.println(employee);
        }

        String id = "NV001";
        NhanVien employee = employeeDAO.getByID(id);
        System.out.println("Nhân viên có mã " + id + ":" + employee);

        // Thêm một nhân viên mới
//        NhanVien newEmployee = new NhanVien("NV002", "Nguyễn Văn B", "123456", true, "123456789", "123 Đường A, Quận 1, TP.HCM", "0123456789", true, "Nhân viên bán hàng", 1);
//        employeeDAO.add(newEmployee);
//        System.out.println("Nhân viên mới đã được thêm.");
        // Cập nhật thông tin một nhân viên
//        NhanVien updatedEmployee = employeeDAO.getByID("NV001");
//        if (updatedEmployee != null) {
//            updatedEmployee.setTenNV("Nguyễn Văn A");
//            employeeDAO.update(updatedEmployee);
//            System.out.println("Thông tin nhân viên đã được cập nhật.");
//        }
        // Xóa một nhân viên
//        String employeeIdToDelete = "NV016";
//        employeeDAO.delete(employeeIdToDelete);
//        System.out.println("Nhân viên có mã " + employeeIdToDelete + " đã bị xóa.");
    }

    private static void test_DAO_QuanAo(Connection connection) {
        // Tạo đối tượng QuanAoDAO
        DAO_QuanAo quanAoDAO = new DAO_QuanAo(connection);

//        // Lấy danh sách tất cả nhân viên
//        List<QuanAo> dsQuanAo = quanAoDAO.getAll();
//        System.out.println("Danh sách QuanAo:");
//        for (QuanAo quanAo : dsQuanAo) {
//            System.out.println(quanAo);
//            System.out.println(quanAoDAO.getTenLoaiQuanAo(quanAo.getLoaiQuanAo()));
//        }
//
//        String id = "ADD-0001-M";
//        QuanAo quanAo = quanAoDAO.getByID(id);
//        System.out.println("Quần Áo có mã " + id + ":" + quanAo);

//        // Thêm quần áo mới
//        QuanAo newQuanAo = new QuanAo("VHN-0002-M", "Váy Hoa Nhí", "LQA006", "M", 120, "Yame", 120000, 10, new DAO_NhaCungCap(connection).getByID("NCC008"), true, "C:\\Users\\lehoa\\Desktop\\example.jpg");
//        quanAoDAO.add(newQuanAo);
//        System.out.println("Quần Áo mới đã được thêm.");
//
//        List<QuanAo> dsQuanAoMoi = quanAoDAO.getAll();
//        System.out.println("Danh sách QuanAo:");
//        for (QuanAo quanAoM : dsQuanAoMoi) {
//            System.out.println(quanAoM);
//        }

//        if (quanAoDAO.delete("ĐX-0001-L")) {
//            System.out.println("Xóa thành công");
//        } else {
//            System.out.println("Lỗi gòi");
//        }
    }

    private static void test_DAO_KhachHang(Connection connection) {
        // Tạo đối tượng QuanAoDAO
        DAO_KhachHang khachHangDAO = new DAO_KhachHang(connection);

        // Lấy danh sách tất cả nhân viên
        List<KhachHang> dsKhachHang = khachHangDAO.getAll();
        System.out.println("Danh sách QuanAo:");
        for (KhachHang khachHang : dsKhachHang) {
            System.out.println(khachHang);
        }

        String id = "0762818855";
        KhachHang khachHang = khachHangDAO.getByID(id);
        System.out.println("Khách hàng có mã " + id + ":" + khachHang);
    }

    private static void test_DAO_KhuyenMai(Connection connection) {
        // Tạo đối tượng QuanAoDAO
        DAO_KhuyenMai khuyenMaiDAO = new DAO_KhuyenMai(connection);

        // Lấy danh sách tất cả chương trình khuyến mãi
        List<KhuyenMai> dsKhuyenMai = khuyenMaiDAO.getAll();
        System.out.println("Danh sách QuanAo:");
        for (KhuyenMai khuyenMai : dsKhuyenMai) {
            System.out.println(khuyenMai);
        }

        String id = "KM020";
        KhuyenMai khuyenMai = khuyenMaiDAO.getByID(id);
        System.out.println("Khách hàng có mã " + id + ":" + khuyenMai);

//        KhuyenMai khuyenMaiNew = new KhuyenMai("KM021", "BlackFriday", 1, new Date(2022, 8, 1), new Date(2022, 8, 2), 200);
//        if (khuyenMaiDAO.add(khuyenMaiNew)) {
//            System.out.println("Thêm thành công");
//        }
//// Lấy danh sách tất cả chương trình khuyến mãi
//        List<KhuyenMai> dsKhuyenMai1 = khuyenMaiDAO.getAll();
//        System.out.println("Danh sách QuanAo:");
//        for (KhuyenMai khuyenMai1 : dsKhuyenMai1) {
//            System.out.println(khuyenMai1);
//        }

        // Cập nhật thông tin một nhân viên
        KhuyenMai updatedKhuyenMai = khuyenMaiDAO.getByID("KM020");
        if (updatedKhuyenMai != null) {
            updatedKhuyenMai.setTenCTKM("Kỷ Niệm 5 năm khai trương cửa hàng");
            khuyenMaiDAO.update(updatedKhuyenMai);
            System.out.println("Thông tin khuyến mãi đã được cập nhật.");
        }
        // Lấy danh sách tất cả chương trình khuyến mãi
        List<KhuyenMai> dsKhuyenMai2 = khuyenMaiDAO.getAll();
        System.out.println("Danh sách Khuyến mãi:");
        for (KhuyenMai khuyenMai2 : dsKhuyenMai2) {
            System.out.println(khuyenMai2);
        }
    }
    
    
    private static void testDAO_HoaDon(Connection connection) {
        // Tạo đối tượng HoaDonDAO
        DAO_HoaDon employeeDAO = new DAO_HoaDon(connection);

        // Lấy danh sách tất cả nhân viên
        List<HoaDon> employees = employeeDAO.getByName("Trương Quốc Bảo");
        System.out.println("Danh sách hóa đơn:");
        for (HoaDon employee : employees) {
            System.out.println(employee);
        }
    }
    
    private static void testDAO_ChiTietHoaDon(Connection connection) {
        // Tạo đối tượng HoaDonDAO
        DAO_ChiTietHoaDon employeeDAO = new DAO_ChiTietHoaDon(connection);

        // Lấy danh sách tất cả nhân viên
        List<ChiTietHoaDon> employees = employeeDAO.getAll();
        System.out.println("Danh sách chi tiết hóa đơn:");
        for (ChiTietHoaDon employee : employees) {
            System.out.println(employee);
        }
    }
}
