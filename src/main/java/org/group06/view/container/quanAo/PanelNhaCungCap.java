package org.group06.view.container.quanAo;

import org.group06.db.DatabaseConnect;
import org.group06.db.dao.DAO_NhaCungCap;
import org.group06.model.entity.NhaCungCap;
import org.group06.utils.ColorConstant;
import org.group06.utils.ComponentStatus;
import org.group06.utils.FontConstant;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * @author lehoa
 */
public class PanelNhaCungCap extends javax.swing.JPanel {

    /**
     * Creates new form PanelKhuyenMai
     */
    public PanelNhaCungCap() {
        initComponents();
        loadDataTable();
        setStatusAllBtnsStart();

    }

    public void setStatusAllBtnsStart() {
        java.util.List<JButton> listBtn = java.util.Arrays.asList(this.btnHuy, this.btnXoaTrang, this.btnCapNhat, this.btnLuu);
        ComponentStatus.setStatusBtn(listBtn, false);
        ComponentStatus.setStatusBtn(this.btnThemMoi, true);
    }

    private void loadDataTable() {
        DefaultTableModel modelNCC = (DefaultTableModel) this.tblNhaCungCap.getModel();
        for (NhaCungCap ncc : this.dsNCC) {
            Object[] data = {ncc.getMaNCC(), ncc.getTenNCC(), ncc.getSoDienThoai(), ncc.getDiaChi()};
//      Thêm dữ liệu vào table
            modelNCC.addRow(data);
        }
    }

