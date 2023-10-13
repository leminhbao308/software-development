package org.group06;

import org.group06.view.screen.Login;
import org.group06.view.screen.MainFrame;

import javax.swing.*;

public class Main {

    private static Login loginFrame = new Login();
    private static MainFrame mainFrame = new MainFrame();

    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                loginFrame.setVisible(true);
//                mainFrame.setVisible(true);
            }
        });
    }
}
