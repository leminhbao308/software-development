package org.group06.db.dao;

import org.group06.db.DatabaseConnect;
import org.group06.model.entity.ChiTietPhieuDat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO_ChiTietPhieuDat implements DAO_Interface<ChiTietPhieuDat> {

    private Connection connection = DatabaseConnect.getConnection();
    private DAO_PhieuDat dao_PhieuDat = new DAO_PhieuDat(connection);
    private DAO_QuanAo dao_QuanAo = new DAO_QuanAo(connection);

    public DAO_ChiTietPhieuDat(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ArrayList<ChiTietPhieuDat> getAll() {
        ArrayList<ChiTietPhieuDat> dsChiTietPhieuDat = new ArrayList<>();
        String sql = "SELECT * FROM ChiTietPhieuDat";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                ChiTietPhieuDat chiTietPhieuDat = new ChiTietPhieuDat();
                chiTietPhieuDat.setPhieuDat(dao_PhieuDat.getByID(resultSet.getString("MAPHIEUDAT")));
                chiTietPhieuDat.setQuanAo(dao_QuanAo.getByID(resultSet.getString("MAQA")));
                chiTietPhieuDat.setSoLuong(resultSet.getInt("SOLUONG"));
                chiTietPhieuDat.setGiaBan(resultSet.getDouble("GIABAN"));
                dsChiTietPhieuDat.add(chiTietPhieuDat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChiTietPhieuDat;
    }

    public ArrayList<ChiTietPhieuDat> getAllByID(String id) {
        ArrayList<ChiTietPhieuDat> dsChiTietPhieuDat = new ArrayList<>();
        String sql = "SELECT * FROM ChiTietPhieuDat WHERE MAPHIEUDAT = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                ChiTietPhieuDat chiTietPhieuDat = new ChiTietPhieuDat();
                chiTietPhieuDat.setPhieuDat(dao_PhieuDat.getByID(resultSet.getString("MAPHIEUDAT")));
                chiTietPhieuDat.setQuanAo(dao_QuanAo.getByID(resultSet.getString("MAQA")));
                chiTietPhieuDat.setSoLuong(resultSet.getInt("SOLUONG"));
                chiTietPhieuDat.setGiaBan(resultSet.getDouble("GIABAN"));
                dsChiTietPhieuDat.add(chiTietPhieuDat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChiTietPhieuDat;
    }

    @Override
    public ChiTietPhieuDat getByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(ChiTietPhieuDat chiTietPhieuDat) {
        try {
            String sql = "INSERT INTO ChiTietPhieuDat (MAPHIEUDAT, MAQA, SOLUONG, GIABAN) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, chiTietPhieuDat.getPhieuDat().getMaPhieuDat());
            statement.setString(2, chiTietPhieuDat.getQuanAo().getMaQA());
            statement.setInt(3, chiTietPhieuDat.getSoLuong());
            statement.setDouble(4, chiTietPhieuDat.getGiaBan());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(ChiTietPhieuDat chiTietPhieuDat) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        try {
            String sql = "DELETE FROM ChiTietPhieuDat WHERE MAPHIEUDAT = ?";
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
