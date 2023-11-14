package org.group06.db.dao;

import org.group06.model.entity.ChiTietHoaDon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO_ChiTietHoaDon implements DAO_Interface<ChiTietHoaDon> {

    private Connection connection;
    private DAO_HoaDon dao_HoaDon;
    private DAO_QuanAo dao_QuanAo;

    public DAO_ChiTietHoaDon(Connection connection) {
        this.connection = connection;
        dao_HoaDon = new DAO_HoaDon(connection);
        dao_QuanAo = new DAO_QuanAo(connection);
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
            System.out.println("Lỗi lấy danh sách chi tiết hóa đơn");
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
            System.out.println("Lỗi lấy danh sách chi tiết hóa đơn");
        }
        return dsChiTietHoaDon;
    }

    @Override
    public boolean add(ChiTietHoaDon cthd) {
        try {
            String sql = "INSERT INTO ChiTietHoaDon (MAHD, LOINHUAN, MAQA, SOLUONG, GIABAN) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cthd.getHoaDon().getMaHoaDon());
            statement.setString(2, cthd.getQuanAo().getMaQA());
            statement.setInt(3, cthd.getSoLuong());
            statement.setDouble(4, cthd.getGiaBan());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Lỗi thêm chi tiết hóa đơn");
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

    @Override
    public ArrayList<ChiTietHoaDon> getBatch(int start, int end) {
        ArrayList<ChiTietHoaDon> dsChiTietHoaDon = new ArrayList<>();
        String sql = "SELECT * FROM ChiTietHoaDon ORDER BY MAHD OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, start);
            statement.setInt(2, end);
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
            System.out.println("Lỗi lấy danh sách chi tiết hóa đơn");
        }
        return dsChiTietHoaDon;
    }

    @Deprecated
    @Override
    public ChiTietHoaDon getByID(String maHD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
