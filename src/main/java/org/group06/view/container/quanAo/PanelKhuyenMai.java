package org.group06.view.container.quanAo;

import org.group06.db.DatabaseConstant;
import org.group06.db.dao.DAO_KhachHang;
import org.group06.db.dao.DAO_KhuyenMai;
import org.group06.model.entity.KhachHang;
import org.group06.model.entity.KhuyenMai;
import org.group06.utils.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * @author lehoangnam
 */
public class PanelKhuyenMai extends javax.swing.JPanel {

    public PanelKhuyenMai() {
        initComponents();
        loadDataTable();
        setDefaultCalender();
        this.dchNgayBatDau.setEnabled(false);
        this.dchNgayBatDau.setLocale(new Locale("vi", "VN"));
        this.dchNgayBatDau.setDateFormatString("dd/MM/yyyy");
        this.dchNgayKetThuc.setEnabled(false);
        this.dchNgayKetThuc.setLocale(new Locale("vi", "VN"));
        this.dchNgayKetThuc.setDateFormatString("dd/MM/yyyy");
        setStatusAllBtnsStart();

        FormatCellRenderer.formatCellRendererRight(this.tblKhuyenMai, 2);
        FormatCellRenderer.formatCellRendererCenter(this.tblKhuyenMai, 3);
        FormatCellRenderer.formatCellRendererCenter(this.tblKhuyenMai, 4);
        FormatCellRenderer.formatCellRendererCenter(this.tblKhuyenMai, 5);
    }

    public void setStatusAllBtnsStart() {
        java.util.List<JButton> listBtn = java.util.Arrays.asList(this.btnHuy, this.btnXoaTrang, this.btnCapNhat, this.btnLuu);
        ComponentStatus.setStatusBtn(listBtn, false);
        ComponentStatus.setStatusBtn(this.btnThemMoi, true);
    }

    //    Set ngày mặc định là ngày hiện tại
    public void setDefaultCalender() {
        Date currentDate = new Date();
        this.dchNgayBatDau.setDate(currentDate);

        // Lấy ngày hiện tại
        LocalDate dateNow = LocalDate.now();
        // Tính toán ngày hôm sau
        LocalDate nextDay = dateNow.plusDays(1);
        DateStandard.formatDate(this.dchNgayBatDau.getDate());
        Instant instant = nextDay.atStartOfDay(ZoneId.systemDefault()).toInstant();

        // Chuyển đổi sang java.util.Date
        java.util.Date utilDate = Date.from(instant);
        this.dchNgayKetThuc.setDate(utilDate);
        DateStandard.formatDate(this.dchNgayKetThuc.getDate());
    }

    public String taoMa() {
        NumberFormat nf = new DecimalFormat("000");
        int number = 1;
        String maKM = "KM" + nf.format(number);

//        Lấy danh sách mã Khuyến Mãi
        ArrayList<String> dsMaKM = new ArrayList<>();
        for (KhuyenMai ctkm : dsKhuyenMai) {
            dsMaKM.add(ctkm.getMaKhuyenMai());
        }
//        Kiểm tra mã đã tồn tại trong danh sách hay chưa
        while (dsMaKM.contains(maKM)) {
            number++;
            maKM = "KM" + nf.format(number);
        }
        return maKM.trim();
    }

    private void loadDataTable() {
        DefaultTableModel modelKhuyenMai = (DefaultTableModel) this.tblKhuyenMai.getModel();
        modelKhuyenMai.setRowCount(0);
        for (KhuyenMai km : this.dsKhuyenMai) {
            Object[] data = {km.getMaKhuyenMai(), km.getTenCTKM(), NumberStandard.formatPercent(km.getMucGiamGia()), km.getSoLuotSuDung(),
                DateStandard.formatDate(km.getNgayBatDau()), DateStandard.formatDate(km.getNgayKetThuc())};
//            Thêm dữ liệu vào table
            modelKhuyenMai.addRow(data);
        }
    }

