package org.group06.view.screen;

import org.group06.controller.events.EventLogin;
import org.group06.utils.ColorConstant;
import org.group06.utils.ImagePath;
import org.group06.view.components.buttons.RoundButton;
import org.group06.view.components.panels.ImagePanel;
import org.group06.view.components.textFields.PasswordField;
import org.group06.view.components.textFields.TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    private RoundButton btnForgotPwd;
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
        btnForgotPwd = new RoundButton("Forgot Password", ColorConstant.BUTTON_SECONDARY_NORMAL, ColorConstant.BUTTON_SECONDARY_HOVER, ColorConstant.BUTTON_SECONDARY_CLICK);
        btnLogin = new RoundButton("LOGIN", ColorConstant.BUTTON_NORMAL, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK);
        pnImage = new ImagePanel(ImagePath.THUMBNAIL_LOGIN, 653, 600);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Group 06");
        setIconImage(new ImageIcon(ImagePath.ICON_LOGO).getImage());
        setResizable(false);
        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));
        setBackground(ColorConstant.TEXT_NORMAL);

        pnLogin.setBackground(ColorConstant.BACKGROUND_GRAY);
        pnLogin.setMaximumSize(new java.awt.Dimension(447, 600));
        pnLogin.setMinimumSize(new java.awt.Dimension(447, 600));
        pnLogin.setPreferredSize(new java.awt.Dimension(447, 600));
        pnLogin.setBackground(ColorConstant.BACKGROUND_BLACK);

        lblTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 30));
        lblTitle.setForeground(ColorConstant.TEXT_HEADER_FOOTER);
        lblTitle.setText("Login Your Account");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTitle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblSubTitle.setText("Please login to your account");
        lblSubTitle.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 16));
        lblSubTitle.setForeground(ColorConstant.TEXT_HEADER_FOOTER);
        lblSubTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblSubTitle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 18));
        txtUsername.setHint("Username or Email");
        txtUsername.setToolTipText("Enter Username");
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        pwdPassword.setFont(new java.awt.Font("Segoe UI", 0, 18));
        pwdPassword.setHint("Password");
        pwdPassword.setToolTipText("Enter Password");
        pwdPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnForgotPwd.setToolTipText("Click if you forgot your password");
        btnForgotPwd.setBorderPainted(false);
        btnForgotPwd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnForgotPwd.addActionListener(this);


        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnLogin.setForeground(ColorConstant.TEXT_BUTTON);
        btnLogin.setText("LOGIN");
        btnLogin.setToolTipText("Click to login to your account");
        btnLogin.addActionListener(new EventLogin(this));

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
                pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnLoginLayout.createSequentialGroup()
                                .addContainerGap(78, Short.MAX_VALUE)
                                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                        .addComponent(lblSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pwdPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnLoginLayout.createSequentialGroup()
                                                .addComponent(btnForgotPwd)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(btnForgotPwd)
                                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(119, Short.MAX_VALUE))
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
        Object o = e.getSource();
        if (o == btnForgotPwd) {
            JOptionPane.showMessageDialog(null, "Username: Admin\nPassword: Admin", "Forgot Password", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