    public String taoMa() {
        NumberFormat nf = new DecimalFormat("000");
        int number = 1;
        String maNCC = "NCC" + nf.format(number);

//        Lấy danh sách mã nhà cung cấp
        ArrayList<String> dsMaNCC = new ArrayList<>();
        for (NhaCungCap ncc : dsNCC) {
            dsMaNCC.add(ncc.getMaNCC());
        }
// Kiểm tra mã đã tồn tại trong danh sách hay chưa
        while (dsMaNCC.contains(maNCC)) {
            number++;
            maNCC = "NCC" + nf.format(number);
        }
        return maNCC.trim();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleNhaCungCap = new javax.swing.JLabel();
        lblTimKiemNCC = new javax.swing.JLabel();
        txtTimNhaCungCap = new javax.swing.JTextField();
        pnFields = new javax.swing.JPanel();
        pnLeft = new javax.swing.JPanel();
        txtMa = new javax.swing.JTextField();
        lblMa = new javax.swing.JLabel();
        lblTenNCC = new javax.swing.JLabel();
        txtTenNCC = new javax.swing.JTextField();
        pnRight = new javax.swing.JPanel();
        lblSoDienThoai = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        pnControl = new javax.swing.JPanel();
        btnXoaTrang = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        scrNhaCungCap = new javax.swing.JScrollPane();
        tblNhaCungCap = new javax.swing.JTable();
        cmbTieuChiTimKiemNCC = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitleNhaCungCap.setFont(org.group06.utils.FontConstant.FONT_HEADER);
        lblTitleNhaCungCap.setForeground(org.group06.utils.ColorConstant.BLACK);
        lblTitleNhaCungCap.setText("Nhà Cung Cấp");
        lblTitleNhaCungCap.setMaximumSize(new java.awt.Dimension(103, 110));
        lblTitleNhaCungCap.setMinimumSize(new java.awt.Dimension(103, 110));
        lblTitleNhaCungCap.setPreferredSize(new java.awt.Dimension(103, 110));

        lblTimKiemNCC.setFont(FontConstant.FONT_LABEL);
        lblTimKiemNCC.setText("Tìm Kiếm Nhà Cung Cấp:");

        txtTimNhaCungCap.setFont(FontConstant.FONT_TEXT);
        txtTimNhaCungCap.setForeground(ColorConstant.BLACK);
        txtTimNhaCungCap.setToolTipText("Nhập mã nhà cung cấp cần tìm");
        txtTimNhaCungCap.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTimNhaCungCap.setMinimumSize(new java.awt.Dimension(64, 40));
        txtTimNhaCungCap.setPreferredSize(new java.awt.Dimension(64, 50));
        txtTimNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimNhaCungCapActionPerformed(evt);
            }
        });
        txtTimNhaCungCap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimNhaCungCapKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimNhaCungCapKeyReleased(evt);
            }
        });

        pnFields.setBackground(ColorConstant.BUTTON_HOVER);
        pnFields.setLayout(new java.awt.GridLayout(1, 2));

        pnLeft.setBackground(new java.awt.Color(204, 204, 204));

        txtMa.setBackground(new java.awt.Color(102, 102, 102));
        txtMa.setFont(FontConstant.FONT_TEXT);
        txtMa.setForeground(new java.awt.Color(255, 255, 255));
        txtMa.setEnabled(false);

        lblMa.setFont(FontConstant.FONT_LABEL);
        lblMa.setText("Mã Nhà Cung Cấp:");

        lblTenNCC.setFont(FontConstant.FONT_LABEL);
        lblTenNCC.setText("Tên Nhà Cung Cấp:");

        txtTenNCC.setFont(FontConstant.FONT_TEXT);
        txtTenNCC.setEnabled(false);

        javax.swing.GroupLayout pnLeftLayout = new javax.swing.GroupLayout(pnLeft);
        pnLeft.setLayout(pnLeftLayout);
        pnLeftLayout.setHorizontalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLeftLayout.createSequentialGroup()
                        .addComponent(lblMa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMa))
                    .addGroup(pnLeftLayout.createSequentialGroup()
                        .addComponent(lblTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenNCC, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)))
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
                .addGroup(pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLeftLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblTenNCC))
                    .addGroup(pnLeftLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        pnFields.add(pnLeft);

        pnRight.setBackground(new java.awt.Color(204, 204, 204));

        lblSoDienThoai.setFont(FontConstant.FONT_LABEL);
        lblSoDienThoai.setText("Số Điện Thoại:");
        lblSoDienThoai.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblSoDienThoai.setMaximumSize(new java.awt.Dimension(91, 40));
        lblSoDienThoai.setMinimumSize(new java.awt.Dimension(91, 40));
        lblSoDienThoai.setPreferredSize(new java.awt.Dimension(170, 40));

        txtSoDienThoai.setFont(FontConstant.FONT_TEXT);
        txtSoDienThoai.setEnabled(false);

        lblDiaChi.setFont(FontConstant.FONT_LABEL);
        lblDiaChi.setText("Địa Chỉ:");

        txtDiaChi.setFont(FontConstant.FONT_TEXT);
        txtDiaChi.setEnabled(false);

        javax.swing.GroupLayout pnRightLayout = new javax.swing.GroupLayout(pnRight);
        pnRight.setLayout(pnRightLayout);
        pnRightLayout.setHorizontalGroup(
            pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRightLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoDienThoai)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        pnRightLayout.setVerticalGroup(
            pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRightLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRightLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblDiaChi))
                    .addGroup(pnRightLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        tblNhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhà Cung Cấp", "Tên Nhà Cung Cấp", "Số Điện Thoại", "Địa Chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhaCungCap.setShowGrid(true);
        tblNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhaCungCapMouseClicked(evt);
            }
        });
        scrNhaCungCap.setViewportView(tblNhaCungCap);

        cmbTieuChiTimKiemNCC.setFont(FontConstant.FONT_TEXT);
        cmbTieuChiTimKiemNCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Tiêu Chí Tìm Kiếm", "Tìm Theo Mã", "Tìm Theo Tên", "Tìm Theo Số Điện Thoại" }));

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
                        .addComponent(lblTitleNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTimKiemNCC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTieuChiTimKiemNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrNhaCungCap))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTitleNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTimKiemNCC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTieuChiTimKiemNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addComponent(pnFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimNhaCungCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimNhaCungCapActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        ComponentStatus.emptyField(this.txtTenNCC);
        ComponentStatus.emptyField(this.txtSoDienThoai);
        ComponentStatus.emptyField(this.txtDiaChi);
    }//GEN-LAST:event_btnXoaTrangActionPerformed

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        this.statusBtnThemMoi = true;
        this.statusBtnCapNhat = false;
        ComponentStatus.setStatusBtn(this.btnThemMoi, false);
        ComponentStatus.setStatusBtn(this.btnCapNhat, false);
        ComponentStatus.setStatusBtn(this.btnXoaTrang, true);
        ComponentStatus.setStatusBtn(this.btnLuu, true);
        ComponentStatus.setStatusBtn(this.btnHuy, true);
        this.txtMa.setText(taoMa());
        this.txtTenNCC.setEnabled(true);
        this.txtSoDienThoai.setEnabled(true);
        this.txtDiaChi.setEnabled(true);
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if (txtMa.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mã nhà cung cấp đang trống không thể lưu");
        } else if (txtTenNCC.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên nhà cung cấp đang trống không thể lưu");
            this.txtTenNCC.requestFocus();
        } else if (txtSoDienThoai.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Số điện thoại nhà cung cấp đang trống không thể lưu");
            this.txtSoDienThoai.requestFocus();
        } else if (txtDiaChi.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Địa chỉ nhà cung cấp đang trống không thể lưu");
            this.txtDiaChi.requestFocus();
        } else {
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn lưu?", "Xác nhận hành động", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                if (this.statusBtnCapNhat == true && this.statusBtnThemMoi == false) {

                    viTri = this.tblNhaCungCap.getSelectedRow();
                    String maNhaCungCap = this.txtMa.getText().trim();
                    String tenNhaCungCap = this.txtTenNCC.getText().trim();
                    String sdtNhaCungCap = this.txtSoDienThoai.getText().trim();
                    String diaChiNCC = this.txtDiaChi.getText().trim();

                    this.nccCapNhat = new DAO_NhaCungCap(DatabaseConnect.getConnection()).getByID(maNhaCungCap);
                    this.nccCapNhat.setTenNCC(tenNhaCungCap);
                    this.nccCapNhat.setSoDienThoai(sdtNhaCungCap);
                    this.nccCapNhat.setDiaChi(diaChiNCC);
                    this.nhaCungCap_DAO = new DAO_NhaCungCap(DatabaseConnect.getConnection());
                    if (this.nhaCungCap_DAO.update(nccCapNhat)) {
                        System.out.println("Cập nhật thành công nhà cung cấp!");
                    }
                    this.tblNhaCungCap.getModel().setValueAt(tenNhaCungCap, viTri, 1);
                    this.tblNhaCungCap.getModel().setValueAt(sdtNhaCungCap, viTri, 2);
                    this.tblNhaCungCap.getModel().setValueAt(diaChiNCC, viTri, 3);
                } else if (this.statusBtnThemMoi == true && this.statusBtnCapNhat == false) {
//                    Lấy giá trị của fields
                    String maNhaCungCap = this.txtMa.getText().trim();
                    String tenNhaCungCap = this.txtTenNCC.getText().trim();
                    String sdtNhaCungCap = this.txtSoDienThoai.getText().trim();
                    String diaChiNCC = this.txtDiaChi.getText().trim();
//                    Set giá trị cho thuộc tính của nhà cung cấp
                    NhaCungCap ncc = new NhaCungCap();
                    ncc.setMaNCC(maNhaCungCap);
                    ncc.setTenNCC(tenNhaCungCap);
                    ncc.setSoDienThoai(sdtNhaCungCap);
                    ncc.setDiaChi(diaChiNCC);
//                    Load xuống table
                    Object[] data = {maNhaCungCap, tenNhaCungCap, sdtNhaCungCap, diaChiNCC};
                    DefaultTableModel modelTable = (DefaultTableModel) this.tblNhaCungCap.getModel();
                    modelTable.addRow(data);
//                    Lưu nhà cung cấp mới vào cơ sở dữ liệu
                    this.themMoiNCC = new DAO_NhaCungCap(DatabaseConnect.getConnection());
                    if (this.themMoiNCC.add(ncc)) {
                        System.out.println("Thêm mới thành công loại quần áo!");
                    }
                }
                setStatusAllBtnsStart();
                ComponentStatus.emptyField(this.txtMa);
                ComponentStatus.emptyField(this.txtTenNCC);
                ComponentStatus.emptyField(this.txtSoDienThoai);
                ComponentStatus.emptyField(this.txtDiaChi);
                this.txtTenNCC.setEnabled(false);
                this.txtSoDienThoai.setEnabled(false);
                this.txtDiaChi.setEnabled(false);
                this.tblNhaCungCap.clearSelection();
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
            this.txtTenNCC.setEnabled(true);
            this.txtSoDienThoai.setEnabled(true);
            this.txtDiaChi.setEnabled(true);
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn chắn chắn hủy?", "Xác nhận hành động", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            setStatusAllBtnsStart();
            ComponentStatus.emptyField(this.txtMa);
            ComponentStatus.emptyField(this.txtTenNCC);
            ComponentStatus.emptyField(this.txtSoDienThoai);
            ComponentStatus.emptyField(this.txtDiaChi);
            this.txtTenNCC.setEnabled(false);
            this.txtSoDienThoai.setEnabled(false);
            this.txtDiaChi.setEnabled(false);
            this.tblNhaCungCap.clearSelection();
            this.statusBtnCapNhat = false;
            this.statusBtnThemMoi = false;
        }
    }//GEN-LAST:event_btnHuyActionPerformed

    //    Xử lý đưa dữ liệu từ row table lên fields
    private void tblNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhaCungCapMouseClicked
