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

public class DAO_PhieuDat implements DAO_Interface<PhieuDat> {

    private Connection connection = DatabaseConnect.getConnection();
    private DAO_NhanVien dao_NhanVien = new DAO_NhanVien(connection);
    private DAO_KhuyenMai dao_KhuyenMai = new DAO_KhuyenMai(connection);
    private DAO_KhachHang dao_KhachHang = new DAO_KhachHang(connection);

    public DAO_PhieuDat(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ArrayList<PhieuDat> getAll() {
        ArrayList<PhieuDat> dsPD = new ArrayList<>();
        try {
            String sql = "SELECT * FROM PhieuDat";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                PhieuDat phieuDat = new PhieuDat();
                String maPD = resultSet.getString("MAPHIEUDAT");
                Date ngayLap = resultSet.getDate("NGAYTAO");
                Date ngayNhan = resultSet.getDate("NGAYNHAN");
                KhachHang khachHang = dao_KhachHang.getByMAKH(resultSet.getString("MAKH"));
                NhanVien nhanVien = dao_NhanVien.getByID(resultSet.getString("MANV"));
                KhuyenMai khuyenMai = dao_KhuyenMai.getByID(resultSet.getString("MAKM"));
                int trangThai = resultSet.getInt("TRANGTHAI");
                phieuDat = new PhieuDat(maPD, ngayLap, ngayNhan, khachHang, nhanVien, khuyenMai, trangThai);
                dsPD.add(phieuDat);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi lấy danh sách phiếu đặt");
        }
        return dsPD;
    }

    public ArrayList<PhieuDat> getByNameKH(String name) {
        ArrayList<PhieuDat> dsKH = new ArrayList<>();
        try {
            String sql = "SELECT PhieuDat.MAPHIEUDAT,NGAYTAO,NGAYNHAN,PhieuDat.MAKH,MANV,MAKM FROM PhieuDat, KhachHang WHERE PhieuDat.MAKH = KhachHang.MAKH AND TENKH = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                PhieuDat phieuDat = new PhieuDat();
                String maPD = rs.getString("MAPHIEUDAT");
                KhuyenMai khuyenMai = dao_KhuyenMai.getByID(rs.getString("MAKM"));
                Date ngayLap = rs.getDate("NGAYTAO");
                Date ngayNhan = rs.getDate("NGAYNHAN");
                KhachHang khachHang = dao_KhachHang.getByMAKH(rs.getString("MAKH"));
                NhanVien nhanVien = dao_NhanVien.getByID(rs.getString("MANV"));
                int trangThai = rs.getInt("TRANGTHAI");
                phieuDat = new PhieuDat(maPD, ngayLap, ngayNhan, khachHang, nhanVien, khuyenMai, trangThai);
                dsKH.add(phieuDat);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi lấy danh sách phiếu đặt theo tên khách hàng");
        }
        return dsKH;
    }

    public ArrayList<PhieuDat> getByNameNV(String name) {
        ArrayList<PhieuDat> dsPD = new ArrayList<>();
        try {
            String sql = "SELECT PhieuDat.MAPHIEUDAT,NGAYTAO,NGAYNHAN,MAKH,PhieuDat.MANV,MAKM FROM PhieuDat, NhanVien WHERE PhieuDat.MANV = NhanVien.MANV AND TENNV = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                PhieuDat phieuDat = new PhieuDat();
                String maPD = rs.getString("MAPHIEUDAT");
                KhuyenMai khuyenMai = dao_KhuyenMai.getByID(rs.getString("MAKM"));
                Date ngayLap = rs.getDate("NGAYTAO");
                Date ngayNhan = rs.getDate("NGAYNHAN");
                KhachHang khachHang = dao_KhachHang.getByMAKH(rs.getString("MAKH"));
                NhanVien nhanVien = dao_NhanVien.getByID(rs.getString("MANV"));
                int trangThai = rs.getInt("TRANGTHAI");
                phieuDat = new PhieuDat(maPD, ngayLap, ngayNhan, khachHang, nhanVien, khuyenMai, trangThai);
                dsPD.add(phieuDat);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi lấy danh sách phiếu đặt theo tên nhân viên");
        }
        return dsPD;
    }

    public ArrayList<PhieuDat> getByDateDat(String date) {
        ArrayList<PhieuDat> dsDateDat = new ArrayList<PhieuDat>();
        try {
            String sql = "SELECT *FROM PhieuDat WHERE NGAYTAO = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                PhieuDat phieuDat = new PhieuDat();
                String maHD = rs.getString("MAPHIEUDAT");
                KhuyenMai khuyenMai = dao_KhuyenMai.getByID(rs.getString("MAKM"));
                Date ngayLap = rs.getDate("NGAYTAO");
                Date ngayNhan = rs.getDate("NGAYNHAN");
                KhachHang khachHang = dao_KhachHang.getByMAKH(rs.getString("MAKH"));
                NhanVien nhanVien = dao_NhanVien.getByID(rs.getString("MANV"));
                int trangThai = rs.getInt("TRANGTHAI");
                phieuDat = new PhieuDat(maHD, ngayLap, ngayNhan, khachHang, nhanVien, khuyenMai, trangThai);
                dsDateDat.add(phieuDat);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi lấy danh sách phiếu đặt theo ngày đặt hàng");
        }
        return dsDateDat;
    }

    public ArrayList<PhieuDat> getByDateNhan(String date) {
        ArrayList<PhieuDat> dsDateNhan = new ArrayList<PhieuDat>();
        try {
            String sql = "SELECT *FROM PhieuDat WHERE NGAYNHAN = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                PhieuDat phieuDat = new PhieuDat();
                String maHD = rs.getString("MAPHIEUDAT");
                KhuyenMai khuyenMai = dao_KhuyenMai.getByID(rs.getString("MAKM"));
                Date ngayLap = rs.getDate("NGAYTAO");
                Date ngayNhan = rs.getDate("NGAYNHAN");
                KhachHang khachHang = dao_KhachHang.getByMAKH(rs.getString("MAKH"));
                NhanVien nhanVien = dao_NhanVien.getByID(rs.getString("MANV"));
                int trangThai = rs.getInt("TRANGTHAI");
                phieuDat = new PhieuDat(maHD, ngayLap, ngayNhan, khachHang, nhanVien, khuyenMai, trangThai);
                dsDateNhan.add(phieuDat);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi lấy danh sách phiếu đặt theo ngày nhận hàng");
        }
        return dsDateNhan;
    }

    /**
     * Tìm theo ngày đặt hàng hoặc ngày nhận hàng.
     * @param dateDat
     * @param dateNhan
     * @return danh sách ngày đặt hàng hoặc ngày nhận hàng
     */
    public ArrayList<PhieuDat> getByDateDatAndDateNhan(String dateDat, String dateNhan) {
        ArrayList<PhieuDat> dsDateDatAndDateNhan = new ArrayList<PhieuDat>();
        try {
            String sql = "SELECT *FROM PhieuDat WHERE NGAYTAO = ? OR NgayNhan = ?";
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
                int trangThai = rs.getInt("TRANGTHAI");
                phieuDat = new PhieuDat(maHD, ngayLap, ngayNhan, khachHang, nhanVien, khuyenMai, trangThai);
                dsDateDatAndDateNhan.add(phieuDat);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi lấy danh sách phiếu đặt theo ngày đặt hàng hoặc ngày nhận hàng");
        }
        return dsDateDatAndDateNhan;
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
                phieuDat.setTrangThai(resultSet.getInt("TRANGTHAI"));
            }
        } catch (SQLException e) {
            System.out.println("Lỗi lấy phiếu đặt theo mã phiếu đặt");
        }
        return phieuDat;
    }

    @Override
    public boolean add(PhieuDat phieuDat) {
        boolean success = false;
        String sql = "INSERT INTO PhieuDat (MAPHIEUDAT, NGAYTAO, NGAYNHAN, MAKH, MANV, MAKM, TRANGTHAI) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, phieuDat.getMaPhieuDat());
            statement.setDate(2, phieuDat.getNgayTao());
            statement.setDate(3, phieuDat.getNgayNhan());
            statement.setString(4, phieuDat.getKhachHang().getMaKhachHang());
            statement.setString(5, phieuDat.getNhanVien().getMaNV());
            statement.setString(6, phieuDat.getKhuyenMai() == null ? null : phieuDat.getKhuyenMai().getMaKhuyenMai());
            statement.setInt(7, phieuDat.getTrangThai());
            success = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Lỗi thêm phiếu đặt");
        }
        return success;
    }

    @Override
    public boolean update(PhieuDat t) {
        boolean success = false;
        String sql = "UPDATE PhieuDat SET TRANGTHAI = ? WHERE MAPHIEUDAT = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, t.getTrangThai());
            statement.setString(2, t.getMaPhieuDat());
            success = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Lỗi cập nhật trạng thái phiếu đặt");
        }
        return success;
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
            System.out.println("Lỗi xóa phiếu đặt");
            return false;
        }
    }

    public int loadMaPDCount() {
        int countMaPD = 0;
        String sql = "SELECT MAX(MAPHIEUDAT) FROM PhieuDat";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
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
        }
        return countMaPD;
    }
}
