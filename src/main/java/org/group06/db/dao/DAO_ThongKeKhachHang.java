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
     * Tìm theo tất cả các khoảng thời gian bằng cách sử dụng câu lệnh SQL
     *
     * @return Danh sách khách hàng theo tất cả khoảng thời gian
     */
    // Tổng tất cả khách hàng
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

    // Tổng khách hàng thân thiết, nếu trùng sẽ không tính
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

    //Tổng khách vãng lai
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

    // Danh sách khách hàng chi tiêu, sort theo tổng chi tiêu của khách hàng
    public ArrayList<Object[]> getAllKhachHangTheoTongChi() {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH,ISNULL(SDT, ' ') AS SDT, DIEMTICHLUY, HANG,SUM(ISNULL(CHD.GIABAN, 0)) AS TongChiTieu\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "GROUP BY KH.TENKH,SDT,DIEMTICHLUY,HANG\n"
                    + "ORDER BY TongChiTieu DESC";
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
     * Tìm theo ngày tháng năm được chọn bằng cách sử dụng câu lệnh SQL
     *
     * @return Danh sách khách hàng theo ngày tháng năm được chọn (chỉ trong 1
     * ngày)
     */
    //Tổng khách hàng trong ngày
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

    //Tổng khách hàng thân thiết trong ngày
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

    //Tổng khách vãng lai trong ngày  
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

    // Danh sách khách hàng chi tiêu trong ngày
    public ArrayList<Object[]> getAllKhachHangTheoTongChi_TrongNgay(String date) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH,ISNULL(SDT, ' ') AS SDT, DIEMTICHLUY, HANG,SUM(ISNULL(CHD.GIABAN, 0)) AS TongChiTieu\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "AND NGAYTAO = ? \n"
                    + "GROUP BY KH.TENKH,SDT,DIEMTICHLUY,HANG\n"
                    + "ORDER BY TongChiTieu DESC";
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
     * Tìm theo tháng đã chọn bằng cách sử dụng câu lệnh SQL
     *
     * @return Danh sách khách hàng trong tháng
     */
    //Tổng khách hàng trong tháng
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

    //Tổng khách hàng thân thiết trong tháng
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

    //Tổng khách vãng lai trong tháng
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

    // Danh sách khách hàng chi tiêu trong tháng  
    public ArrayList<Object[]> getAllKhachHangTheoTongChi_TrongThang(int month, int year) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH,ISNULL(SDT, ' ') AS SDT, DIEMTICHLUY, HANG, SUM(ISNULL(CHD.GIABAN, 0)) AS TongChiTieu\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "AND DATEPART(MONTH, NGAYTAO) = ? AND DATEPART(YEAR, NGAYTAO) = ? \n"
                    + "GROUP BY KH.TENKH,SDT,DIEMTICHLUY,HANG\n"
                    + "ORDER BY TongChiTieu DESC";
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
     * Tìm theo năm đã chọn bằng cách sử dụng câu lệnh SQL
     *
     * @return Danh sách khách hàng trong năm
     */
    //Tổng khách hàng trong năm
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

    //Tổng khách hàng thân thiết trong năm
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

    //Tổng khách vãng lai trong năm
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

    // Danh sách khách hàng chi tiêu trong năm
    public ArrayList<Object[]> getAllKhachHangTheoTongChi_TrongNam(int year) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH,ISNULL(SDT, ' ') AS SDT, DIEMTICHLUY, HANG, SUM(ISNULL(CHD.GIABAN, 0)) AS TongChiTieu\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "AND DATEPART(YEAR, NGAYTAO) = ? \n"
                    + "GROUP BY KH.TENKH,SDT,DIEMTICHLUY,HANG\n"
                    + "ORDER BY TongChiTieu DESC";
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
     * Tìm theo khoảng thời gian đã chọn bằng cách sử dụng câu lệnh SQL
     *
     * @return Danh sách khách hàng trong khoảng thời gian
     */
    //Tổng khách hàng
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

    //Tổng khách hàng thân thiết
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

    //Tổng khách vãng lai
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

    // Danh sách khách hàng chi tiêu
    public ArrayList<Object[]> getAllKhachHangTheoTongChi_TheoKhoangTGian(String date1, String date2) {
        ArrayList<Object[]> rows = new ArrayList<>();
        try {
            String sql = "SELECT ISNULL(KH.TENKH, 'Khách vãng lai') AS TENKH,ISNULL(SDT, ' ') AS SDT, DIEMTICHLUY, HANG, SUM(ISNULL(CHD.GIABAN, 0)) AS TongChiTieu\n"
                    + "FROM HoaDon HD\n"
                    + "LEFT JOIN KhachHang KH ON HD.MAKH = KH.MAKH\n"
                    + "LEFT JOIN ChiTietHoaDon CHD ON HD.MAHD = CHD.MAHD\n"
                    + "AND NGAYTAO BETWEEN ? AND ? \n"
                    + "GROUP BY KH.TENKH,SDT,DIEMTICHLUY,HANG\n"
                    + "ORDER BY TongChiTieu DESC";
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
}
