/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.components.panels.container;

import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.group06.utils.ColorConstant;
import org.group06.utils.FontConstant;
import org.group06.utils.ImagePath;
import org.group06.view.components.panels.ImagePanel;
import org.group06.view.components.textFields.TextField;

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
        tblSoLuongVaKichThuoc.setBackground(ColorConstant.BUTTON_CLICK);
        setStatusAllFields(false);
        setStatusAllBtns(false);
//        this.btnThemMoi.setEnabled(true);
    }

//    Chuyển đổi kiểu dữ liệu
    public int parseStringtoInt(String text) {
        return Integer.parseInt(text);
    }

    public Double parseStringtoDouble(String text) {
        return Double.parseDouble(text);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleQA = new javax.swing.JLabel();
        txtTimQA = new org.group06.view.components.textFields.TextField("Nhập vào mã quần áo cần tìm", ColorConstant.WHITE);
        btnTimQA = new org.group06.view.components.buttons.StaticRoundButton("", ImagePath.ICON_SEARCH, ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        pnInformationFields = new javax.swing.JPanel();
        pnImgUpLoad = new javax.swing.JPanel();
        pnImg = new ImagePanel(ImagePath.UPLOAD_IMG, 400, 400);
        btnUploadImg = new org.group06.view.components.buttons.StaticRoundButton("", ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        pnFields = new javax.swing.JPanel();
        pnFieldsLeft = new javax.swing.JPanel();
        lblMa = new javax.swing.JLabel();
        txtMa = new org.group06.view.components.textFields.TextField();
        lbTen = new javax.swing.JLabel();
        txtTen = new org.group06.view.components.textFields.TextField();
        lblLoaiQA = new javax.swing.JLabel();
        btnThemLoaiQA = new javax.swing.JButton();
        cmbLoaiQA = new javax.swing.JComboBox<>();
        lblSoLuong = new javax.swing.JLabel();
        txtSoLuong = new org.group06.view.components.textFields.TextField();
        lblGiaNhap = new javax.swing.JLabel();
        txtGiaNhap = new org.group06.view.components.textFields.TextField();
        lblLoiNhuan = new javax.swing.JLabel();
        txtLoiNhuan = new org.group06.view.components.textFields.TextField();
        lblGiaBan = new javax.swing.JLabel();
        txtGiaBan = new org.group06.view.components.textFields.TextField();
        lblNhaCungCap = new javax.swing.JLabel();
        cmbNhaCungCap = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        pnFieldsRight = new javax.swing.JPanel();
        scrKichThuoc_SoLuong = new javax.swing.JScrollPane();
        tblSoLuongVaKichThuoc = new javax.swing.JTable();
        lblDinhMucTonKho = new javax.swing.JLabel();
        txtDinhMucTonKho = new org.group06.view.components.textFields.TextField();
        lblMoTa = new javax.swing.JLabel();
        scrMoTa = new javax.swing.JScrollPane();
        txaMoTa = new javax.swing.JTextArea();
        pnControl = new javax.swing.JPanel();
        btnXoaTrang = new org.group06.view.components.buttons.StaticRoundButton("", ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        btnThemMoi = new org.group06.view.components.buttons.StaticRoundButton("", ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        btnLuu = new org.group06.view.components.buttons.StaticRoundButton("", ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        btnCapNhat = new org.group06.view.components.buttons.StaticRoundButton("", ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        btnHuy = new org.group06.view.components.buttons.StaticRoundButton("", ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        scrQuanAo = new javax.swing.JScrollPane();
        tblQuanAo = new javax.swing.JTable();

        setBackground(ColorConstant.BACKGROUND_CONTAINER);

        lblTitleQA.setFont(org.group06.utils.FontConstant.FONT_HEADER);
        lblTitleQA.setForeground(org.group06.utils.ColorConstant.WHITE);
        lblTitleQA.setText("Thông Tin Quần Áo");
        lblTitleQA.setMaximumSize(new java.awt.Dimension(103, 110));
        lblTitleQA.setMinimumSize(new java.awt.Dimension(103, 110));
        lblTitleQA.setPreferredSize(new java.awt.Dimension(103, 110));

        txtTimQA.setFont(FontConstant.FONT_TEXT);
        txtTimQA.setForeground(ColorConstant.WHITE);
        txtTimQA.setToolTipText("Nhập mã quần áo cần tìm");
        txtTimQA.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTimQA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimQAActionPerformed(evt);
            }
        });

        btnTimQA.setToolTipText("Click để tìm kiếm quần áo");
        btnTimQA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimQA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTimQA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimQAActionPerformed(evt);
            }
        });

        pnInformationFields.setBackground(ColorConstant.BACKGROUND_CONTAINER);
        pnInformationFields.setPreferredSize(new java.awt.Dimension(0, 500));

        pnImgUpLoad.setBackground(ColorConstant.BUTTON_HOVER);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnUploadImg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pnFields.setBackground(ColorConstant.BUTTON_HOVER);
        pnFields.setLayout(new java.awt.GridLayout(1, 2));

        pnFieldsLeft.setBackground(ColorConstant.BUTTON_HOVER);
        pnFieldsLeft.setPreferredSize(new java.awt.Dimension(420, 0));

        lblMa.setFont(FontConstant.FONT_LABEL);
        lblMa.setText("Mã:");

        txtMa.setEditable(false);
        txtMa.setBackground(ColorConstant.DISABLE_FIELD);
        txtMa.setFont(FontConstant.FONT_TEXT);
        txtMa.setEnabled(false);

        lbTen.setFont(FontConstant.FONT_LABEL);
        lbTen.setText("Tên:");

        txtTen.setFont(FontConstant.FONT_TEXT);
        txtTen.setEnabled(false);

        lblLoaiQA.setFont(FontConstant.FONT_LABEL);
        lblLoaiQA.setText("Loại Quần Áo:");

        btnThemLoaiQA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/addItem.jpg"))); // NOI18N
        btnThemLoaiQA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLoaiQAActionPerformed(evt);
            }
        });

        cmbLoaiQA.setBackground(ColorConstant.BACKGROUND_SIDEBAR);
        cmbLoaiQA.setFont(FontConstant.FONT_TEXT);
        cmbLoaiQA.setForeground(ColorConstant.WHITE);
        cmbLoaiQA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Loại Quần Áo", "Jean Jacket", "Váy", "Áo Croptop" }));
        cmbLoaiQA.setEnabled(false);
        cmbLoaiQA.setPreferredSize(new java.awt.Dimension(72, 40));
        cmbLoaiQA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLoaiQAActionPerformed(evt);
            }
        });

        lblSoLuong.setFont(FontConstant.FONT_LABEL);
        lblSoLuong.setText("Số Lượng:");

        txtSoLuong.setFont(FontConstant.FONT_TEXT);
        txtSoLuong.setEnabled(false);
        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        lblGiaNhap.setFont(FontConstant.FONT_LABEL);
        lblGiaNhap.setText("Giá Nhập:");

        txtGiaNhap.setFont(FontConstant.FONT_TEXT);
        txtGiaNhap.setEnabled(false);

        lblLoiNhuan.setFont(FontConstant.FONT_LABEL);
        lblLoiNhuan.setText("Lợi Nhuận:");

        txtLoiNhuan.setFont(FontConstant.FONT_TEXT);
        txtLoiNhuan.setEnabled(false);

        lblGiaBan.setFont(FontConstant.FONT_LABEL);
        lblGiaBan.setText("Giá Bán:");

        txtGiaBan.setFont(FontConstant.FONT_TEXT);
        txtGiaBan.setEnabled(false);
        txtGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaBanActionPerformed(evt);
            }
        });

        lblNhaCungCap.setFont(FontConstant.FONT_LABEL);
        lblNhaCungCap.setText("Nhà Cung Cấp:");

        cmbNhaCungCap.setBackground(ColorConstant.BACKGROUND_SIDEBAR);
        cmbNhaCungCap.setFont(FontConstant.FONT_TEXT);
        cmbNhaCungCap.setForeground(ColorConstant.WHITE);
        cmbNhaCungCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Nhà Cung Cấp", "Chợ Đồng Xuân", "Chợ Bến Thành", "Hạnh Thông Tây" }));
        cmbNhaCungCap.setEnabled(false);
        cmbNhaCungCap.setPreferredSize(new java.awt.Dimension(72, 40));

        jLabel1.setFont(FontConstant.FONT_HEADER);
        jLabel1.setText("%");

        javax.swing.GroupLayout pnFieldsLeftLayout = new javax.swing.GroupLayout(pnFieldsLeft);
        pnFieldsLeft.setLayout(pnFieldsLeftLayout);
        pnFieldsLeftLayout.setHorizontalGroup(
            pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFieldsLeftLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFieldsLeftLayout.createSequentialGroup()
                        .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnFieldsLeftLayout.createSequentialGroup()
                                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(pnFieldsLeftLayout.createSequentialGroup()
                                .addComponent(lblLoaiQA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMa)
                            .addGroup(pnFieldsLeftLayout.createSequentialGroup()
                                .addComponent(cmbLoaiQA, 0, 232, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThemLoaiQA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTen)))
                    .addGroup(pnFieldsLeftLayout.createSequentialGroup()
                        .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLoiNhuan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGiaNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGiaBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGiaBan)
                            .addComponent(txtGiaNhap)
                            .addComponent(txtSoLuong)
                            .addComponent(cmbNhaCungCap, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnFieldsLeftLayout.createSequentialGroup()
                                .addComponent(txtLoiNhuan)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(15, 15, 15)))))
                .addContainerGap())
        );
        pnFieldsLeftLayout.setVerticalGroup(
            pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFieldsLeftLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMa)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTen)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLoaiQA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoaiQA)
                    .addComponent(btnThemLoaiQA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoLuong)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGiaNhap)
                    .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoiNhuan)
                    .addComponent(txtLoiNhuan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGiaBan)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFieldsLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNhaCungCap))
                .addContainerGap())
        );

        pnFields.add(pnFieldsLeft);

        pnFieldsRight.setBackground(ColorConstant.BUTTON_HOVER);
        pnFieldsRight.setPreferredSize(new java.awt.Dimension(420, 0));

        scrKichThuoc_SoLuong.setBackground(ColorConstant.BUTTON_CLICK
        );

        tblSoLuongVaKichThuoc.setBackground(ColorConstant.BUTTON_CLICK);
        tblSoLuongVaKichThuoc.setFont(FontConstant.FONT_TEXT);
        tblSoLuongVaKichThuoc.setForeground(ColorConstant.BLACK);
        tblSoLuongVaKichThuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"S", "12"},
                {"M", "23"},
                {"L", "23"},
                {"XL", null}
            },
            new String [] {
                "Kích Thước", "Số Lượng"
            }
        ));
        tblSoLuongVaKichThuoc.setEnabled(false);
        tblSoLuongVaKichThuoc.setGridColor(new java.awt.Color(102, 102, 102));
        tblSoLuongVaKichThuoc.setShowGrid(true);
        scrKichThuoc_SoLuong.setViewportView(tblSoLuongVaKichThuoc);

        lblDinhMucTonKho.setFont(FontConstant.FONT_LABEL);
        lblDinhMucTonKho.setText("Định Mức Tồn Kho:");
        lblDinhMucTonKho.setMaximumSize(new java.awt.Dimension(140, 16));
        lblDinhMucTonKho.setMinimumSize(new java.awt.Dimension(140, 16));
        lblDinhMucTonKho.setPreferredSize(new java.awt.Dimension(140, 16));

        txtDinhMucTonKho.setFont(FontConstant.FONT_TEXT);
        txtDinhMucTonKho.setText("123123");
        txtDinhMucTonKho.setEnabled(false);

        lblMoTa.setFont(FontConstant.FONT_LABEL);
        lblMoTa.setText("Mô Tả:");
        lblMoTa.setMaximumSize(new java.awt.Dimension(140, 16));
        lblMoTa.setMinimumSize(new java.awt.Dimension(140, 16));
        lblMoTa.setPreferredSize(new java.awt.Dimension(140, 16));

        txaMoTa.setBackground(ColorConstant.BUTTON_CLICK);
        txaMoTa.setColumns(20);
        txaMoTa.setFont(FontConstant.FONT_TEXT);
        txaMoTa.setRows(5);
        txaMoTa.setText("đâsdasdasd\n");
        txaMoTa.setEnabled(false);
        scrMoTa.setViewportView(txaMoTa);

        javax.swing.GroupLayout pnFieldsRightLayout = new javax.swing.GroupLayout(pnFieldsRight);
        pnFieldsRight.setLayout(pnFieldsRightLayout);
        pnFieldsRightLayout.setHorizontalGroup(
            pnFieldsRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFieldsRightLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnFieldsRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrMoTa)
                    .addComponent(lblMoTa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnFieldsRightLayout.createSequentialGroup()
                        .addComponent(lblDinhMucTonKho, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtDinhMucTonKho))
                    .addComponent(scrKichThuoc_SoLuong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        pnFieldsRightLayout.setVerticalGroup(
            pnFieldsRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFieldsRightLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(scrKichThuoc_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFieldsRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDinhMucTonKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDinhMucTonKho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrMoTa)
                .addGap(20, 20, 20))
        );

        pnFields.add(pnFieldsRight);

        pnControl.setBackground(ColorConstant.BUTTON_HOVER);

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
                .addComponent(pnFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGroup(pnInformationFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnFields, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnImgUpLoad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(3, 3, 3))
        );

        tblQuanAo.setBackground(ColorConstant.BUTTON_HOVER);
        tblQuanAo.setFont(FontConstant.FONT_TEXT);
        tblQuanAo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"QA-001", "Quần Hoa", "12", "120000", "10%", "132000", "Quần", "LocalBrand", "Hạnh Thông Tây"},
                {"QA-002", "Váy Ngắn", "1", "250000", "10%", "275000", "Váy", "No Brand", "Chợ Bến Thành"}
            },
            new String [] {
                "Mã", "Tên QA", "Tổng SL", "Giá Nhập", "Lợi Nhuận", "Giá Bán", "Loại", "Thương Hiệu", "NCC"
            }
        ));
        tblQuanAo.setRowHeight(30);
        tblQuanAo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanAoMouseClicked(evt);
            }
        });
        scrQuanAo.setViewportView(tblQuanAo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitleQA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimQA, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTimQA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(pnInformationFields, javax.swing.GroupLayout.DEFAULT_SIZE, 1480, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrQuanAo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleQA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnTimQA, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txtTimQA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnInformationFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrQuanAo)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

//Thay đổi trạng thái của fields
    public void setStatusAllFields(boolean status) {
        this.txtTen.setEnabled(status);
        this.cmbLoaiQA.setEnabled(status);
        this.txtSoLuong.setEnabled(status);
        this.txtGiaNhap.setEnabled(status);
        this.txtLoiNhuan.setEnabled(status);
        this.cmbNhaCungCap.setEnabled(status);
        this.tblSoLuongVaKichThuoc.setEnabled(status);
        if (status == true) {
            this.txaMoTa.setBackground(ColorConstant.BUTTON_CLICK);
            this.txtTen.requestFocus();
        } else if (status == false) {
            this.txaMoTa.setBackground(ColorConstant.DISABLE_FIELD);
//            this.tblSoLuongVaKichThuoc.setBackground(ColorConstant.DISABLE_FIELD);
        }
        this.txtDinhMucTonKho.setEnabled(status);
        this.txaMoTa.setEnabled(status);
    }

    public void setStatusBtn(JButton btn, boolean status) {
        btn.setEnabled(status);
        if (!status) {
            btn.setBackground(ColorConstant.DISABLE_FIELD);
        } else {
            btn.setBackground(ColorConstant.BACKGROUND_SIDEBAR);
        }
    }

    public void setStatusAllBtns(boolean status) {
        setStatusBtn(btnXoaTrang, status);
        setStatusBtn(btnLuu, status);
        setStatusBtn(btnCapNhat, status);
        setStatusBtn(btnHuy, status);
        setStatusBtn(btnUploadImg, status);
    }

    public void xoaTrang() {
        this.txtTen.setText("");
        this.cmbLoaiQA.setSelectedIndex(0);
        this.txtSoLuong.setText("");
        this.txtGiaNhap.setText("");
        this.txtLoiNhuan.setText("");
        this.txtGiaBan.setText("");
        this.cmbNhaCungCap.setSelectedIndex(0);
        DefaultTableModel model = (DefaultTableModel) this.tblSoLuongVaKichThuoc.getModel();
        model.setRowCount(0);
        this.txtDinhMucTonKho.setText("");
        this.txaMoTa.setText("");
    }

    public String tinhGiaBan(String giaNhap, String loiNhuan) {
        Double giaBan = parseStringtoInt(giaNhap) + parseStringtoInt(giaNhap) * parseStringtoDouble(loiNhuan) / 100;
        DecimalFormat df = new DecimalFormat("##,### VNĐ");

        return df.format(giaBan);
    }

    private void txtTimQAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimQAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimQAActionPerformed

    private void btnTimQAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimQAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimQAActionPerformed

    private void btnUploadImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadImgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUploadImgActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        xoaTrang();
        setStatusBtn(btnXoaTrang, false);
        setStatusBtn(btnLuu, false);
        if (txtMa.getText().isEmpty()) {

        }
    }//GEN-LAST:event_btnXoaTrangActionPerformed

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        setStatusAllFields(true);
        xoaTrang();
        setStatusBtn(this.btnThemMoi, false);
        setStatusBtn(this.btnLuu, true);
        setStatusBtn(this.btnHuy, true);
        setStatusBtn(this.btnUploadImg, true);
        setStatusBtn(this.btnXoaTrang, true);
