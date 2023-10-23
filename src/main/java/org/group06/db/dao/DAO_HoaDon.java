package org.group06.db.dao;

import org.group06.model.entity.HoaDon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO_HoaDon implements DAO_Interface<HoaDon> {

    private Connection connection;

    public DAO_HoaDon(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<HoaDon> getAll() {
        List<HoaDon> hoaDons = new ArrayList<>();
        String sql = "SELECT * FROM HoaDon";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMaHoaDon(resultSet.getString("MAHD"));
                hoaDon.setNgayTao(resultSet.getDate("NGAYTAO"));
//                hoaDon.set
                hoaDons.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hoaDons;
    }

    @Override
    public HoaDon getByID(String id) {
        HoaDon hoaDon = null;
        String sql = "SELECT * FROM HoaDon WHERE MAHD = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                hoaDon = new HoaDon();
                hoaDon.setMaHoaDon(resultSet.getString("maHoaDon"));
                hoaDon.setNgayTao(resultSet.getDate("ngayTao"));
                // Bạn cần triển khai thêm lấy thông tin KhachHang, NhanVien, và KhuyenMai ở đây
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hoaDon;
    }

    @Override
    public boolean add(HoaDon hoaDon) {
        boolean success = false;
        String sql = "INSERT INTO HoaDon (maHoaDon, ngayTao) VALUES (?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, hoaDon.getMaHoaDon());
            statement.setDate(2, hoaDon.getNgayTao());
            // Bạn cần triển khai thêm lưu thông tin KhachHang, NhanVien, và KhuyenMai ở đây
            success = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public boolean update(HoaDon hoaDon) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
