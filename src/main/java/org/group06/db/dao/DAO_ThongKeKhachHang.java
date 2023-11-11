package org.group06.db.dao;

import org.group06.db.DatabaseConnect;
import org.group06.model.entity.HoaDon;

import java.sql.*;
import java.util.ArrayList;

public class DAO_ThongKeKhachHang implements DAO_Interface<HoaDon> {

    private Connection connection = DatabaseConnect.getConnection();
//    private DAO_KhachHang dao_KhachHang = new DAO_KhachHang(connection);

    public DAO_ThongKeKhachHang(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ArrayList<HoaDon> getAll() {
        return null;
    }

// Tính theo tất cả các khoảng thời gian
    //Tổng khách hàng theo tất cả thời gian
    public ArrayList<HoaDon> getTongKH() {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT * FROM HoaDon";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                dsSLKhachHang.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSLKhachHang;
    }

    //Tổng khách hàng thân thiết theo tất cả thời gian
    public ArrayList<HoaDon> getTongKHTT() {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT MAKH FROM HoaDon WHERE MAKH IS NOT NULL GROUP BY MAKH";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                dsSLKhachHang.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSLKhachHang;
    }

    //Tổng khách vãng lai theo tất cả thời gian
    public ArrayList<HoaDon> getTongKVL() {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT MAKH FROM HoaDon WHERE MAKH IS NULL";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                dsSLKhachHang.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSLKhachHang;
    }

    // Danh sách khách hàng mua nhiều sản phẩm nhất
    public ArrayList<Object[]> getAllKhachHangTheoTongSP() {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH, ISNULL(SDT, ' ') AS SDT,SUM(SOLUONG) AS TONGSP\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "GROUP BY KH.TENKH,SDT\n"
                    + "ORDER BY TONGSP DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getInt("TONGSP")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    // Danh sách khách hàng chi tiêu nhất
    public ArrayList<Object[]> getAllKhachHangTheoTongChi() {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH,ISNULL(SDT, ' ') AS SDT,SUM(ISNULL(CHD.GIABAN, 0)) AS TongChiTieu\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "GROUP BY KH.TENKH,SDT\n"
                    + "ORDER BY TongChiTieu DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getInt("TongChiTieu")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

// Tính theo khoảng thời gian (Ngày, tháng, năm)    
    //Tổng khách hàng theo khoảng thời gian (Ngày, tháng, năm)    
    public ArrayList<HoaDon> getTongKH_TrongNgay(String date) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT MAKH FROM HoaDon WHERE NGAYTAO = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                dsSLKhachHang.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSLKhachHang;
    }

    //Tổng khách hàng thân thiết theo khoảng thời gian (Ngày, tháng, năm)    
    public ArrayList<HoaDon> getTongKHTT_TrongNgay(String date) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT MAKH FROM HoaDon WHERE MAKH is not null AND NGAYTAO = ? GROUP BY MAKH";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                dsSLKhachHang.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSLKhachHang;
    }

    //Tổng khách vãng lai theo khoảng thời gian (Ngày, tháng, năm)    
    public ArrayList<HoaDon> getTongKVL_TrongNgay(String date) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "select MAKH from HoaDon where MAKH is null AND NGAYTAO = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                dsSLKhachHang.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSLKhachHang;
    }

