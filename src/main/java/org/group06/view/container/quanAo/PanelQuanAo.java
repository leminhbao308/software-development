package org.group06.view.container.quanAo;

import org.group06.db.DatabaseConnect;
import org.group06.db.dao.DAO_NhaCungCap;
import org.group06.db.dao.DAO_QuanAo;
import org.group06.model.entity.NhaCungCap;
import org.group06.model.entity.QuanAo;
import org.group06.utils.*;
import org.group06.view.components.panels.ImagePanel;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        loadDataForComboboxLoaiQuanAo();
        loadDataForComboboxNCC();
        setStatusAllBtnsStart();
        formatCellRendererCenter(this.tblQuanAo, 3);
        formatCellRendererCenter(this.tblQuanAo, 4);
        formatCellRendererRight(this.tblQuanAo, 7);
        formatCellRendererRight(this.tblQuanAo, 8);
        formatCellRendererRight(this.tblQuanAo, 9);
        formatCellRendererCenter(this.tblQuanAo, 10);

    }

    public double originalMoney(String data) {
        DecimalFormat dfMoney = new DecimalFormat("##,### VNĐ");
        double value = 0;
        try {
            Number money = dfMoney.parse(data);
            value = money.doubleValue();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    public double originalPercent(String data) {
        DecimalFormat dfPercent = new DecimalFormat("##,## %");
        double value = 0;
        try {
            Number percent = dfPercent.parse(data);
            value = percent.doubleValue();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    public void formatCellRendererCenter(JTable tbl, int index) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        tbl.getColumnModel().getColumn(index).setCellRenderer(centerRenderer);
    }

    public void formatCellRendererLeft(JTable tbl, int index) {
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);
        tbl.getColumnModel().getColumn(index).setCellRenderer(leftRenderer);
    }

    public void formatCellRendererRight(JTable tbl, int index) {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(DefaultTableCellRenderer.RIGHT);
        tbl.getColumnModel().getColumn(index).setCellRenderer(rightRenderer);
    }

    public void loadDataForComboboxLoaiQuanAo() {
        DefaultComboBoxModel<String> cmbModel = new DefaultComboBoxModel<>();
        cmbModel.addElement("Chọn Loại Quần Áo");
        for (HashMap.Entry<String, String> item : loaiQuanAo.entrySet()) {
            cmbModel.addElement(item.getValue());
        }
        this.cmbLoaiQA.setModel(cmbModel);
    }

    public void loadDataForComboboxNCC() {
        DefaultComboBoxModel<String> cmbModel = new DefaultComboBoxModel<>();
        cmbModel.addElement("Chọn Nhà Cung Cấp");
        for (NhaCungCap ncc : dsNCC) {
            cmbModel.addElement(ncc.getTenNCC());
        }
        this.cmbNhaCungCap.setModel(cmbModel);
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

    //    Xử lý load hình ảnh quần áo lên panel khi chọn dòng dữ liệu quần áo trên bảng dữ liệu tương ứng
    private void loadImgWithRowData(String maQuanAo) {
        for (QuanAo qa : this.dsQA) {
            if (qa.getMaQA().equalsIgnoreCase(maQuanAo)) {
                try {
                    URL urlImg = new URL("file:///" + qa.getHinhAnh());
                    loadImage(urlImg);
                } catch (Exception e) {
                    e.printStackTrace();
                    loadImage(ImagePath.UPLOAD_IMG);
                }
            }
        }
    }

    private void loadDataTable() {
        DefaultTableModel modelQuanAo = (DefaultTableModel) this.tblQuanAo.getModel();
        DecimalFormat dfMoney = new DecimalFormat("##,### VNĐ");
        DecimalFormat dfPercent = new DecimalFormat("##,## %");
        String tenLoaiQuanAo = "";
        for (QuanAo qa : this.dsQA) {
            for (Map.Entry<String, String> item : loaiQuanAo.entrySet()) {
                if (qa.getLoaiQuanAo().equalsIgnoreCase(item.getKey())) {
                    tenLoaiQuanAo = item.getValue();
                }
            }
            Object[] data = {qa.getMaQA(), qa.getTenQA(), tenLoaiQuanAo, qa.getKichThuoc(),
                    qa.getSoLuong(), qa.getThuongHieu(), qa.getNhaCungCap().getTenNCC(), dfMoney.format(qa.getGiaNhap()), dfPercent.format(qa.getLoiNhuan()), tinhGiaBan(String.valueOf(qa.getGiaNhap()), String.valueOf(qa.getLoiNhuan())), qa.isTrangThai() ? "Còn Kinh Doanh" : "Dừng Kinh Doanh"};
//      Thêm dữ liệu vào table
            modelQuanAo.addRow(data);
        }
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
        cmbTimKiemQATheoTieuChi = new javax.swing.JComboBox<>();

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
        cmbLoaiQA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Chọn Loại Quần Áo", "Jean Jacket", "Váy", "Áo Croptop", "Quần"}));
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
        cmbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Chọn size", "S", "M", "L", "XL", "XXL", "XXXL"}));
        cmbSize.setEnabled(false);
        cmbSize.setPreferredSize(new java.awt.Dimension(72, 40));
        cmbSize.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSizeItemStateChanged(evt);
            }
        });
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
        cmbNhaCungCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Chọn Nhà Cung Cấp", "Chợ Đồng Xuân", "Chợ Bến Thành", "Hạnh Thông Tây"}));
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

        lblTrangThai.setFont(FontConstant.FONT_LABEL);
        lblTrangThai.setText("Trạng Thái:");

        cmbTrangThai.setFont(FontConstant.FONT_TEXT);
        cmbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Chọn Trạng Thái", "Còn Kinh Doanh", "Dừng Kinh Doanh"}));
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
                                        .addComponent(txtGiaNhap, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cmbTrangThai, 0, 263, Short.MAX_VALUE)
                                        .addComponent(txtLoiNhuan))
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
                                        .addComponent(txtLoiNhuan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                new Object[][]{

                },
                new String[]{
                        "Mã QA", "Tên QA", "Loại QA", "Size", "Số Lượng", "Thương Hiệu", "NCC", "Giá Nhập", "Lợi Nhuận", "Giá Bán", "Trạng Thái"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
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
        if (tblQuanAo.getColumnModel().getColumnCount() > 0) {
            tblQuanAo.getColumnModel().getColumn(0).setResizable(false);
            tblQuanAo.getColumnModel().getColumn(1).setResizable(false);
            tblQuanAo.getColumnModel().getColumn(2).setResizable(false);
            tblQuanAo.getColumnModel().getColumn(3).setResizable(false);
            tblQuanAo.getColumnModel().getColumn(3).setPreferredWidth(20);
            tblQuanAo.getColumnModel().getColumn(4).setResizable(false);
            tblQuanAo.getColumnModel().getColumn(4).setPreferredWidth(40);
            tblQuanAo.getColumnModel().getColumn(5).setResizable(false);
            tblQuanAo.getColumnModel().getColumn(6).setResizable(false);
            tblQuanAo.getColumnModel().getColumn(7).setResizable(false);
            tblQuanAo.getColumnModel().getColumn(8).setResizable(false);
            tblQuanAo.getColumnModel().getColumn(9).setResizable(false);
            tblQuanAo.getColumnModel().getColumn(10).setResizable(false);
        }

        lblTitleQA1.setFont(org.group06.utils.FontConstant.FONT_HEADER);
        lblTitleQA1.setForeground(org.group06.utils.ColorConstant.BLACK);
        lblTitleQA1.setText("Thông Tin Quần Áo");
        lblTitleQA1.setMaximumSize(new java.awt.Dimension(103, 60));
        lblTitleQA1.setMinimumSize(new java.awt.Dimension(103, 60));
        lblTitleQA1.setPreferredSize(new java.awt.Dimension(103, 60));

        txtTimKiem.setFont(FontConstant.FONT_TEXT);
        txtTimKiem.setEnabled(true);
        txtTimKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimKiemFocusLost(evt);
            }
        });
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }

            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        cmbTimKiemQATheoTieuChi.setFont(FontConstant.FONT_TEXT);
        cmbTimKiemQATheoTieuChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Chọn Tiêu Chí Tìm Kiếm", "Tìm Theo Mã", "Tìm Theo Tên", "Tìm Theo Thương Hiệu"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnInformationFields, javax.swing.GroupLayout.DEFAULT_SIZE, 1480, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(scrQuanAo)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(835, 835, 835)
                                                .addComponent(lblTimKiemQA, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTimKiem)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbTimKiemQATheoTieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                        .addComponent(lblTimKiemQA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbTimKiemQATheoTieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        ComponentStatus.setStatusBtn(this.btnThemMoi, true);
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

    public void setAllField(Boolean status) {
        java.util.List<JTextField> listTxt = java.util.Arrays.asList(this.txtTenQA, this.txtSoLuongQA,
                this.txtThuongHieu, this.txtGiaNhap, this.txtLoiNhuan, this.txtGiaBan);
        java.util.List<JTextField> listStatusTxt = java.util.Arrays.asList(this.txtTenQA, this.txtSoLuongQA,
                this.txtThuongHieu, this.txtGiaNhap, this.txtLoiNhuan);
        java.util.List<JComboBox> listCmb = java.util.Arrays.asList(this.cmbLoaiQA, this.cmbSize, this.cmbNhaCungCap, this.cmbTrangThai);
        ComponentStatus.emptyField(listTxt);
        ComponentStatus.setFieldStatus(listStatusTxt, status);
        ComponentStatus.setDefaultCmb(listCmb);
        ComponentStatus.setComboBoxStatus(listCmb, status);
    }

    public void setFieldUpdate() {
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
                file = chooser.getSelectedFile();
//                Load hình ảnh
                loadImage(file.toURI().toURL());
                System.out.println(file.getPath());

            } catch (MalformedURLException ex) {
                Logger.getLogger(PanelQuanAo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PanelQuanAo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnUploadImgActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        if (this.statusBtnCapNhat == false && this.statusBtnThemMoi == true) {
            this.tblQuanAo.clearSelection();
//            loadImage(ImagePath.UPLOAD_IMG);
            setAllField(true);
        } else if (this.statusBtnCapNhat == true && this.statusBtnThemMoi == false) {
            setFieldUpdate();
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
        this.statusBtnThemMoi = true;
        this.statusBtnCapNhat = false;
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
        if (this.txtTenQA.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tên quần áo!");
            this.txtTenQA.requestFocus();
        } else if (this.cmbLoaiQA.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn loại quần áo!");
            ComponentStatus.CheckSelectOption(this.cmbLoaiQA);
        } else if (this.cmbSize.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn size!");
            ComponentStatus.CheckSelectOption(this.cmbSize);
        } else if (this.txtMaQA.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng không để trống field này! Hãy kiểm tra Tên quần áo và size đã chọn chưa!");
            this.txtTenQA.requestFocus();
        } else if (this.txtSoLuongQA.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng quần áo!");
            this.txtSoLuongQA.requestFocus();
        } else if (this.txtThuongHieu.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tên thương hiệu!");
            this.txtThuongHieu.requestFocus();
        } else if (this.cmbNhaCungCap.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhà cung cấp!");
            ComponentStatus.CheckSelectOption(this.cmbNhaCungCap);
        } else if (this.txtGiaNhap.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập vào giá nhập quần áo!");
            this.txtGiaNhap.requestFocus();
        } else if (this.txtLoiNhuan.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập vào lợi nhuận!");
            this.txtLoiNhuan.requestFocus();
        } else if (this.txtGiaBan.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng không để trống field này! Hãy kiểm tra giá nhập và lợi nhuận đã nhập chưa!");
            this.txtGiaBan.requestFocus();
        } else if (this.cmbTrangThai.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn size!");
            ComponentStatus.CheckSelectOption(this.cmbTrangThai);
        } else {
            if (JOptionPane.showConfirmDialog(null, "Bạn chắn chắn lưu dữ liệu này?", "Xác nhận hành động", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                if (this.statusBtnThemMoi == false && this.statusBtnCapNhat == true) {
                    viTri = this.tblQuanAo.getSelectedRow();
//                Lấy quần áo cần cập nhật
                    qaCapNhat = new DAO_QuanAo(DatabaseConnect.getConnection()).getByID(this.txtMaQA.getText());
//                Tên quần áo
                    String tenQuanAo = NameStandard.formatCapitalize(this.txtTenQA.getText());
                    this.qaCapNhat.setTenQA(tenQuanAo);
                    this.tblQuanAo.getModel().setValueAt(tenQuanAo, viTri, 1);
//                Loại quần áo
                    int loaiQAIndex = this.cmbLoaiQA.getSelectedIndex();
                    String loaiQA = this.cmbLoaiQA.getItemAt(loaiQAIndex);
                    for (Map.Entry<String, String> item : loaiQuanAo.entrySet()) {
                        String tenLoaiQuanAo = item.getValue();
                        if (tenLoaiQuanAo.equals(loaiQA)) {
                            this.qaCapNhat.setLoaiQuanAo(item.getKey());
                            this.tblQuanAo.getModel().setValueAt(tenLoaiQuanAo, viTri, 2);
                        }
                    }
//                Size quần áo
                    int size = this.cmbSize.getSelectedIndex();
                    String sizeQuanAo = this.cmbSize.getItemAt(size);
                    qaCapNhat.setKichThuoc(sizeQuanAo);
                    this.tblQuanAo.getModel().setValueAt(sizeQuanAo, viTri, 3);
//                Số lượng quần áo
                    int soLuongQuanAo = parseStringtoInt(this.txtSoLuongQA.getText());
                    qaCapNhat.setSoLuong(soLuongQuanAo);
                    this.tblQuanAo.getModel().setValueAt(soLuongQuanAo, viTri, 4);
//                Tên thương hiệu
                    String tenThuongHieu = this.txtThuongHieu.getText();
                    qaCapNhat.setThuongHieu(tenThuongHieu);
                    this.tblQuanAo.getModel().setValueAt(tenThuongHieu, viTri, 5);
//                Mã nhà cung cấp
                    int nhaCungCap = this.cmbNhaCungCap.getSelectedIndex();
                    for (NhaCungCap ncc : dsNCC) {
                        if (ncc.getTenNCC().equalsIgnoreCase(this.cmbNhaCungCap.getItemAt(nhaCungCap))) {
                            qaCapNhat.setNhaCungCap(ncc);
                            this.tblQuanAo.getModel().setValueAt(ncc.getTenNCC(), viTri, 6);
                        }
                    }
//                Giá nhập quần áo
                    double giaNhap = originalMoney(this.txtGiaNhap.getText());
                    qaCapNhat.setGiaNhap(giaNhap);
                    DecimalFormat dfMoney = new DecimalFormat("##,### VNĐ");
                    this.tblQuanAo.getModel().setValueAt(dfMoney.format(giaNhap), viTri, 7);
//                Lợi nhuận của quần áo
                    double loiNhuan = originalPercent(this.txtLoiNhuan.getText());
                    qaCapNhat.setLoiNhuan(loiNhuan);
                    DecimalFormat dfPercent = new DecimalFormat("##,## %");
                    this.tblQuanAo.getModel().setValueAt(dfPercent.format(loiNhuan), viTri, 8);
//                Trạng thái sản phẩm 1: true là đang kinh doanh; 2: false là dừng kinh doanh
                    int trangThai = this.cmbTrangThai.getSelectedIndex();
                    if (trangThai == 1) {
                        qaCapNhat.setTrangThai(true);
                        this.tblQuanAo.getModel().setValueAt("Còn Kinh Doanh", viTri, 10);
                    } else if (trangThai == 2) {
                        qaCapNhat.setTrangThai(false);
                        this.tblQuanAo.getModel().setValueAt("Dừng Kinh Doanh", viTri, 10);
                    }

//                    Xử lý lấy hình ảnh mới cần cập nhật
                    System.out.println(file.getPath());
                    if (file != null) {
                        String urlHinhAnh = file.getPath();
                        qaCapNhat.setHinhAnh(urlHinhAnh);
                        for (QuanAo qa : dsQA) {
                            if (qaCapNhat.getMaQA().contains(qa.getMaQA())) {
                                qa.setHinhAnh(urlHinhAnh);
                            }
                        }
                    }
//                    Cập nhật quần áo vào cơ sở dữ liệu
                    DAO_QuanAo updateQuanAo = new DAO_QuanAo(DatabaseConnect.getConnection());
                    if (updateQuanAo.update(qaCapNhat)) {
                        System.out.println("Cập nhật thành công");
                    }

                    this.tblQuanAo.clearSelection();
                    file = null;
                } else if (this.statusBtnThemMoi == true && this.statusBtnCapNhat == false) {
//                Tên quần áo
                    String tenQuanAo = NameStandard.formatCapitalize(this.txtTenQA.getText());
                    this.qaThemMoi.setTenQA(tenQuanAo);
//                Loại quần áo
                    int loaiQAIndex = this.cmbLoaiQA.getSelectedIndex();
                    String loaiQA = this.cmbLoaiQA.getItemAt(loaiQAIndex);
                    String tenLoaiQA = "";
                    for (Map.Entry<String, String> item : loaiQuanAo.entrySet()) {
                        String tenLQA = item.getValue();
                        if (tenLQA.equals(loaiQA)) {
                            this.qaThemMoi.setLoaiQuanAo(item.getKey());
                            tenLoaiQA = item.getValue();
                        }
                    }
//                Size quần áo
                    int size = this.cmbSize.getSelectedIndex();
                    String sizeQuanAo = this.cmbSize.getItemAt(size);
                    qaThemMoi.setKichThuoc(sizeQuanAo);
//                Mã quần áo
                    String maQuanAo = this.txtMaQA.getText().trim();
                    qaThemMoi.setMaQA(maQuanAo);
//                Số lượng quần áo
                    int soLuongQuanAo = parseStringtoInt(this.txtSoLuongQA.getText());
                    qaThemMoi.setSoLuong(soLuongQuanAo);
//                Tên thương hiệu
                    String tenThuongHieu = this.txtThuongHieu.getText();
                    qaThemMoi.setThuongHieu(tenThuongHieu);
//                Mã nhà cung cấp
                    int nhaCungCap = this.cmbNhaCungCap.getSelectedIndex();
                    String tenNhaCungCap = "";
                    for (NhaCungCap ncc : dsNCC) {
                        if (ncc.getTenNCC().equalsIgnoreCase(this.cmbNhaCungCap.getItemAt(nhaCungCap))) {
                            qaThemMoi.setNhaCungCap(ncc);
                            tenNhaCungCap = ncc.getTenNCC();
                        }
                    }
//                Giá nhập quần áo
                    String regexGiaNhap = "^*VNĐ+$";
                    Pattern patternGiaNhap = Pattern.compile(regexGiaNhap);
                    Matcher matcherGiaNhap = patternGiaNhap.matcher(this.txtGiaNhap.getText().trim());
                    double giaNhap = 0;
                    DecimalFormat dfMoney = new DecimalFormat("##,### VNĐ");
                    String giaNhapFormat = "";
                    if (matcherGiaNhap.find()) {
                        giaNhap = originalMoney(this.txtGiaNhap.getText().trim());
                        qaThemMoi.setGiaNhap(giaNhap);
                        giaNhapFormat = dfMoney.format(giaNhap);
                    } else {
                        giaNhap = parseStringtoDouble(this.txtGiaNhap.getText().trim());
                        qaThemMoi.setGiaNhap(giaNhap);
                        giaNhapFormat = dfMoney.format(giaNhap);
                    }
//                Lợi nhuận của quần áo
                    String regexLoiNhuan = "^*%+$";
                    Pattern patternLoiNhuan = Pattern.compile(regexLoiNhuan);
                    Matcher matcherLoiNhuan = patternLoiNhuan.matcher(this.txtLoiNhuan.getText());
                    double loiNhuan = 0;
                    DecimalFormat dfPercent = new DecimalFormat("##,## %");
                    String loiNhuanFormat = "";

                    if (matcherLoiNhuan.find()) {
                        loiNhuan = originalPercent(this.txtLoiNhuan.getText());
                        qaThemMoi.setLoiNhuan(loiNhuan);
                        loiNhuanFormat = dfPercent.format(loiNhuan + "");
                    } else {
                        loiNhuan = parseStringtoDouble(this.txtLoiNhuan.getText().trim());
                        qaThemMoi.setLoiNhuan(loiNhuan);
                        loiNhuanFormat = dfPercent.format(loiNhuan);
                    }
//                Giá bán của quần áo
                    String giaBan = this.txtGiaBan.getText();
//                Trạng thái sản phẩm 1: true là đang kinh doanh; 2: false là dừng kinh doanh
                    int trangThai = this.cmbTrangThai.getSelectedIndex();
                    String tenTrangThai = "";
                    if (trangThai == 1) {
                        qaThemMoi.setTrangThai(true);
                        tenTrangThai = "Còn Kinh Doanh";
                    } else if (trangThai == 2) {
                        qaThemMoi.setTrangThai(false);
                        tenTrangThai = "Dừng Kinh Doanh";
                    }
                    Object[] row = {maQuanAo, tenQuanAo, tenLoaiQA, sizeQuanAo, soLuongQuanAo, tenThuongHieu,
                            tenNhaCungCap, giaNhapFormat, loiNhuanFormat, giaBan, tenTrangThai};
                    DefaultTableModel model = (DefaultTableModel) this.tblQuanAo.getModel();
                    model.addRow(row);
//                    Xử lý lấy hình ảnh quần áo thêm mới
//                    Xử lý lấy hình ảnh mới cần cập nhật
                    System.out.println(file.getPath());
                    if (file != null) {
                        String urlHinhAnh = file.getPath();
                        qaThemMoi.setHinhAnh(urlHinhAnh);
                    }
                    dsQA.add(qaThemMoi);
//                Lưu quần áo vào cơ sở dữ liệu
                    DAO_QuanAo addQuanAo = new DAO_QuanAo(DatabaseConnect.getConnection());
                    if (addQuanAo.add(qaThemMoi)) {
                        System.out.println("Thêm mới thành công");
                    }
                }

                this.statusBtnThemMoi = false;
                this.statusBtnCapNhat = false;
                xoaTrang();
                ComponentStatus.setStatusBtn(this.btnXoaTrang, false);
                ComponentStatus.setStatusBtn(this.btnLuu, false);
                ComponentStatus.setStatusBtn(this.btnHuy, false);
                ComponentStatus.setStatusBtn(this.btnThemMoi, true);
                ComponentStatus.setStatusBtn(this.btnUploadImg, false);
                loadImage(ImagePath.UPLOAD_IMG);
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        java.util.List<JTextField> listTxt = java.util.Arrays.asList(this.txtTenQA, this.txtSoLuongQA, this.txtThuongHieu, this.txtGiaNhap, this.txtLoiNhuan);
        java.util.List<JComboBox> listCmb = java.util.Arrays.asList(this.cmbLoaiQA, this.cmbSize, this.cmbNhaCungCap, this.cmbTrangThai);
        if (JOptionPane.showConfirmDialog(null, "Bạn chắn chắn cập nhật?", "Xác nhận hành động", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            this.txtTenQA.requestFocus();
            this.txtTenQA.selectAll();
//            Set buttons
            ComponentStatus.setStatusBtn(this.btnCapNhat, false);
            ComponentStatus.setStatusBtn(this.btnXoaTrang, true);
            ComponentStatus.setStatusBtn(this.btnUploadImg, true);
            ComponentStatus.setStatusBtn(this.btnLuu, true);
//            Set fields
            ComponentStatus.setFieldStatus(listTxt, true);
//            Set combobox
            ComponentStatus.setComboBoxStatus(listCmb, true);
            this.statusBtnThemMoi = false;
            this.statusBtnCapNhat = true;
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn chắn chắn hủy?", "Xác nhận hành động", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            setAllField(false);
            setStatusAllBtnsStart();
            ComponentStatus.emptyField(this.txtMaQA);
            file = null;
//            Set image default
            loadImage(ImagePath.UPLOAD_IMG);
            this.statusBtnThemMoi = false;
            this.statusBtnCapNhat = false;
            this.tblQuanAo.clearSelection();
        }

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

    //    Load dữ liệu lên fields
    private void tblQuanAoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanAoMouseClicked
        java.util.List<JButton> listBtnEnable = java.util.Arrays.asList(this.btnHuy, this.btnCapNhat);
        ComponentStatus.setStatusBtn(listBtnEnable, true);
        ComponentStatus.setStatusBtn(this.btnXoaTrang, false);
        ComponentStatus.setStatusBtn(this.btnThemMoi, false);
        ComponentStatus.setStatusBtn(this.btnLuu, false);
        setAllField(false);

        this.viTri = this.tblQuanAo.getSelectedRow();
//      Xử lý đổ dữ liệu từ table lên fields
        this.txtMaQA.setText(tblQuanAo.getValueAt(viTri, 0).toString());
        this.txtTenQA.setText(tblQuanAo.getValueAt(viTri, 1).toString());
//        Xử lý lấy loại quần áo
        for (Map.Entry<String, String> item : loaiQuanAo.entrySet()) {
            if (tblQuanAo.getValueAt(viTri, 2).toString().equalsIgnoreCase(item.getValue())) {
                this.cmbLoaiQA.setSelectedItem(item.getValue());
            }
        }
//        Xử lý lấy size
        for (int i = 0; i < this.cmbSize.getItemCount(); i++) {
            if (tblQuanAo.getValueAt(viTri, 3).toString().equalsIgnoreCase(this.cmbSize.getItemAt(i))) {
                this.cmbSize.setSelectedIndex(i);
            }
        }
        this.txtSoLuongQA.setText(tblQuanAo.getValueAt(viTri, 4).toString());
        this.txtThuongHieu.setText(tblQuanAo.getValueAt(viTri, 5).toString());
//        Xử lý lấy nhà cung cấp
        for (int i = 0; i < this.cmbNhaCungCap.getItemCount(); i++) {
            if (tblQuanAo.getValueAt(viTri, 6).toString().equalsIgnoreCase(this.cmbNhaCungCap.getItemAt(i))) {
                this.cmbNhaCungCap.setSelectedIndex(i);
            }
        }
        this.txtGiaNhap.setText(tblQuanAo.getValueAt(viTri, 7).toString());
        this.txtLoiNhuan.setText(tblQuanAo.getValueAt(viTri, 8).toString());
        this.txtGiaBan.setText(tblQuanAo.getValueAt(viTri, 9).toString());
//        Xử lý lấy trạng thái của quần áo
        for (int i = 0; i < this.cmbTrangThai.getItemCount(); i++) {
            if (tblQuanAo.getValueAt(viTri, 10).toString().equalsIgnoreCase(this.cmbTrangThai.getItemAt(i))) {
                this.cmbTrangThai.setSelectedIndex(i);
            }
        }
        file = null;
//        Xử lý lấy hình ảnh theo dòng dữ liệu
        loadImgWithRowData(tblQuanAo.getValueAt(viTri, 0).toString());


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
        ComponentStatus.CheckSelectOption(this.cmbSize);
    }//GEN-LAST:event_cmbSizeActionPerformed

    private void cmbNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNhaCungCapActionPerformed
        ComponentStatus.CheckSelectOption(this.cmbNhaCungCap);
    }//GEN-LAST:event_cmbNhaCungCapActionPerformed

    private void cmbTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTrangThaiActionPerformed
        ComponentStatus.CheckSelectOption(this.cmbTrangThai);
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

    private void cmbSizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSizeItemStateChanged
        if (this.statusBtnThemMoi == true && this.statusBtnCapNhat == false) {
            String maQA = taoMaQuanAo(this.txtTenQA.getText());
            this.txtMaQA.setText(maQA);
            qaThemMoi.setMaQA(maQA);
        }
        ComponentStatus.CheckSelectOption(this.cmbSize);
    }//GEN-LAST:event_cmbSizeItemStateChanged

    private void loadAllTableQA(ArrayList<QuanAo> dsQATimDuoc) {
        DefaultTableModel modelQA = (DefaultTableModel) this.tblQuanAo.getModel();
        modelQA.setRowCount(0);
        String tenLoaiQuanAo = "";
        DecimalFormat dfMoney = new DecimalFormat("##,### VNĐ");
        DecimalFormat dfPercent = new DecimalFormat("##,## %");
        for (QuanAo qa : dsQATimDuoc) {
            for (HashMap.Entry<String, String> item : loaiQuanAo.entrySet()) {
                if (qa.getLoaiQuanAo().equalsIgnoreCase(item.getKey())) {
                    tenLoaiQuanAo = item.getValue();
                }
            }
            Object[] data = {qa.getMaQA(), qa.getTenQA(), tenLoaiQuanAo, qa.getKichThuoc(),
                    qa.getSoLuong(), qa.getThuongHieu(), qa.getNhaCungCap().getTenNCC(),
                    dfMoney.format(qa.getGiaNhap()), dfPercent.format(qa.getLoiNhuan()),
                    tinhGiaBan(String.valueOf(qa.getGiaNhap()), String.valueOf(qa.getLoiNhuan())),
                    qa.isTrangThai() ? "Còn Kinh Doanh" : "Dừng Kinh Doanh"};
//      Thêm dữ liệu vào table
            modelQA.addRow(data);
        }
    }

    private void xuLyTimKiemQA() {
        String duLieuTimKiem = this.txtTimKiem.getText().trim();
        int tieuChiTimKiem = this.cmbTimKiemQATheoTieuChi.getSelectedIndex();

        if (duLieuTimKiem.isEmpty() || tieuChiTimKiem == 0) {
            loadDataTable();
        } else {
            ArrayList<QuanAo> dsQATimDuoc = new ArrayList<>();
            if (tieuChiTimKiem == 1) {
                for (QuanAo qa : this.dsQA) {
                    if (qa.getMaQA().contains(duLieuTimKiem)) {
                        dsQATimDuoc.add(qa);
                    }
                }
            } else if (tieuChiTimKiem == 2) {
                for (QuanAo qa : this.dsQA) {
                    if (qa.getTenQA().contains(duLieuTimKiem)) {
                        dsQATimDuoc.add(qa);
                    }
                }
            } else if (tieuChiTimKiem == 3) {
                for (QuanAo qa : this.dsQA) {
                    if (qa.getThuongHieu().contains(duLieuTimKiem)) {
                        dsQATimDuoc.add(qa);
                    }
                }
            }

//        Cập nhật kết quả tìm kiếm lên bảng
            loadAllTableQA(dsQATimDuoc);
        }
    }

    //    Xử lý tìm kiếm quần áo
    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        xuLyTimKiemQA();
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        xuLyTimKiemQA();
    }//GEN-LAST:event_txtTimKiemKeyReleased

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
    private javax.swing.JComboBox<String> cmbTimKiemQATheoTieuChi;
    private javax.swing.JComboBox<String> cmbTrangThai;
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
    private int viTri = -1;
    private File file = null;
    private QuanAo qaThemMoi = new QuanAo();
    private QuanAo qaCapNhat = null;
    private ArrayList<QuanAo> dsQA = new DAO_QuanAo(DatabaseConnect.getConnection()).getAll();
    private ArrayList<NhaCungCap> dsNCC = new DAO_NhaCungCap(DatabaseConnect.getConnection()).getAll();
    private HashMap<String, String> loaiQuanAo = new DAO_QuanAo(DatabaseConnect.getConnection()).getAllLoaiQuanAo();
    private boolean statusBtnCapNhat = false;
    private boolean statusBtnThemMoi = false;

    private void xoaTrang() {
        java.util.List<JTextField> listTxt = java.util.Arrays.asList(this.txtMaQA, this.txtTenQA, this.txtSoLuongQA, this.txtThuongHieu, this.txtGiaNhap, this.txtLoiNhuan, this.txtGiaBan);
        java.util.List<JComboBox> listCmb = java.util.Arrays.asList(this.cmbLoaiQA, this.cmbSize, this.cmbNhaCungCap, this.cmbTrangThai);
        ComponentStatus.emptyField(listTxt);
        ComponentStatus.setDefaultCmb(listCmb);
        ComponentStatus.setFieldStatus(listTxt, false);
        ComponentStatus.setComboBoxStatus(listCmb, false);
    }
}
