/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.components.panels.container;

import java.awt.event.KeyEvent;
import org.group06.db.DatabaseConnect;
import org.group06.db.dao.DAO_NhanVien;
import org.group06.model.entity.NhanVien;
import org.group06.model.entity.PasswordRenderer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class PanelNhanVien extends javax.swing.JPanel {

    private DAO_NhanVien dao_NhanVien;
    public int soMaNV = 4;

    /**
     * Creates new form PanelNhanVien
     */
    public PanelNhanVien() {
        initComponents();
        loadDataTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpGioiTinh = new javax.swing.ButtonGroup();
        lblTitleTTNV = new javax.swing.JLabel();
        scrNhanVien = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        pnlTimNV = new javax.swing.JPanel();
        lblTimTheoTen = new javax.swing.JLabel();
        txtTimTheoTen = new javax.swing.JTextField();
        lblTimTheoMa = new javax.swing.JLabel();
        txtTimTheoMa = new javax.swing.JTextField();
        lblLocGioiTinh = new javax.swing.JLabel();
        cmbLocGioiTinh = new javax.swing.JComboBox<>();
        lblLocTrangThai = new javax.swing.JLabel();
        cmbLocTrangThai = new javax.swing.JComboBox<>();
        pnlThemNV = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();

        lblTitleTTNV.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitleTTNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleTTNV.setText("Quản Lý Nhân Viên");

        scrNhanVien.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblNhanVien.setAutoCreateRowSorter(true);
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Mật khẩu", "Giới tính", "Căn cước công dân", "Địa chỉ", "Số điện thoại", "Trạng thái", "Chức vụ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblNhanVien.setFillsViewportHeight(true);
        tblNhanVien.setGridColor(new java.awt.Color(0, 0, 0));
        tblNhanVien.setRowHeight(50);
        tblNhanVien.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblNhanVien.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblNhanVien.setShowGrid(true);
        tblNhanVien.getTableHeader().setResizingAllowed(false);
        tblNhanVien.getTableHeader().setReorderingAllowed(false);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        scrNhanVien.setViewportView(tblNhanVien);
        if (tblNhanVien.getColumnModel().getColumnCount() > 0) {
            tblNhanVien.getColumnModel().getColumn(0).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblNhanVien.getColumnModel().getColumn(1).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblNhanVien.getColumnModel().getColumn(2).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(3).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(4).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(4).setPreferredWidth(130);
            tblNhanVien.getColumnModel().getColumn(5).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblNhanVien.getColumnModel().getColumn(6).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(7).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(8).setResizable(false);
        }

        pnlTimNV.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tìm Kiếm Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lblTimTheoTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimTheoTen.setText("Tìm theo tên");

        txtTimTheoTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTimTheoTen.setToolTipText(null);
        txtTimTheoTen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTimTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimTheoTenActionPerformed(evt);
            }
        });
        txtTimTheoTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimTheoTenKeyReleased(evt);
            }
        });

        lblTimTheoMa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimTheoMa.setText("Tìm theo mã");

        txtTimTheoMa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTimTheoMa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTimTheoMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimTheoMaActionPerformed(evt);
            }
        });
        txtTimTheoMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimTheoMaKeyReleased(evt);
            }
        });

        lblLocGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLocGioiTinh.setText("Lọc Giới Tính");

        cmbLocGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbLocGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Nam", "Nữ" }));
        cmbLocGioiTinh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbLocGioiTinhItemStateChanged(evt);
            }
        });
        cmbLocGioiTinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbLocGioiTinhMouseClicked(evt);
            }
        });

        lblLocTrangThai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLocTrangThai.setText("Trạng Thái Công Việc");

        cmbLocTrangThai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbLocTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Làm việc", "Đã nghỉ" }));
        cmbLocTrangThai.setMinimumSize(new java.awt.Dimension(92, 31));
        cmbLocTrangThai.setPreferredSize(new java.awt.Dimension(92, 31));
        cmbLocTrangThai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbLocTrangThaiItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlTimNVLayout = new javax.swing.GroupLayout(pnlTimNV);
        pnlTimNV.setLayout(pnlTimNVLayout);
        pnlTimNVLayout.setHorizontalGroup(
            pnlTimNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimNVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTimNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTimTheoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTimTheoMa, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTimNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimTheoMa, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                    .addComponent(txtTimTheoTen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTimNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLocGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTimNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbLocTrangThai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLocGioiTinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlTimNVLayout.setVerticalGroup(
            pnlTimNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimNVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTimNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblLocGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimTheoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTimTheoTen)
                    .addComponent(cmbLocGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTimNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblTimTheoMa)
                    .addComponent(txtTimTheoMa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocTrangThai)
                    .addComponent(cmbLocTrangThai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlTimNVLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbLocGioiTinh, lblLocGioiTinh, lblLocTrangThai, lblTimTheoMa, lblTimTheoTen, txtTimTheoMa, txtTimTheoTen});

        pnlThemNV.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thêm Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThem.setText("Thêm Nhân Viên Mới");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlThemNVLayout = new javax.swing.GroupLayout(pnlThemNV);
        pnlThemNV.setLayout(pnlThemNVLayout);
        pnlThemNVLayout.setHorizontalGroup(
            pnlThemNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThemNVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlThemNVLayout.setVerticalGroup(
            pnlThemNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThemNVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrNhanVien, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitleTTNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTimNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleTTNV, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTimNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pnlThemNV, pnlTimNV});

    }// </editor-fold>//GEN-END:initComponents

    private NhanVien getSelectedNV() {
        boolean gioiTinh = false;
        if (tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 3).toString().equals("Nam")) {
            gioiTinh = true;
        }

        boolean trangThai = false;
        if (tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 7).toString().equals("Làm việc")) {
            trangThai = true;
        }

        if (tblNhanVien.getSelectedRow() == -1) {
            return null;
        } else {
            return new NhanVien(
                    tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 0).toString(),
                    tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 1).toString(),
                    tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 2).toString(),
                    gioiTinh,
                    tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 4).toString(),
                    tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 5).toString(),
                    tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 6).toString(),
                    trangThai,
                    tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 8).toString());
        }
    }

    private void callFrameTTNV() {
        FrameTTNV frTTNV = new FrameTTNV(this.getSelectedNV(), this);
        frTTNV.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frTTNV.setResizable(false);
        frTTNV.setVisible(true);
    }

    private void callFrameThemNV() {
        FrameThemNhanVien frThemNV = new FrameThemNhanVien(this);
        frThemNV.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frThemNV.setResizable(false);
        frThemNV.setVisible(true);
    }

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        if (evt.getClickCount() == 2) {
            callFrameTTNV();
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        callFrameThemNV();
    }//GEN-LAST:event_btnThemActionPerformed

    public String getMaNV() {
        int count = new DAO_NhanVien((DatabaseConnect.getConnection())).loadMaNVCount(soMaNV);
        count++;
        // Tạo mã nhân viên theo quy tắc và có thứ tự
        String customerID = "NV" + String.format("%03d", count); // Ví dụ: NV001, NV002,...
        soMaNV++; // Tăng biến đếm cho lần thêm nhân viên tiếp theo
        return customerID;
    }

    private void txtTimTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimTheoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimTheoTenActionPerformed

    private void txtTimTheoMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimTheoMaActionPerformed

    }//GEN-LAST:event_txtTimTheoMaActionPerformed

    private void txtTimTheoTenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimTheoTenKeyReleased
        String tenNV = txtTimTheoTen.getText();
        String gt = "Nữ", trangThai = "Đã nghỉ";
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!tenNV.equals("")) {
                if (checkRegexTenNV()) {
                    ArrayList<NhanVien> dsNV = new DAO_NhanVien((DatabaseConnect.getConnection())).getByName(tenNV);
                    DefaultTableModel modelKH = (DefaultTableModel) this.tblNhanVien.getModel();
                    modelKH.setRowCount(0);
                    for (NhanVien nv : dsNV) {
                        if (nv.isGioiTinh()) {
                            gt = "Nam";
                        }
                        if (nv.isTrangThai()) {
                            trangThai = "Làm việc";
                        }

                        Object[] data = {nv.getMaNV(), nv.getTenNV(), nv.getMatKhau(), gt, nv.getCccd(), nv.getDiaChi(), nv.getSoDienThoai(), trangThai, nv.getChucVu()};
                        modelKH.addRow(data);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Nhập lại tên nhân viên cần tìm");
                    loadDataTable();
                }
            } else {
                loadDataTable();
            }
        }
    }//GEN-LAST:event_txtTimTheoTenKeyReleased

    private boolean checkRegexTenNV() {
        String tenKH = txtTimTheoTen.getText().trim();
        if (tenKH.equals("") || !tenKH.matches("^[\\p{L}\\s]+$")) {
            return false;
        } else {
            return true;
        }
    }

    private boolean checkRegexMaNV() {
        String maNV = txtTimTheoMa.getText().trim();
        if (maNV.equals("") || !maNV.matches("^NV[0-9]{3}")) {
            return false;
        } else {
            return true;
        }
    }

    private void txtTimTheoMaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimTheoMaKeyReleased
        String maNV = txtTimTheoMa.getText();
        String gt = "Nữ", trangThai = "Đã nghỉ";
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!maNV.equals("")) {
                if (checkRegexMaNV()) {
                    NhanVien nhanVien = new DAO_NhanVien((DatabaseConnect.getConnection())).getByID(maNV);
                    DefaultTableModel modelKH = (DefaultTableModel) this.tblNhanVien.getModel();
                    modelKH.setRowCount(0);
                    if (nhanVien.isGioiTinh()) {
                        gt = "Nam";
                    }
                    if (nhanVien.isTrangThai()) {
                        trangThai = "Làm việc";
                    }
                    Object[] data = {nhanVien.getMaNV(), nhanVien.getTenNV(), nhanVien.getMatKhau(), gt,
                        nhanVien.getCccd(), nhanVien.getDiaChi(), nhanVien.getSoDienThoai(), trangThai, nhanVien.getChucVu()};
                    modelKH.addRow(data);
                } else {
                    JOptionPane.showMessageDialog(this, "Nhập lại mã nhân viên cần tìm");
                    loadDataTable();
                    txtTimTheoMa.setText("");
                    txtTimTheoMa.requestFocus();
                }
            } else {
                loadDataTable();
            }
        }
    }//GEN-LAST:event_txtTimTheoMaKeyReleased

    private void cmbLocGioiTinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbLocGioiTinhMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLocGioiTinhMouseClicked

    private void cmbLocGioiTinhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbLocGioiTinhItemStateChanged
        locTheoGioiTinh();
        locTheoTrangThaiVaGioiTinh();
    }//GEN-LAST:event_cmbLocGioiTinhItemStateChanged

    private void cmbLocTrangThaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbLocTrangThaiItemStateChanged
        locTheoTrangThai();
        locTheoTrangThaiVaGioiTinh();
    }//GEN-LAST:event_cmbLocTrangThaiItemStateChanged

    private void locTheoGioiTinh() {
        String selectedOption = cmbLocGioiTinh.getSelectedItem().toString();
        int phai;
        if (selectedOption.equals("Nam")) {
            phai = 1;
            getDataLocTheoPhai(selectedOption, phai);
        } else if (selectedOption.equals("Nữ")) {
            phai = 0;
            getDataLocTheoPhai(selectedOption, phai);
        } else {
            loadDataTable();
        }
    }

    private void getDataLocTheoPhai(String gt, int phai) {
        String trangThai;
        ArrayList<NhanVien> dsNV = new DAO_NhanVien((DatabaseConnect.getConnection())).getLocTheoPhai(phai);
        DefaultTableModel modelNV = (DefaultTableModel) this.tblNhanVien.getModel();
        modelNV.setRowCount(0);
        for (NhanVien nv : dsNV) {
            if (nv.isTrangThai()) {
                trangThai = "Làm việc";
            } else {
                trangThai = "Đã nghỉ";
            }
            Object[] data = {nv.getMaNV(), nv.getTenNV(), nv.getMatKhau(), gt, nv.getCccd(), nv.getDiaChi(), nv.getSoDienThoai(), trangThai, nv.getChucVu()};
            modelNV.addRow(data);
        }
    }

    private void locTheoTrangThai() {
        String selectedOption = cmbLocTrangThai.getSelectedItem().toString();
        int trangThai;
        if (selectedOption.equals("Làm việc")) {
            trangThai = 1;
            getDataLocTheoTrangThai(selectedOption, trangThai);
        } else if (selectedOption.equals("Đã nghỉ")) {
            trangThai = 0;
            getDataLocTheoTrangThai(selectedOption, trangThai);
        } else {
            loadDataTable();
        }
    }

    private void getDataLocTheoTrangThai(String trangThai, int tt) {
        String gt;
        ArrayList<NhanVien> dsNV = new DAO_NhanVien((DatabaseConnect.getConnection())).getLocTheoTrangThai(tt);
        DefaultTableModel modelNV = (DefaultTableModel) this.tblNhanVien.getModel();
        modelNV.setRowCount(0);
        for (NhanVien nv : dsNV) {
            if (nv.isGioiTinh()) {
                gt = "Nam";
            } else {
                gt = "Nữ";
            }
            Object[] data = {nv.getMaNV(), nv.getTenNV(), nv.getMatKhau(), gt, nv.getCccd(), nv.getDiaChi(), nv.getSoDienThoai(), trangThai, nv.getChucVu()};
            modelNV.addRow(data);
        }
    }

    private void locTheoTrangThaiVaGioiTinh() {
        String selectTrangThai = cmbLocTrangThai.getSelectedItem().toString();
        String selectGioiTinh = cmbLocGioiTinh.getSelectedItem().toString();
        int trangThai, gioiTinh;
        if (selectTrangThai.equals("Làm việc") && selectGioiTinh.equals("Nam")) {
            trangThai = 1;
            gioiTinh = 1;
            getDatalocTheoTrangThaiVaGioiTinh(selectTrangThai, trangThai, selectGioiTinh, gioiTinh);
        } else if (selectTrangThai.equals("Làm việc") && selectGioiTinh.equals("Nữ")) {
            trangThai = 1;
            gioiTinh = 0;
            getDatalocTheoTrangThaiVaGioiTinh(selectTrangThai, trangThai, selectGioiTinh, gioiTinh);
        } else if (selectTrangThai.equals("Đã nghỉ") && selectGioiTinh.equals("Nam")) {
            trangThai = 0;
            gioiTinh = 1;
            getDatalocTheoTrangThaiVaGioiTinh(selectTrangThai, trangThai, selectGioiTinh, gioiTinh);
        } else if (selectTrangThai.equals("Đã nghỉ") && selectGioiTinh.equals("Nữ")) {
            trangThai = 0;
            gioiTinh = 0;
            getDatalocTheoTrangThaiVaGioiTinh(selectTrangThai, trangThai, selectGioiTinh, gioiTinh);
        } else if (selectTrangThai.equals("Tất Cả") && selectGioiTinh.equals("Nam")) {
            getDataLocTheoPhai("Nam", 1);
        } else if (selectTrangThai.equals("Tất Cả") && selectGioiTinh.equals("Nữ")) {
            getDataLocTheoPhai("Nữ", 0);
        } else if (selectTrangThai.equals("Làm việc") && selectGioiTinh.equals("Tất Cả")) {
            getDataLocTheoTrangThai("Làm việc", 1);
        } else if (selectTrangThai.equals("Nghỉ việc") && selectGioiTinh.equals("Tất Cả")) {
            getDataLocTheoTrangThai("Nghỉ việc", 0);
        }
    }

    private void getDatalocTheoTrangThaiVaGioiTinh(String trangThai, int tt, String gioiTinh, int gt) {
        ArrayList<NhanVien> dsNV = new DAO_NhanVien((DatabaseConnect.getConnection())).getLocTheoTrangThaiVaGioiTinh(tt, gt);
        DefaultTableModel modelNV = (DefaultTableModel) this.tblNhanVien.getModel();
        modelNV.setRowCount(0);
        for (NhanVien nv : dsNV) {
            Object[] data = {nv.getMaNV(), nv.getTenNV(), nv.getMatKhau(), gioiTinh, nv.getCccd(), nv.getDiaChi(), nv.getSoDienThoai(), trangThai, nv.getChucVu()};
            modelNV.addRow(data);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cmbLocGioiTinh;
    private javax.swing.JComboBox<String> cmbLocTrangThai;
    private javax.swing.ButtonGroup grpGioiTinh;
    private javax.swing.JLabel lblLocGioiTinh;
    private javax.swing.JLabel lblLocTrangThai;
    private javax.swing.JLabel lblTimTheoMa;
    private javax.swing.JLabel lblTimTheoTen;
    private javax.swing.JLabel lblTitleTTNV;
    private javax.swing.JPanel pnlThemNV;
    private javax.swing.JPanel pnlTimNV;
    private javax.swing.JScrollPane scrNhanVien;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtTimTheoMa;
    private javax.swing.JTextField txtTimTheoTen;
    // End of variables declaration//GEN-END:variables

    public void loadDataTable() {
        String gioiTinh = "", trangThai = "";
        tblNhanVien.getColumnModel().getColumn(2).setCellRenderer(new PasswordRenderer());
        ArrayList<NhanVien> dsNV = new DAO_NhanVien((DatabaseConnect.getConnection())).getAll();
        DefaultTableModel modelNV = (DefaultTableModel) this.tblNhanVien.getModel();
        modelNV.setRowCount(0);
        for (NhanVien nv : dsNV) {
            if (nv.isGioiTinh()) {
                gioiTinh = "Nam";
            } else {
                gioiTinh = "Nữ";
            }

            if (nv.isTrangThai()) {
                trangThai = "Làm việc";
            } else {
                trangThai = "Đã nghỉ";
            }

            Object[] data = {nv.getMaNV(), nv.getTenNV(), nv.getMatKhau(), gioiTinh, nv.getCccd(), nv.getDiaChi(), nv.getSoDienThoai(), trangThai, nv.getChucVu()};
            modelNV.addRow(data);
        }
    }

}
