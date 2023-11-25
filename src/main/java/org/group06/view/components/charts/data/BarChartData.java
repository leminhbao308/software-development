package org.group06.view.components.charts.data;

import org.jfree.data.category.DefaultCategoryDataset;

import java.util.LinkedHashMap;


public class BarChartData {
    private LinkedHashMap<String, LinkedHashMap<String, Double>> data;

    public BarChartData(LinkedHashMap<String, LinkedHashMap<String, Double>> data) {
        this.data = data;
    }

    public LinkedHashMap<String, LinkedHashMap<String, Double>> getData() {
        return data;
    }

    public void setData(LinkedHashMap<String, LinkedHashMap<String, Double>> data) {
        this.data = data;
    }

    public DefaultCategoryDataset getDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String key : data.keySet()) {
            for (String key2 : data.get(key).keySet()) {
                dataset.setValue(data.get(key).get(key2), key, key2);
            }
        }
        return dataset;
    }
}
