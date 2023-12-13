package org.group06.db.dao;

import org.group06.model.entity.KhachHang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO_KhachHang implements DAO_Interface<KhachHang> {

    private final Connection connection;

    public DAO_KhachHang(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ArrayList<KhachHang> getAll() {
        ArrayList<KhachHang> dsKhachHang = new ArrayList<>();
        String sql = "SELECT * FROM KhachHang";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                KhachHang khachHang = new KhachHang();
                khachHang.setMaKhachHang(resultSet.getString("MAKH"));
                khachHang.setTenKH(resultSet.getString("TENKH"));
                khachHang.setSoDienThoai(resultSet.getString("SDT"));
                khachHang.setEmail(resultSet.getString("EMAIL"));
                khachHang.setDiemTichLuy(resultSet.getInt("DIEMTICHLUY"));
                khachHang.setHang(resultSet.getString("HANG"));
                dsKhachHang.add(khachHang);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dsKhachHang;
    }

    @Override
    public KhachHang getByID(String sdt) {
        KhachHang khachHang = null;
        String sql = "SELECT * FROM KhachHang WHERE SDT = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, sdt);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                khachHang = new KhachHang();
                khachHang.setMaKhachHang(resultSet.getString("MAKH"));
                khachHang.setTenKH(resultSet.getString("TENKH"));
                khachHang.setSoDienThoai(resultSet.getString("SDT"));
                khachHang.setEmail(resultSet.getString("EMAIL"));
                khachHang.setDiemTichLuy(resultSet.getInt("DIEMTICHLUY"));
                khachHang.setHang(resultSet.getString("HANG"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return khachHang;
    }

    @Override
    public boolean add(KhachHang khachHang) {
        try {
            String sql = "INSERT INTO KhachHang (MAKH, TENKH, SDT, EMAIL) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, khachHang.getMaKhachHang());
            statement.setString(2, khachHang.getTenKH());
            statement.setString(3, khachHang.getSoDienThoai());
            statement.setString(4, khachHang.getEmail());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(KhachHang khachHang) {
        try {
            String sql = "UPDATE KhachHang SET TENKH = ?, SDT = ?, EMAIL = ?, DIEMTICHLUY = ?, HANG = ? WHERE MAKH = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, khachHang.getTenKH());
            statement.setString(2, khachHang.getSoDienThoai());
            statement.setString(3, khachHang.getEmail());
            statement.setDouble(4, khachHang.getDiemTichLuy());
            statement.setString(5, khachHang.getHang());
            statement.setString(6, khachHang.getMaKhachHang());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    /**
     * 
     * @param maKH
     * @param hang
     * @param diemTichLuy
     * @return cập nhật lại điểm tích lũy và hạng của 1 khách hàng khi biết mã khách hàng
     */
    public boolean capNhatDiemTichLuyVaHang(String maKH, String hang, double diemTichLuy) {
        try {
            String sql = "UPDATE KhachHang SET DIEMTICHLUY = ?, HANG = ? WHERE MAKH = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1, diemTichLuy);
            statement.setString(2, hang);
            statement.setString(3, maKH);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    /**
     * 
     * @param maKH
     * @return thông tin của 1 khách hàng khi biết mã khách hàng 
     */
    public KhachHang getByMAKH(String maKH) {
        KhachHang khachHang = null;
        String sql = "SELECT * FROM KhachHang WHERE MAKH = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, maKH);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                khachHang = new KhachHang();
                khachHang.setMaKhachHang(resultSet.getString("MAKH"));
                khachHang.setTenKH(resultSet.getString("TENKH"));
                khachHang.setSoDienThoai(resultSet.getString("SDT"));
                khachHang.setEmail(resultSet.getString("EMAIL"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return khachHang;
    }

    /**
     * 
     * @return số lớn nhất trong CSDL để tạo một mã khách hàng mới 
     */
    public int loadMaKHCount(int countMaKH) {
        String sql = "SELECT MAX(MAKH) FROM KhachHang";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String maxMaKH = resultSet.getString(1);
                if (maxMaKH != null) {
                    countMaKH = Integer.parseInt(maxMaKH.substring(2)); // Bỏ đi 2 ký tự đầu (VD: KH) để lấy số
                }
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Lỗi khi tải giá trị countMaKH từ cơ sở dữ liệu.");
            e.printStackTrace();
        }
        return countMaKH;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public ArrayList<KhachHang> getBatch(int start, int end) {
        ArrayList<KhachHang> dsKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT * FROM KhachHang ORDER BY MAKH OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, start);
            statement.setInt(2, end);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                KhachHang khachHang = new KhachHang();
                khachHang.setMaKhachHang(resultSet.getString("MAKH"));
                khachHang.setTenKH(resultSet.getString("TENKH"));
                khachHang.setSoDienThoai(resultSet.getString("SDT"));
                khachHang.setEmail(resultSet.getString("EMAIL"));
                khachHang.setDiemTichLuy(resultSet.getInt("DIEMTICHLUY"));
                khachHang.setHang(resultSet.getString("HANG"));
                dsKhachHang.add(khachHang);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dsKhachHang;
    }
}
