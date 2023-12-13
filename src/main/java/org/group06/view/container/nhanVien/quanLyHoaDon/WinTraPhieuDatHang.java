/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.group06.view.container.nhanVien.quanLyHoaDon;

import java.sql.Connection;
import org.group06.utils.FontConstant;
import org.group06.utils.NumberStandard;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import org.group06.db.DatabaseConstant;
import org.group06.db.dao.DAO_ChiTietPhieuDat;
import org.group06.db.dao.DAO_QuanAo;
import org.group06.model.entity.ChiTietPhieuDat;

/**
 *
 * @author Dell
 */
public class WinTraPhieuDatHang extends javax.swing.JFrame {

    private Connection connection = DatabaseConstant.getConnection();
    private ChiTietPhieuDat ctpd;
    private WinChiTietDonDatHang winCTPD;
    private PanelPhieuTam pnlPhieuTam;
    private DAO_ChiTietPhieuDat dao_ChiTietPhieuDat = new DAO_ChiTietPhieuDat(connection);
    private DAO_QuanAo dao_QuanAo = new DAO_QuanAo(connection);
    private HashMap<String, String> dsSize = new DAO_QuanAo(connection).getAllKichThuocQA();

    /**
     * Creates new form CapNhatHoaDon
     */
    public WinTraPhieuDatHang(ChiTietPhieuDat ctpd, WinChiTietDonDatHang winCTPD, PanelPhieuTam pnlPhieuTam) {
        this.ctpd = ctpd;
        this.winCTPD = winCTPD;
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

        lblTitleTH = new javax.swing.JLabel();
        lblMaQA = new javax.swing.JLabel();
        txtMaQA = new javax.swing.JTextField();
        lblTenQA = new javax.swing.JLabel();
        txtTenQA = new javax.swing.JTextField();
        lblSize = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        lblSLDat = new javax.swing.JLabel();
        txtSLTra = new javax.swing.JTextField();
        lblGiaTien = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        txtSLDat = new javax.swing.JTextField();
        lblSLTra = new javax.swing.JLabel();
        lblTienTraKhach = new javax.swing.JLabel();
        txtTienTraKhach = new javax.swing.JTextField();
        lblLiDo = new javax.swing.JLabel();
        txtLiDo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitleTH.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblTitleTH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleTH.setText("Trả Hàng Phiếu Đặt");

        lblMaQA.setFont(FontConstant.FONT_LABEL);
        lblMaQA.setText("Mã quần áo:");

        txtMaQA.setBackground(new java.awt.Color(242, 242, 242));
        txtMaQA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaQA.setText(ctpd.getQuanAo().getMaQA());
        txtMaQA.setBorder(null);
        txtMaQA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMaQA.setEnabled(false);
        txtMaQA.setPreferredSize(new java.awt.Dimension(71, 30));

        lblTenQA.setFont(FontConstant.FONT_LABEL);
        lblTenQA.setText("Tên quần áo:");

        txtTenQA.setBackground(new java.awt.Color(242, 242, 242));
        txtTenQA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTenQA.setText(ctpd.getQuanAo().getTenQA());
        txtTenQA.setBorder(null);
        txtTenQA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTenQA.setEnabled(false);
        txtTenQA.setPreferredSize(new java.awt.Dimension(71, 30));

        lblSize.setFont(FontConstant.FONT_LABEL);
        lblSize.setText("Size:");

        txtSize.setBackground(new java.awt.Color(242, 242, 242));
        txtSize.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSize.setBorder(null);
        txtSize.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSize.setEnabled(false);
        txtSize.setPreferredSize(new java.awt.Dimension(71, 30));
        String size = "";
        for (Map.Entry<String, String> item : dsSize.entrySet()) {
            if(item.getKey().equals(ctpd.getQuanAo().getMaKichThuoc())) {
                size = item.getValue();
                break;
            }
        }
        txtSize.setText(size);

        lblSLDat.setFont(FontConstant.FONT_LABEL);
        lblSLDat.setText("Số lượng đã đặt:");

        txtSLTra.setBackground(new java.awt.Color(242, 242, 242));
        txtSLTra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSLTra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSLTra.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSLTra.setPreferredSize(new java.awt.Dimension(71, 30));
        txtSLTra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSLTraKeyReleased(evt);
            }
        });

        lblGiaTien.setFont(FontConstant.FONT_LABEL);
        lblGiaTien.setText("Giá tiền:");

        txtGiaTien.setBackground(new java.awt.Color(242, 242, 242));
        txtGiaTien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        double giaBan = ctpd.getQuanAo().getGiaNhap() + (ctpd.getQuanAo().getGiaNhap() * ctpd.getQuanAo().getLoiNhuan() / 100);
        String formatGiaBan = NumberStandard.formatMoney(giaBan);
        txtGiaTien.setText(formatGiaBan);
        txtGiaTien.setBorder(null);
        txtGiaTien.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtGiaTien.setEnabled(false);
        txtGiaTien.setPreferredSize(new java.awt.Dimension(71, 30));

        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        txtSLDat.setBackground(new java.awt.Color(242, 242, 242));
        txtSLDat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSLDat.setText(String.valueOf(winCTPD.getSoLuongDaDat()));
        txtSLDat.setBorder(null);
        txtSLDat.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSLDat.setEnabled(false);
        txtSLDat.setPreferredSize(new java.awt.Dimension(71, 30));

        lblSLTra.setFont(FontConstant.FONT_LABEL);
        lblSLTra.setText("Số lượng muốn trả:");

        lblTienTraKhach.setFont(FontConstant.FONT_LABEL);
        lblTienTraKhach.setText("Số tiền cần trả cho khách hàng (nếu có):");

        txtTienTraKhach.setBackground(new java.awt.Color(242, 242, 242));
        txtTienTraKhach.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTienTraKhach.setBorder(null);
        txtTienTraKhach.setCaretColor(new java.awt.Color(255, 0, 0));
        txtTienTraKhach.setDisabledTextColor(new java.awt.Color(255, 51, 51));
        txtTienTraKhach.setEnabled(false);
        txtTienTraKhach.setPreferredSize(new java.awt.Dimension(71, 30));

        lblLiDo.setFont(FontConstant.FONT_LABEL);
        lblLiDo.setText("Lí do trả hàng:");

        txtLiDo.setBackground(new java.awt.Color(242, 242, 242));
        txtLiDo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLiDo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtLiDo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtLiDo.setPreferredSize(new java.awt.Dimension(71, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleTH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTienTraKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTienTraKhach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblLiDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSLDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSize, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(lblMaQA, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(lblTenQA, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtSLDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(lblSLTra, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                                    .addComponent(lblGiaTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtSLTra, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                                    .addComponent(txtGiaTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(txtTenQA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtMaQA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(txtLiDo, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleTH, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaQA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaQA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenQA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenQA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSLTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSLTra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSLDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSLDat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLiDo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLiDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTienTraKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTienTraKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if (txtSLTra.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập số lượng cần trả");
        } else if (!txtSLTra.getText().matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(this, "Không được nhập chữ");
            txtSLTra.requestFocus();
        } else if (!checkSoLuong()) {
            JOptionPane.showMessageDialog(this, "Số lượng trả không hợp lệ");
            txtSLTra.requestFocus();
        } else {
            updateSLTra();
            this.dispose();
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void txtSLTraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSLTraKeyReleased
        if (!txtSLTra.getText().equals("")) {
            int tt = winCTPD.getTrangThaiThanhToan();
            if (tt == 1) {
                int soLuongTra = Integer.parseInt(txtSLTra.getText());
                double giaB = NumberStandard.parseMoney(txtGiaTien.getText());
                String x = null;
                if (checkSoLuong()) {
                    double gia = giaB * soLuongTra;
                    x = NumberStandard.formatMoney(gia);
                    txtTienTraKhach.setText(x);
                }
            } else {
                txtTienTraKhach.setText(" ");
            }
        }
    }//GEN-LAST:event_txtSLTraKeyReleased

    private void updateSLTra() {
        String ghiChu = txtLiDo.getText();
        int soLuongTra = Integer.parseInt(txtSLTra.getText());
        int soLuongDat = winCTPD.getSoLuongDaDat();
        int temp = soLuongDat - soLuongTra;
        ChiTietPhieuDat chiTietPhieuDat = new ChiTietPhieuDat(ctpd.getQuanAo(), temp, ghiChu);
        if (dao_ChiTietPhieuDat.updateSoLuong(chiTietPhieuDat)) {
            dao_QuanAo.hoanTraQuanAo(ctpd.getQuanAo().getMaQA(), soLuongTra);
            JOptionPane.showMessageDialog(this, "Trả hàng thành công");
            winCTPD.loadDataTable();
            pnlPhieuTam.loadDataTable();
        }
    }

    private boolean checkSoLuong() {
        int soLuongTra = Integer.parseInt(txtSLTra.getText());
        int soLuongDat = winCTPD.getSoLuongDaDat();
        if (soLuongTra > soLuongDat) {
            return false;
        } else {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JLabel lblGiaTien;
    private javax.swing.JLabel lblLiDo;
    private javax.swing.JLabel lblMaQA;
    private javax.swing.JLabel lblSLDat;
    private javax.swing.JLabel lblSLTra;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblTenQA;
    private javax.swing.JLabel lblTienTraKhach;
    private javax.swing.JLabel lblTitleTH;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtLiDo;
    private javax.swing.JTextField txtMaQA;
    private javax.swing.JTextField txtSLDat;
    private javax.swing.JTextField txtSLTra;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtTenQA;
    private javax.swing.JTextField txtTienTraKhach;
    // End of variables declaration//GEN-END:variables
}
