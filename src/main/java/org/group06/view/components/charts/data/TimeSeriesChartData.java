package org.group06.view.components.charts.data;

import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

import java.sql.Date;
import java.time.LocalDate;
import java.util.LinkedHashMap;

public class TimeSeriesChartData {
    private LinkedHashMap<String, LinkedHashMap<Date, Double>> data;

    public TimeSeriesChartData(LinkedHashMap<String, LinkedHashMap<Date, Double>> data) {
        this.data = data;
    }

    public TimeSeriesCollection getDataSet() {
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        for (String key : data.keySet()) {
            TimeSeries series = new TimeSeries(key);
            for (Date date : data.get(key).keySet()) {
                LocalDate localDate = date.toLocalDate();
                series.addOrUpdate(new Day(localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear()), data.get(key).get(date));
            }
            dataset.addSeries(series);
        }
        return dataset;
    }
}
