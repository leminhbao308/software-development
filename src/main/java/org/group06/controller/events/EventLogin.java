package org.group06.controller.events;

import org.group06.view.screen.Login;
import org.group06.view.screen.MainFrame;

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
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
}
