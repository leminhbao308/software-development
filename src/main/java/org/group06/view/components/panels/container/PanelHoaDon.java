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

        lblTitleDSHoaDon = new javax.swing.JLabel();
        pnlTimHD = new javax.swing.JPanel();
        lblTimTheoTenKH = new javax.swing.JLabel();
        lblTimTheoNgay = new javax.swing.JLabel();
        txtTimTheoTenKH = new javax.swing.JTextField();
        txtTimTheoNgay = new javax.swing.JTextField();
        srcHoaDon = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();

        lblTitleDSHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblTitleDSHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleDSHoaDon.setText("Danh sách hóa đơn");

        pnlTimHD.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tìm Kiếm Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lblTimTheoTenKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimTheoTenKH.setText("Tìm theo tên khách hàng");

        lblTimTheoNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimTheoNgay.setText("Tìm theo ngày lập hóa đơn");

        txtTimTheoTenKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTimTheoTenKH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTimTheoTenKH.setPreferredSize(new java.awt.Dimension(64, 29));

        txtTimTheoNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTimTheoNgay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTimTheoNgay.setPreferredSize(new java.awt.Dimension(64, 29));

        javax.swing.GroupLayout pnlTimHDLayout = new javax.swing.GroupLayout(pnlTimHD);
        pnlTimHD.setLayout(pnlTimHDLayout);
        pnlTimHDLayout.setHorizontalGroup(
            pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimHDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTimTheoTenKH)
                .addGap(18, 18, 18)
                .addComponent(txtTimTheoTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTimTheoNgay)
                .addGap(18, 18, 18)
                .addComponent(txtTimTheoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnlTimHDLayout.setVerticalGroup(
            pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblTimTheoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTimTheoTenKH)
                    .addComponent(txtTimTheoTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimTheoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        srcHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tblHoaDon.setAutoCreateRowSorter(true);
        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"HD001", "11/12/2021", "Trần văn cường", "Bùi thị hoa", "120000"},
                {"HD002", "28/2/2023", "Nguyễn Thị Ly", "Trương Văn Toàn", "96000"}
            },
            new String [] {
                "Mã hóa đơn", "Ngày lập hóa đơn", "Tên khách hàng", "Tên nhân viên lập hóa đơn", "Tổng thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblHoaDon.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblHoaDon.setFillsViewportHeight(true);
        tblHoaDon.setGridColor(new java.awt.Color(0, 0, 0));
        tblHoaDon.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblHoaDon.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblHoaDon.setShowGrid(true);
        srcHoaDon.setViewportView(tblHoaDon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(srcHoaDon, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTimHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitleDSHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleDSHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTimHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(srcHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlTimHD.getAccessibleContext().setAccessibleName("Tìm Kiếm hóa đơn");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTimTheoNgay;
    private javax.swing.JLabel lblTimTheoTenKH;
    private javax.swing.JLabel lblTitleDSHoaDon;
    private javax.swing.JPanel pnlTimHD;
    private javax.swing.JScrollPane srcHoaDon;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtTimTheoNgay;
    private javax.swing.JTextField txtTimTheoTenKH;
    // End of variables declaration//GEN-END:variables
}
