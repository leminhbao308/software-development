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
    public ArrayList<NhanVien> getAll() {
        ArrayList<NhanVien> nhanViens = new ArrayList<>();
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
                nhanVien.setChucVu(result.getString("VITRI").trim());
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
                nhanVien.setChucVu(result.getString("VITRI").trim());
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
    
    public ArrayList<NhanVien> getLocTheoPhai(String gioiTinh) {
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien WHERE GIOITINH = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,gioiTinh);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNV(resultSet.getString("MANV").trim());
                nhanVien.setTenNV(resultSet.getString("TENNV"));
                nhanVien.setMatKhau(resultSet.getString("MATKHAU").trim());
                nhanVien.setGioiTinh(resultSet.getBoolean("GIOITINH"));
                nhanVien.setCccd(resultSet.getString("CCCD").trim());
                nhanVien.setDiaChi(resultSet.getString("DIACHI").trim());
                nhanVien.setSoDienThoai(resultSet.getString("SDT").trim());
                nhanVien.setTrangThai(resultSet.getBoolean("TRANGTHAI"));
                nhanVien.setChucVu(resultSet.getString("VITRI").trim());
                dsNhanVien.add(nhanVien);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dsNhanVien;
    }
    
    public ArrayList<NhanVien> getLocTheoTrangThai(String trangThai) {
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien WHERE TRANGTHAI = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,trangThai);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNV(resultSet.getString("MANV").trim());
                nhanVien.setTenNV(resultSet.getString("TENNV"));
                nhanVien.setMatKhau(resultSet.getString("MATKHAU").trim());
                nhanVien.setGioiTinh(resultSet.getBoolean("GIOITINH"));
                nhanVien.setCccd(resultSet.getString("CCCD").trim());
                nhanVien.setDiaChi(resultSet.getString("DIACHI").trim());
                nhanVien.setSoDienThoai(resultSet.getString("SDT").trim());
                nhanVien.setTrangThai(resultSet.getBoolean("TRANGTHAI"));
                nhanVien.setChucVu(resultSet.getString("VITRI").trim());
                dsNhanVien.add(nhanVien);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dsNhanVien;
    }
    
    public ArrayList<NhanVien> getByName(String name) {
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        String sql = "SELECT * FROM KhachHang WHERE TENKH LIKE '?'";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,name);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNV(resultSet.getString("MANV").trim());
                nhanVien.setTenNV(resultSet.getString("TENNV"));
                nhanVien.setMatKhau(resultSet.getString("MATKHAU").trim());
                nhanVien.setGioiTinh(resultSet.getBoolean("GIOITINH"));
                nhanVien.setCccd(resultSet.getString("CCCD").trim());
                nhanVien.setDiaChi(resultSet.getString("DIACHI").trim());
                nhanVien.setSoDienThoai(resultSet.getString("SDT").trim());
                nhanVien.setTrangThai(resultSet.getBoolean("TRANGTHAI"));
                nhanVien.setChucVu(resultSet.getString("VITRI").trim());
                dsNhanVien.add(nhanVien);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dsNhanVien;
    }
}
