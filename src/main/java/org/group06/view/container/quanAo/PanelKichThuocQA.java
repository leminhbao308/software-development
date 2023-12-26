package org.group06.view.container.quanAo;

import org.group06.db.DatabaseConstant;
import org.group06.db.dao.DAO_QuanAo;
import org.group06.utils.ColorConstant;
import org.group06.utils.ComponentStatus;
import org.group06.utils.FontConstant;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import org.group06.utils.FormatCellRenderer;

/**
 * @author lehoangnam
 */
public class PanelKichThuocQA extends javax.swing.JPanel {

    /**
     * Creates new form PanelKichThuocQA
     */
    public PanelKichThuocQA() {
        initComponents();
        loadDataTable();
        FormatCellRenderer.formatCellRendererCenter(tblKichThuocQA, 0);
        FormatCellRenderer.formatCellRendererCenter(tblKichThuocQA, 1);
        setStatusAllBtnsStart();
    }

    public void setStatusAllBtnsStart() {
        java.util.List<JButton> listBtn = java.util.Arrays.asList(this.btnHuy, this.btnXoaTrang, this.btnCapNhat, this.btnLuu);
        ComponentStatus.setStatusBtn(listBtn, false);
        ComponentStatus.setStatusBtn(this.btnThemMoi, true);
    }

