/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.group06.view.components.textFields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;

/**
 *
 * @author Le Minh Bao
 */
public class PlaceholderTextField extends JTextField {

    public PlaceholderTextField() {
        super();
    }

    public PlaceholderTextField(String placeHolder) {
        super(placeHolder);
        super.setForeground(Color.GRAY);
        this.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (((JTextField) evt.getComponent()).getText().equals(placeHolder)) {
                    evt.getComponent().setForeground(Color.BLACK);
                    ((JTextField) evt.getComponent()).setText("");
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (((JTextField) evt.getComponent()).getText().isEmpty()) {
                    evt.getComponent().setForeground(Color.GRAY);
                    ((JTextField) evt.getComponent()).setText(placeHolder);
                }
            }
        });
    }
}