    //this.dchNgayBatDau.setEnabled(false);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleKhuyenMai = new javax.swing.JLabel();
        lblTimKiemCTKM = new javax.swing.JLabel();
        txtTimCTKM = new javax.swing.JTextField();
        pnFields = new javax.swing.JPanel();
        pnLeft = new javax.swing.JPanel();
        txtMa = new javax.swing.JTextField();
        lblMa = new javax.swing.JLabel();
        lblTenCTKM = new javax.swing.JLabel();
        txtTenCTKM = new javax.swing.JTextField();
        lblMucGiamGia = new javax.swing.JLabel();
        txtMucGiamGia = new javax.swing.JTextField();
        pnRight = new javax.swing.JPanel();
        lblSoLuotSuDung = new javax.swing.JLabel();
        txtSoLuotSuDung = new javax.swing.JTextField();
        lblNgayBatDau = new javax.swing.JLabel();
        lblNgayKetThuc = new javax.swing.JLabel();
        dchNgayBatDau = new com.toedter.calendar.JDateChooser();
        dchNgayKetThuc = new com.toedter.calendar.JDateChooser();
        pnControl = new javax.swing.JPanel();
        btnXoaTrang = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        scrKhuyenMai = new javax.swing.JScrollPane();
        tblKhuyenMai = new javax.swing.JTable();
        cmbTieuChiTimKiem = new javax.swing.JComboBox<>();

        setBackground(ColorConstant.WHITE);

        lblTitleKhuyenMai.setFont(org.group06.utils.FontConstant.FONT_HEADER);
        lblTitleKhuyenMai.setForeground(org.group06.utils.ColorConstant.BLACK);
        lblTitleKhuyenMai.setText("Chương Trình Khuyến Mãi");
        lblTitleKhuyenMai.setMaximumSize(new java.awt.Dimension(103, 110));
        lblTitleKhuyenMai.setMinimumSize(new java.awt.Dimension(103, 110));
        lblTitleKhuyenMai.setPreferredSize(new java.awt.Dimension(103, 110));

        lblTimKiemCTKM.setFont(FontConstant.FONT_LABEL);
        lblTimKiemCTKM.setText("Tiếm Chương Trình Khuyến Mãi");