    // Danh sách khách hàng mua nhiều sản phẩm nhất theo khoảng thời gian (Ngày, tháng, năm)    
    public ArrayList<Object[]> getAllKhachHangTheoTongSP_TrongNgay(String date) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH, ISNULL(SDT, ' ') AS SDT,SUM(ISNULL(SOLUONG,0)) AS TONGSP\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "AND NGAYTAO = ? \n"
                    + "GROUP BY KH.TENKH,SDT\n"
                    + "ORDER BY TONGSP DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getInt("TONGSP")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    // Danh sách khách hàng chi tiêu nhất theo khoảng thời gian (Ngày, tháng, năm)    
    public ArrayList<Object[]> getAllKhachHangTheoTongChi_TrongNgay(String date) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH,ISNULL(SDT, ' ') AS SDT,SUM(ISNULL(CHD.GIABAN, 0)) AS TongChiTieu\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "AND NGAYTAO = ? \n"
                    + "GROUP BY KH.TENKH,SDT\n"
                    + "ORDER BY TongChiTieu DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getInt("TongChiTieu")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

// Tính theo khoảng thời gian (Tháng)    
    //Tổng khách hàng theo khoảng thời gian (Tháng)    
    public ArrayList<HoaDon> getTongKH_TrongThang(int month, int year) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "select MAKH from HoaDon where DATEPART(MONTH, NGAYTAO) = ? AND DATEPART(YEAR, NGAYTAO) = ? ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, month);
            statement.setInt(2, year);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                dsSLKhachHang.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSLKhachHang;
    }

    //Tổng khách hàng thân thiết theo khoảng thời gian (Tháng)    
    public ArrayList<HoaDon> getTongKHTT_TrongThang(int month, int year) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "select MAKH from HoaDon where MAKH is not null and DATEPART(MONTH, NGAYTAO) = ? AND DATEPART(YEAR, NGAYTAO) = ? GROUP BY MAKH";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, month);
            statement.setInt(2, year);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                dsSLKhachHang.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSLKhachHang;
    }

    //Tổng khách vãng lai theo khoảng thời gian (Tháng)    
    public ArrayList<HoaDon> getTongKVL_TrongThang(int month, int year) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "select MAKH from HoaDon where MAKH is null AND DATEPART(MONTH, NGAYTAO) = ? AND DATEPART(YEAR, NGAYTAO) = ? ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, month);
            statement.setInt(2, year);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                dsSLKhachHang.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSLKhachHang;
    }

    // Danh sách khách hàng mua nhiều sản phẩm nhất theo khoảng thời gian (Tháng)    
    public ArrayList<Object[]> getAllKhachHangTheoTongSP_TrongThang(int month, int year) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH, ISNULL(SDT, ' ') AS SDT,SUM(ISNULL(SOLUONG, 0)) AS TONGSP\n"
                    + "FROM HoaDon HD																		\n"
                    + "LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "AND DATEPART(MONTH, NGAYTAO) = ? AND DATEPART(YEAR, NGAYTAO) = ? \n"
                    + "GROUP BY KH.TENKH,SDT\n"
                    + "ORDER BY TONGSP DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, month);
            statement.setInt(2, year);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getInt("TONGSP")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    // Danh sách khách hàng chi tiêu nhất theo khoảng thời gian (Tháng)    
    public ArrayList<Object[]> getAllKhachHangTheoTongChi_TrongThang(int month, int year) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH,ISNULL(SDT, ' ') AS SDT,SUM(ISNULL(CHD.GIABAN, 0)) AS TongChiTieu\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "AND DATEPART(MONTH, NGAYTAO) = ? AND DATEPART(YEAR, NGAYTAO) = ? \n"
                    + "GROUP BY KH.TENKH,SDT\n"
                    + "ORDER BY TongChiTieu DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, month);
            statement.setInt(2, year);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getInt("TongChiTieu")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

