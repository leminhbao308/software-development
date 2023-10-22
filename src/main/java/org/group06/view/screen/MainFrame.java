/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.group06.view.screen;

import org.group06.utils.ColorConstant;
import org.group06.utils.ImagePath;
import org.group06.view.components.panels.ImagePanel;
import org.group06.view.components.panels.container.*;

import javax.swing.*;
import java.awt.*;

/**
 * @author lehoa
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    public MainFrame() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpSelect = new javax.swing.ButtonGroup();
        pnSideBar = new javax.swing.JPanel();
        pnLogo = new ImagePanel(ImagePath.THUMBNAIL_LOGO, 150, 100);
        pnUser = new javax.swing.JPanel();
        lblAvatar = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        pnChucNang = new javax.swing.JPanel();
        btnBanHang = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE, ImagePath.ICON_SELL);
        btnQuanAo = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE, ImagePath.ICON_CLOTHES);
        btnHoaDon = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE, ImagePath.ICON_BILL);
        btnPhieuTam = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE, ImagePath.ICON_DRAFT);
        btnKhachHang = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE, ImagePath.ICON_CUSTOMER);
        btnNhanVien = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE, ImagePath.ICON_EMPLOYEE);
        btnNhaCungCap = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE, ImagePath.ICON_SUPPLIER);
        btnKhuyenMai = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE, ImagePath.ICON_SALE);
        spr03 = new javax.swing.JSeparator();
        btnThongKe = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE, ImagePath.ICON_CHART);
        btnDangXuat = new org.group06.view.components.buttons.SelectButton(ColorConstant.BACKGROUND_SIDEBAR, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK, ColorConstant.BUTTON_ACTIVE, ImagePath.ICON_LOGOUT);
        pnContainer = new PanelBanHang();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần Mềm Quản Lý Cửa Hàng");
        setIconImage(ImagePath.loadImage(ImagePath.THUMBNAIL_ICON)
        );

        pnSideBar.setBackground(ColorConstant.BACKGROUND_SIDEBAR);
        pnSideBar.setPreferredSize(new java.awt.Dimension(320, 781));

        pnLogo.setBackground(ColorConstant.BACKGROUND_SIDEBAR);
        pnLogo.setMaximumSize(new java.awt.Dimension(490, 166));
        pnLogo.setMinimumSize(new java.awt.Dimension(490, 166));
        pnLogo.setPreferredSize(new java.awt.Dimension(490, 166));

        javax.swing.GroupLayout pnLogoLayout = new javax.swing.GroupLayout(pnLogo);
        pnLogo.setLayout(pnLogoLayout);
        pnLogoLayout.setHorizontalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnLogoLayout.setVerticalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnUser.setBackground(ColorConstant.BUTTON_LOGIN_HOVER);
        pnUser.setPreferredSize(new java.awt.Dimension(320, 100));

        lblAvatar.setIcon(ImagePath.loadIcon(ImagePath.ICON_USER)
        );

        lblHoTen.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHoTen.setForeground(ColorConstant.WHITE);
        lblHoTen.setText("Le Minh Bao");

        lblChucVu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblChucVu.setForeground(ColorConstant.WHITE);
        lblChucVu.setText("Nhan Vien Ban Hang");

        javax.swing.GroupLayout pnUserLayout = new javax.swing.GroupLayout(pnUser);
        pnUser.setLayout(pnUserLayout);
        pnUserLayout.setHorizontalGroup(
            pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnUserLayout.setVerticalGroup(
            pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnUserLayout.createSequentialGroup()
                        .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblChucVu)
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnChucNang.setBackground(ColorConstant.BACKGROUND_SIDEBAR);
        pnChucNang.setPreferredSize(new java.awt.Dimension(320, 230));
        pnChucNang.setLayout(new java.awt.GridLayout(11, 1));

        grpSelect.add(btnBanHang);
        btnBanHang.setText("Bán Hàng");
        btnBanHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBanHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBanHang.setIconTextGap(15);
        btnBanHang.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });
        pnChucNang.add(btnBanHang);

        grpSelect.add(btnQuanAo);
        btnQuanAo.setText("Quần Áo");
        btnQuanAo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuanAo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuanAo.setIconTextGap(15);
        btnQuanAo.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnQuanAo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanAoActionPerformed(evt);
            }
        });
        pnChucNang.add(btnQuanAo);

        grpSelect.add(btnHoaDon);
        btnHoaDon.setText("Hoá Đơn");
        btnHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHoaDon.setIconTextGap(15);
        btnHoaDon.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });
        pnChucNang.add(btnHoaDon);

        grpSelect.add(btnPhieuTam);
        btnPhieuTam.setText("Phiếu Tạm");
        btnPhieuTam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPhieuTam.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPhieuTam.setIconTextGap(15);
        btnPhieuTam.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnPhieuTam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhieuTamActionPerformed(evt);
            }
        });
        pnChucNang.add(btnPhieuTam);

        grpSelect.add(btnKhachHang);
        btnKhachHang.setText("Khách Hàng");
        btnKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKhachHang.setIconTextGap(15);
        btnKhachHang.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });
        pnChucNang.add(btnKhachHang);

        grpSelect.add(btnNhanVien);
        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNhanVien.setIconTextGap(15);
        btnNhanVien.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        pnChucNang.add(btnNhanVien);

        grpSelect.add(btnNhaCungCap);
        btnNhaCungCap.setText("Nhà Cung Cấp");
        btnNhaCungCap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNhaCungCap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNhaCungCap.setIconTextGap(15);
        btnNhaCungCap.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaCungCapActionPerformed(evt);
            }
        });
        pnChucNang.add(btnNhaCungCap);

        grpSelect.add(btnKhuyenMai);
        btnKhuyenMai.setText("Khuyến Mãi");
        btnKhuyenMai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKhuyenMai.setIconTextGap(15);
        btnKhuyenMai.setMargin(new java.awt.Insets(2, 50, 3, 14));
        btnKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhuyenMaiActionPerformed(evt);
            }
        });
        pnChucNang.add(btnKhuyenMai);
        pnChucNang.add(spr03);

        grpSelect.add(btnThongKe);
        btnThongKe.setText("Thống Kê");
        btnThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongKe.setIconTextGap(15);
        btnThongKe.setMargin(new java.awt.Insets(2, 50, 3, 14));
        pnChucNang.add(btnThongKe);

        grpSelect.add(btnDangXuat);
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDangXuat.setIconTextGap(15);
        btnDangXuat.setMargin(new java.awt.Insets(2, 50, 3, 14));
        pnChucNang.add(btnDangXuat);

        javax.swing.GroupLayout pnSideBarLayout = new javax.swing.GroupLayout(pnSideBar);
        pnSideBar.setLayout(pnSideBarLayout);
        pnSideBarLayout.setHorizontalGroup(
            pnSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSideBarLayout.createSequentialGroup()
                .addGroup(pnSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnChucNang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnSideBarLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(pnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        pnSideBarLayout.setVerticalGroup(
            pnSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSideBarLayout.createSequentialGroup()
                .addComponent(pnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
        );

        getContentPane().add(pnSideBar, java.awt.BorderLayout.WEST);

        pnContainer.setBackground(ColorConstant.BACKGROUND_CONTAINER);

        javax.swing.GroupLayout pnContainerLayout = new javax.swing.GroupLayout(pnContainer);
        pnContainer.setLayout(pnContainerLayout);
        pnContainerLayout.setHorizontalGroup(
            pnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1402, Short.MAX_VALUE)
        );
        pnContainerLayout.setVerticalGroup(
            pnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 789, Short.MAX_VALUE)
        );

        getContentPane().add(pnContainer, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        getContentPane().remove(pnContainer);
        pnContainer = new PanelBanHang();
        getContentPane().add(pnContainer, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnBanHangActionPerformed

    private void btnQuanAoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanAoActionPerformed
        getContentPane().remove(pnContainer);
        pnContainer = new PanelQuanAo();
        getContentPane().add(pnContainer, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnQuanAoActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        getContentPane().remove(pnContainer);
        pnContainer = new PanelKhachHang();
        getContentPane().add(pnContainer, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        getContentPane().remove(pnContainer);
        pnContainer = new PanelNhanVien();
        getContentPane().add(pnContainer, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuyenMaiActionPerformed
        getContentPane().remove(pnContainer);
        pnContainer = new PanelKhuyenMai();
        getContentPane().add(pnContainer, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnKhuyenMaiActionPerformed

    private void btnNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaCungCapActionPerformed
        getContentPane().remove(pnContainer);
        pnContainer = new PanelNhaCungCap();
        getContentPane().add(pnContainer, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnNhaCungCapActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        getContentPane().remove(pnContainer);
        pnContainer = new PanelHoaDon();
        getContentPane().add(pnContainer, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnPhieuTamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhieuTamActionPerformed
        getContentPane().remove(pnContainer);
        pnContainer = new PanelPhieuTam();
        getContentPane().add(pnContainer, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnPhieuTamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBanHang;
    private javax.swing.JToggleButton btnDangXuat;
    private javax.swing.JToggleButton btnHoaDon;
    private javax.swing.JToggleButton btnKhachHang;
    private javax.swing.JToggleButton btnKhuyenMai;
    private javax.swing.JToggleButton btnNhaCungCap;
    private javax.swing.JToggleButton btnNhanVien;
    private javax.swing.JToggleButton btnPhieuTam;
    private javax.swing.JToggleButton btnQuanAo;
    private javax.swing.JToggleButton btnThongKe;
    private javax.swing.ButtonGroup grpSelect;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JPanel pnChucNang;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JPanel pnLogo;
    private javax.swing.JPanel pnSideBar;
    private javax.swing.JPanel pnUser;
    private javax.swing.JSeparator spr03;
    // End of variables declaration//GEN-END:variables
}
