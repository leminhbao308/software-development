package org.group06.db;

import org.group06.db.dao.DAO_KhachHang;
import org.group06.db.dao.DAO_NhaCungCap;
import org.group06.db.dao.DAO_NhanVien;
import org.group06.db.dao.DAO_QuanAo;
import org.group06.model.entity.KhachHang;
import org.group06.model.entity.NhaCungCap;
import org.group06.model.entity.NhanVien;
import org.group06.model.entity.QuanAo;

import java.sql.Connection;
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
                    test_DAO_KhachHang(connection);
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
        NhaCungCap newSupplier = new NhaCungCap("NCC002", "Cửa Hàng Quần Áo Nam Nam", "456 Ðường B, Quận 2, TP.HCM", "0900125199");
        supplierDAO.add(newSupplier);
        System.out.println("Nhà cung cấp mới đã được thêm.");

        // Cập nhật thông tin một nhà cung cấp
        NhaCungCap updatedSupplier = supplierDAO.getByID("NCC001");
        if (updatedSupplier != null) {
            updatedSupplier.setTenNCC("Công ty Áo Sơ Mi Việt");
            supplierDAO.update(updatedSupplier);
            System.out.println("Thông tin nhà cung cấp đã được cập nhật.");
        }

        // Xóa một nhà cung cấp
        String supplierIdToDelete = "NCC016";
        supplierDAO.delete(supplierIdToDelete);
        System.out.println("Nhà cung cấp có mã " + supplierIdToDelete + " đã bị xóa.");
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

        // Lấy danh sách tất cả nhân viên
        List<QuanAo> dsQuanAo = quanAoDAO.getAll();
        System.out.println("Danh sách QuanAo:");
        for (QuanAo quanAo : dsQuanAo) {
            System.out.println(quanAo);
            System.out.println(quanAoDAO.getTenLoaiQuanAo(quanAo.getLoaiQuanAo()));
        }

        String id = "ADD-0001-M";
        QuanAo quanAo = quanAoDAO.getByID(id);
        System.out.println("Quần Áo có mã " + id + ":" + quanAo);

        // Thêm quần áo mới
        QuanAo newQuanAo = new QuanAo("VHN-0001-M", "Váy Hoa Nhí", "LQA006", "M", 120, "Yame", 120000, 10, new DAO_NhaCungCap(connection).getByID("NCC008"), true, "Hinh Anh Moi");
        quanAoDAO.add(newQuanAo);
        System.out.println("Quần Áo mới đã được thêm.");

        List<QuanAo> dsQuanAoMoi = quanAoDAO.getAll();
        System.out.println("Danh sách QuanAo:");
        for (QuanAo quanAoM : dsQuanAoMoi) {
            System.out.println(quanAoM);
        }
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
}