//        Lấy vị trí dòng click
        viTri = this.tblNhaCungCap.getSelectedRow();
//      Lấy và set giá trị cho fields
        this.txtMa.setText(tblNhaCungCap.getValueAt(viTri, 0).toString());
        this.txtTenNCC.setText(tblNhaCungCap.getValueAt(viTri, 1).toString());
        this.txtSoDienThoai.setText(tblNhaCungCap.getValueAt(viTri, 2).toString());
        this.txtDiaChi.setText(tblNhaCungCap.getValueAt(viTri, 3).toString());
        this.txtTenNCC.setEnabled(false);
        this.txtSoDienThoai.setEnabled(false);
        this.txtDiaChi.setEnabled(false);
        ComponentStatus.setStatusBtn(this.btnThemMoi, false);
        ComponentStatus.setStatusBtn(this.btnXoaTrang, false);
        ComponentStatus.setStatusBtn(this.btnLuu, false);
        ComponentStatus.setStatusBtn(this.btnHuy, true);
        ComponentStatus.setStatusBtn(this.btnCapNhat, true);
        this.statusBtnCapNhat = false;
        this.statusBtnThemMoi = false;

    }//GEN-LAST:event_tblNhaCungCapMouseClicked

    private void loadAllTableNCC(ArrayList<NhaCungCap> dsNCCTimDuoc) {
        DefaultTableModel modelNCC = (DefaultTableModel) this.tblNhaCungCap.getModel();
        modelNCC.setRowCount(0);
        for (NhaCungCap ncc : dsNCCTimDuoc) {
            Object[] data = {
                ncc.getMaNCC(), ncc.getTenNCC(),
                ncc.getSoDienThoai(), ncc.getDiaChi()
            };
            // Thêm dữ liệu vào table
            modelNCC.addRow(data);
        }
    }

    private void xuLyTimKiemNCC() {
        String duLieuTimKiem = this.txtTimNhaCungCap.getText().trim();
        int tieuChiTimKiem = this.cmbTieuChiTimKiemNCC.getSelectedIndex();

        if (duLieuTimKiem.isEmpty() || tieuChiTimKiem == 0) {
            loadDataTable();
        } else {
            ArrayList<NhaCungCap> dsNCCTimDuoc = new ArrayList<>();
            if (tieuChiTimKiem == 1) {
                for (NhaCungCap ncc : this.dsNCC) {
                    if (ncc.getMaNCC().contains(duLieuTimKiem)) {
                        dsNCCTimDuoc.add(ncc);
                    }
                }
            } else if (tieuChiTimKiem == 2) {
                for (NhaCungCap ncc : this.dsNCC) {
                    if (ncc.getTenNCC().contains(duLieuTimKiem)) {
                        dsNCCTimDuoc.add(ncc);
                    }
                }
            } else if (tieuChiTimKiem == 3) {
                for (NhaCungCap ncc : this.dsNCC) {
                    if (ncc.getSoDienThoai().contains(duLieuTimKiem)) {
                        dsNCCTimDuoc.add(ncc);
                    }
                }
            }

//        Cập nhật kết quả tìm kiếm lên bảng
            loadAllTableNCC(dsNCCTimDuoc);
        }
    }
