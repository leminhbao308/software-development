package org.group06.view.components.charts;

import org.group06.utils.ColorConstant;
import org.group06.view.components.charts.data.BarChartData;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;

import javax.swing.*;
import java.util.LinkedHashMap;

public class BarChart extends ChartPanel {

    public BarChart(String title, String xLabel, String yLabel, BarChartData data) throws Exception {
        super(ChartFactory.createBarChart(title, xLabel, yLabel, data.getDataSet()), true, true, true, true, true);
        super.getChart().getCategoryPlot().setRangeGridlinePaint(ColorConstant.TEXT_NORMAL);

        // Đảm bảo xLabel của BarChartData phải trùng với xLabel của BarChart
        if (!xLabel.equals(data.getXLabel())) {
            throw new Exception("xLabel is not matched");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LinkedHashMap<String, Double> data = new LinkedHashMap<>();
            data.put("Category 1", 150.0);
            data.put("Category 2", 300.0);
            data.put("Category 3", 450.0);
            data.put("Category 4", 600.0);

            JFrame frame = new JFrame("Bar Chart Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            BarChart barChartPanel = null;
            try {
                barChartPanel = new BarChart("Bar Chart Example", "Category", "Value", new BarChartData("Category", data));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            frame.add(barChartPanel);

            frame.setSize(800, 600);
            frame.setVisible(true);
        });
    }
}
