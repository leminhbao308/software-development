/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.components.panels.container;

import org.group06.db.DatabaseConnect;
import org.group06.db.dao.DAO_QuanAo;
import org.group06.model.entity.QuanAo;
import org.group06.utils.*;
import org.group06.view.components.panels.ImagePanel;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author lemin
 */
public class PanelQuanAo extends javax.swing.JPanel {

    /**
     * Creates new form PanelQuanAo
     */
    public PanelQuanAo() {
        initComponents();
        tblQuanAo.getTableHeader().setFont(FontConstant.FONT_TABLE_HEADER);
        tblQuanAo.getTableHeader().setForeground(ColorConstant.WHITE);
        tblQuanAo.getTableHeader().setBackground(ColorConstant.BACKGROUND_TABLEHEADER);
        loadDataTable();
        setStatusAllBtnsStart();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTimKiemQA = new javax.swing.JLabel();
        pnInformationFields = new javax.swing.JPanel();
        pnImgUpLoad = new javax.swing.JPanel();
        pnImg = new ImagePanel(ImagePath.UPLOAD_IMG, 400, 400);
        btnUploadImg = new javax.swing.JButton();
        pnFields = new javax.swing.JPanel();
        pnFieldsLeft = new javax.swing.JPanel();
        lblMaQA = new javax.swing.JLabel();
        txtMaQA = new javax.swing.JTextField();
        lbTenQA = new javax.swing.JLabel();
        txtTenQA = new javax.swing.JTextField();
        lblLoaiQA = new javax.swing.JLabel();
        cmbLoaiQA = new javax.swing.JComboBox<>();
        lblSoLuong = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        cmbSize = new javax.swing.JComboBox<>();
        txtThuongHieu = new javax.swing.JTextField();
        lblNhaCungCap = new javax.swing.JLabel();
        cmbNhaCungCap = new javax.swing.JComboBox<>();
        lblThuongHieu = new javax.swing.JLabel();
        txtSoLuongQA = new javax.swing.JTextField();
        pnFieldsRight = new javax.swing.JPanel();
        lblGiaNhap = new javax.swing.JLabel();
        lblLoiNhuan = new javax.swing.JLabel();
        lblGiaBan = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();
        txtLoiNhuan = new javax.swing.JTextField();
        txtGiaNhap = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        cmbTrangThai = new javax.swing.JComboBox<>();
        pnControl = new javax.swing.JPanel();
        btnXoaTrang = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        scrQuanAo = new javax.swing.JScrollPane();
        tblQuanAo = new javax.swing.JTable();
        lblTitleQA1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();

        setBackground(ColorConstant.WHITE);

        lblTimKiemQA.setFont(org.group06.utils.FontConstant.FONT_TABLE_HEADER);
        lblTimKiemQA.setForeground(org.group06.utils.ColorConstant.BLACK);
        lblTimKiemQA.setText("Tìm Kiếm Quần Áo");
        lblTimKiemQA.setMaximumSize(new java.awt.Dimension(180, 60));
        lblTimKiemQA.setMinimumSize(new java.awt.Dimension(180, 60));
        lblTimKiemQA.setPreferredSize(new java.awt.Dimension(180, 60));

        pnInformationFields.setBackground(ColorConstant.WHITE);
        pnInformationFields.setPreferredSize(new java.awt.Dimension(0, 500));

        pnImgUpLoad.setBackground(ColorConstant.WHITE);

        pnImg.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout pnImgLayout = new javax.swing.GroupLayout(pnImg);
        pnImg.setLayout(pnImgLayout);
        pnImgLayout.setHorizontalGroup(
            pnImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnImgLayout.setVerticalGroup(
            pnImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        btnUploadImg.setBackground(ColorConstant.BACKGROUND_TABLEHEADER);
        btnUploadImg.setFont(FontConstant.FONT_BUTTON);
        btnUploadImg.setForeground(ColorConstant.WHITE);
        btnUploadImg.setText("Tải Lên Hình Ảnh");
        btnUploadImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUploadImg.setMaximumSize(new java.awt.Dimension(200, 40));
        btnUploadImg.setMinimumSize(new java.awt.Dimension(200, 40));
        btnUploadImg.setPreferredSize(new java.awt.Dimension(200, 40));
        btnUploadImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadImgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnImgUpLoadLayout = new javax.swing.GroupLayout(pnImgUpLoad);
        pnImgUpLoad.setLayout(pnImgUpLoadLayout);
        pnImgUpLoadLayout.setHorizontalGroup(
            pnImgUpLoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnImgUpLoadLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(pnImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(pnImgUpLoadLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnUploadImg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnImgUpLoadLayout.setVerticalGroup(
            pnImgUpLoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnImgUpLoadLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pnImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnUploadImg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pnFields.setBackground(ColorConstant.BACKGROUND_CONTAINER);
        pnFields.setLayout(new java.awt.GridLayout(1, 2, 0, 10));

        pnFieldsLeft.setBackground(ColorConstant.WHITE);
        pnFieldsLeft.setPreferredSize(new java.awt.Dimension(420, 0));

        lblMaQA.setFont(FontConstant.FONT_LABEL);
        lblMaQA.setText("Mã Quần Áo:");

        txtMaQA.setEditable(false);
        txtMaQA.setBackground(ColorConstant.DISABLE_FIELD);
        txtMaQA.setFont(FontConstant.FONT_TEXT);
        txtMaQA.setEnabled(false);

        lbTenQA.setFont(FontConstant.FONT_LABEL);
        lbTenQA.setText("Tên Quần Áo:");

        txtTenQA.setFont(FontConstant.FONT_TEXT);
        txtTenQA.setEnabled(false);
        txtTenQA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenQAFocusLost(evt);
            }
        });

        lblLoaiQA.setFont(FontConstant.FONT_LABEL);
        lblLoaiQA.setText("Loại Quần Áo:");

        cmbLoaiQA.setFont(FontConstant.FONT_TEXT);
        cmbLoaiQA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Loại Quần Áo", "Jean Jacket", "Váy", "Áo Croptop","Quần" }));
        cmbLoaiQA.setEnabled(false);
        cmbLoaiQA.setLightWeightPopupEnabled(false);
        cmbLoaiQA.setPreferredSize(new java.awt.Dimension(72, 40));
        cmbLoaiQA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLoaiQAActionPerformed(evt);
            }
        });

        lblSoLuong.setFont(FontConstant.FONT_LABEL);
        lblSoLuong.setText("Số Lượng:");

        lblSize.setFont(FontConstant.FONT_LABEL);
        lblSize.setText("Size:");

        cmbSize.setFont(FontConstant.FONT_TEXT);
        cmbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn size", "S", "M", "L","XL", "XXL", "XXXL" }));
        cmbSize.setEnabled(false);
        cmbSize.setPreferredSize(new java.awt.Dimension(72, 40));
        cmbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSizeActionPerformed(evt);
            }
        });

        txtThuongHieu.setFont(FontConstant.FONT_TEXT);
        txtThuongHieu.setEnabled(false);
        txtThuongHieu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtThuongHieuFocusLost(evt);
            }
        });
        txtThuongHieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThuongHieuActionPerformed(evt);
            }
        });

        lblNhaCungCap.setFont(FontConstant.FONT_LABEL);
        lblNhaCungCap.setText("Nhà Cung Cấp:");

        cmbNhaCungCap.setFont(FontConstant.FONT_TEXT);
        cmbNhaCungCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Nhà Cung Cấp", "Chợ Đồng Xuân", "Chợ Bến Thành", "Hạnh Thông Tây" }));
        cmbNhaCungCap.setEnabled(false);
        cmbNhaCungCap.setPreferredSize(new java.awt.Dimension(72, 40));
        cmbNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNhaCungCapActionPerformed(evt);
            }
        });

        lblThuongHieu.setFont(FontConstant.FONT_LABEL);
        lblThuongHieu.setText("Thương Hiệu:");

        txtSoLuongQA.setFont(FontConstant.FONT_TEXT);
        txtSoLuongQA.setEnabled(false);
        txtSoLuongQA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSoLuongQAFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pnFieldsLeftLayout = new javax.swing.GroupLayout(pnFieldsLeft);
        pnFieldsLeft.setLayout(pnFieldsLeftLayout);
        pnFieldsLeftLayout.setHorizontalGroup(
            pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFieldsLeftLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFieldsLeftLayout.createSequentialGroup()
                        .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbTenQA, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(lblMaQA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblLoaiQA, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaQA)
                            .addComponent(txtTenQA)
                            .addComponent(cmbLoaiQA, 0, 243, Short.MAX_VALUE)))
                    .addGroup(pnFieldsLeftLayout.createSequentialGroup()
                        .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtThuongHieu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSoLuongQA, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbSize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbNhaCungCap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnFieldsLeftLayout.setVerticalGroup(
            pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFieldsLeftLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaQA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaQA))
                .addGap(18, 18, 18)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTenQA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenQA))
                .addGap(18, 18, 18)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbLoaiQA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoaiQA))
                .addGap(18, 18, 18)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSize))
                .addGap(18, 18, 18)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSoLuongQA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoLuong))
                .addGap(18, 18, 18)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThuongHieu))
                .addGap(18, 18, 18)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNhaCungCap))
                .addGap(22, 22, 22))
        );

        pnFields.add(pnFieldsLeft);

        pnFieldsRight.setBackground(ColorConstant.WHITE);
        pnFieldsRight.setPreferredSize(new java.awt.Dimension(420, 0));

        lblGiaNhap.setFont(FontConstant.FONT_LABEL);
        lblGiaNhap.setText("Giá Nhập:");

        lblLoiNhuan.setFont(FontConstant.FONT_LABEL);
        lblLoiNhuan.setText("Lợi Nhuận:");

        lblGiaBan.setFont(FontConstant.FONT_LABEL);
        lblGiaBan.setText("Giá Bán:");

        txtGiaBan.setBackground(ColorConstant.DISABLE_FIELD);
        txtGiaBan.setFont(FontConstant.FONT_TEXT);
        txtGiaBan.setEnabled(false);
        txtGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaBanActionPerformed(evt);
            }
        });

        txtLoiNhuan.setFont(FontConstant.FONT_TEXT);
        txtLoiNhuan.setEnabled(false);
        txtLoiNhuan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoiNhuanFocusLost(evt);
            }
        });

        txtGiaNhap.setFont(FontConstant.FONT_TEXT);
        txtGiaNhap.setEnabled(false);
        txtGiaNhap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGiaNhapFocusLost(evt);
            }
        });

        jLabel1.setFont(FontConstant.FONT_HEADER);
        jLabel1.setText("%");

        lblTrangThai.setFont(FontConstant.FONT_LABEL);
        lblTrangThai.setText("Trạng Thái:");

        cmbTrangThai.setFont(FontConstant.FONT_TEXT);
        cmbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Trạng Thái", "Đang Kinh Doanh", "Dừng Kinh Doanh" }));
        cmbTrangThai.setEnabled(false);
        cmbTrangThai.setPreferredSize(new java.awt.Dimension(72, 40));
        cmbTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTrangThaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnFieldsRightLayout = new javax.swing.GroupLayout(pnFieldsRight);
        pnFieldsRight.setLayout(pnFieldsRightLayout);
        pnFieldsRightLayout.setHorizontalGroup(
            pnFieldsRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFieldsRightLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnFieldsRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLoiNhuan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGiaBan, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(lblGiaNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFieldsRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnFieldsRightLayout.createSequentialGroup()
                        .addComponent(txtLoiNhuan, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15))
                    .addComponent(txtGiaNhap, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbTrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnFieldsRightLayout.setVerticalGroup(
            pnFieldsRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFieldsRightLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(pnFieldsRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGiaNhap))
                .addGap(18, 18, 18)
                .addGroup(pnFieldsRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFieldsRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLoiNhuan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(lblLoiNhuan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnFieldsRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGiaBan))
                .addGap(18, 18, 18)
                .addGroup(pnFieldsRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTrangThai))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        pnFields.add(pnFieldsRight);

        pnControl.setBackground(ColorConstant.WHITE);

        btnXoaTrang.setBackground(ColorConstant.BACKGROUND_TABLEHEADER);
        btnXoaTrang.setFont(FontConstant.FONT_BUTTON);
        btnXoaTrang.setForeground(ColorConstant.WHITE);
        btnXoaTrang.setText("Xóa Trắng");
        btnXoaTrang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaTrang.setMaximumSize(new java.awt.Dimension(200, 50));
        btnXoaTrang.setMinimumSize(new java.awt.Dimension(200, 50));
        btnXoaTrang.setPreferredSize(new java.awt.Dimension(200, 50));
        btnXoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTrangActionPerformed(evt);
            }
        });

        btnThemMoi.setBackground(ColorConstant.BACKGROUND_TABLEHEADER);
        btnThemMoi.setFont(FontConstant.FONT_BUTTON);
        btnThemMoi.setForeground(ColorConstant.WHITE);
        btnThemMoi.setText("Thêm Mới");
        btnThemMoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemMoi.setMaximumSize(new java.awt.Dimension(200, 50));
        btnThemMoi.setMinimumSize(new java.awt.Dimension(200, 50));
        btnThemMoi.setPreferredSize(new java.awt.Dimension(200, 50));
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnLuu.setBackground(ColorConstant.BACKGROUND_TABLEHEADER);
        btnLuu.setFont(FontConstant.FONT_BUTTON);
        btnLuu.setForeground(ColorConstant.WHITE);
        btnLuu.setText("Lưu");
        btnLuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLuu.setMaximumSize(new java.awt.Dimension(200, 50));
        btnLuu.setMinimumSize(new java.awt.Dimension(200, 50));
        btnLuu.setPreferredSize(new java.awt.Dimension(200, 50));
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnCapNhat.setBackground(ColorConstant.BACKGROUND_TABLEHEADER);
        btnCapNhat.setFont(FontConstant.FONT_BUTTON);
        btnCapNhat.setForeground(ColorConstant.WHITE);
        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhat.setMaximumSize(new java.awt.Dimension(200, 50));
        btnCapNhat.setMinimumSize(new java.awt.Dimension(200, 50));
        btnCapNhat.setPreferredSize(new java.awt.Dimension(200, 50));
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnHuy.setBackground(ColorConstant.BACKGROUND_TABLEHEADER);
        btnHuy.setFont(FontConstant.FONT_BUTTON);
        btnHuy.setForeground(ColorConstant.WHITE);
        btnHuy.setText("Hủy");
        btnHuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHuy.setMaximumSize(new java.awt.Dimension(200, 50));
        btnHuy.setMinimumSize(new java.awt.Dimension(200, 50));
        btnHuy.setPreferredSize(new java.awt.Dimension(200, 50));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnControlLayout = new javax.swing.GroupLayout(pnControl);
        pnControl.setLayout(pnControlLayout);
        pnControlLayout.setHorizontalGroup(
            pnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnControlLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(pnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoaTrang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemMoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        pnControlLayout.setVerticalGroup(
            pnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnControlLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnInformationFieldsLayout = new javax.swing.GroupLayout(pnInformationFields);
        pnInformationFields.setLayout(pnInformationFieldsLayout);
        pnInformationFieldsLayout.setHorizontalGroup(
            pnInformationFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInformationFieldsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnImgUpLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnFields, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnInformationFieldsLayout.setVerticalGroup(
            pnInformationFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInformationFieldsLayout.createSequentialGroup()
                .addGroup(pnInformationFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnInformationFieldsLayout.createSequentialGroup()
                        .addGroup(pnInformationFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnFields, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnImgUpLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(3, 3, 3))
        );

        tblQuanAo.setAutoCreateRowSorter(true);
        tblQuanAo.setBackground(ColorConstant.WHITE);
        tblQuanAo.setFont(FontConstant.FONT_TEXT);
        tblQuanAo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã QA", "Tên QA", "Loại QA", "Size", "Số Lượng", "Thương Hiệu", "NCC", "Giá Nhập", "Lợi Nhuận", "Giá Bán", "Trạng Thái"
            }
        ));
        tblQuanAo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblQuanAo.setFillsViewportHeight(true);
        tblQuanAo.setRowHeight(30);
        tblQuanAo.setSelectionBackground(new java.awt.Color(102, 153, 255));
        tblQuanAo.setSelectionForeground(new java.awt.Color(204, 204, 204));
        tblQuanAo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblQuanAo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblQuanAo.setShowGrid(true);
        tblQuanAo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanAoMouseClicked(evt);
            }
        });
        scrQuanAo.setViewportView(tblQuanAo);

        lblTitleQA1.setFont(org.group06.utils.FontConstant.FONT_HEADER);
        lblTitleQA1.setForeground(org.group06.utils.ColorConstant.BLACK);
        lblTitleQA1.setText("Thông Tin Quần Áo");
        lblTitleQA1.setMaximumSize(new java.awt.Dimension(103, 60));
        lblTitleQA1.setMinimumSize(new java.awt.Dimension(103, 60));
        lblTitleQA1.setPreferredSize(new java.awt.Dimension(103, 60));

        txtTimKiem.setFont(FontConstant.FONT_TEXT);
        txtTimKiem.setText("Nhập Vào Mã Quần áo");
        txtTimKiem.setEnabled(true);
        txtTimKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimKiemFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnInformationFields, javax.swing.GroupLayout.DEFAULT_SIZE, 1480, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrQuanAo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(835, 835, 835)
                        .addComponent(lblTimKiemQA, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(lblTitleQA1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(995, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTimKiemQA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnInformationFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrQuanAo, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(lblTitleQA1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(935, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setStatusAllBtnsStart() {
        java.util.List<JButton> listBtn = java.util.Arrays.asList(this.btnHuy, this.btnXoaTrang, this.btnCapNhat, this.btnUploadImg, this.btnLuu);
        ComponentStatus.setStatusBtn(listBtn, false);

    }

    //    Chuyển đổi kiểu dữ liệu
    public int parseStringtoInt(String text) {
        return Integer.parseInt(text);
    }

    public Double parseStringtoDouble(String text) {
        return Double.parseDouble(text);
    }

    public String tinhGiaBan(String giaNhap, String loiNhuan) {
        Double giaBan = parseStringtoDouble(giaNhap) + parseStringtoDouble(giaNhap) * parseStringtoDouble(loiNhuan) / 100;
        DecimalFormat df = new DecimalFormat("##,### VNĐ");

        return df.format(giaBan);
    }

    public void loadImage(URL path) {
//      Xóa bỏ bản vẽ cũ
        this.pnImgUpLoad.remove(pnImg);
//      Vẽ mới
        this.pnImg = new ImagePanel(path, 400, 400);
        // <editor-fold defaultstate="collapsed" desc="Định Dạng layout hình ảnh">
        javax.swing.GroupLayout pnImgLayout = new javax.swing.GroupLayout(pnImg);
        pnImg.setLayout(pnImgLayout);
        pnImgLayout.setHorizontalGroup(
                pnImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        pnImgLayout.setVerticalGroup(
                pnImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        javax.swing.GroupLayout pnImgUpLoadLayout = new javax.swing.GroupLayout(pnImgUpLoad);
        pnImgUpLoad.setLayout(pnImgUpLoadLayout);
        pnImgUpLoadLayout.setHorizontalGroup(
                pnImgUpLoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnImgUpLoadLayout.createSequentialGroup()
                                .addContainerGap(14, Short.MAX_VALUE)
                                .addComponent(pnImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                        .addGroup(pnImgUpLoadLayout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(btnUploadImg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnImgUpLoadLayout.setVerticalGroup(
                pnImgUpLoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnImgUpLoadLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(pnImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(btnUploadImg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
        );
        // </editor-fold>
        this.revalidate();
        this.repaint();
    }

    /**
     * @pagram setAllField
     * Xóa trắng field + combobox xử lý trạng thái
     * Xóa trắng tất cả các fields và combobox + status các field và combobox
     */
    public void setAllField(Boolean status) {
        java.util.List<JTextField> listTxt = java.util.Arrays.asList(this.txtMaQA, this.txtTenQA, this.txtSoLuongQA,
                this.txtThuongHieu, this.txtGiaNhap, this.txtLoiNhuan, this.txtGiaBan);
        java.util.List<JTextField> listStatusTxt = java.util.Arrays.asList(this.txtTenQA, this.txtSoLuongQA,
                this.txtThuongHieu, this.txtGiaNhap, this.txtLoiNhuan);
        java.util.List<JComboBox> listCmb = java.util.Arrays.asList(this.cmbLoaiQA, this.cmbSize, this.cmbNhaCungCap, this.cmbTrangThai);
        ComponentStatus.emptyField(listTxt);
        ComponentStatus.setFieldStatus(listStatusTxt, status);
        ComponentStatus.setDefaultCmb(listCmb);
        ComponentStatus.setComboBoxStatus(listCmb, status);
        this.tblQuanAo.clearSelection();
    }

    /**
     * @pagram setFieldUpdate Xóa trắng các fields(Ngoại trừ mã) và combobox + enable các field(ngoại trừ mã và giá bán) và combobox
     */
    public void setFieldUpdate () {
        java.util.List<JTextField> listTxt = java.util.Arrays.asList(this.txtTenQA, this.txtSoLuongQA,
                this.txtThuongHieu, this.txtGiaNhap, this.txtLoiNhuan, this.txtGiaBan);
        java.util.List<JTextField> listStatusTxt = java.util.Arrays.asList(this.txtTenQA, this.txtSoLuongQA,
                this.txtThuongHieu, this.txtGiaNhap, this.txtLoiNhuan);
        java.util.List<JComboBox> listCmb = java.util.Arrays.asList(this.cmbLoaiQA, this.cmbSize, this.cmbNhaCungCap, this.cmbTrangThai);
        ComponentStatus.emptyField(listTxt);
        ComponentStatus.setFieldStatus(listStatusTxt, true);
        ComponentStatus.setDefaultCmb(listCmb);
        ComponentStatus.setComboBoxStatus(listCmb, true);
    }


    private void btnUploadImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadImgActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Chọn hình ảnh quần áo");

//        Xử lý định dạng các file hình ảnh hợp lệ
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                } else {
                    String filename = f.getName().toLowerCase();
                    return filename.endsWith(".png") || filename.endsWith(".jpg") || filename.endsWith(".jpeg");
                }
            }

            @Override
            public String getDescription() {
                return "Image";
            }
        });
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = chooser.getSelectedFile();
//                Load hình ảnh
                loadImage(file.toURI().toURL());
            } catch (MalformedURLException ex) {
                Logger.getLogger(PanelQuanAo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnUploadImgActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        this.tblQuanAo.clearSelection();

        if (!this.btnThemMoi.isEnabled() && !this.txtTenQA.isEnabled()) {
            setAllField(true);
        } else {
            setFieldUpdate();
        }
    }//GEN-LAST:event_btnXoaTrangActionPerformed

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        this.txtTenQA.requestFocus();
        setAllField(true);
//        Thiết lập trạng thái của các button
        java.util.List<JButton> listBtnDisable = java.util.Arrays.asList(this.btnThemMoi, this.btnCapNhat);
        java.util.List<JButton> listBtnEnable = java.util.Arrays.asList(this.btnUploadImg, this.btnXoaTrang, this.btnLuu, this.btnHuy);
        ComponentStatus.setStatusBtn(listBtnDisable, false);
        ComponentStatus.setStatusBtn(listBtnEnable, true);
    }//GEN-LAST:event_btnThemMoiActionPerformed

    public String taoMaQuanAo(String text) {
        String resultFormat = "";
        String trimText = text.trim();
        String lowerText = trimText.toLowerCase();
        ArrayList<String> splitResult = new ArrayList<>();
        String[] splitText = lowerText.split(" ");
        for (int i = 0; i < splitText.length; i++) {
            if (!splitText[i].isEmpty()) {
                splitResult.add(splitText[i]);
            }
        }
        for (String item : splitResult) {
            resultFormat += item.substring(0, 1).toUpperCase();
        }
//        Loại bỏ dấu tiếng việt
        String resultName = NameStandard.removeDiacritics(resultFormat.trim());
//        Định dạng lượng số
        NumberFormat nf = new DecimalFormat("0000");
        int number = 1;
        String formattedNumber = nf.format(number);

        String code = "";

        code = resultName + "-" + formattedNumber + "-" + this.cmbSize.getItemAt(this.cmbSize.getSelectedIndex());

//        String[] arrayCode = {"VHN-0001-M", "VHN-0002-M"};
        ArrayList<String> arrayCode = new ArrayList<>();
        for (int i = 0; i < this.tblQuanAo.getModel().getRowCount(); i++) {
            arrayCode.add(this.tblQuanAo.getValueAt(i, 0).toString());
        }

        for (String item : arrayCode) {
            if (code.contains(item)) {
                number++;
                code = resultName + "-" + nf.format(number) + "-" + this.cmbSize.getItemAt(this.cmbSize.getSelectedIndex());
            } else {
                number = 1;
            }
        }

        return code;
    }

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
//        Lấy dữ liệu
        int loaiQA = this.cmbLoaiQA.getSelectedIndex();
        int size = this.cmbSize.getSelectedIndex();
        int nhaCungCap = this.cmbNhaCungCap.getSelectedIndex();
        int trangThai = this.cmbTrangThai.getSelectedIndex();
        String maQuanAo = taoMaQuanAo(this.txtTenQA.getText());
//      Tổng hợp dữ liệu
        Object[] data = {maQuanAo, NameStandard.formatCapitalize(this.txtTenQA.getText()), this.cmbLoaiQA.getItemAt(loaiQA), this.cmbSize.getItemAt(size),
                this.txtSoLuongQA.getText(), this.txtThuongHieu.getText(), this.cmbNhaCungCap.getItemAt(nhaCungCap),
                this.txtGiaNhap.getText(), this.txtLoiNhuan.getText(), this.txtGiaBan.getText(), this.cmbTrangThai.getItemAt(trangThai)};
//      Thêm dữ liệu vào table
        DefaultTableModel modelQuanAo = (DefaultTableModel) this.tblQuanAo.getModel();
        modelQuanAo.addRow(data);
        xoaTrang();
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed

    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        setAllField(false);
        setStatusAllBtnsStart();
        java.util.List<JButton> listBtnEnable = java.util.Arrays.asList(this.btnThemMoi);
        ComponentStatus.setStatusBtn(listBtnEnable, true);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void cmbLoaiQAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLoaiQAActionPerformed
        ComponentStatus.CheckSelectOption(this.cmbLoaiQA);
    }//GEN-LAST:event_cmbLoaiQAActionPerformed

    private void txtThuongHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThuongHieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThuongHieuActionPerformed

    private void txtGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaBanActionPerformed

    private void loadDataTable() {
        ArrayList<QuanAo> dsQA = new DAO_QuanAo(DatabaseConnect.getConnection()).getAll();
        DefaultTableModel modelQuanAo = (DefaultTableModel) this.tblQuanAo.getModel();
        for (QuanAo qa : dsQA) {
            Object[] data = {qa.getMaQA(), qa.getTenQA(), qa.getLoaiQuanAo(), qa.getKichThuoc(),
                    qa.getSoLuong(), qa.getThuongHieu(), qa.getNhaCungCap().getTenNCC(), qa.getGiaNhap(), qa.getLoiNhuan(), tinhGiaBan(String.valueOf(qa.getGiaNhap()), String.valueOf(qa.getLoiNhuan())), qa.isTrangThai() ? "Còn Kinh Doanh" : "Dừng Kinh Doanh"};
//      Thêm dữ liệu vào table
            modelQuanAo.addRow(data);
        }

    }

    //    Load dữ liệu lên fields
    private void tblQuanAoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanAoMouseClicked
        java.util.List<JButton> listBtnEnable = java.util.Arrays.asList(this.btnHuy, this.btnCapNhat);
        ComponentStatus.setStatusBtn(listBtnEnable, true);
        ComponentStatus.setStatusBtn(this.btnThemMoi, false);

        //      Xử lý đổ dữ liệu từ table lên fields
        int vitri = this.tblQuanAo.getSelectedRow();
        this.txtMaQA.setText(tblQuanAo.getValueAt(vitri, 0).toString());
        this.txtTenQA.setText(tblQuanAo.getValueAt(vitri, 1).toString());
//        Xử lý lấy loại quần áo
        for (int i = 0; i < this.cmbLoaiQA.getItemCount(); i++) {
            if (tblQuanAo.getValueAt(vitri, 2).toString().equalsIgnoreCase(this.cmbLoaiQA.getItemAt(i))) {
                this.cmbLoaiQA.setSelectedIndex(i);
            }

        }
//        Xử lý lấy size
        for (int i = 0; i < this.cmbSize.getItemCount(); i++) {
            if (tblQuanAo.getValueAt(vitri, 3).toString().equalsIgnoreCase(this.cmbSize.getItemAt(i))) {
                this.cmbSize.setSelectedIndex(i);
            }

        }
        this.txtSoLuongQA.setText(tblQuanAo.getValueAt(vitri, 4).toString());
        this.txtThuongHieu.setText(tblQuanAo.getValueAt(vitri, 5).toString());
//        Xử lý lấy nhà cung cấp
        for (int i = 0; i < this.cmbNhaCungCap.getItemCount(); i++) {
            if (tblQuanAo.getValueAt(vitri, 6).toString().equalsIgnoreCase(this.cmbNhaCungCap.getItemAt(i))) {
                this.cmbNhaCungCap.setSelectedIndex(i);
            }

        }
        this.txtGiaNhap.setText(tblQuanAo.getValueAt(vitri, 7).toString());
        this.txtLoiNhuan.setText(tblQuanAo.getValueAt(vitri, 8).toString());
        this.txtGiaBan.setText(tblQuanAo.getValueAt(vitri, 9).toString());
        //        Xử lý lấy trạng thái của quần áo
        for (int i = 0; i < this.cmbTrangThai.getItemCount(); i++) {
            if (tblQuanAo.getValueAt(vitri, 10).toString().equalsIgnoreCase(this.cmbTrangThai.getItemAt(i))) {
                this.cmbTrangThai.setSelectedIndex(i);
            }

        }
    }//GEN-LAST:event_tblQuanAoMouseClicked

    private void txtTenQAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenQAFocusLost
        String tenQuanAo = this.txtTenQA.getText();
//        ComponentStatus.checkEmptyField(this.txtTenQA);
        this.txtTenQA.setText(NameStandard.formatCapitalize(tenQuanAo));
    }//GEN-LAST:event_txtTenQAFocusLost

    private void txtLoiNhuanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoiNhuanFocusLost
        this.txtGiaBan.setText(tinhGiaBan(this.txtGiaNhap.getText(), this.txtLoiNhuan.getText()));
    }//GEN-LAST:event_txtLoiNhuanFocusLost

    private void cmbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSizeActionPerformed
//        ComponentStatus.CheckSelectOption(this.cmbSize);
    }//GEN-LAST:event_cmbSizeActionPerformed

    private void cmbNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNhaCungCapActionPerformed
//        ComponentStatus.CheckSelectOption(this.cmbNhaCungCap);
    }//GEN-LAST:event_cmbNhaCungCapActionPerformed

    private void cmbTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTrangThaiActionPerformed
//        ComponentStatus.CheckSelectOption(this.cmbTrangThai);
    }//GEN-LAST:event_cmbTrangThaiActionPerformed

    private void txtSoLuongQAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSoLuongQAFocusLost
//        ComponentStatus.checkEmptyField(this.txtSoLuongQA);
    }//GEN-LAST:event_txtSoLuongQAFocusLost

    private void txtThuongHieuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtThuongHieuFocusLost
//        ComponentStatus.checkEmptyField(this.txtThuongHieu);
    }//GEN-LAST:event_txtThuongHieuFocusLost

    private void txtGiaNhapFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGiaNhapFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaNhapFocusLost

    private void txtTimKiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnUploadImg;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JComboBox<String> cmbLoaiQA;
    private javax.swing.JComboBox<String> cmbNhaCungCap;
    private javax.swing.JComboBox<String> cmbSize;
    private javax.swing.JComboBox<String> cmbTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbTenQA;
    private javax.swing.JLabel lblGiaBan;
    private javax.swing.JLabel lblGiaNhap;
    private javax.swing.JLabel lblLoaiQA;
    private javax.swing.JLabel lblLoiNhuan;
    private javax.swing.JLabel lblMaQA;
    private javax.swing.JLabel lblNhaCungCap;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblThuongHieu;
    private javax.swing.JLabel lblTimKiemQA;
    private javax.swing.JLabel lblTitleQA1;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JPanel pnControl;
    private javax.swing.JPanel pnFields;
    private javax.swing.JPanel pnFieldsLeft;
    private javax.swing.JPanel pnFieldsRight;
    private javax.swing.JPanel pnImg;
    private javax.swing.JPanel pnImgUpLoad;
    private javax.swing.JPanel pnInformationFields;
    private javax.swing.JScrollPane scrQuanAo;
    private javax.swing.JTable tblQuanAo;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JTextField txtLoiNhuan;
    private javax.swing.JTextField txtMaQA;
    private javax.swing.JTextField txtSoLuongQA;
    private javax.swing.JTextField txtTenQA;
    private javax.swing.JTextField txtThuongHieu;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void xoaTrang() {
        java.util.List<JTextField> listTxt = java.util.Arrays.asList(this.txtMaQA, this.txtTenQA, this.txtSoLuongQA, this.txtThuongHieu, this.txtGiaNhap, this.txtLoiNhuan, this.txtGiaBan);
        java.util.List<JComboBox> listCmb = java.util.Arrays.asList(this.cmbLoaiQA, this.cmbSize, this.cmbNhaCungCap, this.cmbTrangThai);
        ComponentStatus.emptyField(listTxt);
        ComponentStatus.setDefaultCmb(listCmb);
    }
}
