package org.group06.view.components.buttons;

import org.group06.utils.ColorConstant;
import org.group06.utils.FontConstant;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SelectButton extends JToggleButton {

    private Color normalColor;
    private Color hoverColor;
    private Color clickColor;
    private Color selectedColor;

    public SelectButton(Color normal, Color hover, Color click, Color selected) {
        setBorderPainted(false);
        setOpaque(false);
        setContentAreaFilled(false);
        setFont(FontConstant.FONT_BUTTON);
        this.normalColor = normal;
        this.hoverColor = hover;
        this.clickColor = click;
        this.selectedColor = selected;

        setForeground(ColorConstant.WHITE);
        setBackground(normalColor);

        addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (isSelected()) {
                    setBackground(selectedColor);
                    setForeground(ColorConstant.BLACK);
                } else {
                    setBackground(normalColor);
                    setForeground(ColorConstant.WHITE);
                }
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (isSelected()) {
                    setBackground(selectedColor);
                    setForeground(ColorConstant.BLACK);
                } else {
                    setBackground(hoverColor);
                    setForeground(ColorConstant.BLACK);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (isSelected()) {
                    setBackground(selectedColor);
                    setForeground(ColorConstant.BLACK);
                } else {
                    setBackground(normalColor);
                    setForeground(ColorConstant.WHITE);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(clickColor);
                setForeground(ColorConstant.WHITE);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (isSelected()) {
                    setBackground(selectedColor);
                    setForeground(ColorConstant.BLACK);
                } else {
                    setBackground(normalColor);
                    setForeground(ColorConstant.WHITE);
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // Paint Border
        g2.setColor(getBackground());
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }
}