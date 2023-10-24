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
    public KhachHang getByID(String sdt) {
        KhachHang khachHang = null;
        String sql = "SELECT * FROM KhachHang WHERE SDT = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(3, sdt);
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
        try {
            String sql = "INSERT INTO KhachHang (MAKH, TENKH, SDT) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, khachHang.getMaKhachHang());
            statement.setString(2, khachHang.getTenKH());
            statement.setString(3, khachHang.getSoDienThoai());
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
            String sql = "UPDATE KhachHang SET TENKH = ?, SDT = ? WHERE MAKH = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, khachHang.getTenKH());
            statement.setString(2, khachHang.getSoDienThoai());
            statement.setString(3, khachHang.getMaKhachHang());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<KhachHang> getByName(String name) {
        List<KhachHang> dsKhachHang = new ArrayList<>();
        String sql = "SELECT * FROM KhachHang WHERE TENKH = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,name);
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
    public boolean delete(String id) {
        return false;
    }
}