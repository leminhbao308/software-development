package org.group06.db.dao;

import org.group06.model.entity.KhuyenMai;
import org.group06.model.entity.QuanAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author lehoa
 */
public class DAO_QuanAo implements DAO_Interface<QuanAo> {
    private Connection connection;

    public DAO_QuanAo(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ArrayList<QuanAo> getAll() {
        ArrayList<QuanAo> dsQuanAo = new ArrayList<>();
        try {
            String sql = "SELECT * FROM QuanAo";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                QuanAo quanAo = new QuanAo();
                quanAo.setMaQA(result.getString("MAQA"));
                quanAo.setTenQA(result.getString("TENQA"));
                quanAo.setLoaiQuanAo(result.getString("MALOAIQA"));
                quanAo.setKichThuoc(result.getString("KICHTHUOC"));
                quanAo.setSoLuong(result.getInt("SOLUONG"));
                quanAo.setThuongHieu(result.getString("THUONGHIEU"));
                quanAo.setGiaNhap(result.getDouble("GIANHAP"));
                quanAo.setLoiNhuan(result.getDouble("LOINHUAN"));
                quanAo.setNhaCungCap(new DAO_NhaCungCap(connection).getByID(result.getString("MANCC")));
                quanAo.setTrangThai(result.getBoolean("TRANGTHAI"));
                quanAo.setHinhAnh(result.getString("HINHANH"));
                dsQuanAo.add(quanAo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsQuanAo;
    }

    @Override
    public QuanAo getByID(String id) {
        QuanAo quanAo = null;
        try {
            String sql = "SELECT * FROM QuanAo WHERE MAQA = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                quanAo = new QuanAo();
                quanAo.setMaQA(result.getString("MAQA"));
                quanAo.setTenQA(result.getString("TENQA"));
                quanAo.setLoaiQuanAo(result.getString("MALOAIQA"));
                quanAo.setKichThuoc(result.getString("KICHTHUOC"));
                quanAo.setSoLuong(result.getInt("SOLUONG"));
                quanAo.setThuongHieu(result.getString("THUONGHIEU"));
                quanAo.setGiaNhap(result.getDouble("GIANHAP"));
                quanAo.setLoiNhuan(result.getDouble("LOINHUAN"));
                quanAo.setNhaCungCap(new DAO_NhaCungCap(connection).getByID(result.getString("MANCC")));
                quanAo.setTrangThai(result.getBoolean("TRANGTHAI"));
                quanAo.setHinhAnh(result.getString("HINHANH"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return quanAo;
    }

    @Override
    public boolean add(QuanAo quanAo) {
        try {
            String sql = "INSERT INTO QuanAo (MAQA, TENQA, MALOAIQA, KICHTHUOC, SOLUONG, THUONGHIEU, GIANHAP, LOINHUAN, MANCC, TRANGTHAI, HINHANH) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, quanAo.getMaQA());
            statement.setString(2, quanAo.getTenQA());
            statement.setString(3, quanAo.getLoaiQuanAo());
            statement.setString(4, quanAo.getKichThuoc());
            statement.setInt(5, quanAo.getSoLuong());
            statement.setString(6, quanAo.getThuongHieu());
            statement.setDouble(7, quanAo.getGiaNhap());
            statement.setDouble(8, quanAo.getLoiNhuan());
            statement.setString(9, quanAo.getNhaCungCap().getMaNCC());
            statement.setBoolean(10, quanAo.isTrangThai());
            statement.setString(11, quanAo.getHinhAnh());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public boolean update(QuanAo quanAo) {
        try {
            String sql = "UPDATE QuanAo SET TENQA = ?, MALOAIQA = ?, KICHTHUOC = ?, SOLUONG = ?, THUONGHIEU = ?, GIANHAP = ?, LOINHUAN = ?, MANCC = ?, TRANGTHAI = ?, HINHANH = ? WHERE MAQA = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, quanAo.getTenQA());
            statement.setString(2, quanAo.getLoaiQuanAo());
            statement.setString(3, quanAo.getKichThuoc());
            statement.setInt(4, quanAo.getSoLuong());
            statement.setString(5, quanAo.getThuongHieu());
            statement.setDouble(6, quanAo.getGiaNhap());
            statement.setDouble(7, quanAo.getLoiNhuan());
            statement.setString(8, quanAo.getNhaCungCap().getMaNCC());
            statement.setBoolean(9, quanAo.isTrangThai());
            statement.setString(10, quanAo.getHinhAnh());
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
            String sql = "DELETE FROM QuanAo WHERE MAQA = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public HashMap<String, String> getAllLoaiQuanAo() {
        HashMap<String, String> dsLoaiQuanAo = new HashMap<>();
        try {
            String sql = "SELECT * FROM LoaiQuanAo";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                dsLoaiQuanAo.put(result.getString("MALOAIQA"), result.getString("TENLOAIQA"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsLoaiQuanAo;
    }
    
    public String getTenLoaiQuanAo(String maLoaiQuanAO) {
        try {
            String sql = "SELECT FROM LoaiQuanAo WHERE MALOAIQA = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, maLoaiQuanAO);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                return result.getString("TENLOAIQA");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            return "Không xác định";
        }
    }
}
