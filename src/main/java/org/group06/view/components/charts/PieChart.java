package org.group06.view.components.charts;

import org.group06.view.components.charts.data.PieChartData;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.TextTitle;

import java.awt.*;

public class PieChart extends ChartPanel {

    public PieChart(String title, PieChartData data) {
        super(ChartFactory.createPieChart(title, data.getDataSet(), true, true, false));
        setPercent();
        this.setScrollable(true);
    }

    public PieChart(String title, String subTitle, PieChartData data) {
        super(ChartFactory.createPieChart(title, data.getDataSet(), true, true, false));

        // Add subtitle
        TextTitle source = new TextTitle(subTitle, new Font("Courier New", Font.PLAIN, 12));
        super.getChart().addSubtitle(source);
        setPercent();
        this.setScrollable(true);
    }

    private void setPercent() {
        PiePlot plot = (PiePlot) super.getChart().getPlot();
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0} = {2}"));
    }

    public void setScrollable(boolean scrollable) {
        super.setMouseWheelEnabled(scrollable);
    }
}
