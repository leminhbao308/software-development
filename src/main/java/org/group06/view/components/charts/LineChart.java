package org.group06.view.components.charts;

import org.group06.utils.ColorConstant;
import org.group06.view.components.charts.data.LineChartData;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.PlotOrientation;

import javax.swing.*;
import java.util.LinkedHashMap;

public class LineChart extends ChartPanel {

        public LineChart(String title, String yLabel, LineChartData data) throws Exception {
            super(ChartFactory.createLineChart(title, data.getxLabel(), yLabel, data.getDataSet(), PlotOrientation.VERTICAL, true, true, false), true, true, true, true, true);
            super.getChart().getCategoryPlot().setRangeGridlinePaint(ColorConstant.BLACK);

        }

        public void setOrientation(PlotOrientation orientation) {
            super.getChart().getCategoryPlot().setOrientation(orientation);
        }

        public void setLegendVisible(boolean visible) {
            super.getChart().getLegend().setVisible(visible);
        }

        public void setRangeGridlineVisible(boolean visible) {
            super.getChart().getCategoryPlot().setRangeGridlinesVisible(visible);
        }

        public void setToolTipVisible(boolean visible) {
            super.setDisplayToolTips(visible);
        }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LinkedHashMap<String, Double> data = new LinkedHashMap<>();
            data.put("Category 1", 150.0);
            data.put("Category 2", 300.0);
            data.put("Category 3", 450.0);
            data.put("Category 4", 600.0);

            JFrame frame = new JFrame("Line Chart Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            LineChart lineChartPanel = null;
            try {
                lineChartPanel = new LineChart("Line Chart Example", "Category", new LineChartData("Category", data));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            frame.add(lineChartPanel);

            frame.setSize(800, 600);
            frame.setVisible(true);
        });
    }
}
