/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.container.nhanVien.quanLyHoaDon;

import org.group06.db.DatabaseConstant;
import org.group06.db.dao.DAO_ChiTietHoaDon;
import org.group06.db.dao.DAO_HoaDon;
import org.group06.model.entity.ChiTietHoaDon;
import org.group06.model.entity.HoaDon;
import org.group06.utils.DateStandard;
import org.group06.utils.FormatCellRenderer;
import org.group06.utils.NameStandard;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

public class PanelHoaDon extends javax.swing.JPanel {

    private Connection connection = DatabaseConstant.getConnection();
    private DAO_HoaDon dao_HoaDon = new DAO_HoaDon(connection);
    private ArrayList<HoaDon> dsHD = new ArrayList<>();

    /**
     * Creates new form PanelHoaDon
     */
    public PanelHoaDon() {
        initComponents();
        dchTimTheoNgay.setLocale(new Locale("vi", "VN"));
        loadDataTable();
        FormatCellRenderer.formatCellRendererCenter(tblHoaDon,0);
        FormatCellRenderer.formatCellRendererRight(tblHoaDon,4);
    }

    /**
     * This method is called from within the constructor to initialize the
     * form.= WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleDSHoaDon = new javax.swing.JLabel();
        pnlTimHD = new javax.swing.JPanel();
        lblTimTheoTenKH = new javax.swing.JLabel();
        lblTimTheoNgay = new javax.swing.JLabel();
        txtTimTheoTenKH = new javax.swing.JTextField();
        dchTimTheoNgay = new com.toedter.calendar.JDateChooser();
        btnLamMoi = new javax.swing.JButton();
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
        txtTimTheoTenKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimTheoTenKHKeyReleased(evt);
            }
        });

        dchTimTheoNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchTimTheoNgay.setPreferredSize(new java.awt.Dimension(64, 29));
        dchTimTheoNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchTimTheoNgayPropertyChange(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTimHDLayout = new javax.swing.GroupLayout(pnlTimHD);
        pnlTimHD.setLayout(pnlTimHDLayout);
        pnlTimHDLayout.setHorizontalGroup(
                pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTimHDLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTimTheoTenKH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTimTheoTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTimTheoNgay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dchTimTheoNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLamMoi)
                                .addContainerGap())
        );
        pnlTimHDLayout.setVerticalGroup(
                pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTimHDLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(lblTimTheoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTimTheoTenKH)
                                        .addComponent(txtTimTheoTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dchTimTheoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(13, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimHDLayout.createSequentialGroup()
                                .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pnlTimHDLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]{dchTimTheoNgay, lblTimTheoNgay, lblTimTheoTenKH, txtTimTheoTenKH});

        dchTimTheoNgay.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadIcon(org.group06.utils.ImagePath.ICON_CALENDAR));

        dchTimTheoNgay.getDateEditor().setEnabled(false);

        ((com.toedter.calendar.JTextFieldDateEditor) dchTimTheoNgay.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);

        srcHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tblHoaDon.setAutoCreateRowSorter(true);
        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Mã hóa đơn", "Ngày lập hóa đơn", "Tên khách hàng", "Tên nhân viên lập hóa đơn", "Tổng thành tiền", "Tên CT khuyến mãi"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblHoaDon.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblHoaDon.setFillsViewportHeight(true);
        tblHoaDon.setGridColor(new java.awt.Color(0, 0, 0));
        tblHoaDon.setRowHeight(50);
        tblHoaDon.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblHoaDon.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblHoaDon.setShowGrid(true);
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        srcHoaDon.setViewportView(tblHoaDon);
        if (tblHoaDon.getColumnModel().getColumnCount() > 0) {
            tblHoaDon.getColumnModel().getColumn(0).setResizable(false);
            tblHoaDon.getColumnModel().getColumn(1).setResizable(false);
            tblHoaDon.getColumnModel().getColumn(2).setResizable(false);
            tblHoaDon.getColumnModel().getColumn(3).setResizable(false);
            tblHoaDon.getColumnModel().getColumn(4).setResizable(false);
            tblHoaDon.getColumnModel().getColumn(5).setResizable(false);
        }

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
                                .addComponent(srcHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pnlTimHD.getAccessibleContext().setAccessibleName("Tìm Kiếm hóa đơn");
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimTheoTenKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimTheoTenKHKeyReleased
        String tenKH = NameStandard.formatCapitalize(txtTimTheoTenKH.getText());
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!tenKH.equals("")) {
                if (checkRegexTenKH()) {
                    DefaultTableModel modelKH = (DefaultTableModel) this.tblHoaDon.getModel();
                    modelKH.setRowCount(0);
                    ArrayList<HoaDon> dsHoaDonTheoTenKH = dsHD.parallelStream()
                            .filter(hd -> hd.getKhachHang() != null).filter(hd -> hd.getKhachHang().getTenKH().contains(tenKH))
                            .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
                    ArrayList<HoaDon> dsHoaDonKhachVangLai = dsHD.parallelStream()
                            .filter(hd -> hd.getKhachHang() == null).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

                    if (tenKH.contains("Khách vãng lai") || tenKH.contains("KVL") || tenKH.contains("kvl") || tenKH.contains("khách vãng lai")) {
                        for (HoaDon hd : dsHoaDonKhachVangLai) {
                            String ttt = loadTongThanhTien(hd.getMaHoaDon());
                            String date = DateStandard.formatDate(hd.getNgayTao());
                            Object[] data = {hd.getMaHoaDon(), date, "Khách vãng lai", hd.getNhanVien().getTenNV(), ttt, hd.getKhuyenMai() != null ? hd.getKhuyenMai().getTenCTKM() : ""};
                            modelKH.addRow(data);
                        }
                    } else {
                        for (HoaDon hd : dsHoaDonTheoTenKH) {
                            String ttt = loadTongThanhTien(hd.getMaHoaDon());
                            String date = DateStandard.formatDate(hd.getNgayTao());
                            Object[] data = {hd.getMaHoaDon(), date, hd.getKhachHang().getTenKH(), hd.getNhanVien().getTenNV(), ttt, hd.getKhuyenMai() != null ? hd.getKhuyenMai().getTenCTKM() : ""};
                            modelKH.addRow(data);
                        }
                    }
                    dchTimTheoNgay.setDate(null);
                } else {
                    JOptionPane.showMessageDialog(this, "Nhập lại tên khách hàng cần tìm");
                    loadDataTable(dsHD);
                }
            } else {
                loadDataTable(dsHD);
            }
        }
    }//GEN-LAST:event_txtTimTheoTenKHKeyReleased

    private boolean checkRegexTenKH() {
        String tenKH = txtTimTheoTenKH.getText().trim();
        if (tenKH.equals("") || !tenKH.matches("^[\\p{L}\\s]+$")) {
            return false;
        } else {
            return true;
        }
    }

    private void callFrameChiTietHoaDon() {
        WinChiTietHoaDon frCTHD = new WinChiTietHoaDon(this.getSelectedHoaDon(), this);
        frCTHD.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frCTHD.setResizable(false);
        frCTHD.setVisible(true);
    }

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        if (evt.getClickCount() == 2) {
            callFrameChiTietHoaDon();
        }
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void dchTimTheoNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchTimTheoNgayPropertyChange
        if (evt.getPropertyName().equals("date")) {
            Date date = (Date) evt.getNewValue();
            java.util.Date dateNow = new java.util.Date();
            if (date != null) {
                if (date.after(dateNow)) {
                    JOptionPane.showMessageDialog(null, "Chọn ngày không hợp lệ");
                    loadDataTable(dsHD);
                    dchTimTheoNgay.setDate(null);
                    txtTimTheoTenKH.setText("");
                } else {
                    loadDataNgay(date);
                    txtTimTheoTenKH.setText("");
                }
            }
        }
    }//GEN-LAST:event_dchTimTheoNgayPropertyChange

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        txtTimTheoTenKH.setText("");
        dchTimTheoNgay.setDate(null);
        loadDataTable(dsHD);
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void loadDataNgay(Date ngay) {
        DefaultTableModel modelHD = (DefaultTableModel) this.tblHoaDon.getModel();
        modelHD.setRowCount(0);
        ArrayList<HoaDon> dsHDTheoNgay = dsHD.parallelStream()
                .filter(hd -> hd.getNgayTao().toLocalDate().isEqual(new java.sql.Date(ngay.getTime()).toLocalDate())).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for (HoaDon hd : dsHDTheoNgay) {
            String ttt = loadTongThanhTien(hd.getMaHoaDon());
            String newFormatNgayTao = DateStandard.formatDate(hd.getNgayTao());
            Object[] data = {hd.getMaHoaDon(), newFormatNgayTao, hd.getKhachHang() != null ? hd.getKhachHang().getTenKH() : "Khách vãng lai", hd.getNhanVien().getTenNV(), ttt, hd.getKhuyenMai() != null ? hd.getKhuyenMai().getTenCTKM() : ""};
            modelHD.addRow(data);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private com.toedter.calendar.JDateChooser dchTimTheoNgay;
    private javax.swing.JLabel lblTimTheoNgay;
    private javax.swing.JLabel lblTimTheoTenKH;
    private javax.swing.JLabel lblTitleDSHoaDon;
    private javax.swing.JPanel pnlTimHD;
    private javax.swing.JScrollPane srcHoaDon;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtTimTheoTenKH;
    // End of variables declaration//GEN-END:variables

    private HoaDon getSelectedHoaDon() {
        String mHD = tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 0).toString();

        if (tblHoaDon.getSelectedRow() == -1) {
            return null;
        } else {
            return dao_HoaDon.getByID(mHD);
        }
    }

    private void loadDataTable(ArrayList<HoaDon> dsHD) {
        //load 100 dòng mỗi 0.3s
        DefaultTableModel modelHD = (DefaultTableModel) tblHoaDon.getModel();
        modelHD.setRowCount(0);
        Timer timer = new Timer(300, new ActionListener() {
            private int currentIndex = 0;
            private final int size = 100;

            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<HoaDon>, Void> worker = new SwingWorker<List<HoaDon>, Void>() {
                    @Override
                    protected List<HoaDon> doInBackground() {
                        return dsHD.subList(currentIndex, Math.min(currentIndex + size, dsHD.size()));
                    }

                    @Override
                    protected void done() {
                        try {
                            List<HoaDon> hoaDons = get();
                            if (hoaDons != null && !hoaDons.isEmpty()) {
                                for (HoaDon hd : hoaDons) {
                                    String date = DateStandard.formatDate(hd.getNgayTao());
                                    String tenKH = (hd.getKhachHang() == null) ? "Khách vãng lai" : hd.getKhachHang().getTenKH();
                                    String tenNV = hd.getNhanVien().getTenNV();
                                    String khuyenMai = (hd.getKhuyenMai() == null) ? "" : hd.getKhuyenMai().getTenCTKM();
                                    String ttt = loadTongThanhTien(hd.getMaHoaDon());
                                    Object[] data = {hd.getMaHoaDon(), date, tenKH, tenNV, ttt, khuyenMai};
                                    // Cập nhật bảng
                                    modelHD.addRow(data);
                                }
                                currentIndex += size;
                            } else {
                                // Dừng timer nếu không còn dữ liệu
                                ((Timer) e.getSource()).stop();
                            }
                        } catch (InterruptedException | ExecutionException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                };
                // Thực hiện công việc tải dữ liệu trong luồng nền
                worker.execute();
            }
        }); // set delay 0.3s
        timer.start();
    }

    public void loadDataTable() {
        DefaultTableModel modelHD = (DefaultTableModel) tblHoaDon.getModel();

        Timer timer = new Timer(300, new ActionListener() {
            private int currentIndex = 0;
            private final int batchSize = 10;

            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<List<HoaDon>, Void> worker = new SwingWorker<List<HoaDon>, Void>() {
                    @Override
                    protected List<HoaDon> doInBackground() {
                        // Thực hiện tải dữ liệu từ currentIndex với kích thước batchSize
                        return dao_HoaDon.getBatch(currentIndex, batchSize);
                    }

                    @Override
                    protected void done() {
                        try {
                            List<HoaDon> hoaDons = get();
                            if (hoaDons != null && !hoaDons.isEmpty()) {
                                // Sử dụng synchronized để đảm bảo đồng bộ hóa
                                synchronized (modelHD) {
                                    for (HoaDon hd : hoaDons) {
                                        dsHD.add(hd);
                                        String date = DateStandard.formatDate(hd.getNgayTao());
                                        String tenKH = (hd.getKhachHang() == null) ? "Khách vãng lai" : hd.getKhachHang().getTenKH();
                                        String tenNV = hd.getNhanVien().getTenNV();
                                        String khuyenMai = (hd.getKhuyenMai() == null) ? "" : hd.getKhuyenMai().getTenCTKM();
                                        String ttt = loadTongThanhTien(hd.getMaHoaDon());
                                        Object[] data = {hd.getMaHoaDon(), date, tenKH, tenNV, ttt, khuyenMai};
                                        // Cập nhật bảng
                                        modelHD.addRow(data);
                                    }
                                    currentIndex += batchSize;
                                }
                                // Kiểm tra xem timer có đang chạy hay không
                                if (!((Timer) e.getSource()).isRunning()) {
                                    ((Timer) e.getSource()).stop();
                                }
                            } else {
                                // Dừng timer nếu không còn dữ liệu
                                ((Timer) e.getSource()).stop();
                            }
                        } catch (InterruptedException | ExecutionException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                };

                // Thực hiện công việc tải dữ liệu trong luồng nền
                worker.execute();
            }
        }); // set delay 0.3s

        timer.start();
    }


    private String loadTongThanhTien(String hd) {
        double tinhTongThanhTien = 0, mucGiamGia = 0;
        ArrayList<ChiTietHoaDon> dsCTHD = new DAO_ChiTietHoaDon(connection).getAllCTQA(hd);
        DecimalFormat dfMoney = new DecimalFormat("##,### VNĐ");
        for (ChiTietHoaDon cthd : dsCTHD) {
            tinhTongThanhTien += cthd.getGiaBan() * cthd.getSoLuong();
            if (cthd.getHoaDon().getKhuyenMai() != null) {
                mucGiamGia = (cthd.getHoaDon().getKhuyenMai().getMucGiamGia()) / 100;
            }
        }
        double tongTienSauVAT = tinhTongThanhTien * 1.08;
        double ttt = (tongTienSauVAT * (1.0f - mucGiamGia));
        String tongThanhTien = dfMoney.format(ttt);
        return tongThanhTien;
    }
}
