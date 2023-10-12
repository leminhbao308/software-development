package org.group06;

import org.group06.view.screen.Login;

import javax.swing.*;
import org.group06.view.screen.Form;
import org.group06.view.screen.MainFrame;
import org.group06.view.screen.NewLogin;

public class Main {

    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
//new NewLogin().setVisible(true);
//                new Form().setVisible(true);
//                new MainFrame().setVisible(true);
            }
        });
    }
}
