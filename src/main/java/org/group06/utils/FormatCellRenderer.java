package org.group06.utils;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class FormatCellRenderer {
    public static void formatCellRendererCenter(JTable tbl, int index) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        tbl.getColumnModel().getColumn(index).setCellRenderer(centerRenderer);
    }

    public static void formatCellRendererLeft(JTable tbl, int index) {
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);
        tbl.getColumnModel().getColumn(index).setCellRenderer(leftRenderer);
    }

    public static void formatCellRendererRight(JTable tbl, int index) {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(DefaultTableCellRenderer.RIGHT);
        tbl.getColumnModel().getColumn(index).setCellRenderer(rightRenderer);
    }

}
