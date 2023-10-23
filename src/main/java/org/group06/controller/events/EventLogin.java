package org.group06.controller.events;

import org.group06.view.screen.Frame;
import org.group06.view.screen.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventLogin implements ActionListener {

    private final Login loginFrame;

    public EventLogin(Login loginFrame) {
        this.loginFrame = loginFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Đóng cửa sổ Login
        loginFrame.dispose();
        // Mở JFrame MainFrame
        Frame mainFrame = new Frame();
        mainFrame.setVisible(true);
    }
}