//    Xử lý tìm kiếm nhà cung cấp
    private void txtTimNhaCungCapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimNhaCungCapKeyPressed
        xuLyTimKiemNCC();
    }//GEN-LAST:event_txtTimNhaCungCapKeyPressed

    private void txtTimNhaCungCapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimNhaCungCapKeyReleased
        xuLyTimKiemNCC();
    }//GEN-LAST:event_txtTimNhaCungCapKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JComboBox<String> cmbTieuChiTimKiemNCC;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblMa;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTenNCC;
    private javax.swing.JLabel lblTimKiemNCC;
    private javax.swing.JLabel lblTitleNhaCungCap;
    private javax.swing.JPanel pnControl;
    private javax.swing.JPanel pnFields;
    private javax.swing.JPanel pnLeft;
    private javax.swing.JPanel pnRight;
    private javax.swing.JScrollPane scrNhaCungCap;
    private javax.swing.JTable tblNhaCungCap;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenNCC;
    private javax.swing.JTextField txtTimNhaCungCap;
    // End of variables declaration//GEN-END:variables
    private ArrayList<NhaCungCap> dsNCC = new DAO_NhaCungCap(DatabaseConnect.getConnection()).getAll();
    private boolean statusBtnThemMoi = true;
    private boolean statusBtnCapNhat = true;
    private int viTri = 0;
    private NhaCungCap nccCapNhat = null;
    private DAO_NhaCungCap nhaCungCap_DAO = null;
    private DAO_NhaCungCap themMoiNCC = null;
}