    private void loadDataTable() {
        DefaultTableModel modelKichThuocQuanAo = (DefaultTableModel) this.tblKichThuocQA.getModel();
        modelKichThuocQuanAo.setRowCount(0);
        for (HashMap.Entry<String, String> item : dsKichThuocQuanAo.entrySet()) {
            Object[] data = {item.getKey(), item.getValue()};
            modelKichThuocQuanAo.addRow(data);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleKichThuocQA = new javax.swing.JLabel();
        pnFields = new javax.swing.JPanel();
        pnLeft = new javax.swing.JPanel();
        txtMaKichThuocQA = new javax.swing.JTextField();
        lblMaKichThuocQA = new javax.swing.JLabel();
        pnRight = new javax.swing.JPanel();
        lblTenKichThuocQA = new javax.swing.JLabel();
        txtTenKichThuocQA = new javax.swing.JTextField();
        pnControl = new javax.swing.JPanel();
        btnXoaTrang = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        scrKichThuocQA = new javax.swing.JScrollPane();
        tblKichThuocQA = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitleKichThuocQA.setFont(org.group06.utils.FontConstant.FONT_HEADER);
        lblTitleKichThuocQA.setForeground(org.group06.utils.ColorConstant.BLACK);
        lblTitleKichThuocQA.setText("Kích Thước Quần Áo");
        lblTitleKichThuocQA.setMaximumSize(new java.awt.Dimension(103, 110));
        lblTitleKichThuocQA.setMinimumSize(new java.awt.Dimension(103, 110));
        lblTitleKichThuocQA.setPreferredSize(new java.awt.Dimension(103, 110));

        pnFields.setBackground(ColorConstant.BUTTON_HOVER);
        pnFields.setLayout(new java.awt.GridLayout(1, 2));

        pnLeft.setBackground(new java.awt.Color(204, 204, 204));

        txtMaKichThuocQA.setBackground(new java.awt.Color(102, 102, 102));
        txtMaKichThuocQA.setFont(FontConstant.FONT_TEXT);
        txtMaKichThuocQA.setForeground(new java.awt.Color(255, 255, 255));
        txtMaKichThuocQA.setEnabled(false);

        lblMaKichThuocQA.setFont(FontConstant.FONT_LABEL);
        lblMaKichThuocQA.setText("Mã Kích Thước Quần Áo:");

        javax.swing.GroupLayout pnLeftLayout = new javax.swing.GroupLayout(pnLeft);
        pnLeft.setLayout(pnLeftLayout);
        pnLeftLayout.setHorizontalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblMaKichThuocQA, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaKichThuocQA, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        pnLeftLayout.setVerticalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaKichThuocQA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaKichThuocQA))
                .addGap(32, 32, 32))
        );

        pnFields.add(pnLeft);

        pnRight.setBackground(new java.awt.Color(204, 204, 204));

        lblTenKichThuocQA.setFont(FontConstant.FONT_LABEL);
        lblTenKichThuocQA.setText("Tên Kích Thước Quần Áo:");
        lblTenKichThuocQA.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTenKichThuocQA.setMaximumSize(new java.awt.Dimension(91, 40));
        lblTenKichThuocQA.setMinimumSize(new java.awt.Dimension(91, 40));
        lblTenKichThuocQA.setPreferredSize(new java.awt.Dimension(170, 40));

        txtTenKichThuocQA.setFont(FontConstant.FONT_TEXT);
        txtTenKichThuocQA.setEnabled(false);
        txtTenKichThuocQA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKichThuocQAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnRightLayout = new javax.swing.GroupLayout(pnRight);
        pnRight.setLayout(pnRightLayout);
        pnRightLayout.setHorizontalGroup(
            pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRightLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTenKichThuocQA, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenKichThuocQA, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        pnRightLayout.setVerticalGroup(
            pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRightLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenKichThuocQA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenKichThuocQA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(32, Short.MAX_VALUE))
        );

        tblKichThuocQA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Kích Thước Quần Áo", "Tên  Kích Thước Quần Áo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKichThuocQA.setShowGrid(true);
        tblKichThuocQA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKichThuocQAMouseClicked(evt);
            }
        });
        scrKichThuocQA.setViewportView(tblKichThuocQA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(140, 140, 140))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitleKichThuocQA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(708, 708, 708))
                    .addComponent(scrKichThuocQA))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitleKichThuocQA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrKichThuocQA, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        this.txtTenKichThuocQA.setText("");
    }//GEN-LAST:event_btnXoaTrangActionPerformed

    public String taoMa() {
        NumberFormat nf = new DecimalFormat("000");
        int number = 1;
        String maKichThuocQA = "KT" + nf.format(number);

        // Kiểm tra mã đã tồn tại trong danh sách hay chưa
        ArrayList<String> arrayCode = new ArrayList<>();
        for (int i = 0; i < this.tblKichThuocQA.getModel().getRowCount(); i++) {
            arrayCode.add(this.tblKichThuocQA.getValueAt(i, 0).toString());
        }
        while (arrayCode.contains(maKichThuocQA)) {
            number++;
            maKichThuocQA = "KT" + nf.format(number);
        }
        return maKichThuocQA.trim();
    }

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        this.statusBtnThemMoi = true;
        this.statusBtnCapNhat = false;
        ComponentStatus.setStatusBtn(this.btnThemMoi, false);
        ComponentStatus.setStatusBtn(this.btnCapNhat, false);
        ComponentStatus.setStatusBtn(this.btnXoaTrang, true);
        ComponentStatus.setStatusBtn(this.btnLuu, true);
        ComponentStatus.setStatusBtn(this.btnHuy, true);
        this.txtMaKichThuocQA.setText(taoMa());
        this.txtTenKichThuocQA.setEnabled(true);
        this.txtTenKichThuocQA.requestFocus();
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if (txtMaKichThuocQA.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mã kích thước quần áo đang trống không thể lưu");
        } else if (txtTenKichThuocQA.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên kích thước quần áo đang trống không thể lưu");
            this.txtTenKichThuocQA.requestFocus();
        } else {
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn lưu?", "Xác nhận hành động", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                if (this.statusBtnCapNhat == true && this.statusBtnThemMoi == false) {
                    viTri = this.tblKichThuocQA.getSelectedRow();
                    String maKichThuocQA = this.txtMaKichThuocQA.getText().trim();
                    String tenKichThuocQA = this.txtTenKichThuocQA.getText().trim();
                    this.KichThuocQACapNhat = new DAO_QuanAo(DatabaseConstant.getConnection());
                    if (KichThuocQACapNhat.updateKichThuocQA(maKichThuocQA, tenKichThuocQA)) {
                        System.out.println("Cập nhật thành công kích thước quần áo!");
                    }
                    this.tblKichThuocQA.getModel().setValueAt(tenKichThuocQA, viTri, 1);
                } else if (this.statusBtnThemMoi == true && this.statusBtnCapNhat == false) {
                    String maKichThuocQA = this.txtMaKichThuocQA.getText().trim();
                    String tenKichThuocQA = this.txtTenKichThuocQA.getText().trim();
//            Load xuống table
                    Object[] data = {maKichThuocQA, tenKichThuocQA};
                    DefaultTableModel modelTable = (DefaultTableModel) this.tblKichThuocQA.getModel();
                    modelTable.addRow(data);
                    DAO_QuanAo themMoiKichThuocQuanAo = new DAO_QuanAo(DatabaseConstant.getConnection());
                    if (themMoiKichThuocQuanAo.addKichThuocQA(maKichThuocQA, tenKichThuocQA)) {
                        System.out.println("Thêm mới thành công kích thước quần áo!");
                    }
                }
                setStatusAllBtnsStart();
                ComponentStatus.emptyField(this.txtMaKichThuocQA);
                ComponentStatus.emptyField(this.txtTenKichThuocQA);
                this.txtTenKichThuocQA.setEnabled(false);
                this.tblKichThuocQA.clearSelection();
                this.statusBtnCapNhat = false;
                this.statusBtnThemMoi = false;
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn chắn chắn cập nhật?", "Xác nhận hành động", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            this.statusBtnCapNhat = true;
            ComponentStatus.setStatusBtn(this.btnCapNhat, false);
            ComponentStatus.setStatusBtn(this.btnXoaTrang, true);
            ComponentStatus.setStatusBtn(this.btnLuu, true);
            this.txtTenKichThuocQA.setEnabled(true);
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn chắn chắn hủy?", "Xác nhận hành động", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            setStatusAllBtnsStart();
            ComponentStatus.emptyField(this.txtMaKichThuocQA);
            ComponentStatus.emptyField(this.txtTenKichThuocQA);
            this.txtTenKichThuocQA.setEnabled(false);
            this.tblKichThuocQA.clearSelection();
            this.statusBtnCapNhat = false;
            this.statusBtnThemMoi = false;
        }
    }//GEN-LAST:event_btnHuyActionPerformed

    //    Xử lý đưa dữ liệu từ row table lên fields
    private void tblKichThuocQAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKichThuocQAMouseClicked
        viTri = this.tblKichThuocQA.getSelectedRow();//        Lấy vị trí dòng click
