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
                chiTietHoaDon.setQuanAo(new DAO_QuanAo(connection).getByID(resultSet.getString("MAQA")));
                chiTietHoaDon.setSoLuong(resultSet.getInt("SOLUONG"));
                chiTietHoaDon.setGiaBan(resultSet.getDouble("GIABAN"));
                chiTietHoaDon.setLoiNhuan(resultSet.getDouble("LOINHUAN"));
                chiTietHoaDon.setGhiChu(resultSet.getString("GHICHU"));
                dsChiTietHoaDon.add(chiTietHoaDon);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi lấy danh sách chi tiết hóa đơn");
        }
        return dsChiTietHoaDon;
    }

    public ChiTietHoaDon getQA(String maQA) {
        ChiTietHoaDon chiTietHoaDon = null;
        try {
            String sql = "SELECT * FROM ChiTietHoaDon WHERE MAQA = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, maQA);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                chiTietHoaDon = new ChiTietHoaDon();
                chiTietHoaDon.setHoaDon(new DAO_HoaDon(connection).getByID(resultSet.getString("MAHD")));
                chiTietHoaDon.setLoiNhuan(resultSet.getDouble("LOINHUAN"));
                chiTietHoaDon.setQuanAo(new DAO_QuanAo(connection).getByID(resultSet.getString("MAQA")));
                chiTietHoaDon.setSoLuong(resultSet.getInt("SOLUONG"));
                chiTietHoaDon.setGiaBan(resultSet.getDouble("GIABAN"));
            }
        } catch (SQLException e) {
            System.out.println("Lỗi lấy danh sách chi tiết hóa đơn");
        }
        return chiTietHoaDon;
    }

    @Override
    public boolean add(ChiTietHoaDon cthd) {
        try {
            String sql = "INSERT INTO ChiTietHoaDon (MAHD, MAQA, SOLUONG, GIABAN, LOINHUAN) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cthd.getHoaDon().getMaHoaDon());
            statement.setString(2, cthd.getQuanAo().getMaQA());
            statement.setInt(3, cthd.getSoLuong());
            statement.setDouble(4, cthd.getGiaBan());
            statement.setDouble(5, cthd.getLoiNhuan());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Lỗi thêm chi tiết hóa đơn");
            return false;
        }
    }

    public boolean updateSoLuong(ChiTietHoaDon cthd) {
        try {
            String sql = "UPDATE ChiTietHoaDon SET SOLUONG = ?, GHICHU = ? WHERE MAQA = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, cthd.getSoLuong());
            statement.setString(2, cthd.getGhiChu());
            statement.setString(3, cthd.getQuanAo().getMaQA());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteSoLuong(String maQA, String maHD) {
        try {
            String sql = "DELETE FROM ChiTietHoaDon WHERE MAQA = ? AND MAHD = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, maQA);
            statement.setString(2, maHD);
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
                chiTietHoaDon.setGiaBan(resultSet.getDouble("LOINHUAN"));
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
