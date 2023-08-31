package org.group06.view.components.charts.data;

import lombok.Getter;
import lombok.Setter;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.LinkedHashMap;

@Getter
@Setter
public class BarChartData {
    private String xLabel;
    private LinkedHashMap<String, Double> data;

    public BarChartData(String xLabel, LinkedHashMap<String, Double> data) {
        this.xLabel = xLabel;
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