//        if (this.txtTen.getText().isEmpty() || this.txtSoLuong.getText().isEmpty() || this.txtGiaBan.getText().isEmpty() || this.txtDinhMucTonKho.getText().isEmpty() || this.txaMoTa.getText().isEmpty()) {
//            }

//      Gàn và lấy dữ liệu
        this.txtMa.setText("ACT-001");
        this.txtTen.setText("Áo CropTop");
        this.cmbLoaiQA.setSelectedIndex(1);
        this.txtSoLuong.setText("10");
        this.txtGiaNhap.setText("120000");
        this.txtLoiNhuan.setText("10");
        this.txtGiaBan.setText(tinhGiaBan(this.txtGiaNhap.getText(), this.txtLoiNhuan.getText()));
        this.cmbNhaCungCap.setSelectedIndex(3);
        this.tblSoLuongVaKichThuoc.setModel(new DefaultTableModel(
                new Object[][]{
                    {"S", "12"},
                    {"M", "23"},
                    {"L", "23"},
                    {"XL", "24"}
                },
                new String[]{
                    "Kích Thước", "Số Lượng"
                }));
        this.txtDinhMucTonKho.setText("10");
        this.txaMoTa.setText("Áo này rất là đẹp có màu trắng");
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        //        Lấy dữ liệu
        int loaiQA = this.cmbLoaiQA.getSelectedIndex();
        int nhaCungCap = this.cmbNhaCungCap.getSelectedIndex();
