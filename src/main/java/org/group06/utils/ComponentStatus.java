/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.group06.utils;

import javax.swing.*;
import java.awt.*;

/**
 * @author lehoa
 */
public class ComponentStatus {

    //  
    public static void setFieldStatus(java.util.List<JTextField> list, boolean status) {
        for (JTextField item : list) {
            item.setEnabled(status);
        }
    }

    public static void setComboBoxStatus(java.util.List<JComboBox> list, boolean status) {
        for (JComboBox item : list) {
            item.setEnabled(status);
        }
    }

    public static void setStatusBtn(java.util.List<JButton> list, boolean status) {
        for (JButton btn : list) {
            setStatusBtn(btn, status);
        }
    }

    public static void setStatusBtn(JButton btn, boolean status) {
        btn.setEnabled(status);
        if (!status) {
            btn.setBackground(ColorConstant.DISABLE_FIELD);
        } else {
            btn.setBackground(ColorConstant.BACKGROUND_TABLEHEADER);
            btn.setForeground(ColorConstant.WHITE);
        }
    }

    public static void emptyField(java.util.List<JTextField> list) {
        for (JTextField txt : list) {
            txt.setText("");
        }
    }

    public static void emptyField(JTextField txt) {
        txt.setText("");
    }

    public static void setDefaultCmb(java.util.List<JComboBox> list) {
        for (JComboBox cmb : list) {
            cmb.setSelectedIndex(0);
        }
    }

    public static void checkEmptyField(JTextField txt) {
        if (txt.getText().isEmpty()) {
            txt.setBackground(ColorConstant.BACKGROUND_ERROR);
            txt.setForeground(ColorConstant.TEXT_ERROR);
            txt.requestFocus();
        } else {
            txt.setBackground(Color.WHITE);
            txt.setForeground(ColorConstant.BLACK);
        }
    }

    public static void CheckSelectOption(JComboBox cmb) {
        if (cmb.getSelectedIndex() == 0) {
            cmb.setBackground(ColorConstant.BACKGROUND_ERROR);
            cmb.setForeground(ColorConstant.TEXT_ERROR);
        } else {
            cmb.setBackground(Color.WHITE);
            cmb.setForeground(ColorConstant.BLACK);
        }
    }
}
