package org.group06.db.dao;

import org.group06.model.entity.ChiTietHoaDon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Le Minh Bao
 */
public class DAO_ChiTietHoaDon implements DAO_Interface<ChiTietHoaDon> {

    private final Connection connection;

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
                chiTietHoaDon.setHoaDon(new DAO_HoaDon(connection).getByID(resultSet.getString("MAHD")));
                chiTietHoaDon.setLoiNhuan(resultSet.getDouble("LOINHUAN"));
                chiTietHoaDon.setQuanAo(new DAO_QuanAo(connection).getByID(resultSet.getString("MAQA")));
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
                chiTietHoaDon.setHoaDon(new DAO_HoaDon(connection).getByID(resultSet.getString("MAHD")));
                chiTietHoaDon.setLoiNhuan(resultSet.getDouble("LOINHUAN"));
                chiTietHoaDon.setQuanAo(new DAO_QuanAo(connection).getByID(resultSet.getString("MAQA")));
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
    public boolean add(ChiTietHoaDon t) {
        try {
            String sql = "INSERT INTO ChiTietHoaDon (MAHD, LOINHUAN, MAQA, SOLUONG, GIABAN) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, t.getHoaDon().getMaHoaDon());
            statement.setDouble(2, t.getLoiNhuan());
            statement.setString(3, t.getQuanAo().getMaQA());
            statement.setInt(4, t.getSoLuong());
            statement.setDouble(5, t.getGiaBan());
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
