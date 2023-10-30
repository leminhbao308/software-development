/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.components.panels.container;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import org.group06.db.DatabaseConnect;
import org.group06.db.dao.DAO_NhaCungCap;
import org.group06.db.dao.DAO_QuanAo;
import org.group06.model.entity.NhaCungCap;
import org.group06.utils.ColorConstant;
import org.group06.utils.ComponentStatus;
import org.group06.utils.FontConstant;
import org.group06.utils.ImagePath;

/**
 * @author lehoa
 */
public class PanelLoaiQuanAo extends javax.swing.JPanel {

    /**
     * Creates new form PanelKhuyenMai
     */
    public PanelLoaiQuanAo() {
        initComponents();
        loadDataTable();
        setStatusAllBtnsStart();
    }

    public void setStatusAllBtnsStart() {
        java.util.List<JButton> listBtn = java.util.Arrays.asList(this.btnHuy, this.btnXoaTrang, this.btnCapNhat, this.btnLuu);
        ComponentStatus.setStatusBtn(listBtn, false);
        ComponentStatus.setStatusBtn(this.btnThemMoi, true);
    }

    private void loadDataTable() {
        DefaultTableModel modelLoaiQuanAo = (DefaultTableModel) this.tblLoaiQuanAo.getModel();
        for (HashMap.Entry<String, String> item : dsLoaiQuanAo.entrySet()) {
            Object[] data = {item.getKey(), item.getValue()};
            modelLoaiQuanAo.addRow(data);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleLoaiQuanAo = new javax.swing.JLabel();
        lblTimLoaiQuanAo = new javax.swing.JLabel();
        txtTimLoaiQuanAo = new javax.swing.JTextField();
        pnFields = new javax.swing.JPanel();
        pnLeft = new javax.swing.JPanel();
        txtMaLoaiQuanAo = new javax.swing.JTextField();
        lblMaLoaiQuanAo = new javax.swing.JLabel();
        pnRight = new javax.swing.JPanel();
        lblTenLoaiQuanAo = new javax.swing.JLabel();
        txtTenLoaiQuanAo = new javax.swing.JTextField();
        pnControl = new javax.swing.JPanel();
        btnXoaTrang = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        scrLoaiQuanAo = new javax.swing.JScrollPane();
        tblLoaiQuanAo = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitleLoaiQuanAo.setFont(org.group06.utils.FontConstant.FONT_HEADER);
        lblTitleLoaiQuanAo.setForeground(org.group06.utils.ColorConstant.BLACK);
        lblTitleLoaiQuanAo.setText("Loại Quần Áo");
        lblTitleLoaiQuanAo.setMaximumSize(new java.awt.Dimension(103, 110));
        lblTitleLoaiQuanAo.setMinimumSize(new java.awt.Dimension(103, 110));
        lblTitleLoaiQuanAo.setPreferredSize(new java.awt.Dimension(103, 110));

        lblTimLoaiQuanAo.setFont(FontConstant.FONT_LABEL);
        lblTimLoaiQuanAo.setText("Tìm Kiếm Loại Quần Áo:");

        txtTimLoaiQuanAo.setFont(FontConstant.FONT_TEXT);
        txtTimLoaiQuanAo.setForeground(ColorConstant.WHITE);
        txtTimLoaiQuanAo.setToolTipText("Nhập mã nhà cung cấp cần tìm");
        txtTimLoaiQuanAo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTimLoaiQuanAo.setMinimumSize(new java.awt.Dimension(64, 40));
        txtTimLoaiQuanAo.setPreferredSize(new java.awt.Dimension(64, 50));
        txtTimLoaiQuanAo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimLoaiQuanAoActionPerformed(evt);
            }
        });

        pnFields.setBackground(ColorConstant.BUTTON_HOVER);
        pnFields.setLayout(new java.awt.GridLayout(1, 2));

        pnLeft.setBackground(new java.awt.Color(204, 204, 204));

        txtMaLoaiQuanAo.setBackground(new java.awt.Color(102, 102, 102));
        txtMaLoaiQuanAo.setFont(FontConstant.FONT_TEXT);
        txtMaLoaiQuanAo.setForeground(new java.awt.Color(255, 255, 255));
        txtMaLoaiQuanAo.setEnabled(false);

        lblMaLoaiQuanAo.setFont(FontConstant.FONT_LABEL);
        lblMaLoaiQuanAo.setText("Mã Loại Quần Áo:");

        javax.swing.GroupLayout pnLeftLayout = new javax.swing.GroupLayout(pnLeft);
        pnLeft.setLayout(pnLeftLayout);
        pnLeftLayout.setHorizontalGroup(
                pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnLeftLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblMaLoaiQuanAo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaLoaiQuanAo, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                                .addGap(15, 15, 15))
        );
        pnLeftLayout.setVerticalGroup(
                pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnLeftLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtMaLoaiQuanAo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMaLoaiQuanAo))
                                .addGap(32, 32, 32))
        );

        pnFields.add(pnLeft);

        pnRight.setBackground(new java.awt.Color(204, 204, 204));

        lblTenLoaiQuanAo.setFont(FontConstant.FONT_LABEL);
        lblTenLoaiQuanAo.setText("Tên Loại Quần Áo:");
        lblTenLoaiQuanAo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTenLoaiQuanAo.setMaximumSize(new java.awt.Dimension(91, 40));
        lblTenLoaiQuanAo.setMinimumSize(new java.awt.Dimension(91, 40));
        lblTenLoaiQuanAo.setPreferredSize(new java.awt.Dimension(170, 40));

        txtTenLoaiQuanAo.setFont(FontConstant.FONT_TEXT);
        txtTenLoaiQuanAo.setEnabled(false);
        txtTenLoaiQuanAo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenLoaiQuanAoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnRightLayout = new javax.swing.GroupLayout(pnRight);
        pnRight.setLayout(pnRightLayout);
        pnRightLayout.setHorizontalGroup(
                pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnRightLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblTenLoaiQuanAo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenLoaiQuanAo, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                                .addGap(15, 15, 15))
        );
        pnRightLayout.setVerticalGroup(
                pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnRightLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTenLoaiQuanAo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTenLoaiQuanAo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
        );

        pnFields.add(pnRight);

        pnControl.setBackground(new java.awt.Color(255, 255, 255));

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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnControlLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnControlLayout.setVerticalGroup(
                pnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnControlLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(pnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(32, Short.MAX_VALUE))
        );

        tblLoaiQuanAo.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Mã Loại Quần Áo", "Tên Loại Quần Áo"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblLoaiQuanAo.setShowGrid(true);
        tblLoaiQuanAo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoaiQuanAoMouseClicked(evt);
            }
        });
        scrLoaiQuanAo.setViewportView(tblLoaiQuanAo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(140, 140, 140))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblTitleLoaiQuanAo, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblTimLoaiQuanAo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtTimLoaiQuanAo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(scrLoaiQuanAo))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblTitleLoaiQuanAo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblTimLoaiQuanAo))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(txtTimLoaiQuanAo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, 0)
                                .addComponent(pnFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(pnControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(scrLoaiQuanAo, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimLoaiQuanAoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimLoaiQuanAoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimLoaiQuanAoActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
            this.txtTenLoaiQuanAo.setText("");
    }//GEN-LAST:event_btnXoaTrangActionPerformed


    public String taoMa() {
        NumberFormat nf = new DecimalFormat("000");
        int number = 1;
        String maLoaiQuanAo = "LQA" + nf.format(number);

        // Kiểm tra mã đã tồn tại trong danh sách hay chưa
        while (dsLoaiQuanAo.containsKey(maLoaiQuanAo)) {
            number++;
            maLoaiQuanAo = "LQA" + nf.format(number);
        }
        return maLoaiQuanAo.trim();
    }

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        this.statusBtnThemMoi = true;
        this.statusBtnCapNhat = false;
        ComponentStatus.setStatusBtn(this.btnThemMoi, false);
        ComponentStatus.setStatusBtn(this.btnCapNhat, false);
        ComponentStatus.setStatusBtn(this.btnXoaTrang, true);
        ComponentStatus.setStatusBtn(this.btnLuu, true);
        ComponentStatus.setStatusBtn(this.btnHuy, true);
        this.txtMaLoaiQuanAo.setText(taoMa());
        this.txtTenLoaiQuanAo.setEnabled(true);
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if (txtMaLoaiQuanAo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mã Loại Quần Áo đang trống không thể lưu");
        } else if (txtTenLoaiQuanAo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên Loại Quần Áo đang trống không thể lưu");
            this.txtTenLoaiQuanAo.requestFocus();
        } else {
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn lưu?", "Xác nhận hành động", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                if (this.statusBtnCapNhat == true && this.statusBtnThemMoi == false) {
                    viTri = this.tblLoaiQuanAo.getSelectedRow();
                    String maLoaiQA = this.txtMaLoaiQuanAo.getText().trim();
                    String tenLoaiQA = this.txtTenLoaiQuanAo.getText().trim();
                    this.loaQuanAoCapNhat = new DAO_QuanAo(DatabaseConnect.getConnection());
                    if (loaQuanAoCapNhat.updateLoaiQuanAo(maLoaiQA, tenLoaiQA)) {
                        System.out.println("Cập nhật thành công loại quần áo!");
                    }
                    this.tblLoaiQuanAo.getModel().setValueAt(tenLoaiQA, viTri, 1);
                } else if (this.statusBtnThemMoi == true && this.statusBtnCapNhat == false) {
                    String maLoaiQA = this.txtMaLoaiQuanAo.getText().trim();
                    String tenLoaiQA = this.txtTenLoaiQuanAo.getText().trim();
//            Load xuống table
                    Object[] data = {maLoaiQA, tenLoaiQA};
                    DefaultTableModel modelTable = (DefaultTableModel) this.tblLoaiQuanAo.getModel();
                    modelTable.addRow(data);
                    DAO_QuanAo themMoiLoaiQuanAo = new DAO_QuanAo(DatabaseConnect.getConnection());
                    if (themMoiLoaiQuanAo.addLoaiQuanAo(maLoaiQA, tenLoaiQA)) {
                        System.out.println("Thêm mới thành công loại quần áo!");
                    }
                }
                setStatusAllBtnsStart();
                ComponentStatus.emptyField(this.txtMaLoaiQuanAo);
                ComponentStatus.emptyField(this.txtTenLoaiQuanAo);
                this.txtTenLoaiQuanAo.setEnabled(false);
                this.tblLoaiQuanAo.clearSelection();
                this.statusBtnCapNhat = false;
                this.statusBtnThemMoi = false;
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn chắn chắn cập nhật?", "Xác nhận hành động", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            this.statusBtnCapNhat = true;
            ComponentStatus.setStatusBtn(this.btnCapNhat, false);
            ComponentStatus.setStatusBtn(this.btnXoaTrang, true);
            ComponentStatus.setStatusBtn(this.btnLuu, true);
            this.txtTenLoaiQuanAo.setEnabled(true);
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn chắn chắn hủy?", "Xác nhận hành động", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            setStatusAllBtnsStart();
            ComponentStatus.emptyField(this.txtMaLoaiQuanAo);
            ComponentStatus.emptyField(this.txtTenLoaiQuanAo);
            this.txtTenLoaiQuanAo.setEnabled(false);
            this.tblLoaiQuanAo.clearSelection();
            this.statusBtnCapNhat = false;
            this.statusBtnThemMoi = false;
        }
    }//GEN-LAST:event_btnHuyActionPerformed

    //    Xử lý đưa dữ liệu từ row table lên fields
    private void tblLoaiQuanAoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiQuanAoMouseClicked
