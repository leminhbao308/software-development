package org.group06;

import org.group06.utils.ImagePath;
import org.group06.view.components.panels.AnimatedPanel;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        List<URL> imagePaths = new ArrayList<>();
        imagePaths.add(ImagePath.THUMBNAIL_LOGIN);
        imagePaths.add(ImagePath.ICON_LOGO);

        AnimatedPanel panel = new AnimatedPanel(imagePaths, 500, 500);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
