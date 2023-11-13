/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.container.nhanVien.thongKe;

import org.group06.db.DatabaseConnect;
import org.group06.db.dao.DAO_ThongKeKhachHang;
import org.group06.utils.NumberStandard;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class PanelThongKeKhachHang extends javax.swing.JPanel {

    private final Connection connection = DatabaseConnect.getConnection();
    private DAO_ThongKeKhachHang dao_ThongKe = new DAO_ThongKeKhachHang(connection);

    /**
     * Creates new form PanelThongKeKhachHang
     */
    public PanelThongKeKhachHang() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        tabXemThongTin = new javax.swing.JTabbedPane();
        pnlBangChiTiet = new javax.swing.JPanel();
        pnlTongQuan = new javax.swing.JPanel();
        tabLuaChonThongKe = new javax.swing.JTabbedPane();
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
        pnlTkToanBo = new javax.swing.JPanel();
        lblToanBo = new javax.swing.JLabel();
        pnlTongQuanDoanhThu = new javax.swing.JPanel();
        lblTongKH = new javax.swing.JLabel();
        lblKHTT = new javax.swing.JLabel();
        lblKVL = new javax.swing.JLabel();
        txtTongKH = new javax.swing.JTextField();
        txtKHTT = new javax.swing.JTextField();
        txtKVL = new javax.swing.JTextField();
        scrTopSanPham = new javax.swing.JScrollPane();
        tblTopSanPham = new javax.swing.JTable();
        scrTopChi = new javax.swing.JScrollPane();
        tblTopChi = new javax.swing.JTable();
        pnlBieuDo = new javax.swing.JPanel();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Thống Kê Khách Hàng");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        tabXemThongTin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabXemThongTin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        pnlBangChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlTongQuan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tổng Quan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tabLuaChonThongKe.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabLuaChonThongKe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabLuaChonThongKe.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabLuaChonThongKeStateChanged(evt);
            }
        });

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
                                        .addComponent(dchChonNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
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
                                .addContainerGap(193, Short.MAX_VALUE))
        );

        dchChonNgay.setLocale(new Locale("vi", "VN"));
        dchChonNgay.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadBlackIcon(org.group06.utils.ImagePath.ICON_CALENDAR));
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
                                                .addComponent(yearTheoThang, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
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
                                .addContainerGap(193, Short.MAX_VALUE))
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
                                                .addGap(0, 229, Short.MAX_VALUE))
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
                                .addContainerGap(193, Short.MAX_VALUE))
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
                                        .addComponent(dchTuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
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
                                .addContainerGap(110, Short.MAX_VALUE))
        );

        dchTuNgay.setLocale(new Locale("vi", "VN"));
        dchTuNgay.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadBlackIcon(org.group06.utils.ImagePath.ICON_CALENDAR));
        dchTuNgay.getDateEditor().setEnabled(false);
        ((com.toedter.calendar.JTextFieldDateEditor) dchTuNgay.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);
        dchDenNgay.setLocale(new Locale("vi", "VN"));
        dchDenNgay.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadBlackIcon(org.group06.utils.ImagePath.ICON_CALENDAR));
        dchDenNgay.getDateEditor().setEnabled(false);
        ((com.toedter.calendar.JTextFieldDateEditor) dchDenNgay.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);

        tabLuaChonThongKe.addTab("Thống Kê Theo Khoảng Thời Gian", pnlTkTheoKhoangThoiGian);

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
                                .addContainerGap(239, Short.MAX_VALUE))
        );

        tabLuaChonThongKe.addTab("Thống Kê Toàn Bộ Thời Gian", pnlTkToanBo);

        javax.swing.JLabel lblTheoNgay = new javax.swing.JLabel("Thống Kê Theo Ngày");
        javax.swing.JLabel lblTheoThang = new javax.swing.JLabel("Thống Kê Theo Tháng");
        javax.swing.JLabel lblTheoNam = new javax.swing.JLabel("Thống Kê Theo Năm");
        javax.swing.JLabel lblTheoKhoangThoiGian = new javax.swing.JLabel("Thống Kê Theo Khoảng Thời Gian");
        javax.swing.JLabel lblToanBo = new javax.swing.JLabel("Thống Kê Toàn Bộ Thời Gian");

        lblTheoNgay.setPreferredSize(new Dimension(270, 30));
        lblTheoThang.setPreferredSize(new Dimension(270, 30));
        lblTheoNam.setPreferredSize(new Dimension(270, 30));
        lblTheoKhoangThoiGian.setPreferredSize(new Dimension(270, 30));
        lblToanBo.setPreferredSize(new Dimension(270, 30));

        lblTheoNgay.setHorizontalAlignment(SwingConstants.LEFT);
        lblTheoThang.setHorizontalAlignment(SwingConstants.LEFT);
        lblTheoNam.setHorizontalAlignment(SwingConstants.LEFT);
        lblTheoKhoangThoiGian.setHorizontalAlignment(SwingConstants.LEFT);
        lblToanBo.setHorizontalAlignment(SwingConstants.LEFT);

        lblTheoNgay.setFont(new Font("Segoe UI", 0, 18));
        lblTheoThang.setFont(new Font("Segoe UI", 0, 18));
        lblTheoNam.setFont(new Font("Segoe UI", 0, 18));
        lblTheoKhoangThoiGian.setFont(new Font("Segoe UI", 0, 18));
        lblToanBo.setFont(new Font("Segoe UI", 0, 18));

        tabLuaChonThongKe.setTabComponentAt(0, lblTheoNgay);
        tabLuaChonThongKe.setTabComponentAt(1, lblTheoThang);
        tabLuaChonThongKe.setTabComponentAt(2, lblTheoNam);
        tabLuaChonThongKe.setTabComponentAt(3, lblTheoKhoangThoiGian);
        tabLuaChonThongKe.setTabComponentAt(4, lblToanBo);

        pnlTongQuanDoanhThu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tổng Quan Khách Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lblTongKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTongKH.setText("Tổng số khách hàng:");

        lblKHTT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKHTT.setText("Khách hàng thân thiết:");

        lblKVL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKVL.setText("Khách vãng lai:");

        txtTongKH.setEditable(false);
        txtTongKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTongKH.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtTongKH.setText(NumberStandard.formatInteger(0));
        txtTongKH.setFocusable(false);

        txtKHTT.setEditable(false);
        txtKHTT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtKHTT.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtKHTT.setText(NumberStandard.formatInteger(0));
        txtKHTT.setFocusable(false);

        txtKVL.setEditable(false);
        txtKVL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtKVL.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtKVL.setText(NumberStandard.formatInteger(0));
        txtKVL.setFocusable(false);

        javax.swing.GroupLayout pnlTongQuanDoanhThuLayout = new javax.swing.GroupLayout(pnlTongQuanDoanhThu);
        pnlTongQuanDoanhThu.setLayout(pnlTongQuanDoanhThuLayout);
        pnlTongQuanDoanhThuLayout.setHorizontalGroup(
                pnlTongQuanDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTongQuanDoanhThuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTongQuanDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblKVL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblKHTT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblTongKH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlTongQuanDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTongKH)
                                        .addComponent(txtKHTT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                                        .addComponent(txtKVL, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
        );
        pnlTongQuanDoanhThuLayout.setVerticalGroup(
                pnlTongQuanDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTongQuanDoanhThuLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(pnlTongQuanDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTongKH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTongKH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(pnlTongQuanDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblKHTT, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtKHTT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(pnlTongQuanDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblKVL, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtKVL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTongQuanDoanhThuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]{lblTongKH, txtKHTT, txtKVL, txtTongKH});

        javax.swing.GroupLayout pnlTongQuanLayout = new javax.swing.GroupLayout(pnlTongQuan);
        pnlTongQuan.setLayout(pnlTongQuanLayout);
        pnlTongQuanLayout.setHorizontalGroup(
                pnlTongQuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTongQuanLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tabLuaChonThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnlTongQuanDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTongQuanLayout.setVerticalGroup(
                pnlTongQuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTongQuanLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tabLuaChonThongKe)
                                .addContainerGap())
                        .addGroup(pnlTongQuanLayout.createSequentialGroup()
                                .addComponent(pnlTongQuanDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        scrTopSanPham.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khách Hàng Mua Nhiều Sản Phẩm Nhất", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tblTopSanPham.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblTopSanPham.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Tên Khách Hàng", "Số Điện Thoại", "Số Sản Phẩm"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblTopSanPham.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);
                if (column == 2) {
                    setHorizontalAlignment(JLabel.RIGHT);
                } else {
                    setHorizontalAlignment(JLabel.LEFT);
                }
                return c;
            }
        });
        tblTopSanPham.setFillsViewportHeight(true);
        tblTopSanPham.setRowHeight(50);
        tblTopSanPham.setShowGrid(true);
        tblTopSanPham.getTableHeader().setResizingAllowed(false);
        tblTopSanPham.getTableHeader().setReorderingAllowed(false);
        scrTopSanPham.setViewportView(tblTopSanPham);

        scrTopChi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khách Hàng Chi Nhiều Nhất", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tblTopChi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblTopChi.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Tên Khách Hàng", "Số Điện Thoại", "Tổng Chi"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblTopChi.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);
                if (column == 2) {
                    setHorizontalAlignment(JLabel.RIGHT);
                } else {
                    setHorizontalAlignment(JLabel.LEFT);
                }
                return c;
            }
        });
        tblTopChi.setFillsViewportHeight(true);
        tblTopChi.setRowHeight(50);
        tblTopChi.setShowGrid(true);
        tblTopChi.getTableHeader().setResizingAllowed(false);
        tblTopChi.getTableHeader().setReorderingAllowed(false);
        scrTopChi.setViewportView(tblTopChi);

        javax.swing.GroupLayout pnlBangChiTietLayout = new javax.swing.GroupLayout(pnlBangChiTiet);
        pnlBangChiTiet.setLayout(pnlBangChiTietLayout);
        pnlBangChiTietLayout.setHorizontalGroup(
                pnlBangChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlBangChiTietLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlBangChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlBangChiTietLayout.createSequentialGroup()
                                                .addComponent(scrTopSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                                                .addGap(50, 50, 50)
                                                .addComponent(scrTopChi, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE))
                                        .addGroup(pnlBangChiTietLayout.createSequentialGroup()
                                                .addComponent(pnlTongQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        pnlBangChiTietLayout.setVerticalGroup(
                pnlBangChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBangChiTietLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlTongQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBangChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(scrTopSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                        .addComponent(scrTopChi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(12, 12, 12))
        );

        tabXemThongTin.addTab("Bảng Chi Tiết", pnlBangChiTiet);

        pnlBieuDo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pnlBieuDoLayout = new javax.swing.GroupLayout(pnlBieuDo);
        pnlBieuDo.setLayout(pnlBieuDoLayout);
        pnlBieuDoLayout.setHorizontalGroup(
                pnlBieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1251, Short.MAX_VALUE)
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
                                        .addComponent(tabXemThongTin)
                                        .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        switch (tabLuaChonThongKe.getSelectedIndex()) {
            case 0:
                tinhTheoNgayDuocChon();
                break;
            case 1:
                tinhTheoThangNamDuocChon();
                break;
            case 2:
                tinhTheoNamDuocChon();
                break;
            case 3:
                tinhTheoKhoangTGian();
                break;
            case 4:
                tinhTheoTatCaTGian();
                break;
        }
    }//GEN-LAST:event_tabLuaChonThongKeStateChanged

    private void dchChonNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchChonNgayPropertyChange
        tinhTheoNgayDuocChon();
    }//GEN-LAST:event_dchChonNgayPropertyChange

    private void monthTheoThangPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_monthTheoThangPropertyChange
        tinhTheoThangNamDuocChon();
    }//GEN-LAST:event_monthTheoThangPropertyChange

    private void yearTheoThangPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yearTheoThangPropertyChange
        tinhTheoThangNamDuocChon();
    }//GEN-LAST:event_yearTheoThangPropertyChange

    private void yearTheoNamPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yearTheoNamPropertyChange
        tinhTheoNamDuocChon();
    }//GEN-LAST:event_yearTheoNamPropertyChange

    private void dchTuNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchTuNgayPropertyChange
        tinhTheoKhoangTGian();
    }//GEN-LAST:event_dchTuNgayPropertyChange

    private void dchDenNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchDenNgayPropertyChange
        tinhTheoKhoangTGian();
    }//GEN-LAST:event_dchDenNgayPropertyChange

    /**
     * Tính theo tất cả khoảng thời gian
     */
    private void tinhTheoTatCaTGian() {
        int tongKH = dao_ThongKe.getTongKH().size();
        int tongKHTT = dao_ThongKe.getTongKHTT().size();
        int tongKVL = dao_ThongKe.getTongKVL().size();
        loadTongQuanKhachHang(tongKH, tongKHTT, tongKVL);

        ArrayList<Object[]> dsTongSP = dao_ThongKe.getAllKhachHangTheoTongSP();
        ArrayList<Object[]> dsTongChi = dao_ThongKe.getAllKhachHangTheoTongChi();
        loadDuLieuLenTable(dsTongSP, dsTongChi);
    }

    /**
     * Tính theo ngày tháng năm được chọn
     */
    private void tinhTheoNgayDuocChon() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(dchChonNgay.getDate());

        int tongKH = dao_ThongKe.getTongKH_TrongNgay(date).size();
        int tongKHTT = dao_ThongKe.getTongKHTT_TrongNgay(date).size();
        int tongKVL = dao_ThongKe.getTongKVL_TrongNgay(date).size();
        loadTongQuanKhachHang(tongKH, tongKHTT, tongKVL);

        ArrayList<Object[]> dsTongSP = dao_ThongKe.getAllKhachHangTheoTongSP_TrongNgay(date);
        ArrayList<Object[]> dsTongChi = dao_ThongKe.getAllKhachHangTheoTongChi_TrongNgay(date);
        loadDuLieuLenTable(dsTongSP, dsTongChi);
    }

    /**
     * Tính theo tháng được chọn
     */
    private void tinhTheoThangNamDuocChon() {
        int month = (monthTheoThang.getMonth() + 1);
        int year = yearTheoThang.getYear();

        int tongKH = dao_ThongKe.getTongKH_TrongThang(month, year).size();
        int tongKHTT = dao_ThongKe.getTongKHTT_TrongThang(month, year).size();
        int tongKVL = dao_ThongKe.getTongKVL_TrongThang(month, year).size();
        loadTongQuanKhachHang(tongKH, tongKHTT, tongKVL);

        ArrayList<Object[]> dsTongSP = dao_ThongKe.getAllKhachHangTheoTongSP_TrongThang(month, year);
        ArrayList<Object[]> dsTongChi = dao_ThongKe.getAllKhachHangTheoTongChi_TrongThang(month, year);
        loadDuLieuLenTable(dsTongSP, dsTongChi);
    }

    /**
     * Tính theo năm được chọn
     */
    private void tinhTheoNamDuocChon() {
        int year = yearTheoNam.getYear();

        int tongKH = dao_ThongKe.getTongKH_TrongNam(year).size();
        int tongKHTT = dao_ThongKe.getTongKHTT_TrongNam(year).size();
        int tongKVL = dao_ThongKe.getTongKVL_TrongNam(year).size();
        loadTongQuanKhachHang(tongKH, tongKHTT, tongKVL);

        ArrayList<Object[]> dsTongSP = dao_ThongKe.getAllKhachHangTheoTongSP_TrongNam(year);
        ArrayList<Object[]> dsTongChi = dao_ThongKe.getAllKhachHangTheoTongChi_TrongNam(year);
        loadDuLieuLenTable(dsTongSP, dsTongChi);
    }

    /**
     * Tính theo khoảng thời gian
     */
    private void tinhTheoKhoangTGian() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = sdf.format(dchTuNgay.getDate());
        String date2 = sdf.format(dchDenNgay.getDate());

        int tongKH = dao_ThongKe.getTongKH_TheoKhoangTGian(date1, date2).size();
        int tongKHTT = dao_ThongKe.getTongKHTT_TheoKhoangTGian(date1, date2).size();
        int tongKVL = dao_ThongKe.getTongKVL_TheoKhoangTGian(date1, date2).size();
        loadTongQuanKhachHang(tongKH, tongKHTT, tongKVL);

        ArrayList<Object[]> dsTongSP = dao_ThongKe.getAllKhachHangTheoTongSP_TheoKhoangTGian(date1, date2);
        ArrayList<Object[]> dsTongChi = dao_ThongKe.getAllKhachHangTheoTongChi_TheoKhoangTGian(date1, date2);
        loadDuLieuLenTable(dsTongSP, dsTongChi);
    }

    /**
     * Load dữ liệu từ 2 Arr lên 2 tabble
     *
     * @param rowSP
     * @param rowChi
     */
    private void loadDuLieuLenTable(ArrayList<Object[]> rowSP, ArrayList<Object[]> rowChi) {
        DefaultTableModel modelSP = (DefaultTableModel) tblTopSanPham.getModel();
        DefaultTableModel modelChi = (DefaultTableModel) tblTopChi.getModel();

        modelSP.setRowCount(0);
        modelChi.setRowCount(0);

        for (Object[] data : rowSP) {
            if (((int) data[2]) != 0) {
                Object[] row = {data[0], data[1], data[2]};
                modelSP.addRow(row);
            }
        }
        for (Object[] data : rowChi) {
            if (((double) data[2]) != 0) {
                Object[] row = {data[0], data[1], NumberStandard.formatMoney((double) data[2])};
                modelChi.addRow(row);
            }
        }
    }

    /**
     * Load số Khách hàng theo thời gian được chọn
     *
     * @param tongKH
     * @param tongKHTT
     * @param tongKVL
     */
    private void loadTongQuanKhachHang(int tongKH, int tongKHTT, int tongKVL) {
        this.txtTongKH.setText(NumberStandard.formatInteger(tongKH));
        this.txtKHTT.setText(NumberStandard.formatInteger(tongKHTT));
        this.txtKVL.setText(NumberStandard.formatInteger(tongKVL));
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
    private javax.swing.JLabel lblKHTT;
    private javax.swing.JLabel lblKVL;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblToanBo;
    private javax.swing.JLabel lblTongKH;
    private javax.swing.JLabel lblTuNgay;
    private com.toedter.calendar.JMonthChooser monthTheoThang;
    private javax.swing.JPanel pnlBangChiTiet;
    private javax.swing.JPanel pnlBieuDo;
    private javax.swing.JPanel pnlTkTheoKhoangThoiGian;
    private javax.swing.JPanel pnlTkTheoNam;
    private javax.swing.JPanel pnlTkTheoNgay;
    private javax.swing.JPanel pnlTkTheoThang;
    private javax.swing.JPanel pnlTkToanBo;
    private javax.swing.JPanel pnlTongQuan;
    private javax.swing.JPanel pnlTongQuanDoanhThu;
    private javax.swing.JScrollPane scrTopChi;
    private javax.swing.JScrollPane scrTopSanPham;
    private javax.swing.JTabbedPane tabLuaChonThongKe;
    private javax.swing.JTabbedPane tabXemThongTin;
    private javax.swing.JTable tblTopChi;
    private javax.swing.JTable tblTopSanPham;
    private javax.swing.JTextField txtKHTT;
    private javax.swing.JTextField txtKVL;
    private javax.swing.JTextField txtTongKH;
    private com.toedter.calendar.JYearChooser yearTheoNam;
    private com.toedter.calendar.JYearChooser yearTheoThang;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
