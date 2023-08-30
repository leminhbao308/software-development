package org.group06.view.screen;

import org.group06.model.entity.Customer;
import org.group06.model.manager.CustomerManager;
import org.group06.utils.ColorConstant;
import org.group06.utils.ImagePath;
import org.group06.view.components.charts.PieChart;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Main Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setResizable(false);
        setIconImage(new ImageIcon(ImagePath.ICON_LOGO).getImage());

        LinkedHashMap<String, Double> data = new LinkedHashMap<>();
        ArrayList<Customer> c1 = new ArrayList<>();
        c1.add(new Customer("NV01", "Le Minh Bao", "hcm", "012345678", 100.0));
        c1.add(new Customer("NV02", "Le Minh Beo", "hcm", "012345678", 103.0));
        c1.add(new Customer("NV03", "Le Minh Lon", "hcm", "012345678", 1023.0));
        c1.add(new Customer("NV04", "Le Minh Nho", "hcm", "012345678", 1450.0));

        CustomerManager cm = new CustomerManager(c1);

        for ( Customer c : cm.getCustomers()) {
            data.put(c.getTen(), c.getTongThanhToan());
        }

        PieChart pieChart = new PieChart(data);
        add(pieChart, BorderLayout.CENTER);
        add(pieChart.createLegendPanel(data, ColorConstant.generateColorPalette(data.size())), BorderLayout.EAST);
    }
}
