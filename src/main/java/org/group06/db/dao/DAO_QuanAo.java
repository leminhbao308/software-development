package org.group06.db.dao;

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
                quanAo.setMaKichThuoc(result.getString("MAKICHTHUOC"));
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
                quanAo.setMaKichThuoc(result.getString("MAKICHTHUOC"));
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
            String sql = "INSERT INTO QuanAo (MAQA, TENQA, MALOAIQA, MAKICHTHUOC, SOLUONG, THUONGHIEU, GIANHAP, LOINHUAN, MANCC, TRANGTHAI, HINHANH) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, quanAo.getMaQA());
            statement.setString(2, quanAo.getTenQA());
            statement.setString(3, quanAo.getLoaiQuanAo());
            statement.setString(4, quanAo.getMaKichThuoc());
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
            String sql = "UPDATE QuanAo SET TENQA = ?, MALOAIQA = ?, MAKICHTHUOC = ?, SOLUONG = ?, THUONGHIEU = ?, GIANHAP = ?, LOINHUAN = ?, MANCC = ?, TRANGTHAI = ?, HINHANH = ? WHERE MAQA = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, quanAo.getTenQA());
            statement.setString(2, quanAo.getLoaiQuanAo());
            statement.setString(3, quanAo.getMaKichThuoc());
            statement.setInt(4, quanAo.getSoLuong());
            statement.setString(5, quanAo.getThuongHieu());
            statement.setDouble(6, quanAo.getGiaNhap());
            statement.setDouble(7, quanAo.getLoiNhuan());
            statement.setString(8, quanAo.getNhaCungCap().getMaNCC());
            statement.setBoolean(9, quanAo.isTrangThai());
            statement.setString(10, quanAo.getHinhAnh());
            statement.setString(11, quanAo.getMaQA());
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

    @Override
    public ArrayList<QuanAo> getBatch(int start, int end) {
        ArrayList<QuanAo> dsQuanAo = new ArrayList<>();
        try {
            String sql = "SELECT * FROM QuanAo ORDER BY MAQA OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, start);
            statement.setInt(2, end);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                QuanAo quanAo = new QuanAo();
                quanAo.setMaQA(result.getString("MAQA"));
                quanAo.setTenQA(result.getString("TENQA"));
                quanAo.setLoaiQuanAo(result.getString("MALOAIQA"));
                quanAo.setMaKichThuoc(result.getString("MAKICHTHUOC"));
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
            throw new RuntimeException(e);
        }
        return dsQuanAo;
    }
//    Loại quần áo
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
            String sql = "SELECT * FROM LoaiQuanAo WHERE MALOAIQA = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, maLoaiQuanAO);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                return result.getString("TENLOAIQA");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return "Không xác định";
        }
    }

    public boolean updateSoLuongQuanAo(QuanAo quanAo) {
        String updateQuery = "UPDATE QuanAo SET SOLUONG = ? WHERE MAQA = ?";
        boolean success = false;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setInt(1, quanAo.getSoLuong());
            preparedStatement.setString(2, quanAo.getMaQA());
            success = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }

    public boolean hoanTraQuanAo(String maQA, int soLuong) {
        String updateQuery = "UPDATE QuanAo SET SOLUONG = SOLUONG + ? WHERE MAQA = ?";
        boolean success = false;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setInt(1, soLuong);
            preparedStatement.setString(2, maQA);
            success = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }
    
    public boolean addLoaiQuanAo(String maLoaiQuanAo, String tenLoaiQuanAo) {
        try {
            String sql = "INSERT INTO LoaiQuanAo (MALOAIQA, TENLOAIQA) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, maLoaiQuanAo);
            statement.setString(2, tenLoaiQuanAo);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateLoaiQuanAo(String maLoaiQA, String tenLoaiQA) {
        try {
            String sql = "UPDATE LoaiQuanAo SET TENLOAIQA = ? WHERE MALOAIQA = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, tenLoaiQA);
            statement.setString(2, maLoaiQA);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
//   Kích Thước Quần Áo
    public HashMap<String, String> getAllKichThuocQA() {
        HashMap<String, String> dsKichThuocQA = new HashMap<>();
        try {
            String sql = "SELECT * FROM KichThuocQA";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                dsKichThuocQA.put(result.getString("MAKICHTHUOC"), result.getString("TENKICHTHUOC"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsKichThuocQA;
    }

    public boolean addKichThuocQA(String maKichThuocQA, String tenKichThuocQA) {
        try {
            String sql = "INSERT INTO KichThuocQA (MAKICHTHUOC, TENKICHTHUOC) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, maKichThuocQA);
            statement.setString(2, tenKichThuocQA);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean updateKichThuocQA(String maKichThuocQA, String tenKichThuocQA) {
        try {
            String sql = "UPDATE KichThuocQA SET TENKICHTHUOC = ? WHERE MAKICHTHUOC = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, tenKichThuocQA);
            statement.setString(2, maKichThuocQA);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