//      Lấy và set giá trị cho fields
        this.txtMaKichThuocQA.setText(tblKichThuocQA.getValueAt(viTri, 0).toString());
        this.txtTenKichThuocQA.setText(tblKichThuocQA.getValueAt(viTri, 1).toString());
        this.txtTenKichThuocQA.setEnabled(false);
        ComponentStatus.setStatusBtn(this.btnThemMoi, false);
        ComponentStatus.setStatusBtn(this.btnXoaTrang, false);
        ComponentStatus.setStatusBtn(this.btnLuu, false);
        ComponentStatus.setStatusBtn(this.btnHuy, true);
        ComponentStatus.setStatusBtn(this.btnCapNhat, true);
        this.statusBtnCapNhat = false;
        this.statusBtnThemMoi = false;

    }//GEN-LAST:event_tblKichThuocQAMouseClicked

    private void txtTenKichThuocQAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKichThuocQAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKichThuocQAActionPerformed

    private void loadAllTableKichThuocQA(HashMap<String, String> dsKichThuocQATimDuoc) {
        DefaultTableModel modelKichThuocQa = (DefaultTableModel) this.tblKichThuocQA.getModel();
        modelKichThuocQa.setRowCount(0);
        for (HashMap.Entry<String, String> item : dsKichThuocQATimDuoc.entrySet()) {
            Object[] data = {item.getKey(), item.getValue()};
            modelKichThuocQa.addRow(data);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JLabel lblMaKichThuocQA;
    private javax.swing.JLabel lblTenKichThuocQA;
    private javax.swing.JLabel lblTitleKichThuocQA;
    private javax.swing.JPanel pnControl;
    private javax.swing.JPanel pnFields;
    private javax.swing.JPanel pnLeft;
    private javax.swing.JPanel pnRight;
    private javax.swing.JScrollPane scrKichThuocQA;
    private javax.swing.JTable tblKichThuocQA;
    private javax.swing.JTextField txtMaKichThuocQA;
    private javax.swing.JTextField txtTenKichThuocQA;
    // End of variables declaration//GEN-END:variables
    private boolean statusBtnCapNhat = false;
    private boolean statusBtnThemMoi = false;
    private HashMap<String, String> dsKichThuocQuanAo = new DAO_QuanAo(DatabaseConstant.getConnection()).getAllKichThuocQA();
    private DAO_QuanAo KichThuocQACapNhat = null;
    private int viTri = 0;
}