        txtTimCTKM.setFont(FontConstant.FONT_TEXT);
        txtTimCTKM.setForeground(ColorConstant.BLACK);
        txtTimCTKM.setToolTipText("Nhập mã khuyến mãi cần tìm");
        txtTimCTKM.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTimCTKM.setMinimumSize(new java.awt.Dimension(64, 40));
        txtTimCTKM.setPreferredSize(new java.awt.Dimension(64, 50));
        txtTimCTKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimCTKMActionPerformed(evt);
            }
        });
        txtTimCTKM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimCTKMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimCTKMKeyReleased(evt);
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
        lblMa.setText("Mã Khuyến Mãi:");

        lblTenCTKM.setFont(FontConstant.FONT_LABEL);
        lblTenCTKM.setText("Tên CTKM:");

        txtTenCTKM.setFont(FontConstant.FONT_TEXT);
        txtTenCTKM.setEnabled(false);
        txtTenCTKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenCTKMActionPerformed(evt);
            }
        });

        lblMucGiamGia.setFont(FontConstant.FONT_LABEL);
        lblMucGiamGia.setText("Mức Giảm Giá:");

        txtMucGiamGia.setFont(FontConstant.FONT_TEXT);
        txtMucGiamGia.setEnabled(false);
        txtMucGiamGia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMucGiamGiaFocusLost(evt);
            }
        });
        txtMucGiamGia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMucGiamGiaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnLeftLayout = new javax.swing.GroupLayout(pnLeft);
        pnLeft.setLayout(pnLeftLayout);
        pnLeftLayout.setHorizontalGroup(
            pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLeftLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLeftLayout.createSequentialGroup()
                        .addComponent(lblMa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMa))
                    .addGroup(pnLeftLayout.createSequentialGroup()
                        .addComponent(lblTenCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenCTKM, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
                    .addGroup(pnLeftLayout.createSequentialGroup()
                        .addComponent(lblMucGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMucGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)))
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
                .addGap(32, 32, 32)
                .addGroup(pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLeftLayout.createSequentialGroup()
                        .addComponent(lblTenCTKM)
                        .addGap(8, 8, 8)))
                .addGap(32, 32, 32)
                .addGroup(pnLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLeftLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblMucGiamGia))
                    .addComponent(txtMucGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pnFields.add(pnLeft);

        pnRight.setBackground(new java.awt.Color(204, 204, 204));

        lblSoLuotSuDung.setFont(FontConstant.FONT_LABEL);
        lblSoLuotSuDung.setText("Số Lượt Sử Dụng:");
        lblSoLuotSuDung.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblSoLuotSuDung.setMaximumSize(new java.awt.Dimension(91, 40));
        lblSoLuotSuDung.setMinimumSize(new java.awt.Dimension(91, 40));
        lblSoLuotSuDung.setPreferredSize(new java.awt.Dimension(170, 40));

        txtSoLuotSuDung.setFont(FontConstant.FONT_TEXT);
        txtSoLuotSuDung.setEnabled(false);
        txtSoLuotSuDung.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSoLuotSuDungFocusLost(evt);
            }
        });
        txtSoLuotSuDung.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSoLuotSuDungKeyReleased(evt);
            }
        });

        lblNgayBatDau.setFont(FontConstant.FONT_LABEL);
        lblNgayBatDau.setText("Ngày Bắt Đầu:");

        lblNgayKetThuc.setFont(FontConstant.FONT_LABEL);
        lblNgayKetThuc.setText("Ngày Kết Thúc:");

        dchNgayBatDau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchNgayBatDau.setMaxSelectableDate(dchNgayKetThuc.getDate());
        dchNgayBatDau.setPreferredSize(new java.awt.Dimension(64, 29));
        dchNgayBatDau.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchNgayBatDauPropertyChange(evt);
            }
        });

        dchNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchNgayKetThuc.setMinSelectableDate(dchNgayBatDau.getDate());
        dchNgayKetThuc.setPreferredSize(new java.awt.Dimension(64, 29));
        dchNgayKetThuc.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchNgayKetThucPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnRightLayout = new javax.swing.GroupLayout(pnRight);
        pnRight.setLayout(pnRightLayout);
        pnRightLayout.setHorizontalGroup(
            pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRightLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSoLuotSuDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoLuotSuDung)
                    .addComponent(dchNgayBatDau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addComponent(dchNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        pnRightLayout.setVerticalGroup(
            pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRightLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoLuotSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoLuotSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRightLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblNgayBatDau))
                    .addGroup(pnRightLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(dchNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRightLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblNgayKetThuc)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRightLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dchNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );

        dchNgayBatDau.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadIcon(org.group06.utils.ImagePath.ICON_CALENDAR));

        dchNgayBatDau.getDateEditor().setEnabled(false);

        ((com.toedter.calendar.JTextFieldDateEditor) dchNgayBatDau.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);
        dchNgayKetThuc.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadIcon(org.group06.utils.ImagePath.ICON_CALENDAR));

        dchNgayKetThuc.getDateEditor().setEnabled(false);

        ((com.toedter.calendar.JTextFieldDateEditor) dchNgayKetThuc.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnXoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(32, 32, 32))
        );

        tblKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khuyến Mãi", "Tên CTKM", "Mức Giảm Giá", "Số Lượt Sử Dụng", "Ngày Bắt Đầu", "Ngày Kết Thúc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhuyenMai.setRowHeight(40);
        tblKhuyenMai.setShowGrid(true);
        tblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhuyenMaiMouseClicked(evt);
            }
        });
        scrKhuyenMai.setViewportView(tblKhuyenMai);

        cmbTieuChiTimKiem.setFont(FontConstant.FONT_TEXT);
        cmbTieuChiTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn tiêu chí tìm kiếm", "Tìm theo mã", "Tìm theo tên"}));
        cmbTieuChiTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTieuChiTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnFields, javax.swing.GroupLayout.DEFAULT_SIZE, 1235, Short.MAX_VALUE)
                    .addComponent(pnControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitleKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTimKiemCTKM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimCTKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTieuChiTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrKhuyenMai))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTitleKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTimKiemCTKM))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTieuChiTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addComponent(pnFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimCTKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimCTKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimCTKMActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        ComponentStatus.emptyField(this.txtTenCTKM);
        ComponentStatus.emptyField(this.txtMucGiamGia);
        ComponentStatus.emptyField(this.txtSoLuotSuDung);
        setDefaultCalender();
    }//GEN-LAST:event_btnXoaTrangActionPerformed

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        this.statusBtnThemMoi = true;
        this.statusBtnCapNhat = false;
        this.statusClickCheckDate = true;
        ComponentStatus.setStatusBtn(this.btnThemMoi, false);
        ComponentStatus.setStatusBtn(this.btnCapNhat, false);
        ComponentStatus.setStatusBtn(this.btnXoaTrang, true);
        ComponentStatus.setStatusBtn(this.btnLuu, true);
        ComponentStatus.setStatusBtn(this.btnHuy, true);
        this.txtMa.setText(taoMa());
        this.txtTenCTKM.setEnabled(true);
        this.txtMucGiamGia.setEnabled(true);
        this.txtSoLuotSuDung.setEnabled(true);
        this.dchNgayBatDau.setEnabled(true);
        this.dchNgayKetThuc.setEnabled(true);
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        LocalDate ngayBD = new java.sql.Date(dchNgayBatDau.getDate().getTime()).toLocalDate();
        LocalDate ngayKT = new java.sql.Date(dchNgayKetThuc.getDate().getTime()).toLocalDate();
        if (txtMa.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mã chương trình khuyến mãi đang trống không thể lưu");
        } else if (txtTenCTKM.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên chương trình khuyến mãi đang trống không thể lưu");
            this.txtTenCTKM.requestFocus();
        } else if (txtMucGiamGia.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mức giảm giá của chương trình khuyến mãi đang trống không thể lưu");
            this.txtMucGiamGia.requestFocus();
        } else if (txtSoLuotSuDung.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Số lượt sử dụng của chương trình khuyến mãi đang trống không thể lưu");
            this.txtSoLuotSuDung.requestFocus();
        } else if (ngayKT.isBefore(ngayBD)) {
            JOptionPane.showMessageDialog(null, "Ngày kết thúc không được trước ngày bắt đầu!");
            LocalDate nextDay = ngayBD.plusDays(1);
            Instant instant = nextDay.atStartOfDay(ZoneId.systemDefault()).toInstant();
            // Chuyển đổi sang java.util.Date
            java.util.Date utilDate = Date.from(instant);
            this.dchNgayKetThuc.setDate(utilDate);
        } else if (!txtMucGiamGia.getText().trim().matches("^[0-9]+\\.?[0-9]*$")) {
            JOptionPane.showMessageDialog(null,
                    "Vui lòng nhập số(sử dụng dấu . với số thực)!");
            this.txtMucGiamGia.selectAll();
            this.txtMucGiamGia.requestFocus();
        } else {
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn lưu?", "Xác nhận hành động", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                if (this.statusBtnCapNhat == true && this.statusBtnThemMoi == false) {
//                    Lấy giá trị từ fields
                    viTri = this.tblKhuyenMai.getSelectedRow();
                    String maCTKM = this.txtMa.getText().trim();
                    String tenCTKM = this.txtTenCTKM.getText().trim();
                    double mucGiamGiaCTKM = Double.parseDouble(this.txtMucGiamGia.getText().trim());
                    int soLuotSDCTKM = Integer.parseInt(this.txtSoLuotSuDung.getText().trim());
                    java.sql.Date ngayBatDauCTKM = new java.sql.Date(this.dchNgayBatDau.getDate().getTime());
                    java.sql.Date ngayKetThucCTKM = new java.sql.Date(this.dchNgayKetThuc.getDate().getTime());
//                    Lấy dữ liệu chương trình khuyến mãi cần cập nhật
                    this.ctkmCapNhat = new DAO_KhuyenMai(DatabaseConstant.getConnection()).getByID(maCTKM);
                    this.ctkmCapNhat.setTenCTKM(tenCTKM);
                    this.ctkmCapNhat.setMucGiamGia(mucGiamGiaCTKM);
                    this.ctkmCapNhat.setSoLuotSuDung(soLuotSDCTKM);
                    this.ctkmCapNhat.setNgayBatDau(ngayBatDauCTKM);
                    this.ctkmCapNhat.setNgayKetThuc(ngayKetThucCTKM);
//                    Xử lý cập nhật dữ liệu vào cơ sở dữ liệu
                    this.ctkm_DAO = new DAO_KhuyenMai(DatabaseConstant.getConnection());
                    if (this.ctkm_DAO.update(ctkmCapNhat)) {
                        System.out.println("Cập nhật thành công chương trình khuyến mãi!");
                        JOptionPane.showMessageDialog(null, "Chúc mừng bạn đã cập nhật thành công chương trình khuyến mãi " + this.ctkmCapNhat.getTenCTKM());
//                        Xử lý gửi email cho khách hàng về chương trình khuyến mãi đã cập nhật
                        xuLyGuiEmailKhachHang(tenCTKM,ngayBatDauCTKM, ngayKetThucCTKM, soLuotSDCTKM, NumberStandard.formatPercent(mucGiamGiaCTKM));
                    }
//                    Đổ dữ liệu vừa cập nhật xuống table
                    this.tblKhuyenMai.getModel().setValueAt(tenCTKM, viTri, 1);
                    this.tblKhuyenMai.getModel().setValueAt(NumberStandard.formatPercent(mucGiamGiaCTKM), viTri, 2);
                    this.tblKhuyenMai.getModel().setValueAt(soLuotSDCTKM, viTri, 3);
                    this.tblKhuyenMai.getModel().setValueAt(DateStandard.formatDate(ngayBatDauCTKM), viTri, 4);
                    this.tblKhuyenMai.getModel().setValueAt(DateStandard.formatDate(ngayKetThucCTKM), viTri, 5);
                } else if (this.statusBtnThemMoi == true && this.statusBtnCapNhat == false) {
                    this.statusClickCheckDate = false;
//                    Lấy giá trị của fields
                    String maCTKM = this.txtMa.getText().trim();
                    String tenCTKM = this.txtTenCTKM.getText().trim();
                    double mucGiamGiaCTKM = Double.parseDouble(this.txtMucGiamGia.getText().trim());
                    int soLuotSDCTKM = Integer.parseInt(this.txtSoLuotSuDung.getText().trim());
                    java.sql.Date ngayBatDauCTKM = new java.sql.Date(this.dchNgayBatDau.getDate().getTime());
                    java.sql.Date ngayKetThucCTKM = new java.sql.Date(this.dchNgayKetThuc.getDate().getTime());
//                    Set giá trị cho thuộc tính của nhà cung cấp
                    KhuyenMai ctkm = new KhuyenMai();
                    ctkm.setMaKhuyenMai(maCTKM);
                    ctkm.setTenCTKM(tenCTKM);
                    ctkm.setMucGiamGia(mucGiamGiaCTKM);
                    ctkm.setSoLuotSuDung(soLuotSDCTKM);
                    ctkm.setNgayBatDau(ngayBatDauCTKM);
                    ctkm.setNgayKetThuc(ngayKetThucCTKM);
                    dsKhuyenMai.add(ctkm);
//                    Load xuống table
                    Object[] data = {maCTKM, tenCTKM, NumberStandard.formatPercent(mucGiamGiaCTKM), soLuotSDCTKM, DateStandard.formatDate(ngayBatDauCTKM), DateStandard.formatDate(ngayKetThucCTKM)};
                    DefaultTableModel modelTable = (DefaultTableModel) this.tblKhuyenMai.getModel();
                    modelTable.addRow(data);
//                    Lưu nhà cung cấp mới vào cơ sở dữ liệu
                    this.themMoiCTKM = new DAO_KhuyenMai(DatabaseConstant.getConnection());
                    if (this.themMoiCTKM.add(ctkm)) {
                        JOptionPane.showMessageDialog(null, "Chúc mừng bạn đã thêm mới thành công chương trình khuyến mãi " + tenCTKM);
//                        Xử lý gửi email cho khách hàng về chương trình khuyến mãi đã thêm mới
                        xuLyGuiEmailKhachHang(tenCTKM,ngayBatDauCTKM, ngayKetThucCTKM, soLuotSDCTKM, NumberStandard.formatPercent(mucGiamGiaCTKM));
                    }
                }
                setStatusAllBtnsStart();
                ComponentStatus.emptyField(this.txtMa);
                ComponentStatus.emptyField(this.txtTenCTKM);
                ComponentStatus.emptyField(this.txtMucGiamGia);
                ComponentStatus.emptyField(this.txtSoLuotSuDung);
                setDefaultCalender();
                this.txtTenCTKM.setEnabled(false);
                this.txtMucGiamGia.setEnabled(false);
                this.txtSoLuotSuDung.setEnabled(false);
                this.dchNgayBatDau.setEnabled(false);
                this.dchNgayKetThuc.setEnabled(false);
                this.tblKhuyenMai.clearSelection();
                this.statusBtnCapNhat = false;
                this.statusBtnThemMoi = false;
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void xuLyGuiEmailKhachHang(String tenCTKM, java.sql.Date ngayBatDauCTKM, java.sql.Date ngayKetThucCTKM, int soLuotSDCTKM, String mucGiamGia) {
//        Lấy ngày hiện tại
        LocalDate currentDate = LocalDate.now();
//        Ngày bắt đầu chương trình khuyến mãi
        LocalDate startDate = ngayBatDauCTKM.toLocalDate();
        if (startDate.isAfter(currentDate) || startDate.isEqual(currentDate)) {
            for (KhachHang kh : dsKhachHang) {
                new Thread(() -> {
                    if (kh.getEmail() != null) {
                        EmailCreator.sendEmail(kh.getEmail(), tenCTKM, "Thân gửi quý khách hàng thân mến. \n\nCửa hàng chúng tôi cập nhật chương trình khuyến mãi bắt đầu vào ngày: "
                                + DateStandard.formatDate(ngayBatDauCTKM) +
                                " kết thúc chương trình vào ngày: " + 
                                DateStandard.formatDate(ngayKetThucCTKM) + 
                                "\nVới tổng số lượt áp dụng lên đến " + soLuotSDCTKM + " lượt sử dụng. \nVà mức giảm giá: " + mucGiamGia +
                                ". Nhằm đưa đến quý khách hàng các sản phẩm chất lượng nhất cùng với giá thành vô cùng ưu đãi.\n"
                                + " Xin cảm ơn quý khách đã theo dõi chương trình khuyến mãi của cửa hàng AM chúng tôi. Hẹn gặp lại quý khách tại của hàng.");
                    }
                }).start();
            }
        }
    }

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn chắn chắn cập nhật?", "Xác nhận hành động", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            this.statusBtnCapNhat = true;
            ComponentStatus.setStatusBtn(this.btnCapNhat, false);
            ComponentStatus.setStatusBtn(this.btnXoaTrang, true);
            ComponentStatus.setStatusBtn(this.btnLuu, true);
            this.txtTenCTKM.setEnabled(true);
            this.txtMucGiamGia.setEnabled(true);
            this.txtSoLuotSuDung.setEnabled(true);
            this.dchNgayBatDau.setEnabled(true);
            this.dchNgayKetThuc.setEnabled(true);
            this.statusClickCheckDate = true;
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn chắn chắn hủy?", "Xác nhận hành động", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            setStatusAllBtnsStart();
            ComponentStatus.emptyField(this.txtMa);
            ComponentStatus.emptyField(this.txtTenCTKM);
            ComponentStatus.emptyField(this.txtMucGiamGia);
            ComponentStatus.emptyField(this.txtSoLuotSuDung);
            setDefaultCalender();
            this.txtTenCTKM.setEnabled(false);
            this.txtMucGiamGia.setEnabled(false);
            this.txtSoLuotSuDung.setEnabled(false);
            this.dchNgayBatDau.setEnabled(false);
            this.dchNgayKetThuc.setEnabled(false);
            this.statusBtnCapNhat = false;
            this.statusBtnThemMoi = false;
            this.statusClickCheckDate = false;
        }
    }//GEN-LAST:event_btnHuyActionPerformed

    //    Xử lý đưa dữ liệu từ row table lên fields

    private void tblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhuyenMaiMouseClicked
        this.statusClickCheckDate = true;
        int vitri = this.tblKhuyenMai.getSelectedRow();//        Lấy vị trí dòng click
