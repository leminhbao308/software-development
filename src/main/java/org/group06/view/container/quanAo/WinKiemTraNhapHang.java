/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.group06.view.container.quanAo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.group06.db.DatabaseConstant;
import org.group06.db.dao.DAO_QuanAo;
import org.group06.model.entity.QuanAo;
import org.group06.model.manager.Manager_QuanAo;

/**
 *
 * @author Le Minh Bao
 */
public class WinKiemTraNhapHang extends javax.swing.JDialog {

    private Manager_QuanAo dsQuanLyQuanAo;
    private ArrayList<QuanAo> dsQAExcel;

    /**
     * Creates new form WinKiemTraNhapHang
     */
    public WinKiemTraNhapHang(Manager_QuanAo dsQuanLyQuanAo, ArrayList<QuanAo> dsQAExcel) {
        super();
        setModal(true);
        this.dsQuanLyQuanAo = dsQuanLyQuanAo;
        this.dsQAExcel = dsQAExcel;

        initComponents();
        DefaultTableModel modelQA = (DefaultTableModel) this.tblNhapHang.getModel();
        modelQA.setRowCount(0);
        for (QuanAo qa : this.dsQuanLyQuanAo.getAll()) {
            for (QuanAo qaExcels : dsQAExcel) {
                if (qa.getMaQA().equals(qaExcels.getMaQA())) {
                    Object[] data = {qa.getMaQA(), qa.getTenQA(),
                        qa.getSoLuong(), qaExcels.getSoLuong(), qaExcels.getSoLuong() + qa.getSoLuong()};
                    modelQA.addRow(data);
                }
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        scrNhapHang = new javax.swing.JScrollPane();
        tblNhapHang = new javax.swing.JTable();
        btnXacNhan = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 600));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Kiểm Tra Nhập Hàng");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        scrNhapHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hàng Hoá Đã Nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tblNhapHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Quần Áo", "Tên Quần Áo", "SL Trong Kho", "SL Nhập Thêm", "SL Sau Nhập"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrNhapHang.setViewportView(tblNhapHang);

        btnXacNhan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXacNhan.setText("Xác Nhận Nhập Hàng");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        btnHuy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHuy.setText("Huỷ Nhập Hàng");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                    .addComponent(scrNhapHang)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrNhapHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        for (QuanAo qa : this.dsQuanLyQuanAo.getAll()) {
            for (QuanAo qaExcels : dsQAExcel) {
                if (qa.getMaQA().equals(qaExcels.getMaQA())) {
                    int soLuuongQACapNhat = qaExcels.getSoLuong();
                    qaExcels.setSoLuong(soLuuongQACapNhat + qa.getSoLuong());
                    if (new DAO_QuanAo(DatabaseConstant.getConnection()).updateSoLuongQuanAo(qaExcels) && dsQuanLyQuanAo.updateSoLuong(qaExcels.getMaQA(), qaExcels.getSoLuong())) {
                        System.out.println("Cập Nhật thành công" + qa.getMaQA());

                    } else {
                        System.out.println("Cập Nhật thành công" + qa.getMaQA());
                    }
                }
            }
        }
        this.dispose();
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrNhapHang;
    private javax.swing.JTable tblNhapHang;
    // End of variables declaration//GEN-END:variables
}
