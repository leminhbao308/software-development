/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.group06.db.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.group06.db.DatabaseConnect;
import org.group06.model.entity.KhachHang;
import org.group06.model.entity.KhuyenMai;
import org.group06.model.entity.NhanVien;
import org.group06.model.entity.PhieuDat;

/**
 *
 * @author Dell
 */
public class DAO_PhieuDat implements DAO_Interface<PhieuDat>{
    private DAO_NhanVien dao_NhanVien;
    private DAO_KhuyenMai dao_KhuyenMai;
    private DAO_KhachHang dao_KhachHang;
    private Connection connection;

    public DAO_PhieuDat(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public ArrayList<PhieuDat> getAll() {
        dao_NhanVien = new DAO_NhanVien(connection);
        dao_KhuyenMai = new DAO_KhuyenMai(connection);
        dao_KhachHang = new DAO_KhachHang(connection);
        ArrayList<PhieuDat> dsPD = new ArrayList<PhieuDat>();
        try {
            DatabaseConnect.getConnection();
            Connection con = DatabaseConnect.getConnection();
            String sql = "SELECT * FROM PhieuDat";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                PhieuDat phieuDat = new PhieuDat();
                String maPD = resultSet.getString("MAPHIEUDAT");
                Date ngayLap = resultSet.getDate("NGAYTAO");
                Date ngayNhan = resultSet.getDate("NGAYNHAN");
                KhachHang khachHang = dao_KhachHang.getByMAKH(resultSet.getString("MAKH"));
                NhanVien nhanVien = dao_NhanVien.getByID(resultSet.getString("MANV"));
                KhuyenMai khuyenMai = dao_KhuyenMai.getByID(resultSet.getString("MAKM"));
                phieuDat = new PhieuDat(maPD, ngayLap, ngayNhan, khachHang, nhanVien, khuyenMai);
                dsPD.add(phieuDat);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPD;
    }

    public ArrayList<PhieuDat> getByNameKH(String name) {
        dao_NhanVien = new DAO_NhanVien(connection);
        dao_KhuyenMai = new DAO_KhuyenMai(connection);
        dao_KhachHang = new DAO_KhachHang(connection);
        ArrayList<PhieuDat> dsPD = new ArrayList<PhieuDat>();
        try {
            DatabaseConnect.getConnection();
            Connection con = DatabaseConnect.getConnection();
            String sql = "SELECT PhieuDat.MAPHIEUDAT,NGAYTAO,NGAYNHAN,PhieuDat.MAKH,MANV,MAKM FROM PhieuDat, KhachHang WHERE PhieuDat.MAKH = KhachHang.MAKH and TENKH = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            //Duyệt trên kết quả trả về 
            while (rs.next()) {//Di chuyển con trỏ xuống bản ghi kế tiếp
                PhieuDat phieuDat = new PhieuDat();
                String maPD = rs.getString("MAPHIEUDAT");
                KhuyenMai khuyenMai = dao_KhuyenMai.getByID(rs.getString("MAKM"));
                Date ngayLap = rs.getDate("NGAYTAO");
                Date ngayNhan = rs.getDate("NGAYNHAN");
                KhachHang khachHang = dao_KhachHang.getByMAKH(rs.getString("MAKH"));
                NhanVien nhanVien = dao_NhanVien.getByID(rs.getString("MANV"));
                phieuDat = new PhieuDat(maPD, ngayLap, ngayNhan, khachHang, nhanVien, khuyenMai);
                dsPD.add(phieuDat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPD;
    }
    
    public ArrayList<PhieuDat> getByNameNV(String name) {
        dao_NhanVien = new DAO_NhanVien(connection);
        dao_KhuyenMai = new DAO_KhuyenMai(connection);
        dao_KhachHang = new DAO_KhachHang(connection);
        ArrayList<PhieuDat> dsPD = new ArrayList<PhieuDat>();
        try {
            DatabaseConnect.getConnection();
            Connection con = DatabaseConnect.getConnection();
            String sql = "SELECT PhieuDat.MAPHIEUDAT,NGAYTAO,NGAYNHAN,MAKH,PhieuDat.MANV,MAKM FROM PhieuDat, NhanVien WHERE PhieuDat.MANV = NhanVien.MANV and TENNV = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            //Duyệt trên kết quả trả về 
            while (rs.next()) {//Di chuyển con trỏ xuống bản ghi kế tiếp
                PhieuDat phieuDat = new PhieuDat();
                String maPD = rs.getString("MAPHIEUDAT");
                KhuyenMai khuyenMai = dao_KhuyenMai.getByID(rs.getString("MAKM"));
                Date ngayLap = rs.getDate("NGAYTAO");
                Date ngayNhan = rs.getDate("NGAYNHAN");
                KhachHang khachHang = dao_KhachHang.getByMAKH(rs.getString("MAKH"));
                NhanVien nhanVien = dao_NhanVien.getByID(rs.getString("MANV"));
                phieuDat = new PhieuDat(maPD, ngayLap, ngayNhan, khachHang, nhanVien, khuyenMai);
                dsPD.add(phieuDat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPD;
    }
    
    public ArrayList<PhieuDat> getByDateDat(String date) {
        dao_NhanVien = new DAO_NhanVien(connection);
        dao_KhuyenMai = new DAO_KhuyenMai(connection);
        dao_KhachHang = new DAO_KhachHang(connection);
        ArrayList<PhieuDat> dsPD = new ArrayList<PhieuDat>();
        try {
            DatabaseConnect.getConnection();
            Connection con = DatabaseConnect.getConnection();
            String sql = "SELECT *from PhieuDat where NGAYTAO = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date);
            ResultSet rs = statement.executeQuery();
            //Duyệt trên kết quả trả về
            while (rs.next()) {//Di chuyển con trỏ xuống bản ghi kế tiếp
                PhieuDat phieuDat = new PhieuDat();
                String maHD = rs.getString("MAPHIEUDAT");
                KhuyenMai khuyenMai = dao_KhuyenMai.getByID(rs.getString("MAKM"));
                Date ngayLap = rs.getDate("NGAYTAO");
                Date ngayNhan = rs.getDate("NGAYNHAN");
                KhachHang khachHang = dao_KhachHang.getByMAKH(rs.getString("MAKH"));
                NhanVien nhanVien = dao_NhanVien.getByID(rs.getString("MANV"));
                phieuDat = new PhieuDat(maHD, ngayLap, ngayNhan, khachHang, nhanVien, khuyenMai);
                dsPD.add(phieuDat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPD;
    }
    
    public ArrayList<PhieuDat> getByDateNhan(String date) {
        dao_NhanVien = new DAO_NhanVien(connection);
        dao_KhuyenMai = new DAO_KhuyenMai(connection);
        dao_KhachHang = new DAO_KhachHang(connection);
        ArrayList<PhieuDat> dsPD = new ArrayList<PhieuDat>();
        try {
            DatabaseConnect.getConnection();
            Connection con = DatabaseConnect.getConnection();
            String sql = "SELECT *from PhieuDat where NGAYNHAN = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date);
            ResultSet rs = statement.executeQuery();
            //Duyệt trên kết quả trả về
            while (rs.next()) {//Di chuyển con trỏ xuống bản ghi kế tiếp
                PhieuDat phieuDat = new PhieuDat();
                String maHD = rs.getString("MAPHIEUDAT");
                KhuyenMai khuyenMai = dao_KhuyenMai.getByID(rs.getString("MAKM"));
                Date ngayLap = rs.getDate("NGAYTAO");
                Date ngayNhan = rs.getDate("NGAYNHAN");
                KhachHang khachHang = dao_KhachHang.getByMAKH(rs.getString("MAKH"));
                NhanVien nhanVien = dao_NhanVien.getByID(rs.getString("MANV"));
                phieuDat = new PhieuDat(maHD, ngayLap, ngayNhan, khachHang, nhanVien, khuyenMai);
                dsPD.add(phieuDat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPD;
    }
    
    public ArrayList<PhieuDat> getByDateDatAndDateNhan(String dateDat,String dateNhan) {
        dao_NhanVien = new DAO_NhanVien(connection);
        dao_KhuyenMai = new DAO_KhuyenMai(connection);
        dao_KhachHang = new DAO_KhachHang(connection);
        ArrayList<PhieuDat> dsPD = new ArrayList<PhieuDat>();
        try {
            DatabaseConnect.getConnection();
            Connection con = DatabaseConnect.getConnection();
            String sql = "select *from PhieuDat where NGAYTAO = ? or NgayNhan = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, dateDat);
            statement.setString(2, dateNhan);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                PhieuDat phieuDat = new PhieuDat();
                String maHD = rs.getString("MAPHIEUDAT");
                KhuyenMai khuyenMai = dao_KhuyenMai.getByID(rs.getString("MAKM"));
                Date ngayLap = rs.getDate("NGAYTAO");
                Date ngayNhan = rs.getDate("NGAYNHAN");
                KhachHang khachHang = dao_KhachHang.getByMAKH(rs.getString("MAKH"));
                NhanVien nhanVien = dao_NhanVien.getByID(rs.getString("MANV"));
                phieuDat = new PhieuDat(maHD, ngayLap, ngayNhan, khachHang, nhanVien, khuyenMai);
                dsPD.add(phieuDat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPD;
    }
    
    @Override
    public PhieuDat getByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(PhieuDat phieuDat) {
        boolean success = false;
        String sql = "INSERT INTO PhieuDat (MAPHIEUDAT, NGAYTAO, NGAYNHAN, MAKH, MANV, MAKM) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, phieuDat.getMaPhieuDat());
            statement.setDate(2, phieuDat.getNgayTao());
            statement.setDate(3, phieuDat.getNgayNhan());
            statement.setString(4, phieuDat.getKhachHang().getMaKhachHang());
            statement.setString(5, phieuDat.getNhanVien().getMaNV());
            statement.setString(6, phieuDat.getKhuyenMai().getMaKhuyenMai());
            success = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public boolean update(PhieuDat t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}