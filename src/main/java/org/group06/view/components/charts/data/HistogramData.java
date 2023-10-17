package org.group06.view.components.charts.data;

import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;

import java.util.LinkedHashMap;

public class HistogramData {
    private LinkedHashMap<String, Double> data;

    public HistogramData(LinkedHashMap<String, Double> data) {
        this.data = data;
    }

    public IntervalXYDataset getDataSet(String key, int range) {
        if (range <= 0) {
            throw new IllegalArgumentException("Range must be greater than 0");
        }

        HistogramDataset dataset = new HistogramDataset();
        double[] values = new double[data.size()];
        int i = 0;
        for (String name : data.keySet()) {
            values[i] = data.get(name);
            i++;
        }
        dataset.addSeries(key, values, range);
        return dataset;
    }
}
