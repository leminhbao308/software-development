/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.group06.db.dao;

import org.group06.db.DatabaseConnect;
import org.group06.model.entity.KhachHang;
import org.group06.model.entity.KhuyenMai;
import org.group06.model.entity.NhanVien;
import org.group06.model.entity.PhieuDat;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class DAO_PhieuDat implements DAO_Interface<PhieuDat> {

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

    public ArrayList<PhieuDat> getByDateDatAndDateNhan(String dateDat, String dateNhan) {
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
        PhieuDat phieuDat = null;
        try {
            String sql = "SELECT * FROM PhieuDat WHERE MAPHIEUDAT = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                phieuDat = new PhieuDat();
                phieuDat.setMaPhieuDat(resultSet.getString("MAPHIEUDAT"));
                phieuDat.setKhuyenMai(new DAO_KhuyenMai(connection).getByID(resultSet.getString("MAKM")));
                phieuDat.setNgayTao(resultSet.getDate("NGAYTAO"));
                phieuDat.setNgayNhan(resultSet.getDate("NGAYNHAN"));
                phieuDat.setKhachHang(new DAO_KhachHang(connection).getByMAKH(resultSet.getString("MAKH")));
                phieuDat.setNhanVien(new DAO_NhanVien(connection).getByID(resultSet.getString("MANV")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return phieuDat;
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
            statement.setString(6, phieuDat.getKhuyenMai() == null ? null : phieuDat.getKhuyenMai().getMaKhuyenMai());
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
        new DAO_ChiTietPhieuDat(connection).delete(id);
        try {
            String sql = "DELETE FROM PhieuDat WHERE MAPHIEUDAT = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public int loadMaPDCount() {
        int countMaPD = 0;
        String query = "SELECT MAX(MAPHIEUDAT) FROM PhieuDat";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String maxMaPD = resultSet.getString(1);
                if (maxMaPD != null) {
                    countMaPD = Integer.parseInt(maxMaPD.substring(2)); // Bỏ đi 2 ký tự đầu (VD: PD) để lấy số
                }
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Lỗi khi tải giá trị countMaPD từ cơ sở dữ liệu.");
            e.printStackTrace();
        }
        return countMaPD;
    }

}
