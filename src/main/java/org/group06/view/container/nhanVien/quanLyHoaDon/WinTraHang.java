/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.group06.view.container.nhanVien.quanLyHoaDon;

import java.awt.Color;
import java.sql.Connection;
import org.group06.model.entity.ChiTietHoaDon;
import org.group06.utils.FontConstant;
import org.group06.utils.NumberStandard;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import org.group06.db.DatabaseConstant;
import org.group06.db.dao.DAO_ChiTietHoaDon;

/**
 *
 * @author Dell
 */
public class WinTraHang extends javax.swing.JFrame {

    private Connection connection = DatabaseConstant.getConnection();
    private ChiTietHoaDon cthd;
    private WinChiTietHoaDon winCTHD;
    private DAO_ChiTietHoaDon dao_ChiTietHoaDon = new DAO_ChiTietHoaDon(connection);

    /**
     * Creates new form CapNhatHoaDon
     */
    public WinTraHang(ChiTietHoaDon cthd, WinChiTietHoaDon winCTHD) {
        this.cthd = cthd;
        this.winCTHD = winCTHD;
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
        lblSLMua = new javax.swing.JLabel();
        txtSLTra = new javax.swing.JTextField();
        lblGiaTien = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        txtSLMua = new javax.swing.JTextField();
        lblSLTra = new javax.swing.JLabel();
        lblLiDo = new javax.swing.JLabel();
        srcLiDo = new javax.swing.JScrollPane();
        txaLiDo = new javax.swing.JTextArea();
        lblTienTraKhach = new javax.swing.JLabel();
        txtTienTraKhach = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitleTH.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblTitleTH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleTH.setText("Trả Hàng");

        lblMaQA.setFont(FontConstant.FONT_LABEL);
        lblMaQA.setText("Mã quần áo:");

        txtMaQA.setBackground(new java.awt.Color(242, 242, 242));
        txtMaQA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaQA.setText(cthd.getQuanAo().getMaQA());
        txtMaQA.setBorder(null);
        txtMaQA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMaQA.setEnabled(false);
        txtMaQA.setPreferredSize(new java.awt.Dimension(71, 30));

        lblTenQA.setFont(FontConstant.FONT_LABEL);
        lblTenQA.setText("Tên quần áo:");

        txtTenQA.setBackground(new java.awt.Color(242, 242, 242));
        txtTenQA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTenQA.setText(cthd.getQuanAo().getTenQA());
        txtTenQA.setBorder(null);
        txtTenQA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTenQA.setEnabled(false);
        txtTenQA.setPreferredSize(new java.awt.Dimension(71, 30));

        lblSize.setFont(FontConstant.FONT_LABEL);
        lblSize.setText("Size:");

        txtSize.setBackground(new java.awt.Color(242, 242, 242));
        txtSize.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSize.setText(cthd.getQuanAo().getKichThuoc());
        txtSize.setBorder(null);
        txtSize.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSize.setEnabled(false);
        txtSize.setPreferredSize(new java.awt.Dimension(71, 30));

        lblSLMua.setFont(FontConstant.FONT_LABEL);
        lblSLMua.setText("Số lượng đã mua:");

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
        double giaBan = cthd.getQuanAo().getGiaNhap() + (cthd.getQuanAo().getGiaNhap() * cthd.getQuanAo().getLoiNhuan() / 100);
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

        txtSLMua.setBackground(new java.awt.Color(242, 242, 242));
        txtSLMua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSLMua.setText(String.valueOf(winCTHD.getSoLuongDaMua()));
        txtSLMua.setBorder(null);
        txtSLMua.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSLMua.setEnabled(false);
        txtSLMua.setPreferredSize(new java.awt.Dimension(71, 30));

        lblSLTra.setFont(FontConstant.FONT_LABEL);
        lblSLTra.setText("Số lượng muốn trả:");

        lblLiDo.setFont(FontConstant.FONT_LABEL);
        lblLiDo.setText("Lí do trả hàng:");

        txaLiDo.setColumns(20);
        txaLiDo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txaLiDo.setRows(5);
        srcLiDo.setViewportView(txaLiDo);

        lblTienTraKhach.setFont(FontConstant.FONT_LABEL);
        lblTienTraKhach.setText("Số tiền cần trả cho khách hàng:");

        txtTienTraKhach.setBackground(new java.awt.Color(242, 242, 242));
        txtTienTraKhach.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTienTraKhach.setBorder(null);
        txtTienTraKhach.setCaretColor(new java.awt.Color(255, 0, 0));
        txtTienTraKhach.setDisabledTextColor(new java.awt.Color(255, 51, 51));
        txtTienTraKhach.setEnabled(false);
        txtTienTraKhach.setPreferredSize(new java.awt.Dimension(71, 30));

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblSLMua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblSize, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblMaQA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblTenQA, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtSLMua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLiDo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(srcLiDo, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTienTraKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTienTraKhach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
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
                            .addComponent(txtSLMua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSLMua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLiDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(srcLiDo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTienTraKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTienTraKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
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
            int soLuongTra = Integer.parseInt(txtSLTra.getText());
            double giaB = NumberStandard.parseMoney(txtGiaTien.getText());
            String x = null;
            if (checkSoLuong()) {
                double gia = giaB * soLuongTra;
                x = NumberStandard.formatMoney(gia);
                txtTienTraKhach.setText(x);
            } else {
                txtTienTraKhach.setText(" ");
            }
        }
    }//GEN-LAST:event_txtSLTraKeyReleased

    private void updateSLTra() {
        int soLuongTra = Integer.parseInt(txtSLTra.getText());
        int soLuongMua = winCTHD.getSoLuongDaMua();
        int temp = soLuongMua - soLuongTra;
        ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon(cthd.getQuanAo(), temp);
        if (dao_ChiTietHoaDon.updateSoLuong(chiTietHoaDon)) {
            if (temp == 0) {
                if (dao_ChiTietHoaDon.deleteSoLuong(cthd.getQuanAo().getMaQA(), cthd.getHoaDon().getMaHoaDon())) {
                }
            }
            JOptionPane.showMessageDialog(this, "Trả hàng thành công");
            winCTHD.loadDataTable();
        }
    }

    private boolean checkSoLuong() {
        int soLuongTra = Integer.parseInt(txtSLTra.getText());
        int soLuongMua = winCTHD.getSoLuongDaMua();
        if (soLuongTra > soLuongMua) {
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
    private javax.swing.JLabel lblSLMua;
    private javax.swing.JLabel lblSLTra;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblTenQA;
    private javax.swing.JLabel lblTienTraKhach;
    private javax.swing.JLabel lblTitleTH;
    private javax.swing.JScrollPane srcLiDo;
    private javax.swing.JTextArea txaLiDo;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMaQA;
    private javax.swing.JTextField txtSLMua;
    private javax.swing.JTextField txtSLTra;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtTenQA;
    private javax.swing.JTextField txtTienTraKhach;
    // End of variables declaration//GEN-END:variables
}
