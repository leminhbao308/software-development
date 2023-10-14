/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.group06.view.components.textFields;

/**
 *
 * @author lemin
 */
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AnimatedSpinner extends JSpinner {

  private float animate;
  private boolean showHint;

  private String hint = "";

  public AnimatedSpinner() {
    initiate();
  }

  public AnimatedSpinner(String hint) {
    this.hint = hint;
    initiate();
  }

  private void initiate() {
    
    JComponent editor = getEditor();
    if (editor instanceof JSpinner.DefaultEditor) {
      JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editor;
      JTextField textField = spinnerEditor.getTextField();
      textField.setBorder(new EmptyBorder(5, 10, 5, 10));
      textField.setForeground(Color.GRAY);
      
      textField.addFocusListener(new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
          showHint = false;
          repaint();
        }
       
        @Override
        public void focusLost(FocusEvent e) {
          showHint = true;
          repaint();
        }
      });
      
    }

    // Tùy chỉnh nút mũi tên
    setUpDownButton();
    
  }

  // Tùy chỉnh nút mũi tên
  private void setUpDownButton() {
    setBorder(BorderFactory.createEmptyBorder());
    
    JButton upButton = createUpButton();
    upButton.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        upButton.setForeground(Color.BLUE);
      }

      @Override
      public void mouseExited(MouseEvent e) {
        upButton.setForeground(Color.BLACK);
      }
    });
    
    JButton downButton = createDownButton();
    downButton.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        downButton.setForeground(Color.BLUE);
      }

      @Override
      public void mouseExited(MouseEvent e) {
        downButton.setForeground(Color.BLACK);
      }
    });
  }

  public JButton createUpButton() {
    JButton button = new BasicArrowButton(BasicArrowButton.NORTH);
    button.setFont(new Font("Serif", Font.BOLD, 16));
    return button;
  }

  
  public JButton createDownButton() {
    JButton button = new BasicArrowButton(BasicArrowButton.SOUTH);
    button.setFont(new Font("Serif", Font.BOLD, 16)); 
    return button;
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (showHint && hint != null) {
      Graphics2D g2d = (Graphics2D) g.create();
      g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      g2d.setColor(Color.GRAY);
      Insets ins = getInsets();
      FontMetrics fm = g2d.getFontMetrics();
      int h = getHeight();
      g2d.drawString(hint, ins.left, h / 2 + fm.getAscent() / 2 - 2);
      g2d.dispose();
    }
  }

  public void setHint(String hint) {
    this.hint = hint;
  }

}