package org.group06.view.screen;

import org.group06.utils.ColorConstant;
import org.group06.view.components.buttons.RoundButton;
import org.group06.view.components.panels.ImagePanel;

import javax.swing.*;

public class Login extends JFrame {
    private RoundButton btnForgotPwd;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblTitle;
    private ImagePanel pnImage;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtUsername;

    public Login() {
        initComponents();
    }

    private void initComponents() {

        pnLogin = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSubTitle = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        pwdPassword = new javax.swing.JPasswordField();
        btnForgotPwd = new RoundButton("Forgot Password", ColorConstant.BUTTON_SECONDARY_NORMAL, ColorConstant.BUTTON_SECONDARY_HOVER, ColorConstant.BUTTON_SECONDARY_CLICK);
        btnLogin = new RoundButton("LOGIN", ColorConstant.BUTTON_NORMAL, ColorConstant.BUTTON_HOVER, ColorConstant.BUTTON_CLICK);
        pnImage = new ImagePanel("src/main/resources/images/thumbnail/login.jpg", 653, 600);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Group 06");
        setIconImage(new ImageIcon("src/main/resources/images/icon/icon.png").getImage());
        setResizable(false);
        setMaximumSize(new java.awt.Dimension(1100, 600));
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setPreferredSize(new java.awt.Dimension(1100, 600));

        pnLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnLogin.setMaximumSize(new java.awt.Dimension(447, 600));
        pnLogin.setMinimumSize(new java.awt.Dimension(447, 600));
        pnLogin.setName(""); // NOI18N
        pnLogin.setPreferredSize(new java.awt.Dimension(447, 600));

        lblTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        lblTitle.setText("Login Your Account");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTitle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblSubTitle.setText("Please login to your account");
        lblSubTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblSubTitle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsername.setText("Admin");
        txtUsername.setToolTipText("Enter Username");
        txtUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username or Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        pwdPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pwdPassword.setText("Admin");
        pwdPassword.setToolTipText("Enter Password");
        pwdPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        pwdPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnForgotPwd.setToolTipText("Click if you forgot your password");
        btnForgotPwd.setBorderPainted(false);
        btnForgotPwd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnLogin.setBackground(new java.awt.Color(64, 204, 111));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setToolTipText("Click to login to your account");

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
                                .addGap(155, 155, 155)
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

        pnImage.setMinimumSize(new java.awt.Dimension(653, 600));

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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
