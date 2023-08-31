package org.group06.view.components.charts.data;

import org.jfree.data.general.DefaultPieDataset;

import java.util.LinkedHashMap;

public class PieChartData {
    private LinkedHashMap<String, Double> data;

    public PieChartData(LinkedHashMap<String, Double> data) {
        this.data = data;
    }

    public DefaultPieDataset<String> getDataSet() {
        DefaultPieDataset<String> dataset = new DefaultPieDataset<>();
        for (String key : data.keySet()) {
            dataset.setValue(key, data.get(key));
        }
        return dataset;
    }
}
