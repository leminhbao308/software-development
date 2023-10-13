package org.group06.controller.events;

import org.group06.view.screen.Login;
import org.group06.view.screen.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventLogout implements ActionListener {

    private final MainFrame mainFrame;

    public EventLogout(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Thông báo đăng xuất thành công
        JOptionPane.showMessageDialog(null, "Đăng Xuất Thành Công", "Success", JOptionPane.INFORMATION_MESSAGE);
        // Đóng cửa sổ chính
        mainFrame.dispose();
        // Mở Login Frame
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
    }
}
