/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.group06.view.components.panels.container;

import java.text.SimpleDateFormat;
import org.group06.model.entity.HoaDon;
import org.group06.model.entity.KhachHang;
import org.group06.model.entity.KhuyenMai;
import org.group06.model.entity.NhanVien;
import org.group06.model.entity.PhieuDat;
import org.group06.utils.FontConstant;
/**
 *
 * @author Dell
 */
public class FrameChiTietDonDatHang extends javax.swing.JFrame {
    private PhieuDat phieuDat;
    private PanelPhieuTam pnlPhieuTam;
    /**
     * Creates new form FrameChiTietDonDatHang
     */
    public FrameChiTietDonDatHang(PhieuDat phieuDat, PanelPhieuTam pnlPhieuTam) {
        this.phieuDat = phieuDat;
        this.pnlPhieuTam = pnlPhieuTam;
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

        pnlDSQA = new javax.swing.JPanel();
        srcQuanAo = new javax.swing.JScrollPane();
        tblDSQuanAo = new javax.swing.JTable();
        pnlTTPD = new javax.swing.JPanel();
        lblMaCTPD = new javax.swing.JLabel();
        lblTenKH = new javax.swing.JLabel();
        lblTenCTKM = new javax.swing.JLabel();
        lblNgayTao = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        txtMaCTPD = new javax.swing.JTextField();
        lblTongTT = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();
        txtKH = new javax.swing.JTextField();
        txtNV = new javax.swing.JTextField();
        txtTenCTKM = new javax.swing.JTextField();
        txtTongTT = new javax.swing.JTextField();
        lblNgayNhan = new javax.swing.JLabel();
        txtNgayNhan = new javax.swing.JTextField();
        lblTitleCTPD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlDSQA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách quần áo đã đặt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        tblDSQuanAo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tblDSQuanAo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên quần áo", "Giá tiền", "Số lượng", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSQuanAo.setRowHeight(30);
        srcQuanAo.setViewportView(tblDSQuanAo);
        if (tblDSQuanAo.getColumnModel().getColumnCount() > 0) {
            tblDSQuanAo.getColumnModel().getColumn(0).setResizable(false);
            tblDSQuanAo.getColumnModel().getColumn(1).setResizable(false);
            tblDSQuanAo.getColumnModel().getColumn(2).setResizable(false);
            tblDSQuanAo.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout pnlDSQALayout = new javax.swing.GroupLayout(pnlDSQA);
        pnlDSQA.setLayout(pnlDSQALayout);
        pnlDSQALayout.setHorizontalGroup(
            pnlDSQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(srcQuanAo, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlDSQALayout.setVerticalGroup(
            pnlDSQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(srcQuanAo, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        lblMaCTPD.setFont(FontConstant.FONT_LABEL);
        lblMaCTPD.setText("Mã chi tiết phiếu đặt:");

        lblTenKH.setFont(FontConstant.FONT_LABEL);
        lblTenKH.setText("Tên khách hàng:");

        lblTenCTKM.setFont(FontConstant.FONT_LABEL);
        lblTenCTKM.setText("Tên chương trình KM (Nếu có):");

        lblNgayTao.setFont(FontConstant.FONT_LABEL);
        lblNgayTao.setText("Ngày tạo phiếu đặt:");

        lblTenNV.setFont(FontConstant.FONT_LABEL);
        lblTenNV.setText("Nhân viên lập phiếu đặt:");

        txtMaCTPD.setBackground(new java.awt.Color(242, 242, 242));
        txtMaCTPD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaCTPD.setText(phieuDat.getMaPhieuDat());
        txtMaCTPD.setBorder(null);
        txtMaCTPD.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMaCTPD.setEnabled(false);
        txtMaCTPD.setPreferredSize(new java.awt.Dimension(71, 30));
        txtMaCTPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaCTPDActionPerformed(evt);
            }
        });

        lblTongTT.setFont(FontConstant.FONT_LABEL);
        lblTongTT.setText("Tổng thành tiền phải trả:");

        txtNgayTao.setBackground(new java.awt.Color(242, 242, 242));
        txtNgayTao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNgayTao.setBorder(null);
        txtNgayTao.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNgayTao.setEnabled(false);
        txtNgayTao.setPreferredSize(new java.awt.Dimension(71, 30));
        txtNgayTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayTaoActionPerformed(evt);
            }
        });

