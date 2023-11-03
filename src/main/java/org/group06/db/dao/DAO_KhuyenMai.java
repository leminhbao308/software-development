package org.group06.db.dao;

import org.group06.model.entity.KhuyenMai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO_KhuyenMai implements DAO_Interface<KhuyenMai> {

    private Connection connection;

    public DAO_KhuyenMai(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ArrayList<KhuyenMai> getAll() {
        ArrayList<KhuyenMai> dsKhuyenMai = new ArrayList<>();
        try {
            String sql = "SELECT * FROM KhuyenMai";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                KhuyenMai khuyenMai = new KhuyenMai();
                khuyenMai.setMaKhuyenMai(result.getString("MAKM"));
                khuyenMai.setTenCTKM(result.getString("TENCTKM"));
                khuyenMai.setMucGiamGia(result.getDouble("MUCGIAGIAM"));
                khuyenMai.setNgayBatDau(result.getDate("NGAYBATDAU"));
                khuyenMai.setNgayKetThuc(result.getDate("NGAYKETTHUC"));
                khuyenMai.setSoLuotSuDung(result.getInt("SOLUOTSD"));
                dsKhuyenMai.add(khuyenMai);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsKhuyenMai;
    }

    @Override
    public KhuyenMai getByID(String id) {
        KhuyenMai khuyenMai = null;
        try {
            String sql = "SELECT * FROM KhuyenMai WHERE MAKM = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                khuyenMai = new KhuyenMai();
                khuyenMai.setMaKhuyenMai(result.getString("MAKM"));
                khuyenMai.setTenCTKM(result.getString("TENCTKM"));
                khuyenMai.setMucGiamGia(result.getDouble("MUCGIAGIAM"));
                khuyenMai.setNgayBatDau(result.getDate("NGAYBATDAU"));
                khuyenMai.setNgayKetThuc(result.getDate("NGAYKETTHUC"));
                khuyenMai.setSoLuotSuDung(result.getInt("SOLUOTSD"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return khuyenMai;
    }

    @Override
    public boolean add(KhuyenMai khuyenMai) {
        try {
            String sql = "INSERT INTO KhuyenMai (MAKM, TENCTKM, MUCGIAGIAM, NGAYBATDAU, NGAYKETTHUC, SOLUOTSD) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, khuyenMai.getMaKhuyenMai());
            statement.setString(2, khuyenMai.getTenCTKM());
            statement.setDouble(3, khuyenMai.getMucGiamGia());
            statement.setDate(4, khuyenMai.getNgayBatDau());
            statement.setDate(5, khuyenMai.getNgayKetThuc());
            statement.setInt(6, khuyenMai.getSoLuotSuDung());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(KhuyenMai khuyenMai) {
        try {
            String sql = "UPDATE KhuyenMai SET TENCTKM = ?, MUCGIAGIAM = ?, NGAYBATDAU = ?, NGAYKETTHUC = ?, SOLUOTSD = ? WHERE MAKM = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, khuyenMai.getTenCTKM());
            statement.setDouble(2, khuyenMai.getMucGiamGia());
            statement.setDate(3, khuyenMai.getNgayBatDau());
            statement.setDate(4, khuyenMai.getNgayKetThuc());
            statement.setInt(5, khuyenMai.getSoLuotSuDung());
            statement.setString(6, khuyenMai.getMaKhuyenMai());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean updateSoLuotSuDung(KhuyenMai khuyenMai) {
        String updateQuery = "UPDATE KhuyenMai SET SOLUOTSD = ? WHERE MAKM = ?";
        boolean success = false;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

            preparedStatement.setInt(1, khuyenMai.getSoLuotSuDung());
            preparedStatement.setString(2, khuyenMai.getMaKhuyenMai());
            success = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }    

    @Override
    public boolean delete(String id) {
        try {
            String sql = "DELETE FROM KhuyenMai WHERE MAKM = ?";
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
