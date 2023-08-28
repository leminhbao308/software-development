package org.group06.view.screen;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Main Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setResizable(false);
        setIconImage(new ImageIcon("src/main/resources/images/icon/icon.png").getImage());
        JLabel lbl = new JLabel();
        lbl.setIcon(new ImageIcon("src/main/resources/images/icon/icon.png"));
        this.add(lbl, BorderLayout.CENTER);
    }
}
