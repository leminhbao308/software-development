/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.group06.db.dao;

import org.group06.model.entity.NhanVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Le Minh Bao
 */
public class DAO_NhanVien implements DAO_Interface<NhanVien>{
    private final Connection connection;
    
    public DAO_NhanVien(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<NhanVien> getAll() {
        List<NhanVien> nhanViens = new ArrayList<>();
        try {
            String sql = "SELECT * FROM NhanVien";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNV(result.getString("MANV").trim());
                nhanVien.setTenNV(result.getString("TENNV"));
                nhanVien.setMatKhau(result.getString("MATKHAU").trim());
                nhanVien.setGioiTinh(result.getBoolean("GIOITINH"));
                nhanVien.setCccd(result.getString("CCCD").trim());
                nhanVien.setDiaChi(result.getString("DIACHI").trim());
                nhanVien.setSoDienThoai(result.getString("SDT").trim());
                nhanVien.setTrangThai(result.getBoolean("TRANGTHAI"));
                nhanVien.setViTri(result.getString("VITRI").trim());
                nhanVien.setCaLamViec(result.getInt("CALAMVIEC"));
                nhanViens.add(nhanVien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhanViens;
    }

    @Override
    public NhanVien getByID(String id) {
        NhanVien nhanVien = null;
        String sql = "SELECT * FROM NhanVien WHERE MANV = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                nhanVien = new NhanVien();
                nhanVien.setMaNV(result.getString("MANV").trim());
                nhanVien.setTenNV(result.getString("TENNV"));
                nhanVien.setMatKhau(result.getString("MATKHAU").trim());
                nhanVien.setGioiTinh(result.getBoolean("GIOITINH"));
                nhanVien.setCccd(result.getString("CCCD").trim());
                nhanVien.setDiaChi(result.getString("DIACHI").trim());
                nhanVien.setSoDienThoai(result.getString("SDT").trim());
                nhanVien.setTrangThai(result.getBoolean("TRANGTHAI"));
                nhanVien.setViTri(result.getString("VITRI").trim());
                nhanVien.setCaLamViec(result.getInt("CALAMVIEC"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhanVien;
    }

    @Override
    public boolean add(NhanVien t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(NhanVien t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
