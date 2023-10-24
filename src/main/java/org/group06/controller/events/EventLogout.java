package org.group06.controller.events;

import org.group06.view.screen.Frame;
import org.group06.view.screen.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventLogout implements ActionListener {

    private final Frame mainFrame;

    public EventLogout(Frame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Thông báo đăng xuất thành công
        // Đóng cửa sổ chính
        mainFrame.dispose();
        // Mở Login Frame
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
    }
}