//        Lấy và set giá trị cho fields
        this.txtMa.setText(tblKhuyenMai.getValueAt(vitri, 0).toString());
        this.txtTenCTKM.setText(tblKhuyenMai.getValueAt(vitri, 1).toString());
        this.txtMucGiamGia.setText(NumberStandard.parsePercent(tblKhuyenMai.getValueAt(vitri, 2).toString()) + "");
        this.txtSoLuotSuDung.setText(tblKhuyenMai.getValueAt(vitri, 3).toString());

//            Ngày bắt đầu khuyến mãi
        java.util.Date ngayBatDau = DateStandard.parseToDate(tblKhuyenMai.getValueAt(vitri, 4).toString());
        this.dchNgayBatDau.setDate(ngayBatDau);
        DateStandard.formatDate(this.dchNgayBatDau.getDate());
//            Ngày kết thúc khuyến mãi
        java.util.Date ngayKetThuc = DateStandard.parseToDate(tblKhuyenMai.getValueAt(vitri, 5).toString());
        this.dchNgayKetThuc.setDate(ngayKetThuc);
        DateStandard.formatDate(this.dchNgayKetThuc.getDate());

        this.txtTenCTKM.setEnabled(false);
        this.txtMucGiamGia.setEnabled(false);
        this.txtSoLuotSuDung.setEnabled(false);
        this.dchNgayBatDau.setEnabled(false);
        this.dchNgayKetThuc.setEnabled(false);

        ComponentStatus.setStatusBtn(this.btnThemMoi, false);
        ComponentStatus.setStatusBtn(this.btnXoaTrang, false);
        ComponentStatus.setStatusBtn(this.btnLuu, false);
        ComponentStatus.setStatusBtn(this.btnHuy, true);
        ComponentStatus.setStatusBtn(this.btnCapNhat, true);
        this.statusBtnCapNhat = false;
        this.statusBtnThemMoi = false;

    }//GEN-LAST:event_tblKhuyenMaiMouseClicked

    private void dchNgayBatDauPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchNgayBatDauPropertyChange
        if (evt.getPropertyName().equals("date")) {
            if (this.statusClickCheckDate == false) {
                LocalDate ngayHienTai = LocalDate.now();
                LocalDate ngayBD = new java.sql.Date(dchNgayBatDau.getDate().getTime()).toLocalDate();

                if (ngayBD.isBefore(ngayHienTai)) {
                    JOptionPane.showMessageDialog(null, "Ngày bắt đầu không được trước ngày hiện tại!");
                    dchNgayBatDau.setDate(new Date());
                    System.out.println("Bạn chọn ngày trước ngày hiện tại.");
                }
            }
        }
        dongBoKhoangThoiGian();
    }//GEN-LAST:event_dchNgayBatDauPropertyChange

    private void dchNgayKetThucPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchNgayKetThucPropertyChange
        if (evt.getPropertyName().equals("date")) {
            if (this.statusClickCheckDate == false) {
                LocalDate ngayBD = new java.sql.Date(dchNgayBatDau.getDate().getTime()).toLocalDate();
                LocalDate ngayKT = new java.sql.Date(dchNgayKetThuc.getDate().getTime()).toLocalDate();
                if (!ngayKT.isAfter(ngayBD)) {
                    JOptionPane.showMessageDialog(null, "Ngày kết thúc không được là ngày bắt đầu hoặc trước ngày bắt đầu!");
//                dchNgayBatDau.setDate(new Date());
                    LocalDate nextDay = ngayBD.plusDays(1);
                    Instant instant = nextDay.atStartOfDay(ZoneId.systemDefault()).toInstant();
                    // Chuyển đổi sang java.util.Date
                    java.util.Date utilDate = Date.from(instant);
                    this.dchNgayKetThuc.setDate(utilDate);
                }
            }
        }
        dongBoKhoangThoiGian();
    }//GEN-LAST:event_dchNgayKetThucPropertyChange

    private void dongBoKhoangThoiGian() {
        dchNgayBatDau.setMaxSelectableDate(dchNgayKetThuc.getDate());
        dchNgayKetThuc.setMinSelectableDate(dchNgayBatDau.getDate());
    }

    private void loadAllTableKhuyenMai(ArrayList<KhuyenMai> dsCTKM) {
        DefaultTableModel modelKhuyenMai = (DefaultTableModel) this.tblKhuyenMai.getModel();
        modelKhuyenMai.setRowCount(0);
        for (KhuyenMai khuyenMai : dsCTKM) {
            Object[] data = {khuyenMai.getMaKhuyenMai(), khuyenMai.getTenCTKM(), khuyenMai.getMucGiamGia(), khuyenMai.getSoLuotSuDung(), khuyenMai.getNgayBatDau(), khuyenMai.getNgayKetThuc()};
            // Thêm dữ liệu vào table
            modelKhuyenMai.addRow(data);
        }
    }

    private void xuLyTimKiemCTKM() {
        String duLieuTimKiem = this.txtTimCTKM.getText().trim();
        int tieuChiTimKiem = this.cmbTieuChiTimKiem.getSelectedIndex();
        if (duLieuTimKiem.isEmpty() || tieuChiTimKiem == 0) {
            loadDataTable();
        } else {
            ArrayList<KhuyenMai> dsKhuyenMaiTimDuoc = new ArrayList<>();
            if (tieuChiTimKiem == 1) {
                for (KhuyenMai km : this.dsKhuyenMai) {
                    if (km.getMaKhuyenMai().contains(duLieuTimKiem)) {
                        dsKhuyenMaiTimDuoc.add(km);
                    }
                }
            } else if (tieuChiTimKiem == 2) {
                for (KhuyenMai km : this.dsKhuyenMai) {
                    if (km.getTenCTKM().contains(duLieuTimKiem)) {
                        dsKhuyenMaiTimDuoc.add(km);
                    }
                }
            }

//        Cập nhật kết quả tìm kiếm lên bảng
            loadAllTableKhuyenMai(dsKhuyenMaiTimDuoc);
        }
    }

    //    Xử lý tìm kiếm chương trình khuyến mãi
    private void txtTimCTKMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimCTKMKeyPressed
        xuLyTimKiemCTKM();
    }//GEN-LAST:event_txtTimCTKMKeyPressed

    private void txtTimCTKMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimCTKMKeyReleased
        xuLyTimKiemCTKM();
    }//GEN-LAST:event_txtTimCTKMKeyReleased

    private void cmbTieuChiTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTieuChiTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTieuChiTimKiemActionPerformed

    private void txtMucGiamGiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMucGiamGiaFocusLost

    }//GEN-LAST:event_txtMucGiamGiaFocusLost

    private void txtSoLuotSuDungFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSoLuotSuDungFocusLost

    }//GEN-LAST:event_txtSoLuotSuDungFocusLost

    private void txtMucGiamGiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMucGiamGiaKeyReleased
        if (!txtMucGiamGia.getText().trim().matches("^[0-9]+\\.?[0-9]*$")) {
            JOptionPane.showMessageDialog(null,
                    "Vui lòng nhập số(sử dụng dấu . với số thực)!");
            this.txtMucGiamGia.selectAll();
            this.txtMucGiamGia.requestFocus();
        }
    }//GEN-LAST:event_txtMucGiamGiaKeyReleased

    private void txtSoLuotSuDungKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuotSuDungKeyReleased
        if (!txtSoLuotSuDung.getText().trim().matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null,
                    "Vui lòng nhập số nguyên dương");
            this.txtSoLuotSuDung.selectAll();
            this.txtSoLuotSuDung.requestFocus();
        }
    }//GEN-LAST:event_txtSoLuotSuDungKeyReleased

    private void txtTenCTKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenCTKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenCTKMActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JComboBox<String> cmbTieuChiTimKiem;
    private com.toedter.calendar.JDateChooser dchNgayBatDau;
    private com.toedter.calendar.JDateChooser dchNgayKetThuc;
    private javax.swing.JLabel lblMa;
    private javax.swing.JLabel lblMucGiamGia;
    private javax.swing.JLabel lblNgayBatDau;
    private javax.swing.JLabel lblNgayKetThuc;
    private javax.swing.JLabel lblSoLuotSuDung;
    private javax.swing.JLabel lblTenCTKM;
    private javax.swing.JLabel lblTimKiemCTKM;
    private javax.swing.JLabel lblTitleKhuyenMai;
    private javax.swing.JPanel pnControl;
    private javax.swing.JPanel pnFields;
    private javax.swing.JPanel pnLeft;
    private javax.swing.JPanel pnRight;
    private javax.swing.JScrollPane scrKhuyenMai;
    private javax.swing.JTable tblKhuyenMai;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMucGiamGia;
    private javax.swing.JTextField txtSoLuotSuDung;
    private javax.swing.JTextField txtTenCTKM;
    private javax.swing.JTextField txtTimCTKM;
    // End of variables declaration//GEN-END:variables
    private ArrayList<KhuyenMai> dsKhuyenMai = new DAO_KhuyenMai(DatabaseConstant.getConnection()).getAll();
    private boolean statusBtnThemMoi = true;
    private boolean statusBtnCapNhat = true;
    private boolean statusClickCheckDate = false;
    private int viTri = 0;
    private KhuyenMai ctkmCapNhat = null;
    private DAO_KhuyenMai ctkm_DAO = null;
    private DAO_KhuyenMai themMoiCTKM = null;
    private ArrayList<KhachHang> dsKhachHang = new DAO_KhachHang(DatabaseConstant.getConnection()).getAll();
}
