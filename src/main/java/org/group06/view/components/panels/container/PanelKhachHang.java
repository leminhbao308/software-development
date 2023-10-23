/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.components.panels.container;
import javax.swing.JFrame;
import org.group06.utils.*;
//import org.group06.view.components.*;
/**
 *
 * @author Dell
 */
public class PanelKhachHang extends javax.swing.JPanel {

    /**
     * Creates new form PanelKhachHang
     */
    public PanelKhachHang() {
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

        lblTitleKH = new javax.swing.JLabel();
        btnTimSDT = new org.group06.view.components.buttons.StaticRoundButton("", ImagePath.ICON_SEARCH, ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        txtTimSDT = new org.group06.view.components.textFields.TextField("Số điện thoại cần tìm", ColorConstant.BLACK);
        scrKhachHang = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();

        setBackground(ColorConstant.BACKGROUND_CONTAINER);
        setToolTipText("");

        lblTitleKH.setFont(FontConstant.FONT_HEADER);
        lblTitleKH.setForeground(ColorConstant.WHITE);
        lblTitleKH.setText("Thông tin khách hàng");

        btnTimSDT.setToolTipText("Click để tìm kiếm khách hàng");
        btnTimSDT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimSDT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtTimSDT.setFont(FontConstant.FONT_TEXT);
        txtTimSDT.setToolTipText("Nhập số điện thoại cần tìm");
        txtTimSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimSDTActionPerformed(evt);
            }
        });

        scrKhachHang.setBorder(null);
        scrKhachHang.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrKhachHang.setFont(org.group06.utils.FontConstant.FONT_LABEL);

        tblKhachHang.setAutoCreateRowSorter(true);
        tblKhachHang.setBackground(org.group06.utils.ColorConstant.BACKGROUND_NORMAL);
        tblKhachHang.setFont(org.group06.utils.FontConstant.FONT_TEXT);
        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"QA01", "Đầm dạ hội", "Trắng"}
            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Số điện thoại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHang.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblKhachHang.setFillsViewportHeight(true);
        tblKhachHang.setGridColor(org.group06.utils.ColorConstant.BLACK);
        tblKhachHang.setRowHeight(50);
        tblKhachHang.setSelectionBackground(org.group06.utils.ColorConstant.BACKGROUND_SIDEBAR);
        tblKhachHang.setSelectionForeground(org.group06.utils.ColorConstant.WHITE);
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
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrKhachHang)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitleKH, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTimSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTimSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(lblTitleKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimSDTActionPerformed

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        if(evt.getClickCount() == 2) {
            JFrame jf = new JFrame();
            jf.add(new PanelTTKhachHang());
            jf.getContentPane().add(new PanelTTKhachHang());
            jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            jf.setLocationRelativeTo(null);
            jf.setResizable(false);
            jf.pack();
            jf.setVisible(true);
        }
    }//GEN-LAST:event_tblKhachHangMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimSDT;
    private javax.swing.JLabel lblTitleKH;
    private javax.swing.JScrollPane scrKhachHang;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtTimSDT;
    // End of variables declaration//GEN-END:variables
}
