package org.group06.view.components.charts;

import org.group06.view.components.charts.data.HistogramData;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.PlotOrientation;

public class HistogramChart extends ChartPanel {
    public HistogramChart(String title, String xLabel, String yLabel, HistogramData dataset, String key, int range) {
        super(ChartFactory.createHistogram(title, xLabel, yLabel, dataset.getDataSet(key, range), PlotOrientation.VERTICAL, true, true, true));
    }

    public void setOrientation(PlotOrientation orientation) {
        super.getChart().getXYPlot().setOrientation(orientation);
    }
}