        txtKH.setBackground(new java.awt.Color(242, 242, 242));
        txtKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtKH.setText(phieuDat.getKhachHang().getTenKH());
        txtKH.setBorder(null);
        txtKH.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtKH.setEnabled(false);
        txtKH.setPreferredSize(new java.awt.Dimension(71, 30));
        txtKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKHActionPerformed(evt);
            }
        });

        txtNV.setBackground(new java.awt.Color(242, 242, 242));
        txtNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNV.setText(phieuDat.getNhanVien().getTenNV());
        txtNV.setBorder(null);
        txtNV.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNV.setEnabled(false);
        txtNV.setPreferredSize(new java.awt.Dimension(71, 30));
        txtNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNVActionPerformed(evt);
            }
        });

        txtTenCTKM.setBackground(new java.awt.Color(242, 242, 242));
        txtTenCTKM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTenCTKM.setText(phieuDat.getKhuyenMai().getTenCTKM());
        txtTenCTKM.setBorder(null);
        txtTenCTKM.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTenCTKM.setEnabled(false);
        txtTenCTKM.setPreferredSize(new java.awt.Dimension(71, 30));
        txtTenCTKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenCTKMActionPerformed(evt);
            }
        });

        txtTongTT.setBackground(new java.awt.Color(242, 242, 242));
        txtTongTT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTongTT.setBorder(null);
        txtTongTT.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtTongTT.setEnabled(false);
        txtTongTT.setPreferredSize(new java.awt.Dimension(71, 30));
        txtTongTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTTActionPerformed(evt);
            }
        });

        lblNgayNhan.setFont(FontConstant.FONT_LABEL);
        lblNgayNhan.setText("Ngày lấy quần áo:");

        txtNgayNhan.setBackground(new java.awt.Color(242, 242, 242));
        txtNgayNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNgayNhan.setBorder(null);
        txtNgayNhan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNgayNhan.setEnabled(false);
        txtNgayNhan.setPreferredSize(new java.awt.Dimension(71, 30));
        txtNgayNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTTPDLayout = new javax.swing.GroupLayout(pnlTTPD);
        pnlTTPD.setLayout(pnlTTPDLayout);
        pnlTTPDLayout.setHorizontalGroup(
            pnlTTPDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTTPDLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(pnlTTPDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTenCTKM, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(lblTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNgayNhan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNgayTao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMaCTPD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTongTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(pnlTTPDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTenCTKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTongTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaCTPD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNgayNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        pnlTTPDLayout.setVerticalGroup(
            pnlTTPDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTTPDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTTPDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaCTPD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaCTPD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTTPDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTTPDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTTPDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTTPDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlTTPDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTTPDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTongTT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // Chuyển đổi thành chuỗi
        String dateString = dateFormat.format(phieuDat.getNgayTao());
        txtNgayTao.setText(dateString);
        SimpleDateFormat dateFormatNhan = new SimpleDateFormat("dd/MM/yyyy");
        // Chuyển đổi thành chuỗi
        String dateStringNhan = dateFormatNhan.format(phieuDat.getNgayNhan());
        txtNgayNhan.setText(dateStringNhan);

        lblTitleCTPD.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblTitleCTPD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleCTPD.setText("Chi Tiết Phiếu Đặt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(lblTitleCTPD, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addGap(115, 115, 115))
            .addComponent(pnlDSQA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTTPD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblTitleCTPD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTTPD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDSQA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaCTPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaCTPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaCTPDActionPerformed

    private void txtNgayTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayTaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayTaoActionPerformed

    private void txtKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKHActionPerformed

    private void txtNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNVActionPerformed

    private void txtTenCTKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenCTKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenCTKMActionPerformed

    private void txtTongTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTTActionPerformed

    private void txtNgayNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayNhanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblMaCTPD;
    private javax.swing.JLabel lblNgayNhan;
    private javax.swing.JLabel lblNgayTao;
    private javax.swing.JLabel lblTenCTKM;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblTitleCTPD;
    private javax.swing.JLabel lblTongTT;
    private javax.swing.JPanel pnlDSQA;
    private javax.swing.JPanel pnlTTPD;
    private javax.swing.JScrollPane srcQuanAo;
    private javax.swing.JTable tblDSQuanAo;
    private javax.swing.JTextField txtKH;
    private javax.swing.JTextField txtMaCTPD;
    private javax.swing.JTextField txtNV;
    private javax.swing.JTextField txtNgayNhan;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtTenCTKM;
    private javax.swing.JTextField txtTongTT;
    // End of variables declaration//GEN-END:variables
}