// Tính theo khoảng thời gian (Năm)    
    //Tổng khách hàng theo khoảng thời gian (Năm)    
    public ArrayList<HoaDon> getTongKH_TrongNam(int year) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "select MAKH from HoaDon where DATEPART(YEAR, NGAYTAO) = ? ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, year);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                dsSLKhachHang.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSLKhachHang;
    }

    //Tổng khách hàng thân thiết theo khoảng thời gian (Năm)    
    public ArrayList<HoaDon> getTongKHTT_TrongNam(int year) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "select MAKH from HoaDon where MAKH is not null and DATEPART(YEAR, NGAYTAO) = ? GROUP BY MAKH;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, year);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                dsSLKhachHang.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSLKhachHang;
    }

    //Tổng khách vãng lai theo khoảng thời gian (Năm)    
    public ArrayList<HoaDon> getTongKVL_TrongNam(int year) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "select MAKH from HoaDon where MAKH is null AND DATEPART(YEAR, NGAYTAO) = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, year);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                dsSLKhachHang.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSLKhachHang;
    }

    // Danh sách khách hàng mua nhiều sản phẩm nhất theo khoảng thời gian (Năm)    
    public ArrayList<Object[]> getAllKhachHangTheoTongSP_TrongNam(int year) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH, ISNULL(SDT, ' ') AS SDT,SUM(ISNULL(SOLUONG, 0)) AS TONGSP\n"
                    + "FROM HoaDon HD																		\n"
                    + "LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "AND DATEPART(YEAR, NGAYTAO) = ? \n"
                    + "GROUP BY KH.TENKH,SDT\n"
                    + "ORDER BY TONGSP DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, year);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getInt("TONGSP")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    // Danh sách khách hàng chi tiêu nhất theo khoảng thời gian (Năm)    
    public ArrayList<Object[]> getAllKhachHangTheoTongChi_TrongNam(int year) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH,ISNULL(SDT, ' ') AS SDT,SUM(ISNULL(CHD.GIABAN, 0)) AS TongChiTieu\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "AND DATEPART(YEAR, NGAYTAO) = ? \n"
                    + "GROUP BY KH.TENKH,SDT\n"
                    + "ORDER BY TongChiTieu DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, year);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getInt("TongChiTieu")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

// Tính theo giữa 2 ngày
    //Tổng khách hàng theo khoảng thời gian
    public ArrayList<HoaDon> getTongKH_TheoKhoangTGian(String date1, String date2) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT MAKH FROM HoaDon WHERE NGAYTAO BETWEEN ? AND ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date1);
            statement.setString(2, date2);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                dsSLKhachHang.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSLKhachHang;
    }

    //Tổng khách hàng thân thiết theo khoảng thời gian
    public ArrayList<HoaDon> getTongKHTT_TheoKhoangTGian(String date1, String date2) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT MAKH FROM HoaDon WHERE MAKH is not null AND NGAYTAO BETWEEN ? AND ? GROUP BY MAKH";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date1);
            statement.setString(2, date2);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                dsSLKhachHang.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSLKhachHang;
    }

    //Tổng khách vãng lai theo khoảng thời gian
    public ArrayList<HoaDon> getTongKVL_TheoKhoangTGian(String date1, String date2) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "select MAKH from HoaDon where MAKH is null AND NGAYTAO BETWEEN ? AND ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date1);
            statement.setString(2, date2);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                HoaDon hoaDon = new HoaDon();
                dsSLKhachHang.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSLKhachHang;
    }

    // Danh sách khách hàng mua nhiều sản phẩm nhất theo khoảng thời gian
    public ArrayList<Object[]> getAllKhachHangTheoTongSP_TheoKhoangTGian(String date1, String date2) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH, ISNULL(SDT, ' ') AS SDT,SUM(ISNULL(SOLUONG,0)) AS TONGSP\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "AND NGAYTAO BETWEEN ? AND ? \n"
                    + "GROUP BY KH.TENKH,SDT\n"
                    + "ORDER BY TONGSP DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date1);
            statement.setString(2, date2);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getInt("TONGSP")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    // Danh sách khách hàng chi tiêu nhất theo khoảng thời gian
    public ArrayList<Object[]> getAllKhachHangTheoTongChi_TheoKhoangTGian(String date1, String date2) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH,ISNULL(SDT, ' ') AS SDT,SUM(ISNULL(CHD.GIABAN, 0)) AS TongChiTieu\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "AND NGAYTAO BETWEEN ? AND ? \n"
                    + "GROUP BY KH.TENKH,SDT\n"
                    + "ORDER BY TongChiTieu DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date1);
            statement.setString(2, date2);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getInt("TongChiTieu")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
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
        return false;
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
}
