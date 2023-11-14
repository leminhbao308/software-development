package org.group06.view.components.charts;

import org.group06.utils.ColorConstant;
import org.group06.view.components.charts.data.BarChartData;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.ui.RectangleEdge;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedHashMap;

public class BarChart extends ChartPanel {

    public BarChart(String title, String xLabel, String yLabel, BarChartData data) throws Exception {
        super(ChartFactory.createBarChart(title, xLabel, yLabel, data.getDataSet()), true, true, true, true, true);
        super.getChart().getCategoryPlot().setRangeGridlinePaint(ColorConstant.BLACK);
        super.getChart().getCategoryPlot().setRangeGridlinePaint(ColorConstant.BLACK);
        super.getChart().getLegend().setItemFont(new Font("Segoe UI", Font.PLAIN, 18));
        super.getChart().getLegend().setPosition(RectangleEdge.RIGHT);
        super.getChart().getCategoryPlot().getDomainAxis().setLabelFont(new Font("Segoe UI", Font.PLAIN, 18));
        super.getChart().getCategoryPlot().getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.UP_45); // Chữ mô tả nghiêng 45 độ
        super.getChart().getCategoryPlot().getRangeAxis().setLabelFont(new Font("Segoe UI", Font.PLAIN, 18));
        super.setDomainZoomable(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LinkedHashMap<String, Double> data1 = new LinkedHashMap<>();
            data1.put("Category 1", 150.0);
            data1.put("Category 2", 300.0);
            data1.put("Category 3", 450.0);
            data1.put("Category 4", 600.0);

            LinkedHashMap<String, Double> data2 = new LinkedHashMap<>();
            data2.put("Category 1", 250.0);
            data2.put("Category 2", 350.0);
            data2.put("Category 3", 500.0);
            data2.put("Category 4", 700.0);

            LinkedHashMap<String, LinkedHashMap<String, Double>> data = new LinkedHashMap<>();
            data.put("Series 1", data1);
            data.put("Series 2", data2);

            JFrame frame = new JFrame("Bar Chart Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            BarChart barChartPanel = null;
            try {
                barChartPanel = new BarChart("Bar Chart Example", "Test", "Category", new BarChartData(data));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            frame.add(barChartPanel);

            frame.setSize(800, 600);
            frame.setVisible(true);
        });
    }
}
