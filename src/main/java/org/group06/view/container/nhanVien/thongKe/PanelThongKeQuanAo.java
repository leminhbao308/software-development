package org.group06.view.container.nhanVien.thongKe;

import org.group06.db.DatabaseConstant;
import org.group06.db.dao.DAO_ChiTietHoaDon;
import org.group06.db.dao.DAO_HoaDon;
import org.group06.db.dao.DAO_KhuyenMai;
import org.group06.db.dao.DAO_QuanAo;
import org.group06.model.entity.*;
import org.group06.utils.FormatCellRenderer;
import org.group06.utils.NumberStandard;
import org.group06.view.container.nhanVien.quanLyHoaDon.WinChiTietHoaDon;
import org.group06.view.container.nhanVien.quanLyHoaDon.PanelHoaDon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;
import java.util.*;

/**
 * @author Le Hoang Nam
 */
public class PanelThongKeQuanAo extends javax.swing.JPanel {

    private final Connection connection = DatabaseConstant.getConnection();
    private final DAO_HoaDon dao_HoaDon = new DAO_HoaDon(connection);
    private final DAO_QuanAo dao_QuanAo = new DAO_QuanAo(connection);
    private final DAO_ChiTietHoaDon dao_ChiTietHoaDon = new DAO_ChiTietHoaDon(connection);
    private ArrayList<HoaDon> dsHoaDon = new ArrayList<>();
    private ArrayList<ChiTietHoaDon> dsChiTietHoaDon = new ArrayList<>();
    private ArrayList<QuanAo> dsQA = new ArrayList<>();

