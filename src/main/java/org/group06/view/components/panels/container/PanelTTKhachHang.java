/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.components.panels.container;

import org.group06.model.entity.KhachHang;
import org.group06.utils.ColorConstant;
import org.group06.utils.FontConstant;

import javax.swing.*;

/**
 *
 * @author Dell
 */
public class PanelTTKhachHang extends javax.swing.JPanel {
    private KhachHang kh;
    /**
     * Creates new form PanelTTKhachHang
     */
    public PanelTTKhachHang(KhachHang kh) {
        this.kh = kh;
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleCNKH = new javax.swing.JLabel();
        lblMaKH = new javax.swing.JLabel();
        lblTenKH = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        btnCapNhat = new org.group06.view.components.buttons.StaticRoundButton("", ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        btnXoaTrang = new org.group06.view.components.buttons.StaticRoundButton("", ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();

        setBackground(ColorConstant.BACKGROUND_CONTAINER);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitleCNKH.setFont(FontConstant.FONT_HEADER);
        lblTitleCNKH.setForeground(ColorConstant.WHITE);
        lblTitleCNKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleCNKH.setText("Cập Nhật Thông Tin Khách Hàng");

        lblMaKH.setFont(FontConstant.FONT_LABEL);
        lblMaKH.setText("Mã khách hàng:");

        lblTenKH.setFont(FontConstant.FONT_LABEL);
        lblTenKH.setText("Tên khách hàng:");

        lblSDT.setFont(FontConstant.FONT_LABEL);
        lblSDT.setText("Số điện thoại:");

        btnCapNhat.setFont(FontConstant.FONT_BUTTON);
        btnCapNhat.setForeground(ColorConstant.WHITE);
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoaTrang.setFont(FontConstant.FONT_BUTTON);
        btnXoaTrang.setForeground(ColorConstant.WHITE);
        btnXoaTrang.setText("Xóa trắng");
        btnXoaTrang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaTrang.setEnabled(false);
        btnXoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTrangActionPerformed(evt);
            }
        });

        txtMaKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaKH.setText(kh.getMaKhachHang());
        txtMaKH.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMaKH.setEnabled(false);
        txtMaKH.setPreferredSize(new java.awt.Dimension(71, 30));

        txtTenKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTenKH.setText(kh.getTenKH());
        txtTenKH.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTenKH.setEnabled(false);
        txtTenKH.setPreferredSize(new java.awt.Dimension(71, 30));

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSDT.setText(kh.getSoDienThoai());
        txtSDT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSDT.setEnabled(false);
        txtSDT.setPreferredSize(new java.awt.Dimension(71, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblTitleCNKH, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(lblSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(48, 48, 48))
                                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblTitleCNKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        if(btnCapNhat.getText().equals("Cập nhật")){
            btnCapNhat.setText("Lưu");
            txtTenKH.requestFocus();
            btnXoaTrang.setEnabled(true);
            txtTenKH.setEnabled(true);
            txtSDT.setEnabled(true);
        } else {
            if(txtTenKH.getText().equals("") || txtSDT.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập thông tin");
            } else {
                btnCapNhat.setText("Cập nhật");
                btnXoaTrang.setEnabled(false);
                txtTenKH.setEnabled(false);
                txtSDT.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        // TODO add your handling code here:
        xoaTrang();
    }//GEN-LAST:event_btnXoaTrangActionPerformed

    private void xoaTrang() {
        txtTenKH.setText("");
        txtSDT.setText("");
        txtTenKH.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblTitleCNKH;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
