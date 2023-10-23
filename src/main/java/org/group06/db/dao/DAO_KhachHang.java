package org.group06.db.dao;

import org.group06.model.entity.KhachHang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO_KhachHang implements DAO_Interface<KhachHang> {
    private final Connection connection;

    public DAO_KhachHang(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<KhachHang> getAll() {
        List<KhachHang> dsKhachHang = new ArrayList<>();
        String sql = "SELECT * FROM KhachHang";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                KhachHang khachHang = new KhachHang();
                khachHang.setMaKhachHang(resultSet.getString("MAKH"));
                khachHang.setTenKH(resultSet.getString("TENKH"));
                khachHang.setSoDienThoai(resultSet.getString("SDT"));
                dsKhachHang.add(khachHang);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dsKhachHang;
    }

    @Override
    public KhachHang getByID(String id) {
        KhachHang khachHang = null;
        String sql = "SELECT * FROM KhachHang WHERE SDT = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                khachHang = new KhachHang();
                khachHang.setMaKhachHang(resultSet.getString("MAKH"));
                khachHang.setTenKH(resultSet.getString("TENKH"));
                khachHang.setSoDienThoai(resultSet.getString("SDT"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return khachHang;
    }

    @Override
    public boolean add(KhachHang khachHang) {
        return false;
    }

    @Override
    public boolean update(KhachHang khachHang) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
