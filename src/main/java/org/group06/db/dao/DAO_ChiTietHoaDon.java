package org.group06.db.dao;

import org.group06.model.entity.ChiTietHoaDon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.group06.db.DatabaseConnect;

public class DAO_ChiTietHoaDon implements DAO_Interface<ChiTietHoaDon> {

    private Connection connection = DatabaseConnect.getConnection();
    private DAO_HoaDon dao_HoaDon = new DAO_HoaDon(connection);
    private DAO_QuanAo dao_QuanAo = new DAO_QuanAo(connection);

    public DAO_ChiTietHoaDon(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ArrayList<ChiTietHoaDon> getAll() {
        ArrayList<ChiTietHoaDon> dsChiTietHoaDon = new ArrayList<>();
        String sql = "SELECT * FROM ChiTietHoaDon";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
                chiTietHoaDon.setHoaDon(dao_HoaDon.getByID(resultSet.getString("MAHD")));
                chiTietHoaDon.setQuanAo(dao_QuanAo.getByID(resultSet.getString("MAQA")));
                chiTietHoaDon.setSoLuong(resultSet.getInt("SOLUONG"));
                chiTietHoaDon.setGiaBan(resultSet.getDouble("GIABAN"));
                dsChiTietHoaDon.add(chiTietHoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChiTietHoaDon;
    }

    public ArrayList<ChiTietHoaDon> getAllCTQA(String maHD) {
        ArrayList<ChiTietHoaDon> dsChiTietHoaDon = new ArrayList<>();
        String sql = "SELECT * FROM ChiTietHoaDon WHERE MAHD = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, maHD);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
                chiTietHoaDon.setHoaDon(dao_HoaDon.getByID(resultSet.getString("MAHD")));
                chiTietHoaDon.setQuanAo(dao_QuanAo.getByID(resultSet.getString("MAQA")));
                chiTietHoaDon.setSoLuong(resultSet.getInt("SOLUONG"));
                chiTietHoaDon.setGiaBan(resultSet.getDouble("GIABAN"));
                dsChiTietHoaDon.add(chiTietHoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChiTietHoaDon;
    }

    @Override
    public boolean add(ChiTietHoaDon cthd) {
        try {
            String sql = "INSERT INTO ChiTietHoaDon (MAHD, MAQA, SOLUONG, GIABAN) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cthd.getHoaDon().getMaHoaDon());
            statement.setString(2, cthd.getQuanAo().getMaQA());
            statement.setInt(3, cthd.getSoLuong());
            statement.setDouble(4, cthd.getGiaBan());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Deprecated
    @Override
    public boolean update(ChiTietHoaDon t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Deprecated
    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Deprecated
    @Override
    public ChiTietHoaDon getByID(String maHD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
