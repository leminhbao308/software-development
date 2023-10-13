package org.group06.view.screen;

import org.group06.model.entity.Customer;
import org.group06.model.manager.CustomerManager;
import org.group06.utils.ImagePath;
import org.group06.view.components.charts.PieChart;
import org.group06.view.components.charts.data.PieChartData;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class TestChart extends JFrame {
    public TestChart() {
        super("Main Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setResizable(false);
        setIconImage(ImagePath.loadImage(ImagePath.ICON_LOGO));

        ArrayList<Customer> c1 = new ArrayList<>();
        c1.add(new Customer("NV01", "Le Minh Bao", "hcm", "012345678", 100.0));
        c1.add(new Customer("NV02", "Le Minh Beo", "hcm", "012345678", 103.0));
        c1.add(new Customer("NV03", "Le Minh Lon", "hcm", "012345678", 1023.0));
        c1.add(new Customer("NV04", "Le Minh Nho", "hcm", "012345678", 1450.0));

        CustomerManager cm = new CustomerManager(c1);

        LinkedHashMap<String, Double> data = new LinkedHashMap<>();

        for (Customer c : cm.getCustomers()) {
            data.put(c.getTen(), c.getTongThanhToan());
        }

        PieChartData pData = new PieChartData(data);

        PieChart chart = new PieChart("Pie Chart", "Demo Pie Chart", pData);
        chart.setScrollable(true);
        add(chart, BorderLayout.CENTER);
    }
}