//      Tổng hợp dữ liệu
        Object[] data = {this.txtMa.getText(), this.txtTen.getText(), this.txtSoLuong.getText(),
            this.txtGiaNhap.getText(), this.txtLoiNhuan.getText(), this.txtGiaBan.getText(),
            this.cmbLoaiQA.getItemAt(loaiQA), "NoBrand", this.cmbNhaCungCap.getItemAt(nhaCungCap)};
//      Thêm dữ liệu vào table
        DefaultTableModel modelQuanAo = (DefaultTableModel) this.tblQuanAo.getModel();
        modelQuanAo.addRow(data);
//        Xử lý control và các fields
        xoaTrang();
        setStatusAllFields(false);
        setStatusAllBtns(false);
        setStatusBtn(this.btnThemMoi, true);
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        setStatusAllFields(true);
        setStatusAllBtns(true);
        setStatusBtn(this.btnThemMoi, false);
        setStatusBtn(this.btnCapNhat, false);
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        setStatusAllFields(false);
        setStatusAllBtns(false);
        setStatusBtn(btnThemMoi, true);
        xoaTrang();
        this.txtMa.setText("");
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnThemLoaiQAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLoaiQAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemLoaiQAActionPerformed

    private void cmbLoaiQAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLoaiQAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLoaiQAActionPerformed

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private void txtGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaBanActionPerformed

    private void tblQuanAoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanAoMouseClicked
        setStatusAllFields(false);
