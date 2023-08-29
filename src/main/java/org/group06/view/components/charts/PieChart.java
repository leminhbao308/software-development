package org.group06.view.components.charts;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class PieChart extends JPanel {
    private final LinkedHashMap<String, Double> data;

    public PieChart(LinkedHashMap<String, Double> data) {
        super();
        this.data = data;
    }

    private static JPanel createLegendPanel(LinkedHashMap<String, Double> data, ArrayList<Color> colorPalette) {
        JPanel legendPanel = new JPanel(new GridLayout(data.size(), 1));
        int index = 0;

        for (Map.Entry<String, Double> entry : data.entrySet()) {
            JPanel colorLabelPanel = new JPanel();
            colorLabelPanel.setBackground(colorPalette.get(index));
            colorLabelPanel.setPreferredSize(new Dimension(20, 20));

            JLabel label = new JLabel(entry.getKey());
            JPanel entryPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            entryPanel.add(colorLabelPanel);
            entryPanel.add(label);

            legendPanel.add(entryPanel);
            index++;
        }

        return legendPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LinkedHashMap<String, Double> data = new LinkedHashMap<>();
            data.put("Category 01", 400.0);
            data.put("Category 02", 1204.0);
            data.put("Category 03", 499.0);
            data.put("Category 04", 200.0);
            data.put("Category 05", 400.0);

            JFrame frame = new JFrame("Pie Chart Example");
            frame.setSize(600, 400);
            PieChart pieChartPanel = new PieChart(data);
            frame.add(pieChartPanel, BorderLayout.CENTER);

            JPanel legendPanel = createLegendPanel(data, pieChartPanel.generateColorPalette(data.size()));
            frame.add(legendPanel, BorderLayout.EAST);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(pieChartPanel);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        double totalValue = 0;
        for (Double value : data.values()) {
            totalValue += value;
        }

        ArrayList<Color> colorPalette = generateColorPalette(data.size());
        double currentAngle = 90;

        int radius = Math.min(getWidth(), getHeight()) / 2;

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        int colorIndex = 0;

        ArrayList<String> keys = new ArrayList<>(data.keySet());

        for (String key : keys) {
            double value = data.get(key);
            double arcAngle = (value / totalValue) * 360;
            drawCustomArc(g, centerX, centerY, radius, currentAngle, arcAngle, colorPalette.get(colorIndex));

            currentAngle += arcAngle;

            colorIndex = (colorIndex + 1) % colorPalette.size();
        }
    }

    private void drawCustomArc(Graphics g, int centerX, int centerY, int radius, double startAngle, double arcAngle, Color color) {
        int segments = (int) (arcAngle * 10); // Số phần chia nhỏ hơn, càng chính xác góc.
        double angleIncrement = arcAngle / segments;

        for (int i = 0; i < segments; i++) {
            double angle1 = Math.toRadians(startAngle + i * angleIncrement);
            double angle2 = Math.toRadians(startAngle + (i + 1) * angleIncrement);

            int x1 = (int) (centerX + radius * Math.cos(angle1));
            int y1 = (int) (centerY - radius * Math.sin(angle1));

            int x2 = (int) (centerX + radius * Math.cos(angle2));
            int y2 = (int) (centerY - radius * Math.sin(angle2));

            int[] xPoints = {centerX, x1, x2};
            int[] yPoints = {centerY, y1, y2};

            g.setColor(color);
            g.fillPolygon(xPoints, yPoints, 3);
        }
    }

    private ArrayList<Color> generateColorPalette(int numberOfColors) {
        ArrayList<Color> colorPalette = new ArrayList<>();
        float hueStep = 1.0f / numberOfColors;
        for (int i = 0; i < numberOfColors; i++) {
            colorPalette.add(Color.getHSBColor(i * hueStep, 1.0f, 1.0f));
        }
        return colorPalette;
    }
}
