package org.group06.view.screen;

import org.group06.controller.events.EventLogin;
import org.group06.utils.ColorConstant;
import org.group06.utils.FontConstant;
import org.group06.utils.ImagePath;
import org.group06.view.components.buttons.RoundButton;
import org.group06.view.components.panels.ImagePanel;
import org.group06.view.components.textFields.PasswordField;
import org.group06.view.components.textFields.TextField;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    private RoundButton btnLogin;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblTitle;
    private ImagePanel pnImage;
    private javax.swing.JPanel pnLogin;
    private PasswordField pwdPassword;
    private TextField txtUsername;

    public Login() {
        initComponents();
    }

    private void initComponents() {

        pnLogin = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSubTitle = new javax.swing.JLabel();
        txtUsername = new TextField();
        pwdPassword = new PasswordField();
        btnLogin = new RoundButton("LOGIN", ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        pnImage = new ImagePanel(ImagePath.THUMBNAIL_LOGIN, 820, 600);
//        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập - Nhóm 06");
        setIconImage(new ImageIcon(ImagePath.ICON_LOGO).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(1345, 600));
        setBackground(ColorConstant.BACKGROUND_NORMAL);

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

        txtUsername.setFont(FontConstant.FONT_LABEL);
        txtUsername.setHint("Mã nhân viên");
        txtUsername.setToolTipText("Nhập vào mã nhân viên");
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        pwdPassword.setFont(FontConstant.FONT_LABEL);
        pwdPassword.setHint("Mật khẩu");
        pwdPassword.setToolTipText("Nhập vào mật khẩu");
        pwdPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnLogin.setFont(FontConstant.FONT_BUTTON);
        btnLogin.setForeground(ColorConstant.WHITE);
        btnLogin.setText("Đăng Nhập");
        btnLogin.setToolTipText("Click để đăng nhập");
        btnLogin.addActionListener(new EventLogin(this));
        btnLogin.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
                pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnLoginLayout.createSequentialGroup()
                                .addContainerGap(50,50)
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
}
