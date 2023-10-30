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
                hoaDon.setMaHoaDon(resultSet.getString("maHoaDon"));
                hoaDon.setNgayTao(resultSet.getDate("ngayTao"));
                // Bạn cần triển khai thêm lấy thông tin KhachHang, NhanVien, và KhuyenMai ở đây
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hoaDon;
    }

    @Override
    public boolean add(HoaDon hoaDon) {
        boolean success = false;
        String sql = "INSERT INTO HoaDon (maHoaDon, ngayTao) VALUES (?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, hoaDon.getMaHoaDon());
            statement.setDate(2, hoaDon.getNgayTao());
            // Bạn cần triển khai thêm lưu thông tin KhachHang, NhanVien, và KhuyenMai ở đây
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
    
    public ArrayList<HoaDon> getByDate(Date date) {
        dao_NhanVien = new DAO_NhanVien(connection);
        dao_KhuyenMai = new DAO_KhuyenMai(connection);
        dao_KhachHang = new DAO_KhachHang(connection);
        ArrayList<HoaDon> dsHD = new ArrayList<HoaDon>();
        try {
            DatabaseConnect.getConnection();
            Connection con = DatabaseConnect.getConnection();
            String sql = "SELECT *from HoaDon where NGAYTAO = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDate(1, date);
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
}
