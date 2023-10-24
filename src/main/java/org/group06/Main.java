package org.group06;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import org.group06.model.entity.NhanVien;
import org.group06.utils.ColorConstant;
import org.group06.view.screen.Frame;
import org.group06.view.screen.Login;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        try {
            //<editor-fold desc="FlatLaf Look and Feel">
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            UIManager.put("TabbedPane:TabbedPaneTab.contentMargins", new Insets(10, 100, 0, 0));
            UIManager.put("TableHeader.font", org.group06.utils.FontConstant.FONT_TABLE_HEADER);
            UIManager.put("Table.selectionBackground", ColorConstant.BUTTON_CLICK);
            UIManager.put("Table.rowHeight", 30);
            UIManager.put("Table.foreground", ColorConstant.BLACK);
            UIManager.put("Table.selectionForeground", ColorConstant.BLACK);
            UIManager.put("fillsViewportHeight", true);
            UIManager.put("Table.font", org.group06.utils.FontConstant.FONT_TABLE);
            UIManager.put("TableHeader.opaque", true);
            UIManager.put("TableHeader.background", ColorConstant.BUTTON_ACTIVE);
            UIManager.put("TableHeader.foreground", ColorConstant.WHITE);
            UIManager.put("Button.arc", 10);
            UIManager.put("Component.arc", 10);
            UIManager.put("ProgressBar.arc", 10);
            UIManager.put("TextComponent.arc", 10);
            UIManager.put("JRootPane.titleBarShowIconify", false);
            UIManager.put("JRootPane.titleBarShowMaximize", false);
            System.setProperty( "flatlaf.menuBarEmbedded", "true");
            UIManager.put( "TabbedPane.selectedBackground", Color.WHITE);
            UIManager.put( "JTabbedPane.hasFullBorder", true );
            //</editor-fold>
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
//            Login loginFrame = new Login();
            Frame frame = new Frame(new NhanVien());
//            loginFrame.setVisible(true);
            frame.setVisible(true);
            frame.requestFocus();
        });
    }
}
