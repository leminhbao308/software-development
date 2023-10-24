package org.group06;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import org.group06.utils.ColorConstant;
import org.group06.view.screen.Frame;
import org.group06.view.screen.Login;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new FlatMacLightLaf());
            UIManager.put("TableHeader.font", org.group06.utils.FontConstant.FONT_TABLE_HEADER);
            UIManager.put("TableHeader.opaque", true);
            UIManager.put("TableHeader.background", ColorConstant.BUTTON_ACTIVE);
//            System.setProperty( "flatlaf.menuBarEmbedded", "false");
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login loginFrame = new Login();
                Frame frame = new Frame();
                loginFrame.setVisible(true);
//                frame.setVisible(true);
            }
        });
    }
}
