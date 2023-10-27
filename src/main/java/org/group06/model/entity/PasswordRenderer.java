/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.group06.model.entity;

import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Dell
 */
public class PasswordRenderer extends DefaultTableCellRenderer{
     @Override
	    protected void setValue(Object value) {
	        setText("••••••••");
	    }
}