//        Xử lý các button control
        setStatusAllBtns(false);
        setStatusBtn(btnCapNhat, true);
        setStatusBtn(btnHuy, true);
        setStatusBtn(btnThemMoi, false);
        if (this.txtTen.isEnabled()) {
            setStatusBtn(btnLuu, true);
        } else {
            setStatusBtn(btnXoaTrang, false);
        }

//      Đổ dữ liệu từ table lên fields
        int vitri = this.tblQuanAo.getSelectedRow();
        this.txtMa.setText(tblQuanAo.getValueAt(vitri, 0).toString());
        this.txtTen.setText(tblQuanAo.getValueAt(vitri, 1).toString());
        this.txtSoLuong.setText(tblQuanAo.getValueAt(vitri, 2).toString());
        this.txtGiaNhap.setText(tblQuanAo.getValueAt(vitri, 3).toString());
        this.txtLoiNhuan.setText(tblQuanAo.getValueAt(vitri, 4).toString());
        this.txtGiaBan.setText(tblQuanAo.getValueAt(vitri, 5).toString());

    }//GEN-LAST:event_tblQuanAoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThemLoaiQA;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnTimQA;
    private javax.swing.JButton btnUploadImg;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JComboBox<String> cmbLoaiQA;
    private javax.swing.JComboBox<String> cmbNhaCungCap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbTen;
    private javax.swing.JLabel lblDinhMucTonKho;
    private javax.swing.JLabel lblGiaBan;
    private javax.swing.JLabel lblGiaNhap;
    private javax.swing.JLabel lblLoaiQA;
    private javax.swing.JLabel lblLoiNhuan;
    private javax.swing.JLabel lblMa;
    private javax.swing.JLabel lblMoTa;
    private javax.swing.JLabel lblNhaCungCap;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTitleQA;
    private javax.swing.JPanel pnControl;
    private javax.swing.JPanel pnFields;
    private javax.swing.JPanel pnFieldsLeft;
    private javax.swing.JPanel pnFieldsRight;
    private javax.swing.JPanel pnImg;
    private javax.swing.JPanel pnImgUpLoad;
    private javax.swing.JPanel pnInformationFields;
    private javax.swing.JScrollPane scrKichThuoc_SoLuong;
    private javax.swing.JScrollPane scrMoTa;
    private javax.swing.JScrollPane scrQuanAo;
    private javax.swing.JTable tblQuanAo;
    private javax.swing.JTable tblSoLuongVaKichThuoc;
    private javax.swing.JTextArea txaMoTa;
    private javax.swing.JTextField txtDinhMucTonKho;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JTextField txtLoiNhuan;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTimQA;
    // End of variables declaration//GEN-END:variables
}
