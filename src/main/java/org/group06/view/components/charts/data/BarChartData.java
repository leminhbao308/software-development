package org.group06.view.components.charts.data;

import org.jfree.data.category.DefaultCategoryDataset;

import java.util.LinkedHashMap;


public class BarChartData {
    private String xLabel;
    private LinkedHashMap<String, Double> data;

    public BarChartData(String xLabel, LinkedHashMap<String, Double> data) {
        this.xLabel = xLabel;
        this.data = data;
    }

    public String getxLabel() {
        return xLabel;
    }

    public void setxLabel(String xLabel) {
        this.xLabel = xLabel;
    }

    public LinkedHashMap<String, Double> getData() {
        return data;
    }

    public void setData(LinkedHashMap<String, Double> data) {
        this.data = data;
    }

    public DefaultCategoryDataset getDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String key : data.keySet()) {
            dataset.setValue(data.get(key), xLabel, key);
        }
        return dataset;
    }
}
