package org.group06.db.dao;

import org.group06.db.DatabaseConstant;
import org.group06.model.entity.HoaDon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO_ThongKeKhachHang implements DAO_Interface<HoaDon> {

    private Connection connection = DatabaseConstant.getConnection();

    public DAO_ThongKeKhachHang(Connection connection) {
        this.connection = connection;
    }

    /**
     * @return Danh sách tất cả khách hàng
     */
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

    /**
     * @return Tổng khách hàng thân thiết, nếu trùng sẽ không tính và khách hàng thân thiết có điểm tích lũy >= 100
     */
    public ArrayList<HoaDon> getTongKHTT() {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT HD.MAKH\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON KH.MAKH = HD.MAKH\n"
                    + "WHERE (HD.MAKH IS NOT NULL OR KH.DIEMTICHLUY >= 100)\n"
                    + "GROUP BY HD.MAKH";
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

    /**
     * 
     * @return Tổng khách vãng lai và khách hàng có điểm tích lũy < 100
     */
    public ArrayList<HoaDon> getTongKVL() {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT HD.MAKH \n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON KH.MAKH = HD.MAKH\n"
                    + "WHERE HD.MAKH IS NULL \n"
                    + "OR KH.DIEMTICHLUY < 100";
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

    /**
     * 
     * @return tổng chi tiêt của khách hàng, cộng dồn khách vãng lai 
     * sort theo tổng chi tiêu của khách hàng
     * 
     */
    public ArrayList<Object[]> getAllKhachHangTheoTongChi() {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH,ISNULL(SDT, ' ') AS SDT, DIEMTICHLUY, HANG,SUM(ISNULL(KM.MUCGIAGIAM/100,1)*(CHD.GIABAN*CHD.SOLUONG*1.08)) AS TongChiTieu\n"
                    + "                    FROM HoaDon HD\n"
                    + "                    LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "                    LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "                    LEFT JOIN KhuyenMai KM ON HD.MAKM = KM.MAKM\n"
                    + "                    GROUP BY KH.TENKH,SDT,DIEMTICHLUY,HANG\n"
                    + "                    ORDER BY TongChiTieu DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getString("DIEMTICHLUY"), resultSet.getString("HANG"), resultSet.getDouble("TongChiTieu")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    /**
     * 
     * @param date
     * @return Danh sách khách hàng theo date
     */
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

    /**
     * 
     * @param date
     * @return danh sách khách hàng thân thiết (điểm tích lũy >= 100) theo date
     */
    public ArrayList<HoaDon> getTongKHTT_TrongNgay(String date) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT HD.MAKH\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON KH.MAKH = HD.MAKH\n"
                    + "WHERE (HD.MAKH IS NOT NULL OR KH.DIEMTICHLUY >= 100)\n"
                    + "AND NGAYTAO = ?\n"
                    + "GROUP BY HD.MAKH";
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

    /**
     * 
     * @param date
     * @return danh sách khách vãng lai và khách hàng có điểm tích lũy < 100 theo date
     */ 
    public ArrayList<HoaDon> getTongKVL_TrongNgay(String date) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT HD.MAKH\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON KH.MAKH = HD.MAKH\n"
                    + "WHERE (HD.MAKH IS NULL OR KH.DIEMTICHLUY < 100)\n"
                    + "AND NGAYTAO = ?";
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

    /**
     * @param date
     * @return tổng chi tiêu của khách hàng theo date, cộng dồn khách vãng lai 
     * sort theo tổng chi tiêu của khách hàng 
     * 
     */
    public ArrayList<Object[]> getAllKhachHangTheoTongChi_TrongNgay(String date) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH,ISNULL(SDT, ' ') AS SDT, DIEMTICHLUY, HANG,SUM(ISNULL(KM.MUCGIAGIAM/100,1)*(CHD.GIABAN*CHD.SOLUONG*1.08)) AS TongChiTieu\n"
                    + "                    FROM HoaDon HD\n"
                    + "                    LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "                    LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "                    LEFT JOIN KhuyenMai KM ON HD.MAKM = KM.MAKM\n"
                    + "			   WHERE NGAYTAO = ?\n"
                    + "                    GROUP BY KH.TENKH,SDT,DIEMTICHLUY,HANG\n"
                    + "                    ORDER BY TongChiTieu DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getString("DIEMTICHLUY"), resultSet.getString("HANG"), resultSet.getDouble("TongChiTieu")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    /**
     * 
     * @param month
     * @param year
     * @return Danh sách khách hàng theo month và year
     */
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

    /**
     * 
     * @param month
     * @param year
     * @return Danh sách khách hàng thân thiết (điểm tích lũy >= 100) theo month và year
     */
    public ArrayList<HoaDon> getTongKHTT_TrongThang(int month, int year) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT HD.MAKH\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON KH.MAKH = HD.MAKH\n"
                    + "WHERE (HD.MAKH IS NOT NULL OR KH.DIEMTICHLUY >= 100)\n"
                    + "AND DATEPART(MONTH, NGAYTAO) = ? AND DATEPART(YEAR, NGAYTAO) = ?\n"
                    + "GROUP BY HD.MAKH";
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

    /**
     * 
     * @param month
     * @param year
     * @return Danh sách khách vãng lai và khách hàng có điểm tích lũy < 100 theo month và year
     */
    public ArrayList<HoaDon> getTongKVL_TrongThang(int month, int year) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT HD.MAKH\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON KH.MAKH = HD.MAKH\n"
                    + "WHERE (HD.MAKH IS NULL OR KH.DIEMTICHLUY < 100)\n"
                    + "AND DATEPART(MONTH, NGAYTAO) = ? AND DATEPART(YEAR, NGAYTAO) = ?";
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

    /**
     * 
     * @param month
     * @param year
     * @return tổng chi tiêu của khách hàng theo month và year, cộng dồn khách vãng lai 
     * sort theo tổng chi tiêu của khách hàng 
     */
    public ArrayList<Object[]> getAllKhachHangTheoTongChi_TrongThang(int month, int year) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH,ISNULL(SDT, ' ') AS SDT, DIEMTICHLUY, HANG,SUM(ISNULL(KM.MUCGIAGIAM/100,1)*(CHD.GIABAN*CHD.SOLUONG*1.08)) AS TongChiTieu\n"
                    + "                    FROM HoaDon HD\n"
                    + "                    LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "                    LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "                    LEFT JOIN KhuyenMai KM ON HD.MAKM = KM.MAKM\n"
                    + "			   WHERE DATEPART(MONTH, NGAYTAO) = ? AND DATEPART(YEAR, NGAYTAO) = ?\n"
                    + "                    GROUP BY KH.TENKH,SDT,DIEMTICHLUY,HANG\n"
                    + "                    ORDER BY TongChiTieu DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, month);
            statement.setInt(2, year);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getString("DIEMTICHLUY"), resultSet.getString("HANG"), resultSet.getDouble("TongChiTieu")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    /**
     * 
     * @param year
     * @return Danh sách khách hàng trong năm
     */
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

    /**
     * 
     * @param year
     * @return Danh sách khách hàng thân thiết (điểm tích lũy >= 100) trong năm
     */
    public ArrayList<HoaDon> getTongKHTT_TrongNam(int year) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT HD.MAKH\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON KH.MAKH = HD.MAKH\n"
                    + "WHERE (HD.MAKH IS NOT NULL OR KH.DIEMTICHLUY >= 100)\n"
                    + "AND DATEPART(YEAR, NGAYTAO) = ?\n"
                    + "GROUP BY HD.MAKH";
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

    /**
     * 
     * @param year
     * @return Danh sách khách vãng lai và khách hàng có điểm tích lũy < 100 trong năm
     */
    public ArrayList<HoaDon> getTongKVL_TrongNam(int year) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT HD.MAKH\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON KH.MAKH = HD.MAKH\n"
                    + "WHERE (HD.MAKH IS NULL OR KH.DIEMTICHLUY < 100)\n"
                    + "AND DATEPART(YEAR, NGAYTAO) = ?";
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

    // Danh sách khách hàng chi tiêu trong năm
    /**
     * 
     * @param year
     * @return tổng chi tiêu của khách hàng theo year, cộng dồn khách vãng lai 
     * sort theo tổng chi tiêu của khách hàng 
     */
    public ArrayList<Object[]> getAllKhachHangTheoTongChi_TrongNam(int year) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH,ISNULL(SDT, ' ') AS SDT, DIEMTICHLUY, HANG,SUM(ISNULL(KM.MUCGIAGIAM/100,1)*(CHD.GIABAN*CHD.SOLUONG*1.08)) AS TongChiTieu\n"
                    + "                    FROM HoaDon HD\n"
                    + "                    LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "                    LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "                    LEFT JOIN KhuyenMai KM ON HD.MAKM = KM.MAKM\n"
                    + "			   WHERE DATEPART(YEAR, NGAYTAO) = ?\n"
                    + "                    GROUP BY KH.TENKH,SDT,DIEMTICHLUY,HANG\n"
                    + "                    ORDER BY TongChiTieu DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, year);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getString("DIEMTICHLUY"), resultSet.getString("HANG"), resultSet.getDouble("TongChiTieu")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    /**
     * 
     * @param date1
     * @param date2
     * @return danh sách khách hàng trong khoảng thời gian được chọn
     */
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

    /**
     * 
     * @param date1
     * @param date2
     * @return danh sách khách hàng thân thiết có điểm tích lũy >= 100 trong khoảng thời gian được chọn
     */
    public ArrayList<HoaDon> getTongKHTT_TheoKhoangTGian(String date1, String date2) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT HD.MAKH\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON KH.MAKH = HD.MAKH\n"
                    + "WHERE (HD.MAKH IS NOT NULL OR KH.DIEMTICHLUY >= 100)\n"
                    + "AND NGAYTAO BETWEEN ? AND ?\n"
                    + "GROUP BY HD.MAKH";
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

    /**
     * 
     * @param date1
     * @param date2
     * @return danh sách khách vãng lai và khách hàng có điểm tích lũy < 100 trong khoảng thời gian được chọn
     */
    public ArrayList<HoaDon> getTongKVL_TheoKhoangTGian(String date1, String date2) {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "SELECT HD.MAKH\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON KH.MAKH = HD.MAKH\n"
                    + "WHERE (HD.MAKH IS NULL OR KH.DIEMTICHLUY < 100)\n"
                    + "AND NGAYTAO BETWEEN ? AND ?";
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

    /**
     * 
     * @param date1
     * @param date2
     * @return tổng chi tiêu của khách hàng theo 2 date, cộng dồn khách vãng lai 
     * sort theo tổng chi tiêu của khách hàng 
     */
    public ArrayList<Object[]> getAllKhachHangTheoTongChi_TheoKhoangTGian(String date1, String date2) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH,ISNULL(SDT, ' ') AS SDT, DIEMTICHLUY, HANG,SUM(ISNULL(KM.MUCGIAGIAM/100,1)*(CHD.GIABAN*CHD.SOLUONG*1.08)) AS TongChiTieu\n"
                    + "                    FROM HoaDon HD\n"
                    + "                    LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "                    LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "                    LEFT JOIN KhuyenMai KM ON HD.MAKM = KM.MAKM\n"
                    + "		           WHERE NGAYTAO BETWEEN ? AND ?\n"
                    + "                    GROUP BY KH.TENKH,SDT,DIEMTICHLUY,HANG\n"
                    + "                    ORDER BY TongChiTieu DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, date1);
            statement.setString(2, date2);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getString("DIEMTICHLUY"), resultSet.getString("HANG"), resultSet.getDouble("TongChiTieu")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    @Override
    public ArrayList<HoaDon> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HoaDon getByID(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean add(HoaDon hoaDon) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Deprecated
    @Override
    public boolean update(HoaDon hoaDon) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Deprecated
    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<HoaDon> getBatch(int start, int end) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<HoaDon> getHangNull() {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "select * from KhachHang WHERE HANG = ''";
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

    public ArrayList<HoaDon> getHangDong() {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "select * from KhachHang WHERE HANG = N'Đồng'";
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

    public ArrayList<HoaDon> getHangBac() {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "select * from KhachHang WHERE HANG = N'Bạc'";
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

    public ArrayList<HoaDon> getHangVang() {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "select * from KhachHang WHERE HANG = N'Vàng'";
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

    public ArrayList<HoaDon> getHangBachKim() {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "select * from KhachHang WHERE HANG = N'Bạch Kim'";
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

    public ArrayList<HoaDon> getHangKimCuong() {
        ArrayList<HoaDon> dsSLKhachHang = new ArrayList<>();
        try {
            String sql = "select * from KhachHang WHERE HANG = N'Kim Cương'";
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
}
