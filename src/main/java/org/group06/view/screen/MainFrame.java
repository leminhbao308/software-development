package org.group06.view.screen;

import org.group06.utils.ColorConstant;
import org.group06.utils.ImagePath;
import org.group06.view.components.charts.PieChart;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedHashMap;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Main Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setResizable(false);
        setIconImage(new ImageIcon(ImagePath.ICON_LOGO).getImage());

        LinkedHashMap<String, Double> data = new LinkedHashMap<>();
        data.put("Category 01", 400.0);
        data.put("Category 02", 1204.0);
        data.put("Category 03", 4909.0);
        data.put("Category 04", 789.0);
        data.put("Category 05", 400.0);

        PieChart pieChart = new PieChart(data);
        add(pieChart, BorderLayout.CENTER);
        add(pieChart.createLegendPanel(data, ColorConstant.generateColorPalette(data.size())), BorderLayout.EAST);
    }
}