    /**
     * Creates new form PanelThongKeQuanAo
     */
    public PanelThongKeQuanAo() {
        dsHoaDon = dao_HoaDon.getAll();
        dsChiTietHoaDon = dao_ChiTietHoaDon.getAll();
        dsQA = dao_QuanAo.getAll();
        initComponents();
        FormatCellRenderer.formatCellRendererLeft(tblTopQuanAo, 3);
        tabLuaChonThongKe.setSelectedIndex(-1);
        this.txtTongSoLuongQuanAo.setText("Không có thông tin");
        this.txtLoaiQuanAo.setText("Không có thông tin");
        this.txtTenQuanAo.setText("Không có thông tin");
        this.txtLoiNhuan.setText("Không có thông tin");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        tabXemThongTin = new javax.swing.JTabbedPane();
        pnlBangChiTiet = new javax.swing.JPanel();
        pnlTongQuan = new javax.swing.JPanel();
        tabLuaChonThongKe = new javax.swing.JTabbedPane();
        pnlTkQuanAoHet = new javax.swing.JPanel();
        lblTKQuanAoHet = new javax.swing.JLabel();
        pnlTkToanBo = new javax.swing.JPanel();
        lblToanBo = new javax.swing.JLabel();
        pnlTkTheoNgay = new javax.swing.JPanel();
        lblChonNgay = new javax.swing.JLabel();
        dchChonNgay = new com.toedter.calendar.JDateChooser();
        pnlTkTheoThang = new javax.swing.JPanel();
        lblChonThangVaNam = new javax.swing.JLabel();
        monthTheoThang = new com.toedter.calendar.JMonthChooser();
        yearTheoThang = new com.toedter.calendar.JYearChooser();
        pnlTkTheoNam = new javax.swing.JPanel();
        lblChonNam = new javax.swing.JLabel();
        yearTheoNam = new com.toedter.calendar.JYearChooser();
        pnlTkTheoKhoangThoiGian = new javax.swing.JPanel();
        lblTuNgay = new javax.swing.JLabel();
        dchTuNgay = new com.toedter.calendar.JDateChooser();
        lblDenNgay = new javax.swing.JLabel();
        dchDenNgay = new com.toedter.calendar.JDateChooser();
        pnlTongQuanQuanAo = new javax.swing.JPanel();
        lblTongHD = new javax.swing.JLabel();
        lblTongQA = new javax.swing.JLabel();
        lblDoanhThu = new javax.swing.JLabel();
        lblLoiNhuan = new javax.swing.JLabel();
        txtTongSoLuongQuanAo = new javax.swing.JTextField();
        txtLoaiQuanAo = new javax.swing.JTextField();
        txtTenQuanAo = new javax.swing.JTextField();
        txtLoiNhuan = new javax.swing.JTextField();
        scrTopQuanAo = new javax.swing.JScrollPane();
        tblTopQuanAo = new javax.swing.JTable();
        pnlBieuDo = new javax.swing.JPanel();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Thống Kê Quần Áo");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        tabXemThongTin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabXemThongTin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        pnlBangChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlTongQuan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tổng Quan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        pnlTongQuan.setLayout(new java.awt.GridLayout(1, 0));

        tabLuaChonThongKe.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabLuaChonThongKe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabLuaChonThongKe.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabLuaChonThongKeStateChanged(evt);
            }
        });

        lblTKQuanAoHet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTKQuanAoHet.setText("Đang Hiển Thị Thống Kê Quần Áo Hết");

        javax.swing.GroupLayout pnlTkQuanAoHetLayout = new javax.swing.GroupLayout(pnlTkQuanAoHet);
        pnlTkQuanAoHet.setLayout(pnlTkQuanAoHetLayout);
        pnlTkQuanAoHetLayout.setHorizontalGroup(
            pnlTkQuanAoHetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkQuanAoHetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTKQuanAoHet)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTkQuanAoHetLayout.setVerticalGroup(
            pnlTkQuanAoHetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkQuanAoHetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTKQuanAoHet)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        tabLuaChonThongKe.addTab("Thống Kê Quần Áo Hết", pnlTkQuanAoHet);

        lblToanBo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblToanBo.setText("Đang Hiển Thị Thống Kê Toàn Thời Gian");

        javax.swing.GroupLayout pnlTkToanBoLayout = new javax.swing.GroupLayout(pnlTkToanBo);
        pnlTkToanBo.setLayout(pnlTkToanBoLayout);
        pnlTkToanBoLayout.setHorizontalGroup(
            pnlTkToanBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkToanBoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblToanBo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTkToanBoLayout.setVerticalGroup(
            pnlTkToanBoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkToanBoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblToanBo)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        tabLuaChonThongKe.addTab("Thống Kê Toàn Bộ Thời Gian", pnlTkToanBo);

        lblChonNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblChonNgay.setText("Chọn ngày:");

        dchChonNgay.setDate(new java.util.Date());
        dchChonNgay.setDateFormatString("dd-MM-yyyy");
        dchChonNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchChonNgay.setMaxSelectableDate(new java.util.Date());
        dchChonNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchChonNgayPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlTkTheoNgayLayout = new javax.swing.GroupLayout(pnlTkTheoNgay);
        pnlTkTheoNgay.setLayout(pnlTkTheoNgayLayout);
        pnlTkTheoNgayLayout.setHorizontalGroup(
            pnlTkTheoNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTkTheoNgayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTkTheoNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dchChonNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addGroup(pnlTkTheoNgayLayout.createSequentialGroup()
                        .addComponent(lblChonNgay)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTkTheoNgayLayout.setVerticalGroup(
            pnlTkTheoNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkTheoNgayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChonNgay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dchChonNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        dchChonNgay.setLocale(new Locale("vi", "VN"));
        dchChonNgay.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadIcon(org.group06.utils.ImagePath.ICON_CALENDAR));
        dchChonNgay.getDateEditor().setEnabled(false);
        ((com.toedter.calendar.JTextFieldDateEditor) dchChonNgay.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);

        tabLuaChonThongKe.addTab("Thống Kê Theo Ngày", pnlTkTheoNgay);

        lblChonThangVaNam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblChonThangVaNam.setText("Chọn tháng và năm:");

        monthTheoThang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        monthTheoThang.setYearChooser(yearTheoThang);
        monthTheoThang.setLocale(new Locale("vi", "VN"));
        monthTheoThang.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                monthTheoThangPropertyChange(evt);
            }
        });

        yearTheoThang.setEndYear(LocalDate.now().getYear());
        yearTheoThang.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                yearTheoThangPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlTkTheoThangLayout = new javax.swing.GroupLayout(pnlTkTheoThang);
        pnlTkTheoThang.setLayout(pnlTkTheoThangLayout);
        pnlTkTheoThangLayout.setHorizontalGroup(
            pnlTkTheoThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkTheoThangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTkTheoThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTkTheoThangLayout.createSequentialGroup()
                        .addComponent(lblChonThangVaNam)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlTkTheoThangLayout.createSequentialGroup()
                        .addComponent(monthTheoThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearTheoThang, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTkTheoThangLayout.setVerticalGroup(
            pnlTkTheoThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkTheoThangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChonThangVaNam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTkTheoThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yearTheoThang, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(monthTheoThang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        tabLuaChonThongKe.addTab("Thống Kê Theo Tháng", pnlTkTheoThang);

        lblChonNam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblChonNam.setText("Chọn năm:");

        yearTheoNam.setEndYear(LocalDate.now().getYear());
        yearTheoNam.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                yearTheoNamPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlTkTheoNamLayout = new javax.swing.GroupLayout(pnlTkTheoNam);
        pnlTkTheoNam.setLayout(pnlTkTheoNamLayout);
        pnlTkTheoNamLayout.setHorizontalGroup(
            pnlTkTheoNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkTheoNamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTkTheoNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTkTheoNamLayout.createSequentialGroup()
                        .addComponent(lblChonNam)
                        .addGap(0, 517, Short.MAX_VALUE))
                    .addComponent(yearTheoNam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTkTheoNamLayout.setVerticalGroup(
            pnlTkTheoNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkTheoNamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChonNam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearTheoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        tabLuaChonThongKe.addTab("Thống Kê Theo Năm", pnlTkTheoNam);

        lblTuNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTuNgay.setText("Từ ngày:");

        dchTuNgay.setDate(new java.util.Date());
        dchTuNgay.setDateFormatString("dd-MM-yyyy");
        dchTuNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchTuNgay.setMaxSelectableDate(dchDenNgay.getDate());
        dchTuNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchTuNgayPropertyChange(evt);
            }
        });

        lblDenNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDenNgay.setText("Đến ngày:");

        dchDenNgay.setDate(new java.util.Date());
        dchDenNgay.setDateFormatString("dd-MM-yyyy");
        dchDenNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchDenNgay.setMinSelectableDate(dchTuNgay.getDate());
        dchDenNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchDenNgayPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlTkTheoKhoangThoiGianLayout = new javax.swing.GroupLayout(pnlTkTheoKhoangThoiGian);
        pnlTkTheoKhoangThoiGian.setLayout(pnlTkTheoKhoangThoiGianLayout);
        pnlTkTheoKhoangThoiGianLayout.setHorizontalGroup(
            pnlTkTheoKhoangThoiGianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkTheoKhoangThoiGianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTkTheoKhoangThoiGianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dchTuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addGroup(pnlTkTheoKhoangThoiGianLayout.createSequentialGroup()
                        .addGroup(pnlTkTheoKhoangThoiGianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTuNgay)
                            .addComponent(lblDenNgay))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dchDenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTkTheoKhoangThoiGianLayout.setVerticalGroup(
            pnlTkTheoKhoangThoiGianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTkTheoKhoangThoiGianLayout.createSequentialGroup()
                .addComponent(lblTuNgay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dchTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDenNgay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dchDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        dchTuNgay.setLocale(new Locale("vi", "VN"));
        dchTuNgay.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadIcon(org.group06.utils.ImagePath.ICON_CALENDAR));
        dchTuNgay.getDateEditor().setEnabled(false);
        ((com.toedter.calendar.JTextFieldDateEditor) dchTuNgay.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);
        dchDenNgay.setLocale(new Locale("vi", "VN"));
        dchDenNgay.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadIcon(org.group06.utils.ImagePath.ICON_CALENDAR));
        dchDenNgay.getDateEditor().setEnabled(false);
        ((com.toedter.calendar.JTextFieldDateEditor) dchDenNgay.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);

        tabLuaChonThongKe.addTab("Thống Kê Theo Khoảng Thời Gian", pnlTkTheoKhoangThoiGian);

        javax.swing.JLabel lblQuanAoHet = new javax.swing.JLabel("Thống Kê Quần Áo Hết");
        javax.swing.JLabel lblToanBo = new javax.swing.JLabel("Thống Kê Toàn Bộ Thời Gian");
        javax.swing.JLabel lblTheoNgay = new javax.swing.JLabel("Thống Kê Theo Ngày");
        javax.swing.JLabel lblTheoThang = new javax.swing.JLabel("Thống Kê Theo Tháng");
        javax.swing.JLabel lblTheoNam = new javax.swing.JLabel("Thống Kê Theo Năm");
        javax.swing.JLabel lblTheoKhoangThoiGian = new javax.swing.JLabel("Thống Kê Theo Khoảng Thời Gian");

        lblQuanAoHet.setPreferredSize(new Dimension(270, 30));
        lblToanBo.setPreferredSize(new Dimension(270, 30));
        lblTheoNgay.setPreferredSize(new Dimension(270, 30));
        lblTheoThang.setPreferredSize(new Dimension(270, 30));
        lblTheoNam.setPreferredSize(new Dimension(270, 30));
        lblTheoKhoangThoiGian.setPreferredSize(new Dimension(270, 30));

        lblQuanAoHet.setHorizontalAlignment(SwingConstants.LEFT);
        lblToanBo.setHorizontalAlignment(SwingConstants.LEFT);
        lblTheoNgay.setHorizontalAlignment(SwingConstants.LEFT);
        lblTheoThang.setHorizontalAlignment(SwingConstants.LEFT);
        lblTheoNam.setHorizontalAlignment(SwingConstants.LEFT);
        lblTheoKhoangThoiGian.setHorizontalAlignment(SwingConstants.LEFT);

        lblQuanAoHet.setFont(new Font("Segoe UI", 0, 18));
        lblToanBo.setFont(new Font("Segoe UI", 0, 18));
        lblTheoNgay.setFont(new Font("Segoe UI", 0, 18));
        lblTheoThang.setFont(new Font("Segoe UI", 0, 18));
        lblTheoNam.setFont(new Font("Segoe UI", 0, 18));
        lblTheoKhoangThoiGian.setFont(new Font("Segoe UI", 0, 18));

        tabLuaChonThongKe.setTabComponentAt(0, lblQuanAoHet);
        tabLuaChonThongKe.setTabComponentAt(1, lblToanBo);
        tabLuaChonThongKe.setTabComponentAt(2, lblTheoNgay);
        tabLuaChonThongKe.setTabComponentAt(3, lblTheoThang);
        tabLuaChonThongKe.setTabComponentAt(4, lblTheoNam);
        tabLuaChonThongKe.setTabComponentAt(5, lblTheoKhoangThoiGian);

        pnlTongQuan.add(tabLuaChonThongKe);

        pnlTongQuanQuanAo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tổng Quan Quần Áo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lblTongHD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTongHD.setText("Số lượng quần áo bán nhiều nhất:");

        lblTongQA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTongQA.setText("Loại quần áo được mua nhiều nhất:");

        lblDoanhThu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDoanhThu.setText("Tên quần áo được mua nhiều nhất:");

        lblLoiNhuan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLoiNhuan.setText("Lợi nhuận thu được:");

        txtTongSoLuongQuanAo.setEditable(false);
        txtTongSoLuongQuanAo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTongSoLuongQuanAo.setForeground(new java.awt.Color(255, 51, 51));
        txtTongSoLuongQuanAo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTongSoLuongQuanAo.setText(NumberStandard.formatInteger(0));
        txtTongSoLuongQuanAo.setDisabledTextColor(new java.awt.Color(255, 51, 51));
        txtTongSoLuongQuanAo.setFocusable(false);

        txtLoaiQuanAo.setEditable(false);
        txtLoaiQuanAo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLoaiQuanAo.setForeground(new java.awt.Color(255, 51, 51));
        txtLoaiQuanAo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLoaiQuanAo.setText(NumberStandard.formatInteger(0));
        txtLoaiQuanAo.setDisabledTextColor(new java.awt.Color(255, 51, 51));
        txtLoaiQuanAo.setFocusable(false);

        txtTenQuanAo.setEditable(false);
        txtTenQuanAo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTenQuanAo.setForeground(new java.awt.Color(255, 51, 51));
        txtTenQuanAo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTenQuanAo.setText(NumberStandard.formatMoney(0));
        txtTenQuanAo.setDisabledTextColor(new java.awt.Color(255, 51, 51));
        txtTenQuanAo.setFocusable(false);

        txtLoiNhuan.setEditable(false);
        txtLoiNhuan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLoiNhuan.setForeground(new java.awt.Color(255, 51, 51));
        txtLoiNhuan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLoiNhuan.setText(NumberStandard.formatMoney(0));
        txtLoiNhuan.setDisabledTextColor(new java.awt.Color(255, 51, 51));
        txtLoiNhuan.setFocusable(false);

        javax.swing.GroupLayout pnlTongQuanQuanAoLayout = new javax.swing.GroupLayout(pnlTongQuanQuanAo);
        pnlTongQuanQuanAo.setLayout(pnlTongQuanQuanAoLayout);
        pnlTongQuanQuanAoLayout.setHorizontalGroup(
            pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTongQuanQuanAoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDoanhThu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTongQA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTongHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLoiNhuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTongSoLuongQuanAo)
                    .addComponent(txtLoaiQuanAo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .addComponent(txtTenQuanAo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLoiNhuan))
                .addContainerGap())
        );
        pnlTongQuanQuanAoLayout.setVerticalGroup(
            pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTongQuanQuanAoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTongHD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongSoLuongQuanAo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTongQA, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoaiQuanAo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenQuanAo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlTongQuanQuanAoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoiNhuan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoiNhuan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlTongQuanQuanAoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblTongHD, txtLoaiQuanAo, txtLoiNhuan, txtTenQuanAo, txtTongSoLuongQuanAo});

        pnlTongQuan.add(pnlTongQuanQuanAo);

        scrTopQuanAo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Top Quần Áo Bán Chạy Nhất", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tblTopQuanAo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblTopQuanAo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Quần Áo", "Tên Quần Áo", "Loại Quần Áo", "Thương Hiệu", "Nhà Cung Cấp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTopQuanAo.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                    isSelected, hasFocus, row, column);
                if (column == 3) {
                    setHorizontalAlignment(JLabel.RIGHT);
                } else {
                    setHorizontalAlignment(JLabel.LEFT);
                }
                return c;
            }
        });
        tblTopQuanAo.setEnabled(false);
        tblTopQuanAo.setFillsViewportHeight(true);
        tblTopQuanAo.setRowHeight(50);
        tblTopQuanAo.setShowGrid(true);
        tblTopQuanAo.getTableHeader().setResizingAllowed(false);
        tblTopQuanAo.getTableHeader().setReorderingAllowed(false);
        scrTopQuanAo.setViewportView(tblTopQuanAo);
        if (tblTopQuanAo.getColumnModel().getColumnCount() > 0) {
            tblTopQuanAo.getColumnModel().getColumn(0).setResizable(false);
            tblTopQuanAo.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblTopQuanAo.getColumnModel().getColumn(1).setResizable(false);
            tblTopQuanAo.getColumnModel().getColumn(2).setResizable(false);
            tblTopQuanAo.getColumnModel().getColumn(3).setResizable(false);
            tblTopQuanAo.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout pnlBangChiTietLayout = new javax.swing.GroupLayout(pnlBangChiTiet);
        pnlBangChiTiet.setLayout(pnlBangChiTietLayout);
        pnlBangChiTietLayout.setHorizontalGroup(
            pnlBangChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBangChiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBangChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrTopQuanAo)
                    .addComponent(pnlTongQuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlBangChiTietLayout.setVerticalGroup(
            pnlBangChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBangChiTietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTongQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrTopQuanAo, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        tabXemThongTin.addTab("Bảng Chi Tiết", pnlBangChiTiet);

        pnlBieuDo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pnlBieuDoLayout = new javax.swing.GroupLayout(pnlBieuDo);
        pnlBieuDo.setLayout(pnlBieuDoLayout);
        pnlBieuDoLayout.setHorizontalGroup(
            pnlBieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1838, Short.MAX_VALUE)
        );
        pnlBieuDoLayout.setVerticalGroup(
            pnlBieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 719, Short.MAX_VALUE)
        );

        tabXemThongTin.addTab("Biểu Đồ Trực Quan", pnlBieuDo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabXemThongTin))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabXemThongTin)
                .addContainerGap())
        );

        javax.swing.JLabel lblBanHang = new javax.swing.JLabel("Bảng Chi Tiết");
        javax.swing.JLabel lblDatHang = new javax.swing.JLabel("Biểu Đồ Trực Quan");
        lblBanHang.setPreferredSize(new Dimension(350, 30));
        lblDatHang.setPreferredSize(new Dimension(350, 30));
        lblBanHang.setHorizontalAlignment(SwingConstants.CENTER);
        lblDatHang.setHorizontalAlignment(SwingConstants.CENTER);
        lblBanHang.setFont(new Font("Segoe UI", 1, 18));
        lblDatHang.setFont(new Font("Segoe UI", 1, 18));
        tabXemThongTin.setTabComponentAt(0, lblBanHang);
        tabXemThongTin.setTabComponentAt(1, lblDatHang);
    }// </editor-fold>//GEN-END:initComponents

    private void tabLuaChonThongKeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabLuaChonThongKeStateChanged
        DefaultTableModel modelTopQuanAo = (DefaultTableModel) tblTopQuanAo.getModel();
        modelTopQuanAo.setRowCount(0);