//        Lấy vị trí dòng click
        viTri = this.tblLoaiQuanAo.getSelectedRow();
//      Lấy và set giá trị cho fields
        this.txtMaLoaiQuanAo.setText(tblLoaiQuanAo.getValueAt(viTri, 0).toString());
        this.txtTenLoaiQuanAo.setText(tblLoaiQuanAo.getValueAt(viTri, 1).toString());
        this.txtTenLoaiQuanAo.setEnabled(false);
        ComponentStatus.setStatusBtn(this.btnThemMoi, false);
        ComponentStatus.setStatusBtn(this.btnXoaTrang, false);
        ComponentStatus.setStatusBtn(this.btnLuu, false);
        ComponentStatus.setStatusBtn(this.btnHuy, true);
        ComponentStatus.setStatusBtn(this.btnCapNhat, true);
        this.statusBtnCapNhat = false;
        this.statusBtnThemMoi = false;

    }//GEN-LAST:event_tblLoaiQuanAoMouseClicked

    private void txtTenLoaiQuanAoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenLoaiQuanAoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenLoaiQuanAoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JLabel lblMaLoaiQuanAo;
    private javax.swing.JLabel lblTenLoaiQuanAo;
    private javax.swing.JLabel lblTimLoaiQuanAo;
    private javax.swing.JLabel lblTitleLoaiQuanAo;
    private javax.swing.JPanel pnControl;
    private javax.swing.JPanel pnFields;
    private javax.swing.JPanel pnLeft;
    private javax.swing.JPanel pnRight;
    private javax.swing.JScrollPane scrLoaiQuanAo;
    private javax.swing.JTable tblLoaiQuanAo;
    private javax.swing.JTextField txtMaLoaiQuanAo;
    private javax.swing.JTextField txtTenLoaiQuanAo;
    private javax.swing.JTextField txtTimLoaiQuanAo;
    // End of variables declaration//GEN-END:variables
    private boolean statusBtnCapNhat = false;
    private boolean statusBtnThemMoi = false;
    private HashMap<String, String> dsLoaiQuanAo = new DAO_QuanAo(DatabaseConnect.getConnection()).getAllLoaiQuanAo();
    private DAO_QuanAo loaQuanAoCapNhat = null;
    int viTri = 0;
}
