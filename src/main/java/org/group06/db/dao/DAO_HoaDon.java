package org.group06.db.dao;

import org.group06.model.entity.HoaDon;

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

public class DAO_HoaDon implements DAO_Interface<HoaDon> {

    private DAO_NhanVien dao_NhanVien;
    private DAO_KhuyenMai dao_KhuyenMai;
    private DAO_KhachHang dao_KhachHang;
    private Connection connection;

    public DAO_HoaDon(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ArrayList<HoaDon> getAll() {
        dao_NhanVien = new DAO_NhanVien(connection);
        dao_KhuyenMai = new DAO_KhuyenMai(connection);
        dao_KhachHang = new DAO_KhachHang(connection);
        ArrayList<HoaDon> dsHD = new ArrayList<HoaDon>();
        try {
            DatabaseConnect.getConnection();
            Connection con = DatabaseConnect.getConnection();
            String sql = "SELECT * FROM HoaDon";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                String maHD = resultSet.getString(1);
                KhuyenMai khuyenMai = dao_KhuyenMai.getByID(resultSet.getString("MAKM"));
                Date ngayLap = resultSet.getDate(3);
                KhachHang khachHang = dao_KhachHang.getByMAKH(resultSet.getString("MAKH"));
                NhanVien nhanVien = dao_NhanVien.getByID(resultSet.getString("MANV"));
                hoaDon = new HoaDon(maHD, ngayLap, khachHang, nhanVien, khuyenMai);
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
        String sql = "SELECT * FROM HoaDon WHERE MAHD = ?";
        try {
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
        String sql = "INSERT INTO HoaDon (MAHD, NGAYTAO) VALUES (?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, hoaDon.getMaHoaDon());
            statement.setDate(2, hoaDon.getNgayTao());
            statement.setString(3, hoaDon.getKhuyenMai().getMaKhuyenMai());
            success = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public boolean update(HoaDon hoaDon) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    public ArrayList<HoaDon> getByName(String name) {
        dao_NhanVien = new DAO_NhanVien(connection);
        dao_KhuyenMai = new DAO_KhuyenMai(connection);
        dao_KhachHang = new DAO_KhachHang(connection);
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
