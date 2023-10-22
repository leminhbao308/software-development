/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.components.panels.container;

import org.group06.utils.ColorConstant;
import org.group06.utils.FontConstant;
import org.group06.utils.ImagePath;

/**
 *
 * @author Le Minh Bao
 */
public class PanelHoaDon extends javax.swing.JPanel {

    /**
     * Creates new form PanelHoaDon
     */
    public PanelHoaDon() {
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

        lblTitleHoaDon = new javax.swing.JLabel();
        btnTimMaHoaDon = new org.group06.view.components.buttons.StaticRoundButton("", ImagePath.ICON_SEARCH, ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        txtTimMaHoaDon = new org.group06.view.components.textFields.TextField("Mã hoá đơn cần tìm", ColorConstant.BLACK);
        scrHoaDon = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();

        setBackground(ColorConstant.BACKGROUND_CONTAINER);

        lblTitleHoaDon.setFont(org.group06.utils.FontConstant.FONT_HEADER);
        lblTitleHoaDon.setForeground(org.group06.utils.ColorConstant.WHITE);
        lblTitleHoaDon.setText("Thông Tin Hoá Đơn");

        btnTimMaHoaDon.setToolTipText("Click để tìm kiếm khách hàng");
        btnTimMaHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimMaHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtTimMaHoaDon.setFont(FontConstant.FONT_TEXT);
        txtTimMaHoaDon.setToolTipText("Nhập mã hoá đơn cần tìm");
        txtTimMaHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimMaHoaDonActionPerformed(evt);
            }
        });

        tblHoaDon.setAutoCreateRowSorter(true);
        tblHoaDon.setBackground(org.group06.utils.ColorConstant.BACKGROUND_NORMAL);
        tblHoaDon.setFont(org.group06.utils.FontConstant.FONT_TEXT);
        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã hoá đơn", "Ngày tạo hoá đơn", "Tên khách hàng", "Nhân viên lập hoá đơn", "Tổng thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblHoaDon.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblHoaDon.setFillsViewportHeight(true);
        tblHoaDon.setGridColor(org.group06.utils.ColorConstant.BLACK);
        tblHoaDon.setRowHeight(50);
        tblHoaDon.setSelectionBackground(org.group06.utils.ColorConstant.BACKGROUND_SIDEBAR);
        tblHoaDon.setSelectionForeground(org.group06.utils.ColorConstant.WHITE);
        tblHoaDon.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblHoaDon.setShowGrid(false);
        tblHoaDon.setShowHorizontalLines(true);
        tblHoaDon.getTableHeader().setResizingAllowed(false);
        tblHoaDon.getTableHeader().setReorderingAllowed(false);
        scrHoaDon.setViewportView(tblHoaDon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitleHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTimMaHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTimMaHoaDon)
                    .addComponent(lblTitleHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimMaHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimMaHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimMaHoaDonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimMaHoaDon;
    private javax.swing.JLabel lblTitleHoaDon;
    private javax.swing.JScrollPane scrHoaDon;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtTimMaHoaDon;
    // End of variables declaration//GEN-END:variables
}