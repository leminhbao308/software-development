/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.components.panels.container;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.group06.db.DatabaseConnect;
import org.group06.db.dao.DAO_KhuyenMai;
import org.group06.model.entity.KhuyenMai;
import org.group06.utils.ColorConstant;
import org.group06.utils.FontConstant;

/**
 *
 * @author lehoa
 */
public class PanelKhuyenMai extends javax.swing.JPanel {

    public PanelKhuyenMai() {
        initComponents();
        loadDataTable();
    }

    private void loadDataTable() {
        DefaultTableModel modelKhuyenMai = (DefaultTableModel) this.tblKhuyenMai.getModel();
        for (KhuyenMai km : this.dsKhuyenMai) {
            Object[] data = {km.getMaKhuyenMai(), km.getTenCTKM(), km.getMucGiamGia(), km.getSoLuotSuDung(), km.getNgayBatDau(), km.getNgayKetThuc()};
//      Thêm dữ liệu vào table
            modelKhuyenMai.addRow(data);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleKhuyenMai = new javax.swing.JLabel();
        lblTimKiemCTKM = new javax.swing.JLabel();
        txtTimCTKM = new javax.swing.JTextField();
        pnFields = new javax.swing.JPanel();
        pnLeft = new javax.swing.JPanel();
        txtMa = new javax.swing.JTextField();
        lblMa = new javax.swing.JLabel();
        lblTenCTKM = new javax.swing.JLabel();
        txtTenCTKM = new javax.swing.JTextField();
        lblMucGiamGia = new javax.swing.JLabel();
        txtMucGiamGia = new javax.swing.JTextField();
        pnRight = new javax.swing.JPanel();
        lblSoLuotSuDung = new javax.swing.JLabel();
        txtSoLuotSuDung = new javax.swing.JTextField();
        lblNgayBatDau = new javax.swing.JLabel();
        lblNgayKetThuc = new javax.swing.JLabel();
        dchNgayBatDau = new com.toedter.calendar.JDateChooser();
        dchNgayKetThuc = new com.toedter.calendar.JDateChooser();
        pnControl = new javax.swing.JPanel();
        btnXoaTrang = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        scrKhuyenMai = new javax.swing.JScrollPane();
        tblKhuyenMai = new javax.swing.JTable();

        setBackground(ColorConstant.WHITE);

        lblTitleKhuyenMai.setFont(org.group06.utils.FontConstant.FONT_HEADER);
        lblTitleKhuyenMai.setForeground(org.group06.utils.ColorConstant.BLACK);
        lblTitleKhuyenMai.setText("Chương Trình Khuyến Mãi");
        lblTitleKhuyenMai.setMaximumSize(new java.awt.Dimension(103, 110));
        lblTitleKhuyenMai.setMinimumSize(new java.awt.Dimension(103, 110));
        lblTitleKhuyenMai.setPreferredSize(new java.awt.Dimension(103, 110));

        lblTimKiemCTKM.setFont(FontConstant.FONT_LABEL);
        lblTimKiemCTKM.setText("Tìm Kiếm Chương Trình Khuyến Mãi");

        txtTimCTKM.setFont(FontConstant.FONT_TEXT);
        txtTimCTKM.setForeground(ColorConstant.WHITE);
        txtTimCTKM.setToolTipText("Nhập mã khuyến mãi cần tìm");
        txtTimCTKM.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTimCTKM.setMinimumSize(new java.awt.Dimension(64, 40));
        txtTimCTKM.setPreferredSize(new java.awt.Dimension(64, 50));
        txtTimCTKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimCTKMActionPerformed(evt);
            }
        });

        pnFields.setBackground(ColorConstant.BUTTON_HOVER);
        pnFields.setLayout(new java.awt.GridLayout(1, 2));

        pnLeft.setBackground(new java.awt.Color(204, 204, 204));

        txtMa.setFont(FontConstant.FONT_TEXT);

        lblMa.setFont(FontConstant.FONT_LABEL);
        lblMa.setText("Mã Khuyến Mãi:");

        lblTenCTKM.setFont(FontConstant.FONT_LABEL);
        lblTenCTKM.setText("Tên CTKM:");

        txtTenCTKM.setFont(FontConstant.FONT_TEXT);

        lblMucGiamGia.setFont(FontConstant.FONT_LABEL);
        lblMucGiamGia.setText("Mức Giảm Giá:");

        txtMucGiamGia.setFont(FontConstant.FONT_TEXT);

        javax.swing.GroupLayout pnLeftLayout = new javax.swing.GroupLayout(pnLeft);
        pnLeft.setLayout(pnLeftLayout);
        pnLeftLayout.setHorizontalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLeftLayout.createSequentialGroup()
                        .addComponent(lblMa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMa))
                    .addGroup(pnLeftLayout.createSequentialGroup()
                        .addComponent(lblTenCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenCTKM, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
                    .addGroup(pnLeftLayout.createSequentialGroup()
                        .addComponent(lblMucGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMucGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        pnLeftLayout.setVerticalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftLayout.createSequentialGroup()
                .addGroup(pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLeftLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblMa))
                    .addGroup(pnLeftLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenCTKM)
                    .addComponent(txtTenCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLeftLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblMucGiamGia))
                    .addComponent(txtMucGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pnFields.add(pnLeft);

        pnRight.setBackground(new java.awt.Color(204, 204, 204));

        lblSoLuotSuDung.setFont(FontConstant.FONT_LABEL);
        lblSoLuotSuDung.setText("Số Lượt Sử Dụng:");
        lblSoLuotSuDung.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblSoLuotSuDung.setMaximumSize(new java.awt.Dimension(91, 40));
        lblSoLuotSuDung.setMinimumSize(new java.awt.Dimension(91, 40));
        lblSoLuotSuDung.setPreferredSize(new java.awt.Dimension(170, 40));

        txtSoLuotSuDung.setFont(FontConstant.FONT_TEXT);

        lblNgayBatDau.setFont(FontConstant.FONT_LABEL);
        lblNgayBatDau.setText("Ngày Bắt Đầu:");

        lblNgayKetThuc.setFont(FontConstant.FONT_LABEL);
        lblNgayKetThuc.setText("Ngày Kết Thúc:");

        dchNgayBatDau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchNgayBatDau.setPreferredSize(new java.awt.Dimension(64, 29));
        dchNgayBatDau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dchNgayBatDauMouseClicked(evt);
            }
        });
        dchNgayBatDau.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchNgayBatDauPropertyChange(evt);
            }
        });

        dchNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchNgayKetThuc.setPreferredSize(new java.awt.Dimension(64, 29));
        dchNgayKetThuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dchNgayKetThucMouseClicked(evt);
            }
        });
        dchNgayKetThuc.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchNgayKetThucPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnRightLayout = new javax.swing.GroupLayout(pnRight);
        pnRight.setLayout(pnRightLayout);
        pnRightLayout.setHorizontalGroup(
            pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRightLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSoLuotSuDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoLuotSuDung)
                    .addComponent(dchNgayBatDau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addComponent(dchNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        pnRightLayout.setVerticalGroup(
            pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRightLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoLuotSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoLuotSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRightLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblNgayBatDau))
                    .addGroup(pnRightLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(dchNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRightLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblNgayKetThuc)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRightLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dchNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );

        dchNgayBatDau.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadBlackIcon(org.group06.utils.ImagePath.ICON_CALENDAR));

        dchNgayBatDau.getDateEditor().setEnabled(false);

        ((com.toedter.calendar.JTextFieldDateEditor) dchNgayBatDau.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);
        dchNgayBatDau.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadBlackIcon(org.group06.utils.ImagePath.ICON_CALENDAR));

        dchNgayBatDau.getDateEditor().setEnabled(false);

        ((com.toedter.calendar.JTextFieldDateEditor) dchNgayBatDau.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(32, 32, 32))
        );

        tblKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khuyến Mãi", "Tên CTKM", "Mức Giảm Giá", "Số Lượt Sử Dụng", "Ngày Bắt Đầu", "Ngày Kết Thúc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhuyenMai.setRowHeight(40);
        tblKhuyenMai.setShowGrid(true);
        tblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhuyenMaiMouseClicked(evt);
            }
        });
        scrKhuyenMai.setViewportView(tblKhuyenMai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnFields, javax.swing.GroupLayout.DEFAULT_SIZE, 1235, Short.MAX_VALUE)
                    .addComponent(pnControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitleKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTimKiemCTKM)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimCTKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(scrKhuyenMai))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTitleKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTimKiemCTKM))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtTimCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(pnFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimCTKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimCTKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimCTKMActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaTrangActionPerformed

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

//    Xử lý đưa dữ liệu từ row table lên fields
    private void tblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhuyenMaiMouseClicked
//        Lấy vị trí dòng click
        int vitri = this.tblKhuyenMai.getSelectedRow();
//      Lấy và set giá trị cho fields
        this.txtMa.setText(tblKhuyenMai.getValueAt(vitri, 0).toString());
        this.txtTenCTKM.setText(tblKhuyenMai.getValueAt(vitri, 1).toString());
        this.txtMucGiamGia.setText(tblKhuyenMai.getValueAt(vitri, 2).toString());
        this.txtSoLuotSuDung.setText(tblKhuyenMai.getValueAt(vitri, 3).toString());
//        this.txtNgayBatDau.setText(tblKhuyenMai.getValueAt(vitri, 4).toString());
//        this.txtNgayKetThuc.setText(tblKhuyenMai.getValueAt(vitri, 5).toString());

    }//GEN-LAST:event_tblKhuyenMaiMouseClicked

    private void dchNgayBatDauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dchNgayBatDauMouseClicked

    }//GEN-LAST:event_dchNgayBatDauMouseClicked

    private void dchNgayBatDauPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchNgayBatDauPropertyChange
        if (evt.getPropertyName().equals("date")) {
            java.util.Date date = dchNgayBatDau.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String formatDay = sdf.format(date.getTime());
//            if(date != null){
//                ArrayList<KhuyenMai> dsKM = new DAO_KhuyenMai((DatabaseConnect.getConnection())).getByDate(formatDay);
//                DefaultTableModel modelKH = (DefaultTableModel) this.tblHoaDon.getModel();
//                modelKH.setRowCount(0);
//                for (HoaDon hd : dsHD) {
//                    Object[] data = {hd.getMaHoaDon(), hd.getNgayTao(), hd.getKhachHang().getTenKH(), hd.getNhanVien().getTenNV(), 1, hd.getKhuyenMai().getTenCTKM()};
//                    modelKH.addRow(data);
//                }
//            } else
            loadDataTable();
        }
    }//GEN-LAST:event_dchNgayBatDauPropertyChange

    private void dchNgayKetThucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dchNgayKetThucMouseClicked

    }//GEN-LAST:event_dchNgayKetThucMouseClicked

    private void dchNgayKetThucPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchNgayKetThucPropertyChange
        if (evt.getPropertyName().equals("date")) {
            java.util.Date date = dchNgayKetThuc.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String formatDay = sdf.format(date.getTime());
//            if(date != null){
//                ArrayList<KhuyenMai> dsKM = new DAO_KhuyenMai((DatabaseConnect.getConnection())).getByDate(formatDay);
//                DefaultTableModel modelKH = (DefaultTableModel) this.tblHoaDon.getModel();
//                modelKH.setRowCount(0);
//                for (HoaDon hd : dsHD) {
//                    Object[] data = {hd.getMaHoaDon(), hd.getNgayTao(), hd.getKhachHang().getTenKH(), hd.getNhanVien().getTenNV(), 1, hd.getKhuyenMai().getTenCTKM()};
//                    modelKH.addRow(data);
//                }
//            } else
            loadDataTable();
        }
    }//GEN-LAST:event_dchNgayKetThucPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnXoaTrang;
    private com.toedter.calendar.JDateChooser dchNgayBatDau;
    private com.toedter.calendar.JDateChooser dchNgayKetThuc;
    private javax.swing.JLabel lblMa;
    private javax.swing.JLabel lblMucGiamGia;
    private javax.swing.JLabel lblNgayBatDau;
    private javax.swing.JLabel lblNgayKetThuc;
    private javax.swing.JLabel lblSoLuotSuDung;
    private javax.swing.JLabel lblTenCTKM;
    private javax.swing.JLabel lblTimKiemCTKM;
    private javax.swing.JLabel lblTitleKhuyenMai;
    private javax.swing.JPanel pnControl;
    private javax.swing.JPanel pnFields;
    private javax.swing.JPanel pnLeft;
    private javax.swing.JPanel pnRight;
    private javax.swing.JScrollPane scrKhuyenMai;
    private javax.swing.JTable tblKhuyenMai;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMucGiamGia;
    private javax.swing.JTextField txtSoLuotSuDung;
    private javax.swing.JTextField txtTenCTKM;
    private javax.swing.JTextField txtTimCTKM;
    // End of variables declaration//GEN-END:variables
    private ArrayList<KhuyenMai> dsKhuyenMai = new DAO_KhuyenMai(DatabaseConnect.getConnection()).getAll();
}
