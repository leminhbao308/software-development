package org.group06;

import org.group06.utils.ColorConstant;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(10, "a", "b");
        dataset.setValue(20, "a", "c");
        dataset.setValue(30, "a", "d");
        dataset.setValue(40, "a", "e");
        dataset.setValue(50, "a", "f");

        JFreeChart chart = ChartFactory.createBarChart("Demo", "Category", "Value", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeGridlinePaint(ColorConstant.BUTTON_CLICK);
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame();
        frame.add(chartPanel, BorderLayout.CENTER);
//        ChartFrame frame = new ChartFrame("Demo", chart);
        frame.setVisible(true);
        frame.setSize(450, 350);
    }
}
