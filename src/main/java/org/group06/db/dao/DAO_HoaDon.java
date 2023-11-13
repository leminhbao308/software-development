package org.group06.db.dao;

import org.group06.db.DatabaseConnect;
import org.group06.model.entity.HoaDon;
import org.group06.model.entity.KhachHang;
import org.group06.model.entity.KhuyenMai;
import org.group06.model.entity.NhanVien;

import java.sql.*;
import java.util.ArrayList;

public class DAO_HoaDon implements DAO_Interface<HoaDon> {

    private Connection connection = DatabaseConnect.getConnection();
    private DAO_KhachHang dao_KhachHang = new DAO_KhachHang(connection);
    private DAO_NhanVien dao_NhanVien = new DAO_NhanVien(connection);
    private DAO_KhuyenMai dao_KhuyenMai = new DAO_KhuyenMai(connection);

    public DAO_HoaDon(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ArrayList<HoaDon> getAll() {
        ArrayList<HoaDon> dsHD = new ArrayList<>();
        try {
            String sql = "SELECT * FROM HoaDon";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMaHoaDon(resultSet.getString("MAHD"));
                hoaDon.setKhuyenMai(dao_KhuyenMai.getByID(resultSet.getString("MAKM")));
                hoaDon.setNgayTao(resultSet.getDate("NGAYTAO"));
                hoaDon.setKhachHang(dao_KhachHang.getByMAKH(resultSet.getString("MAKH")));
                hoaDon.setNhanVien(dao_NhanVien.getByID(resultSet.getString("MANV")));
                dsHD.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsHD;
    }

    @Override
    public HoaDon getByID(String id) {
        HoaDon hoaDon = null;
        try {
            String sql = "SELECT * FROM HoaDon WHERE MAHD = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                hoaDon = new HoaDon();
                hoaDon.setMaHoaDon(resultSet.getString("MAHD"));
                hoaDon.setNgayTao(resultSet.getDate("NGAYTAO"));
                hoaDon.setKhuyenMai(dao_KhuyenMai.getByID(resultSet.getString("MAKM")));
                hoaDon.setKhachHang(dao_KhachHang.getByMAKH(resultSet.getString("MAKH")));
                hoaDon.setNhanVien(dao_NhanVien.getByID(resultSet.getString("MANV")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hoaDon;
    }

    @Override
    public boolean add(HoaDon hoaDon) {
        boolean success = false;
        String sql = "INSERT INTO HoaDon (MAHD, NGAYTAO, MAKM, MAKH, MANV) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, hoaDon.getMaHoaDon());
            statement.setDate(2, hoaDon.getNgayTao());
            statement.setString(3, hoaDon.getKhuyenMai() == null ? null : hoaDon.getKhuyenMai().getMaKhuyenMai());
            statement.setString(4, hoaDon.getKhachHang() == null ? null : hoaDon.getKhachHang().getMaKhachHang());
            statement.setString(5, hoaDon.getNhanVien().getMaNV());
            success = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }

    @Deprecated
    @Override
    public boolean update(HoaDon hoaDon) {
        return false;
    }

    @Deprecated
    @Override
    public boolean delete(String id) {
        return false;
    }

    public ArrayList<HoaDon> getByDate(String date) {
        ArrayList<HoaDon> dsHD = new ArrayList<HoaDon>();
        try {
            String sql = "SELECT *FROM HoaDon WHERE NGAYTAO = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                HoaDon hoaDon = new HoaDon();
                String maHD = rs.getString("MAHD");
                KhuyenMai khuyenMai = dao_KhuyenMai.getByID(rs.getString("MAKM"));
                Date ngayLap = rs.getDate("NGAYTAO");
                KhachHang khachHang = dao_KhachHang.getByMAKH(rs.getString("MAKH"));
                NhanVien nhanVien = dao_NhanVien.getByID(rs.getString("MANV"));
                hoaDon = new HoaDon(maHD, ngayLap, khachHang, nhanVien, khuyenMai);
                dsHD.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsHD;
    }

    public int loadMaHDCount() {
        int countMaHD = 0;
        String sql = "SELECT MAX(MAHD) FROM HoaDon";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String maxMaHD = resultSet.getString(1);
                if (maxMaHD != null) {
                    countMaHD = Integer.parseInt(maxMaHD.substring(2)); // Bỏ đi 2 ký tự đầu (VD: HD) để lấy số
                }
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Lỗi khi tải giá trị countMaHD từ cơ sở dữ liệu.");
            e.printStackTrace();
        }
        return countMaHD;
    }
}