//        Xử lý thay đổi số lượng và tên cột theo từng tiêu chí thống kê
        if (tabLuaChonThongKe.getSelectedIndex() == 0 || tabLuaChonThongKe.getSelectedIndex() == -1) {
//            Thống kê quần áo hết
            modelTopQuanAo.setColumnIdentifiers(new String[]{"Mã Quần Áo", "Tên Quần Áo", "Loại Quần Áo", "Thương Hiệu", "Nhà Cung Cấp"});
        } else {
//            Các tiêu chí còn lại
            modelTopQuanAo.setColumnIdentifiers(new String[]{"Mã Quần Áo", "Tên Quần Áo", "Loại Quần Áo", "Thương Hiệu", "Số Lượng", "Lợi Nhuận"});
            FormatCellRenderer.formatCellRendererCenter(tblTopQuanAo, 4);
            FormatCellRenderer.formatCellRendererRight(tblTopQuanAo, 5);
        }
//        Lựa chọn các tiêu chí thống kê
        switch (tabLuaChonThongKe.getSelectedIndex()) {
            case 0:
//                Thống kê quần áo hết
                modelTopQuanAo.setRowCount(0);
                int kiemTraHet = 0;
                for (QuanAo qa : dsQA) {
                    if (qa.getSoLuong() == 0) {
                        Object[] rowData = {qa.getMaQA(), qa.getTenQA(), qa.getLoaiQuanAo(), qa.getThuongHieu(), qa.getNhaCungCap().getTenNCC()};
                        modelTopQuanAo.addRow(rowData);
                        kiemTraHet++;
                    }
                }
                if (kiemTraHet == 0) {
                    JOptionPane.showMessageDialog(null, "Không có quần áo hết");
                }
                break;
            case 1:
//                Thống kê toàn bộ thời gian
                locDuLieu(null, null, dsHoaDon, dsChiTietHoaDon);
                break;
            case 2:
//                Thống kê theo ngày được chọn
                locDuLieu(dchChonNgay.getDate(), null, dsHoaDon, dsChiTietHoaDon);
                break;
            case 3:
//                Thống kê theo tháng và theo năm
                locDuLieu(monthTheoThang.getMonth(), yearTheoThang.getYear(), dsHoaDon, dsChiTietHoaDon);
                break;
            case 4:
//                Thống kê theo năm
                locDuLieu(0, yearTheoNam.getYear(), dsHoaDon, dsChiTietHoaDon);
                break;
            case 5:
//                Thống kê theo khoảng thời gian được chọn
                locDuLieu(dchTuNgay.getDate(), dchDenNgay.getDate(), dsHoaDon, dsChiTietHoaDon);
                break;
        }
    }//GEN-LAST:event_tabLuaChonThongKeStateChanged

    private void dchChonNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchChonNgayPropertyChange
        DefaultTableModel modelTopQuanAo = (DefaultTableModel) tblTopQuanAo.getModel();
        modelTopQuanAo.setRowCount(0);
        if (tabLuaChonThongKe.getSelectedIndex() == 2) {
            locDuLieu(dchChonNgay.getDate(), null, dsHoaDon, dsChiTietHoaDon);
        }
    }//GEN-LAST:event_dchChonNgayPropertyChange

    private void monthTheoThangPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_monthTheoThangPropertyChange
        locDuLieu(monthTheoThang.getMonth(), yearTheoThang.getYear(), dsHoaDon, dsChiTietHoaDon);
    }//GEN-LAST:event_monthTheoThangPropertyChange

    private void yearTheoThangPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yearTheoThangPropertyChange
        locDuLieu(monthTheoThang.getMonth(), yearTheoThang.getYear(), dsHoaDon, dsChiTietHoaDon);
    }//GEN-LAST:event_yearTheoThangPropertyChange

    private void yearTheoNamPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yearTheoNamPropertyChange
        locDuLieu(0, yearTheoNam.getYear(), dsHoaDon, dsChiTietHoaDon);
    }//GEN-LAST:event_yearTheoNamPropertyChange

    private void dchTuNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchTuNgayPropertyChange
        dongBoKhoangThoiGian();
        locDuLieu(dchTuNgay.getDate(), dchDenNgay.getDate(), dsHoaDon, dsChiTietHoaDon);
    }//GEN-LAST:event_dchTuNgayPropertyChange

    private void dchDenNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchDenNgayPropertyChange
        dongBoKhoangThoiGian();
        locDuLieu(dchTuNgay.getDate(), dchDenNgay.getDate(), dsHoaDon, dsChiTietHoaDon);
    }//GEN-LAST:event_dchDenNgayPropertyChange

    private void dongBoKhoangThoiGian() {
        dchTuNgay.setMaxSelectableDate(dchDenNgay.getDate());
        dchDenNgay.setMinSelectableDate(dchTuNgay.getDate());
    }
    // </editor-fold>

    /**
     * Sắp xếp giảm dần theo Số lượng nếu số lượng bằng nhau thì sắp xếp giảm dần theo lợi nhuận
     *
     * @param list Dữ liệu cần sắp xếp
     */
    private void sapXepGiamDan(List<Map.Entry<String, Integer>> list) {
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                // So sánh giảm dần theo số lượng
                int soLuongComparison = Integer.compare(entry2.getValue(), entry1.getValue());
                // Nếu số lượng bằng nhau, so sánh giảm dần theo lợi nhuận
                if (soLuongComparison == 0) {
                    Double loiNhuan1 = 0.0;
                    Double loiNhuan2 = 0.0;
                    for (Map.Entry<String, Double> tienLoi : dsLoiNhuan.entrySet()) {
                        if (entry1.getKey().contains(tienLoi.getKey())) {
                            loiNhuan1 = tienLoi.getValue();
                        } else if (entry2.getKey().contains(tienLoi.getKey())) {
                            loiNhuan2 = tienLoi.getValue();
                        }
                    }
                    return Double.compare(loiNhuan2, loiNhuan1);
                }
                return soLuongComparison;
            }
        });
    }

    //    Xử lý tính toán các thông tin lợi nhuận và số lượng quần áo
    public void xuLyDuLieuQuanAo(ArrayList<ChiTietHoaDon> dsChiTietHoaDonOutput, ArrayList<String> dsMaHoaDon) {
        dsQADaKiemTra = new HashMap<HoaDon, QuanAo>();
        dsSoLuongQuanAo = new HashMap<>();
        dsLoiNhuan = new HashMap<>();
        if (dsMaHoaDon.size() != 0) {
            double loiNhuan = 0;
            double khuyenMai = 0;
            int soLuong = 0;
            // Mượn đặc tính của set để kiểm tra trùng giá trị
            Set<String> uniqueMaHoaDon = new HashSet<>();
            for (ChiTietHoaDon cthd : dsChiTietHoaDonOutput) {
                if (dsQADaKiemTra.isEmpty()) {
                    dsQADaKiemTra.put(cthd.getHoaDon(), cthd.getQuanAo());
                    soLuong += cthd.getSoLuong();
                    dsSoLuongQuanAo.put(cthd.getQuanAo().getMaQA(), soLuong);
                    khuyenMai = cthd.getHoaDon().getKhuyenMai() != null ? cthd.getHoaDon().getKhuyenMai().getMucGiamGia() / 100 : 0;
                    loiNhuan += (cthd.getLoiNhuan() / 100) * cthd.getGiaBan() * cthd.getSoLuong() - khuyenMai * (cthd.getLoiNhuan() / 100) * cthd.getGiaBan() * cthd.getSoLuong();
                    dsLoiNhuan.put(cthd.getQuanAo().getMaQA(), loiNhuan);
                    uniqueMaHoaDon.add(cthd.getQuanAo().getMaQA());
                    soLuong = 0;
                    loiNhuan = 0;
                } else {
                    if (uniqueMaHoaDon.add(cthd.getQuanAo().getMaQA())) {
                        dsQADaKiemTra.put(cthd.getHoaDon(), cthd.getQuanAo());
                        soLuong += cthd.getSoLuong();
                        dsSoLuongQuanAo.put(cthd.getQuanAo().getMaQA(), soLuong);
                        khuyenMai = cthd.getHoaDon().getKhuyenMai() != null ? cthd.getHoaDon().getKhuyenMai().getMucGiamGia() / 100 : 0;
                        loiNhuan += (cthd.getLoiNhuan() / 100) * cthd.getGiaBan() * cthd.getSoLuong() - khuyenMai * (cthd.getLoiNhuan() / 100) * cthd.getGiaBan() * cthd.getSoLuong();
                        dsLoiNhuan.put(cthd.getQuanAo().getMaQA(), loiNhuan);
                        soLuong = 0;
                        loiNhuan = 0;
                    } else {
//                        Cập nhật các giá trị số lượng và thành tiền cho các quần áo bị trùng
                        for (Map.Entry<String, Integer> item : dsSoLuongQuanAo.entrySet()) {
                            if (cthd.getQuanAo().getMaQA().contains(item.getKey())) {
                                soLuong = item.getValue() + cthd.getSoLuong();
                                dsSoLuongQuanAo.put(cthd.getQuanAo().getMaQA(), soLuong);
                            }
                        }
                        for (Map.Entry<String, Double> item : dsLoiNhuan.entrySet()) {
                            if (cthd.getQuanAo().getMaQA().contains(item.getKey())) {
                                khuyenMai = cthd.getHoaDon().getKhuyenMai() != null ? cthd.getHoaDon().getKhuyenMai().getMucGiamGia() / 100 : 0;
                                loiNhuan = item.getValue() + ((cthd.getLoiNhuan() / 100) * cthd.getGiaBan() * cthd.getSoLuong() - khuyenMai * (cthd.getLoiNhuan() / 100) * cthd.getGiaBan() * cthd.getSoLuong());
                                dsLoiNhuan.put(cthd.getQuanAo().getMaQA(), loiNhuan);
                            }
                        }
                        soLuong = 0;
                        loiNhuan = 0;
                    }
                }
            }
        }
    }

    /**
     * Lọc dữ liệu theo ngày được chọn hoặc theo khoảng thời gian được chọn, dữ
     * liệu đúng được giữ lại. Nếu cả 2 ngày đều null thì lọc dữ liệu theo toàn
     * bộ thời gian
     *
     * @param date1                Ngày được chọn, hoặc ngày bắt đầu khoảng thời gian được chọn
     * @param date2                Ngày kết thúc khoảng thời gian được chọn, hoặc null nếu chỉ
     *                             lọc dữ liệu theo một ngày được chọn
     * @param dsHoaDonInput        Dữ liệu về hoá đơn
     * @param dsChiTietHoaDonInput Dữ liệu về chi tiết hoá đơn
     */
    private void locDuLieu(@Nullable Date date1, @Nullable Date date2, @NotNull ArrayList<HoaDon> dsHoaDonInput, @NotNull ArrayList<ChiTietHoaDon> dsChiTietHoaDonInput) {
//        Khởi tạo
        ArrayList<HoaDon> dsHoaDonOutput = new ArrayList<>(dsHoaDonInput);
        ArrayList<ChiTietHoaDon> dsChiTietHoaDonOutput = new ArrayList<>(dsChiTietHoaDonInput);
        ArrayList<String> dsMaHoaDon = new ArrayList<>();
//        Xử lý lấy danh sách các hóa đơn và chi tiết hóa đơn theo thời gian tiêu chí được chọn
        if (date2 == null) {
            if (date1 == null) {
                for (HoaDon hd : dsHoaDonOutput) {
                    dsMaHoaDon.add(hd.getMaHoaDon());
                }
                xuLyDuLieuQuanAo(dsChiTietHoaDonOutput, dsMaHoaDon);
            } else {
                LocalDate localDate1 = new java.sql.Date(date1.getTime()).toLocalDate();
//            Lấy mã hóa đơn theo ngày đã chọn và thêm vào dsMaHoaDon, nếu hóa đơn không lập ở ngày đã chọn loại bỏ khỏi dsHoaDonOutPut
                for (int i = 0; i < dsHoaDonOutput.size(); i++) {
                    LocalDate localDate = dsHoaDonOutput.get(i).getNgayTao().toLocalDate();
                    if (!localDate.isEqual(localDate1)) {
                        dsHoaDonOutput.remove(i);
                        i--;
                        continue;
                    }
                    dsMaHoaDon.add(dsHoaDonOutput.get(i).getMaHoaDon());
                }
//            Lấy được danh sách chi tiết hóa đơn (Mã Hóa Đơn, Mã Quần Áo, )
                for (int i = 0; i < dsChiTietHoaDonOutput.size(); i++) {
                    if (!dsMaHoaDon.contains(dsChiTietHoaDonOutput.get(i).getHoaDon().getMaHoaDon())) {
                        dsChiTietHoaDonOutput.remove(i);
                        i--;
                    }
                }
                xuLyDuLieuQuanAo(dsChiTietHoaDonOutput, dsMaHoaDon);
            }
        } else {
            LocalDate localDate1 = new java.sql.Date(date1.getTime()).toLocalDate();
            LocalDate localDate2 = new java.sql.Date(date2.getTime()).toLocalDate();
            for (int i = 0; i < dsHoaDonOutput.size(); i++) {
                LocalDate localDate = dsHoaDonOutput.get(i).getNgayTao().toLocalDate();
                if (localDate.isBefore(localDate1) || localDate.isAfter(localDate2)) {
                    dsHoaDonOutput.remove(i);
                    i--;
                    continue;
                }
                dsMaHoaDon.add(dsHoaDonOutput.get(i).getMaHoaDon());
            }
            for (int i = 0; i < dsChiTietHoaDonOutput.size(); i++) {
                if (!dsMaHoaDon.contains(dsChiTietHoaDonOutput.get(i).getHoaDon().getMaHoaDon())) {
                    dsChiTietHoaDonOutput.remove(i);
                    i--;
                }
            }
            xuLyDuLieuQuanAo(dsChiTietHoaDonOutput, dsMaHoaDon);
        }
//        Xử lý đưa dữ liệu lên table
//        Sắp xếp giảm dần theo số lượng theo mã quần áo
        List<Map.Entry<String, Integer>> resultSortQuatity = new ArrayList<>(this.dsSoLuongQuanAo.entrySet());
        sapXepGiamDan(resultSortQuatity);
//        Load dữ liệu lên table
        double mucGiamGia = 0;
        double tongChietKhau = 0;
        double tongThanhTienCuaMotQuanAo = 0;
        DefaultTableModel modelTopQuanAo = (DefaultTableModel) tblTopQuanAo.getModel();
        modelTopQuanAo.setRowCount(0);
        if (!dsMaHoaDon.isEmpty()) {
            for (Map.Entry<String, Integer> resultSort : resultSortQuatity) {
                String maQuanAoTbl = "", tenQuanAoTbl = "",
                        loaQuanAoTbl = "", thuongHieuTbl = "", soLuongTbl = "", loiNhuanTbl = "";
//            Lấy thông tin quần áo load lên table
                for (Map.Entry<HoaDon, QuanAo> item : dsQADaKiemTra.entrySet()) {
//                for (QuanAo qaLoadTbl : dsQADaKiemTra) {
                    if (resultSort.getKey().contains(item.getValue().getMaQA())) {
//                        Mã quần áo
                        maQuanAoTbl = item.getValue().getMaQA();
//                        Tên quần áo
                        tenQuanAoTbl = item.getValue().getTenQA();
//                        Loại quần áo
                        for (HashMap.Entry<String, String> loaiQA : dsLoaiQuanAo.entrySet()) {
                            if (item.getValue().getLoaiQuanAo().contains(loaiQA.getKey())) {
                                loaQuanAoTbl = loaiQA.getValue();
                            }
                        }
//                        Thương hiệu quần áo
                        thuongHieuTbl = item.getValue().getThuongHieu();
//                        Số lượng quần áo
                        soLuongTbl = NumberStandard.formatInteger(resultSort.getValue());
                    }
                }

                for (HashMap.Entry<String, Double> loiNhuanQA : dsLoiNhuan.entrySet()) {
                    if (loiNhuanQA.getKey().contains(resultSort.getKey())) {
                        loiNhuanTbl = NumberStandard.formatMoney(loiNhuanQA.getValue());
                    }
                }

                Object[] row = {maQuanAoTbl, tenQuanAoTbl, loaQuanAoTbl, thuongHieuTbl, soLuongTbl, loiNhuanTbl};
                modelTopQuanAo.addRow(row);
            }
//            TODO: Xử lý lấy thông tin quần áo Load lên Fields
            if (modelTopQuanAo.getColumnCount() == 6) {
                //            Set Tổng số lượng quần áo
                this.txtTongSoLuongQuanAo.setText(modelTopQuanAo.getValueAt(0, 4).toString());
//            Set tên quần áo và Loại quần áo
                for (QuanAo qaLoad : dsQA) {
                    if (modelTopQuanAo.getRowCount() > 0) {
                        if (qaLoad.getMaQA().contains(modelTopQuanAo.getValueAt(0, 0).toString())) {
//                        Set Tên Quần Áo
                            this.txtTenQuanAo.setText(qaLoad.getTenQA());
                            for (HashMap.Entry<String, String> loaiQA : dsLoaiQuanAo.entrySet()) {
                                if (qaLoad.getLoaiQuanAo().contains(loaiQA.getKey())) {
//                        Set Loại Quần Áo
                                    this.txtLoaiQuanAo.setText(loaiQA.getValue());
                                }
                            }
                        }
                    }
                }
//            Set Lợi nhuận
                this.txtLoiNhuan.setText(modelTopQuanAo.getValueAt(0, 5).toString());
            }
        } else {
            modelTopQuanAo.setRowCount(0);
            this.txtTongSoLuongQuanAo.setText("Không có thông tin");
            this.txtLoaiQuanAo.setText("Không có thông tin");
            this.txtTenQuanAo.setText("Không có thông tin");
            this.txtLoiNhuan.setText("Không có thông tin");
        }
    }

    /**
     * Lọc dữ liệu theo tháng, năm được chọn hoặc theo năm được chọn, dữ lệu
     * đúng được giữ lại
     *
     * @param month                Tháng được chọn, có thể = 0 nếu chỉ cần lọc theo năm
     * @param year                 Năm được chọn
     * @param dsHoaDonInput        Dữ liệu về hoá đơn
     * @param dsChiTietHoaDonInput Dữ liệu về chi tiết hoá đơn
     */
    private void locDuLieu(int month, int year, ArrayList<HoaDon> dsHoaDonInput, ArrayList<ChiTietHoaDon> dsChiTietHoaDonInput) {
//        Khởi tạo
        ArrayList<HoaDon> dsHoaDonOutput = new ArrayList<>(dsHoaDonInput);
        ArrayList<ChiTietHoaDon> dsChiTietHoaDonOutput = new ArrayList<>(dsChiTietHoaDonInput);
        ArrayList<String> dsMaHoaDon = new ArrayList<>();
//        Xử lý lấy danh sách các hóa đơn và chi tiết hóa đơn theo thời gian tiêu chí được chọn
        if (month == 0) { // Lấy hóa đơn theo năm
            for (int i = 0; i < dsHoaDonOutput.size(); i++) {
                LocalDate localDate = dsHoaDonOutput.get(i).getNgayTao().toLocalDate();
                if (localDate.getYear() != year) {
                    dsHoaDonOutput.remove(i);
                    i--;
                    continue;
                }
                dsMaHoaDon.add(dsHoaDonOutput.get(i).getMaHoaDon());
            }
            for (int i = 0; i < dsChiTietHoaDonOutput.size(); i++) {
                if (!dsMaHoaDon.contains(dsChiTietHoaDonOutput.get(i).getHoaDon().getMaHoaDon())) {
                    dsChiTietHoaDonOutput.remove(i);
                    i--;
                }
            }
            xuLyDuLieuQuanAo(dsChiTietHoaDonOutput, dsMaHoaDon);
        } else {
//            Lấy hóa đơn theo tháng trong năm
            for (int i = 0; i < dsHoaDonOutput.size(); i++) {
                LocalDate localDate = dsHoaDonOutput.get(i).getNgayTao().toLocalDate();
                if (localDate.getYear() != year || localDate.getMonthValue() != month + 1) {
                    dsHoaDonOutput.remove(i);
                    i--;
                    continue;
                }
                dsMaHoaDon.add(dsHoaDonOutput.get(i).getMaHoaDon());
            }
            for (int i = 0; i < dsChiTietHoaDonOutput.size(); i++) {
                if (!dsMaHoaDon.contains(dsChiTietHoaDonOutput.get(i).getHoaDon().getMaHoaDon())) {
                    dsChiTietHoaDonOutput.remove(i);
                    i--;
                }
            }
            xuLyDuLieuQuanAo(dsChiTietHoaDonOutput, dsMaHoaDon);
        }
//        Xử lý đưa dữ liệu lên table
//        Sắp xếp giảm dần theo số lượng theo mã quần áo
        List<Map.Entry<String, Integer>> resultSortQuatity = new ArrayList<>(this.dsSoLuongQuanAo.entrySet());
        sapXepGiamDan(resultSortQuatity);
//        Load dữ liệu lên table
        double mucGiamGia = 0;
        double tongChietKhau = 0;
        double tongThanhTienCuaMotQuanAo = 0;
        DefaultTableModel modelTopQuanAo = (DefaultTableModel) tblTopQuanAo.getModel();
        modelTopQuanAo.setRowCount(0);
        if (!dsMaHoaDon.isEmpty()) {
            for (Map.Entry<String, Integer> resultSort : resultSortQuatity) {
                String maQuanAoTbl = "", tenQuanAoTbl = "",
                        loaQuanAoTbl = "", thuongHieuTbl = "", soLuongTbl = "", loiNhuanTbl = "";
//            Lấy thông tin quần áo load lên table
                for (Map.Entry<HoaDon, QuanAo> item : dsQADaKiemTra.entrySet()) {
//                for (QuanAo qaLoadTbl : dsQADaKiemTra) {
                    if (resultSort.getKey().contains(item.getValue().getMaQA())) {
//                        Mã quần áo
                        maQuanAoTbl = item.getValue().getMaQA();
//                        Tên quần áo
                        tenQuanAoTbl = item.getValue().getTenQA();
//                        Loại quần áo
                        for (HashMap.Entry<String, String> loaiQA : dsLoaiQuanAo.entrySet()) {
                            if (item.getValue().getLoaiQuanAo().contains(loaiQA.getKey())) {
                                loaQuanAoTbl = loaiQA.getValue();
                            }
                        }
//                        Thương hiệu quần áo
                        thuongHieuTbl = item.getValue().getThuongHieu();
//                        Số lượng quần áo
                        soLuongTbl = NumberStandard.formatInteger(resultSort.getValue());
                    }
                }

                for (HashMap.Entry<String, Double> loiNhuanQA : dsLoiNhuan.entrySet()) {
                    if (loiNhuanQA.getKey().contains(resultSort.getKey())) {
                        loiNhuanTbl = NumberStandard.formatMoney(loiNhuanQA.getValue());
                    }
                }

                Object[] row = {maQuanAoTbl, tenQuanAoTbl, loaQuanAoTbl, thuongHieuTbl, soLuongTbl, loiNhuanTbl};
                modelTopQuanAo.addRow(row);
            }
//            TODO: Xử lý lấy thông tin quần áo Load lên Fields
            if (modelTopQuanAo.getColumnCount() == 6) {
                //            Set Tổng số lượng quần áo
                this.txtTongSoLuongQuanAo.setText(modelTopQuanAo.getValueAt(0, 4).toString());
//            Set tên quần áo và Loại quần áo
                for (QuanAo qaLoad : dsQA) {
                    if (modelTopQuanAo.getRowCount() > 0) {
                        if (qaLoad.getMaQA().contains(modelTopQuanAo.getValueAt(0, 0).toString())) {
//                        Set Tên Quần Áo
                            this.txtTenQuanAo.setText(qaLoad.getTenQA());
                            for (HashMap.Entry<String, String> loaiQA : dsLoaiQuanAo.entrySet()) {
                                if (qaLoad.getLoaiQuanAo().contains(loaiQA.getKey())) {
//                        Set Loại Quần Áo
                                    this.txtLoaiQuanAo.setText(loaiQA.getValue());
                                }
                            }
                        }
                    }
                }
//            Set Lợi nhuận
                this.txtLoiNhuan.setText(modelTopQuanAo.getValueAt(0, 5).toString());
            }
        } else {
            modelTopQuanAo.setRowCount(0);
            this.txtTongSoLuongQuanAo.setText("Không có thông tin");
            this.txtLoaiQuanAo.setText("Không có thông tin");
            this.txtTenQuanAo.setText("Không có thông tin");
            this.txtLoiNhuan.setText("Không có thông tin");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dchChonNgay;
    private com.toedter.calendar.JDateChooser dchDenNgay;
    private com.toedter.calendar.JDateChooser dchTuNgay;
    private javax.swing.JLabel lblChonNam;
    private javax.swing.JLabel lblChonNgay;
    private javax.swing.JLabel lblChonThangVaNam;
    private javax.swing.JLabel lblDenNgay;
    private javax.swing.JLabel lblDoanhThu;
    private javax.swing.JLabel lblLoiNhuan;
    private javax.swing.JLabel lblTKQuanAoHet;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblToanBo;
    private javax.swing.JLabel lblTongHD;
    private javax.swing.JLabel lblTongQA;
    private javax.swing.JLabel lblTuNgay;
    private com.toedter.calendar.JMonthChooser monthTheoThang;
    private javax.swing.JPanel pnlBangChiTiet;
    private javax.swing.JPanel pnlBieuDo;
    private javax.swing.JPanel pnlTkQuanAoHet;
    private javax.swing.JPanel pnlTkTheoKhoangThoiGian;
    private javax.swing.JPanel pnlTkTheoNam;
    private javax.swing.JPanel pnlTkTheoNgay;
    private javax.swing.JPanel pnlTkTheoThang;
    private javax.swing.JPanel pnlTkToanBo;
    private javax.swing.JPanel pnlTongQuan;
    private javax.swing.JPanel pnlTongQuanQuanAo;
    private javax.swing.JScrollPane scrTopQuanAo;
    private javax.swing.JTabbedPane tabLuaChonThongKe;
    private javax.swing.JTabbedPane tabXemThongTin;
    private javax.swing.JTable tblTopQuanAo;
    private javax.swing.JTextField txtLoaiQuanAo;
    private javax.swing.JTextField txtLoiNhuan;
    private javax.swing.JTextField txtTenQuanAo;
    private javax.swing.JTextField txtTongSoLuongQuanAo;
    private com.toedter.calendar.JYearChooser yearTheoNam;
    private com.toedter.calendar.JYearChooser yearTheoThang;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
    private HashMap<HoaDon, QuanAo> dsQADaKiemTra;
    private HashMap<String, Integer> dsSoLuongQuanAo;
    private HashMap<String, Double> dsLoiNhuan;
    private HashMap<String, Double> dsTongGiaGoc;
    private HashMap<String, String> dsLoaiQuanAo = new DAO_QuanAo(DatabaseConstant.getConnection()).getAllLoaiQuanAo();
    private ArrayList<KhuyenMai> dsKhuyenMai = new DAO_KhuyenMai(DatabaseConstant.getConnection()).getAll();
}
