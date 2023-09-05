package org.group06;

import org.group06.utils.ColorConstant;
import org.group06.view.components.charts.HistogramChart;
import org.group06.view.components.charts.data.HistogramData;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedHashMap;

public class Demo {
    public static void main(String[] args) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(10, "a", "b");
        dataset.setValue(20, "a", "c");
        dataset.setValue(30, "a", "d");
        dataset.setValue(40, "a", "e");
        dataset.setValue(50, "a", "f");

        LinkedHashMap<String, Double> data = new LinkedHashMap<>();
        data.put("a", 10.0);
        data.put("a1", 11.0);
        data.put("a2", 12.0);
        data.put("a3", 13.0);
        data.put("a4", 14.0);
        data.put("a5", 15.0);
        data.put("b", 20.0);
        data.put("b1", 21.0);
        data.put("b2", 22.0);
        data.put("b3", 23.0);
        data.put("b4", 24.0);
        data.put("b5", 25.0);
        data.put("c", 30.0);
        data.put("c1", 31.0);
        data.put("c2", 32.0);
        data.put("c3", 33.0);
        data.put("c4", 34.0);
        data.put("c5", 35.0);
        data.put("d", 40.0);
        data.put("d1", 41.0);
        data.put("d2", 42.0);
        data.put("d3", 43.0);
        data.put("d4", 44.0);
        data.put("d5", 45.0);
        data.put("e", 50.0);
        data.put("e1", 51.0);
        data.put("e2", 52.0);
        data.put("e3", 53.0);
        data.put("e4", 54.0);
        data.put("e5", 55.0);
        data.put("f", 60.0);
        data.put("f1", 61.0);
        data.put("f2", 62.0);
        data.put("f3", 63.0);
        data.put("f4", 64.0);
        data.put("f5", 65.0);

        HistogramData hcd = new HistogramData(data);
        JFreeChart c1 = ChartFactory.createHistogram("Demo", "Category", "Value", hcd.getDataSet("Test", 10), PlotOrientation.VERTICAL, true, true, true);
        JFreeChart chart = ChartFactory.createBarChart("Demo", "Category", "Value", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeGridlinePaint(ColorConstant.BUTTON_CLICK);
//        ChartPanel chartPanel = new ChartPanel(chart);
        ChartPanel chartPanel = new ChartPanel(c1);
        HistogramChart hc = new HistogramChart("Demo", "Category", "Value", hcd, "Test", 10);
        JFrame frame = new JFrame();
//        frame.add(chartPanel, BorderLayout.CENTER);
//        ChartFrame frame = new ChartFrame("Demo", chart);
        frame.add(hc, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setSize(450, 350);
    }
}
