/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.group06.utils;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
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
            btn.setEnabled(status);
            if (!status) {
                btn.setBackground(ColorConstant.DISABLE_FIELD);
            } else {
                btn.setBackground(ColorConstant.BACKGROUND_SIDEBAR);
            }
        }
    }

    public static void emptyField(java.util.List<JTextField> list) {
        for (JTextField txt : list) {
            txt.setText("");
        }
    }

    public static void setDefaultCmb(java.util.List<JComboBox> list) {
        for (JComboBox cmb : list) {
            cmb.setSelectedIndex(-1);
        }
    }

//    public static void clearSelectRowTable(java.util.List<javax.swing.JTable> list) {
//        for (javax.swing.JTable tbl : list) {
//            tbl.clearSelection();
//       }
//    } 
}
