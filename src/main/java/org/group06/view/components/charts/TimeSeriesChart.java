package org.group06.view.components.charts;

import org.group06.utils.ColorConstant;
import org.group06.view.components.charts.data.TimeSeriesChartData;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ui.RectangleEdge;

import java.awt.*;

public class TimeSeriesChart extends ChartPanel {
    public TimeSeriesChart(String title, String xLabel, String yLabel, TimeSeriesChartData data) {
        super(ChartFactory.createTimeSeriesChart(
                title, xLabel, yLabel, data.getDataSet(), true, true, false),
                true, true, true, true, true);
        super.getChart().getXYPlot().setRangeGridlinePaint(ColorConstant.BLACK);
        super.getChart().getLegend().setItemFont(new Font("Segoe UI", Font.PLAIN, 18));
        super.getChart().getLegend().setPosition(RectangleEdge.RIGHT);
        super.getChart().getXYPlot().getDomainAxis().setLabelFont(new Font("Segoe UI", Font.PLAIN, 18));
        super.getChart().getXYPlot().getRangeAxis().setLabelFont(new Font("Segoe UI", Font.PLAIN, 18));
    }
}
