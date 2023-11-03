package org.group06.db.dao;

import org.group06.db.DatabaseConnect;
import org.group06.model.entity.HoaDon;
import org.group06.model.entity.KhachHang;
import org.group06.model.entity.KhuyenMai;
import org.group06.model.entity.NhanVien;

import java.sql.*;
import java.util.ArrayList;

public class DAO_HoaDon implements DAO_Interface<HoaDon> {

    private Connection connection;

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
                hoaDon.setKhuyenMai(new DAO_KhuyenMai(connection).getByID(resultSet.getString("MAKM")));
                hoaDon.setNgayTao(resultSet.getDate("NGAYTAO"));
                hoaDon.setKhachHang(new DAO_KhachHang(connection).getByMAKH(resultSet.getString("MAKH")));
                hoaDon.setNhanVien(new DAO_NhanVien(connection).getByID(resultSet.getString("MANV")));
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
                hoaDon.setKhuyenMai(new DAO_KhuyenMai(connection).getByID(resultSet.getString("MAKM")));
                hoaDon.setKhachHang(new DAO_KhachHang(connection).getByMAKH(resultSet.getString("MAKH")));
                hoaDon.setNhanVien(new DAO_NhanVien(connection).getByID(resultSet.getString("MANV")));
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

    public ArrayList<HoaDon> getByName(String name) {
        ArrayList<HoaDon> dsHD = new ArrayList<HoaDon>();
        try {
            DatabaseConnect.getConnection();
            Connection con = DatabaseConnect.getConnection();
            String sql = "SELECT HoaDon.MAHD,NGAYTAO,MAKM,HoaDon.MAKH,MANV FROM HoaDon, KhachHang WHERE HoaDon.MAKH = KhachHang.MAKH and TENKH = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            //Duyệt trên kết quả trả về 
            while (rs.next()) {//Di chuyển con trỏ xuống bản ghi kế tiếp
                HoaDon hoaDon = new HoaDon();
                String maHD = rs.getString("MAHD");
                KhuyenMai khuyenMai = new DAO_KhuyenMai(connection).getByID(rs.getString("MAKM"));
                Date ngayLap = rs.getDate("NGAYTAO");
                KhachHang khachHang = new DAO_KhachHang(connection).getByMAKH(rs.getString("MAKH"));
                NhanVien nhanVien = new DAO_NhanVien(connection).getByID(rs.getString("MANV"));
                hoaDon = new HoaDon(maHD, ngayLap, khachHang, nhanVien, khuyenMai);
                dsHD.add(hoaDon);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsHD;
    }

    public ArrayList<HoaDon> getByDate(String date) {
        ArrayList<HoaDon> dsHD = new ArrayList<HoaDon>();
        try {
            DatabaseConnect.getConnection();
            Connection con = DatabaseConnect.getConnection();
            String sql = "SELECT *from HoaDon where NGAYTAO = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date);
            ResultSet rs = statement.executeQuery();
            //Duyệt trên kết quả trả về
            while (rs.next()) {//Di chuyển con trỏ xuống bản ghi kế tiếp
                HoaDon hoaDon = new HoaDon();
                String maHD = rs.getString("MAHD");
                KhuyenMai khuyenMai = new DAO_KhuyenMai(connection).getByID(rs.getString("MAKM"));
                Date ngayLap = rs.getDate("NGAYTAO");
                KhachHang khachHang = new DAO_KhachHang(connection).getByMAKH(rs.getString("MAKH"));
                NhanVien nhanVien = new DAO_NhanVien(connection).getByID(rs.getString("MANV"));
                hoaDon = new HoaDon(maHD, ngayLap, khachHang, nhanVien, khuyenMai);
                dsHD.add(hoaDon);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsHD;
    }

    public int loadMaHDCount() {
        int countMaHD = 1;
        String query = "SELECT MAX(MAHD) FROM HoaDon";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
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
