/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.container.khachHang;

import org.group06.db.DatabaseConstant;
import org.group06.db.dao.DAO_KhachHang;
import org.group06.model.entity.KhachHang;
import org.group06.utils.ColorConstant;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.group06.db.dao.DAO_ChiTietHoaDon;
import org.group06.db.dao.DAO_HoaDon;
import org.group06.model.entity.ChiTietHoaDon;
import org.group06.model.entity.HoaDon;

import org.group06.utils.FormatCellRenderer;
import org.group06.utils.NameStandard;
import org.group06.utils.NumberStandard;
//import org.group06.view.components.*;

/**
 *
 * @author Dell
 */
public class PanelKhachHang extends javax.swing.JPanel {

    private Connection connection = DatabaseConstant.getConnection();
    private DAO_KhachHang dao_KhachHang = new DAO_KhachHang(connection);
    private DAO_ChiTietHoaDon dao_CTHD = new DAO_ChiTietHoaDon(connection);
    private DAO_HoaDon dao_HoaDon = new DAO_HoaDon(connection);
    public int soMaKH = 0;

    /**
     * Creates new form PanelKhachHang
     */
    public PanelKhachHang() {
        initComponents();
        loadDataTable();
        FormatCellRenderer.formatCellRendererCenter(tblKhachHang, 0);
        FormatCellRenderer.formatCellRendererCenter(tblKhachHang, 2);
        FormatCellRenderer.formatCellRendererCenter(tblKhachHang, 3);
        FormatCellRenderer.formatCellRendererCenter(tblKhachHang, 4);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleTTKH = new javax.swing.JLabel();
        scrKhachHang = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        pnlTimKH = new javax.swing.JPanel();
        lblTimTheoTen = new javax.swing.JLabel();
        txtTimTheoTen = new javax.swing.JTextField();
        lblTimTheoSDT = new javax.swing.JLabel();
        txtTimTheoSDT = new javax.swing.JTextField();
        pnlThemKH = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();

        setToolTipText("");

        lblTitleTTKH.setBackground(new java.awt.Color(0, 0, 0));
        lblTitleTTKH.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitleTTKH.setForeground(ColorConstant.BLACK);
        lblTitleTTKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleTTKH.setText("Quản Lý Khách Hàng");

        scrKhachHang.setBorder(null);
        scrKhachHang.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrKhachHang.setFont(org.group06.utils.FontConstant.FONT_LABEL);

        tblKhachHang.setAutoCreateRowSorter(true);
        tblKhachHang.setFont(org.group06.utils.FontConstant.FONT_TEXT);
        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Số điện thoại", "Điểm tích lũy", "Hạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHang.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblKhachHang.setFillsViewportHeight(true);
        tblKhachHang.setGridColor(org.group06.utils.ColorConstant.BLACK);
        tblKhachHang.setRowHeight(50);
        tblKhachHang.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblKhachHang.setShowGrid(true);
        tblKhachHang.getTableHeader().setResizingAllowed(false);
        tblKhachHang.getTableHeader().setReorderingAllowed(false);
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        scrKhachHang.setViewportView(tblKhachHang);
        if (tblKhachHang.getColumnModel().getColumnCount() > 0) {
            tblKhachHang.getColumnModel().getColumn(0).setResizable(false);
            tblKhachHang.getColumnModel().getColumn(1).setResizable(false);
            tblKhachHang.getColumnModel().getColumn(2).setResizable(false);
            tblKhachHang.getColumnModel().getColumn(3).setResizable(false);
            tblKhachHang.getColumnModel().getColumn(4).setResizable(false);
        }

        pnlTimKH.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tìm Kiếm Khách Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lblTimTheoTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimTheoTen.setText("Tìm theo họ tên");

        txtTimTheoTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTimTheoTen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTimTheoTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimTheoTenKeyReleased(evt);
            }
        });

        lblTimTheoSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimTheoSDT.setText("Tìm theo số điện thoại");

        txtTimTheoSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTimTheoSDT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTimTheoSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimTheoSDTKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlTimKHLayout = new javax.swing.GroupLayout(pnlTimKH);
        pnlTimKH.setLayout(pnlTimKHLayout);
        pnlTimKHLayout.setHorizontalGroup(
            pnlTimKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTimTheoTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimTheoTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTimTheoSDT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimTheoSDT)
                .addContainerGap())
        );
        pnlTimKHLayout.setVerticalGroup(
            pnlTimKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTimKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblTimTheoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimTheoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTimTheoSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimTheoSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        pnlTimKHLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtTimTheoSDT, txtTimTheoTen});

        pnlThemKH.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thêm Khách Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlThemKHLayout = new javax.swing.GroupLayout(pnlThemKH);
        pnlThemKH.setLayout(pnlThemKHLayout);
        pnlThemKHLayout.setHorizontalGroup(
            pnlThemKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThemKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlThemKHLayout.setVerticalGroup(
            pnlThemKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThemKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleTTKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTimKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleTTKH, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTimKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimSDTActionPerformed

    }//GEN-LAST:event_txtTimSDTActionPerformed

    private void callFrameTTKhachHang() {
        WinTTKhachHang frTTKH = new WinTTKhachHang(this.getSelectedKH(), this);
        frTTKH.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frTTKH.setResizable(false);
        frTTKH.setVisible(true);
    }

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        if (evt.getClickCount() == 2) {
            callFrameTTKhachHang();
        }
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        callFrameThemKH();
    }//GEN-LAST:event_btnThemActionPerformed

    public String getMaKH() {
        int count = new DAO_KhachHang((DatabaseConstant.getConnection())).loadMaKHCount(soMaKH);
        count++;
        // Tạo mã khách hàng theo quy tắc và có thứ tự
        String customerID = "KH" + String.format("%03d", count); // Ví dụ: KH001, KH002,...
        soMaKH++; // Tăng biến đếm cho lần thêm khách hàng tiếp theo
        return customerID;
    }

    private void txtTimTheoTenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimTheoTenKeyReleased
        String tenKH = NameStandard.formatCapitalize(txtTimTheoTen.getText());
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!tenKH.equals("")) {
                if (checkRegexTenKH()) {
                    ArrayList<KhachHang> dsKH = dao_KhachHang.getAll();
                    DefaultTableModel modelKH = (DefaultTableModel) this.tblKhachHang.getModel();
                    modelKH.setRowCount(0);
                    for (KhachHang kh : dsKH) {
                        if (kh.getTenKH().equalsIgnoreCase(tenKH)) {
                            Object[] data = {kh.getMaKhachHang(), kh.getTenKH(), kh.getSoDienThoai(), kh.getDiemTichLuy(), kh.getHang()};
                            modelKH.addRow(data);
                        }
                    }
                    txtTimTheoSDT.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Nhập lại tên khách hàng cần tìm");
                    loadDataTable();
                }
            } else {
                loadDataTable();
            }
        }
    }//GEN-LAST:event_txtTimTheoTenKeyReleased

    private void txtTimTheoSDTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimTheoSDTKeyReleased
        String sdt = txtTimTheoSDT.getText();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!sdt.equals("")) {
                if (checkRegexSDT()) {
                    KhachHang kh = dao_KhachHang.getByID(sdt);
                    DefaultTableModel modelKH = (DefaultTableModel) this.tblKhachHang.getModel();
                    modelKH.setRowCount(0);
                    Object[] data = {kh.getMaKhachHang(), kh.getTenKH(), kh.getSoDienThoai(), kh.getDiemTichLuy(), kh.getHang()};
                    modelKH.addRow(data);
                    txtTimTheoTen.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Nhập lại số điện thoại cần tìm");
                    loadDataTable();
                    txtTimTheoSDT.setText("");
                    txtTimTheoSDT.requestFocus();
                }
            } else {
                loadDataTable();
            }
        }
    }//GEN-LAST:event_txtTimTheoSDTKeyReleased

    private boolean checkRegexTenKH() {
        String tenKH = txtTimTheoTen.getText().trim();
        if (tenKH.equals("") || !tenKH.matches("^[\\p{L}\\s]+$")) {
            return false;
        } else {
            return true;
        }
    }

    private boolean checkRegexSDT() {
        String sdt = txtTimTheoSDT.getText().trim();
        if (sdt.equals("") || !sdt.matches("0[1-9]{1}[0-9]{8}")) {
            return false;
        } else {
            return true;
        }
    }

    private void callFrameThemKH() {
        WinThemKH frThemKH = new WinThemKH(this);
        frThemKH.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frThemKH.setResizable(false);
        frThemKH.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel lblTimTheoSDT;
    private javax.swing.JLabel lblTimTheoTen;
    private javax.swing.JLabel lblTitleTTKH;
    private javax.swing.JPanel pnlThemKH;
    private javax.swing.JPanel pnlTimKH;
    private javax.swing.JScrollPane scrKhachHang;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtTimTheoSDT;
    private javax.swing.JTextField txtTimTheoTen;
    // End of variables declaration//GEN-END:variables

    private KhachHang getSelectedKH() {
        if (tblKhachHang.getSelectedRow() == -1) {
            return null;
        } else {
            return new KhachHang(
                    tblKhachHang.getValueAt(tblKhachHang.getSelectedRow(), 0).toString(),
                    tblKhachHang.getValueAt(tblKhachHang.getSelectedRow(), 1).toString(),
                    tblKhachHang.getValueAt(tblKhachHang.getSelectedRow(), 2).toString(),
                    (int) tblKhachHang.getValueAt(tblKhachHang.getSelectedRow(), 3),
                    tblKhachHang.getValueAt(tblKhachHang.getSelectedRow(), 4).toString());
        }
    }

    public void loadDataTable() {
        ArrayList<KhachHang> dsKH = dao_KhachHang.getAll();
        DefaultTableModel modelKH = (DefaultTableModel) this.tblKhachHang.getModel();
        modelKH.setRowCount(0);
        for (KhachHang kh : dsKH) {
            Object[] data = {kh.getMaKhachHang(), kh.getTenKH(), kh.getSoDienThoai(), getDiem(kh.getMaKhachHang()), hangKhachHang(kh.getMaKhachHang())};
            kh.setDiemTichLuy(getDiem(kh.getMaKhachHang()));
            kh.setHang(hangKhachHang(kh.getMaKhachHang()));
            if(dao_KhachHang.update(kh)){
            }
            modelKH.addRow(data);
        }
    }

    private int getDiem(String maKH) {
        double tinhTongThanhTien = 0, mucGiamGia = 0;
        ArrayList<HoaDon> dsHD = dao_HoaDon.getAll();
        for (HoaDon hd : dsHD) {
            if (hd.getKhachHang() != null) {
                if (hd.getKhachHang().getMaKhachHang().equals(maKH)) {
                    ArrayList<ChiTietHoaDon> dsCTHD = dao_CTHD.getAllCTQA(hd.getMaHoaDon());
                    for (ChiTietHoaDon cthd : dsCTHD) {
                        tinhTongThanhTien += cthd.getGiaBan() * cthd.getSoLuong();
                        if (cthd.getHoaDon().getKhuyenMai() != null) {
                            mucGiamGia = (cthd.getHoaDon().getKhuyenMai().getMucGiamGia()) / 100;
                        }
                    }
                }
            }
        }
        double tongTienSauVAT = tinhTongThanhTien * 1.08;
        double ttt = (tongTienSauVAT * (1.0f - mucGiamGia));
        DecimalFormat df = new DecimalFormat("##,###");
        String temp = df.format(ttt);
        int x = NumberStandard.parseInt(temp);
        return x;
    }

    private String hangKhachHang(String maKH) {
        String result;
        int temp = getDiem(maKH);
        if (temp < 1000000) {
            result = "";
        } else if (temp < 5000000) {
            result = "Đồng";
        } else if (temp < 10000000) {
            result = "Bạc";
        } else if (temp < 15000000) {
            result = "Vàng";
        } else if (temp < 20000000) {
            result = "Bạch Kim";
        } else {
            result = "Kim Cương";
        }
        return result;
    }
}
