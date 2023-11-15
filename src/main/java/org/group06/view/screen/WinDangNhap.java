package org.group06.view.screen;

import org.group06.db.DatabaseConstant;
import org.group06.db.dao.DAO_NhanVien;
import org.group06.model.entity.NhanVien;
import org.group06.utils.ColorConstant;
import org.group06.utils.FontConstant;
import org.group06.utils.ImagePath;
import org.group06.view.components.panels.ImagePanel;
import org.group06.view.components.textFields.PasswordField;
import org.group06.view.components.textFields.TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinDangNhap extends JFrame implements ActionListener {

    private JButton btnLogin;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblTitle;
    private ImagePanel pnImage;
    private javax.swing.JPanel pnLogin;
    private PasswordField pwdPassword;
    private TextField txtUsername;

    public WinDangNhap() {
        initComponents();
        this.txtUsername.setText("NV002");
        this.pwdPassword.setText("1111");
    }

    private void initComponents() {

        pnLogin = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSubTitle = new javax.swing.JLabel();
        txtUsername = new TextField();
        pwdPassword = new PasswordField();
        btnLogin = new JButton("Đăng Nhập");
        btnLogin.setBackground(ColorConstant.BUTTON_ACTIVE);
        pnImage = new ImagePanel(ImagePath.THUMBNAIL_LOGIN, 820, 600);
//        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập - Nhóm 06");
        setIconImage(new ImageIcon(ImagePath.THUMBNAIL_ICON).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(1345, 600));
        setBackground(ColorConstant.BACKGROUND_LOGIN);

        pnLogin.setMaximumSize(new java.awt.Dimension(447, 600));
        pnLogin.setMinimumSize(new java.awt.Dimension(447, 600));
        pnLogin.setPreferredSize(new java.awt.Dimension(447, 600));
        pnLogin.setBackground(ColorConstant.WHITE);

        lblTitle.setFont(FontConstant.FONT_HEADER);
        lblTitle.setForeground(ColorConstant.BLACK);
        lblTitle.setText("Đăng Nhập Tài Khoản");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTitle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblSubTitle.setText("Vui lòng nhập tài khoản của bạn");
        lblSubTitle.setFont(FontConstant.FONT_SUB_HEADER);
        lblSubTitle.setForeground(ColorConstant.BLACK);
        lblSubTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblSubTitle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        txtUsername.setFont(FontConstant.FONT_TEXT);
        txtUsername.setHint("Mã nhân viên");
        txtUsername.setToolTipText("Nhập vào mã nhân viên");
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        pwdPassword.setFont(FontConstant.FONT_TEXT);
        pwdPassword.setHint("Mật khẩu");
        pwdPassword.setToolTipText("Nhập vào mật khẩu");
        pwdPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnLogin.setFont(FontConstant.FONT_BUTTON);
        btnLogin.setForeground(ColorConstant.WHITE);
        btnLogin.setText("Đăng Nhập");
        btnLogin.setToolTipText("Click để đăng nhập");
        btnLogin.addActionListener(this);
        btnLogin.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
                pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnLoginLayout.createSequentialGroup()
                                .addContainerGap(50, 50)
                                .addGroup(pnLoginLayout.createParallelGroup(GroupLayout.Alignment.CENTER, false)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                        .addComponent(lblSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pwdPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnLoginLayout.createSequentialGroup().addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51))
        );
        pnLoginLayout.setVerticalGroup(
                pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnLoginLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSubTitle)
                                .addGap(68, 68, 68)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGap(70, 70, 70)
                                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnImageLayout = new javax.swing.GroupLayout(pnImage);
        pnImage.setLayout(pnImageLayout);
        pnImageLayout.setHorizontalGroup(
                pnImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 653, Short.MAX_VALUE)
        );
        pnImageLayout.setVerticalGroup(
                pnImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pnImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Kiểm tra mật khẩu
        DAO_NhanVien dao_nv = new DAO_NhanVien(DatabaseConstant.getConnection());
        NhanVien nv = dao_nv.getByID(txtUsername.getText());
        if (nv == null) {
            JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại", "Đăng nhập thất bại", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (nv.getMatKhau().equals(new String(pwdPassword.getPassword()))) {
            // Đóng cửa sổ WinDangNhap
            this.dispose();
            // Mở JFrame MainFrame
            WinGiaoDienChinh mainWinGiaoDienChinh = new WinGiaoDienChinh(nv);
            mainWinGiaoDienChinh.setVisible(true);
        } else {
            // Thông báo lỗi
            JOptionPane.showMessageDialog(null, "Sai tên đăng nhập hoặc mật khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
}
