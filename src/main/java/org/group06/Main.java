package org.group06;

import com.formdev.flatlaf.FlatLightLaf;
import org.group06.utils.ColorConstant;
import org.group06.utils.FontConstant;
import org.group06.view.screen.Login;
import org.group06.view.screen.MainFrame;

import javax.swing.*;

public class Main {

    private static Login loginFrame = new Login();
    private static MainFrame mainFrame = new MainFrame();

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new FlatLightLaf());
            UIManager.put("TableHeader.font", FontConstant.FONT_BUTTON);
            UIManager.put("TableHeader.opaque", true);
            UIManager.put("TableHeader.background", ColorConstant.BUTTON_ACTIVE);
        } catch (UnsupportedLookAndFeelException ex) {
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
