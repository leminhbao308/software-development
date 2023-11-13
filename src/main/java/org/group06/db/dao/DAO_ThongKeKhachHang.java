package org.group06.db.dao;

import org.group06.db.DatabaseConnect;
import org.group06.model.entity.HoaDon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO_ThongKeKhachHang implements DAO_Interface<HoaDon> {

    private Connection connection = DatabaseConnect.getConnection();

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

    // Danh sách khách hàng mua sản phẩm, sort theo tổng sản phẩm đã mua
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

    // Danh sách khách hàng chi tiêu, sort theo tổng chi tiêu của khách hàng
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
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getDouble("TongChiTieu")};
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

    // Danh sách khách hàng mua sản phẩm trong ngày   
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

    // Danh sách khách hàng chi tiêu trong ngày
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
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getDouble("TongChiTieu")};
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

    // Danh sách khách hàng mua sản phẩm trong tháng
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

    // Danh sách khách hàng chi tiêu trong tháng  
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
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getDouble("TongChiTieu")};
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

    // Danh sách khách hàng mua sản phẩm trong năm
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

    // Danh sách khách hàng chi tiêu trong năm
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
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getDouble("TongChiTieu")};
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

    // Danh sách khách hàng mua sản phẩm 
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

    // Danh sách khách hàng chi tiêu
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
                Object[] data = {resultSet.getString("TENKH"), resultSet.getString("SDT"), resultSet.getDouble("TongChiTieu")};
                rows.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    @Override
    public ArrayList<HoaDon> getAll() {
        return null;
    }

    @Override
    public HoaDon getByID(String id) {
        return null;
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
