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
                nhanVien.setMaNV(result.getString("MANV"));
                nhanVien.setTenNV(result.getString("TENNV"));
                nhanVien.setMatKhau(result.getString("MATKHAU"));
                nhanVien.setGioiTinh(result.getBoolean("GIOITINH"));
                nhanVien.setCccd(result.getString("CCCD"));
                nhanVien.setDiaChi(result.getString("DIACHI"));
                nhanVien.setSoDienThoai(result.getString("SDT"));
                nhanVien.setTrangThai(result.getBoolean("TRANGTHAI"));
                nhanVien.setChucVu(result.getString("VITRI"));
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
    public boolean add(NhanVien nhanVien) {
        try {
            String sql = "INSERT INTO NhanVien (MANV, MATKHAU, TENNV, GIOITINH, CCCD, DIACHI, SDT, TRANGTHAI, VITRI) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nhanVien.getMaNV());
            statement.setString(2, nhanVien.getMatKhau());
            statement.setString(3, nhanVien.getTenNV());
            statement.setBoolean(4, nhanVien.isGioiTinh());
            statement.setString(5, nhanVien.getCccd());
            statement.setString(6, nhanVien.getDiaChi());
            statement.setString(7, nhanVien.getSoDienThoai());
            statement.setBoolean(8, nhanVien.isTrangThai());
            statement.setString(9, nhanVien.getChucVu());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(NhanVien nhanVien) {
         try {
            String sql = "UPDATE NhanVien SET TENNV = ?, GIOITINH = ?, CCCD = ?, DIACHI = ?, SDT = ?, TRANGTHAI = ?, VITRI = ? WHERE MANV = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nhanVien.getTenNV());
            statement.setBoolean(2, nhanVien.isGioiTinh());
            statement.setString(3, nhanVien.getCccd());
            statement.setString(4, nhanVien.getDiaChi());
            statement.setString(5, nhanVien.getSoDienThoai());
            statement.setBoolean(6, nhanVien.isTrangThai());
            statement.setString(7, nhanVien.getChucVu());
            statement.setString(8, nhanVien.getMaNV());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public ArrayList<NhanVien> getLocTheoPhai(int gioiTinh) {
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien WHERE GIOITINH = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,gioiTinh);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNV(resultSet.getString("MANV"));
                nhanVien.setTenNV(resultSet.getString("TENNV"));
                nhanVien.setMatKhau(resultSet.getString("MATKHAU"));
                nhanVien.setGioiTinh(resultSet.getBoolean("GIOITINH"));
                nhanVien.setCccd(resultSet.getString("CCCD"));
                nhanVien.setDiaChi(resultSet.getString("DIACHI"));
                nhanVien.setSoDienThoai(resultSet.getString("SDT"));
                nhanVien.setTrangThai(resultSet.getBoolean("TRANGTHAI"));
                nhanVien.setChucVu(resultSet.getString("VITRI"));
                dsNhanVien.add(nhanVien);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dsNhanVien;
    }
    
    public ArrayList<NhanVien> getLocTheoTrangThai(int trangThai) {
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien WHERE TRANGTHAI = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,trangThai);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNV(resultSet.getString("MANV"));
                nhanVien.setTenNV(resultSet.getString("TENNV"));
                nhanVien.setMatKhau(resultSet.getString("MATKHAU"));
                nhanVien.setGioiTinh(resultSet.getBoolean("GIOITINH"));
                nhanVien.setCccd(resultSet.getString("CCCD"));
                nhanVien.setDiaChi(resultSet.getString("DIACHI"));
                nhanVien.setSoDienThoai(resultSet.getString("SDT"));
                nhanVien.setTrangThai(resultSet.getBoolean("TRANGTHAI"));
                nhanVien.setChucVu(resultSet.getString("VITRI"));
                dsNhanVien.add(nhanVien);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dsNhanVien;
    }
    
    public ArrayList<NhanVien> getLocTheoTrangThaiVaGioiTinh(int trangThai, int gioiTinh) {
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien WHERE TRANGTHAI = ? AND GIOITINH = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,trangThai);
            statement.setInt(2,gioiTinh);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNV(resultSet.getString("MANV"));
                nhanVien.setTenNV(resultSet.getString("TENNV"));
                nhanVien.setMatKhau(resultSet.getString("MATKHAU"));
                nhanVien.setGioiTinh(resultSet.getBoolean("GIOITINH"));
                nhanVien.setCccd(resultSet.getString("CCCD"));
                nhanVien.setDiaChi(resultSet.getString("DIACHI"));
                nhanVien.setSoDienThoai(resultSet.getString("SDT"));
                nhanVien.setTrangThai(resultSet.getBoolean("TRANGTHAI"));
                nhanVien.setChucVu(resultSet.getString("VITRI"));
                dsNhanVien.add(nhanVien);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dsNhanVien;
    }
    
    public ArrayList<NhanVien> getByName(String name) {
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien WHERE TENNV = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,name);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNV(resultSet.getString("MANV"));
                nhanVien.setTenNV(resultSet.getString("TENNV"));
                nhanVien.setMatKhau(resultSet.getString("MATKHAU"));
                nhanVien.setGioiTinh(resultSet.getBoolean("GIOITINH"));
                nhanVien.setCccd(resultSet.getString("CCCD"));
                nhanVien.setDiaChi(resultSet.getString("DIACHI"));
                nhanVien.setSoDienThoai(resultSet.getString("SDT"));
                nhanVien.setTrangThai(resultSet.getBoolean("TRANGTHAI"));
                nhanVien.setChucVu(resultSet.getString("VITRI"));
                dsNhanVien.add(nhanVien);
            }
        } catch (SQLException e) {
             e.printStackTrace();
        }
        return dsNhanVien;
    }
    
    public int loadMaNVCount(int countMaNV) {
        String query = "SELECT MAX(MANV) FROM NhanVien";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String maxMaNV = resultSet.getString(1);
                if (maxMaNV != null) {
                    countMaNV = Integer.parseInt(maxMaNV.substring(2)); // Bỏ đi 2 ký tự đầu (VD: NV) để lấy số
                }
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Lỗi khi tải giá trị countMaKH từ cơ sở dữ liệu.");
            e.printStackTrace();
        }
        return countMaNV;
    }
}
