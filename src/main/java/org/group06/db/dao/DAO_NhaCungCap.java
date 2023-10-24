package org.group06.db.dao;

import org.group06.model.entity.NhaCungCap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO_NhaCungCap implements DAO_Interface<NhaCungCap>{

    private final Connection connection;

    public DAO_NhaCungCap(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<NhaCungCap> getAll() {
        List<NhaCungCap> suppliers = new ArrayList<>();
        try {
            String sql = "SELECT * FROM NhaCungCap";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                NhaCungCap supplier = new NhaCungCap();
                supplier.setMaNCC(result.getString("MANCC"));
                supplier.setTenNCC(result.getString("TENNCC"));
                supplier.setDiaChi(result.getString("DIACHI"));
                supplier.setSoDienThoai(result.getString("SDT"));
                suppliers.add(supplier);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return suppliers;
    }

    @Override
    public NhaCungCap getByID(String id) {
        NhaCungCap supplier = null;
        try {
            String sql = "SELECT * FROM NhaCungCap WHERE MANCC = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                supplier = new NhaCungCap();
                supplier.setMaNCC(result.getString("MANCC"));
                supplier.setTenNCC(result.getString("TENNCC"));
                supplier.setDiaChi(result.getString("DIACHI"));
                supplier.setSoDienThoai(result.getString("SDT"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return supplier;
    }

    @Override
    public boolean add(NhaCungCap nhaCungCap) {
        try {
            String sql = "INSERT INTO NhaCungCap (MANCC, TENNCC, DIACHI, SDT) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nhaCungCap.getMaNCC());
            statement.setString(2, nhaCungCap.getTenNCC());
            statement.setString(3, nhaCungCap.getDiaChi());
            statement.setString(4, nhaCungCap.getSoDienThoai());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(NhaCungCap nhaCungCap) {
        try {
            String sql = "UPDATE NhaCungCap SET TENNCC = ?, DIACHI = ?, SDT = ? WHERE MANCC = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nhaCungCap.getTenNCC());
            statement.setString(2, nhaCungCap.getDiaChi());
            statement.setString(3, nhaCungCap.getSoDienThoai());
            statement.setString(4, nhaCungCap.getMaNCC());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(String id) {
        try {
            String sql = "DELETE FROM NhaCungCap WHERE MANCC = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
