/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.group06.view.components.buttons;

import org.group06.utils.ColorConstant;
import org.group06.utils.ImagePath;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author lemin
 */
public class StaticRoundButton extends JButton {
    Color colorDefault = ColorConstant.BUTTON_LOGIN_NORMAL;
    Color colorOver = ColorConstant.BUTTON_LOGIN_HOVER;
    Color colorClick = ColorConstant.BUTTON_LOGIN_CLICK;
    String icon = "";

    boolean over;

    /**
     * Khởi tạo button bo góc với tiêu đề và màu
     *
     * @param name         Tiêu đề
     * @param colorDefault Màu mặc định
     * @param colorOver    Màu khi di chuột vào
     * @param colorClick   Màu khi click
     */
    public StaticRoundButton(String name, Color colorDefault, Color colorOver, Color colorClick) {
        super(name);
        this.colorDefault = colorDefault;
        this.colorOver = colorOver;
        this.colorClick = colorClick;

//        setBorder(new EmptyBorder(8, 5, 8, 5));
        this.setBackground(colorDefault);
        setBorderPainted(false);
        setOpaque(false);
        setContentAreaFilled(false);
        // Add event mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                if (!isEnabled()) return;
                setBackground(colorOver);
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if (!isEnabled()) return;
                setBackground(colorDefault);
                over = false;
            }

            @Override
            public void mousePressed(MouseEvent me) {
                if (!isEnabled()) return;
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (!isEnabled()) return;
                if (over) {
                    setBackground(colorOver);
                } else {
                    setBackground(colorDefault);
                }
            }
        });
    }

    public StaticRoundButton(String name, String icon, Color colorDefault, Color colorOver, Color colorClick) {
        super(name);
        this.colorDefault = colorDefault;
        this.colorOver = colorOver;
        this.colorClick = colorClick;
        this.icon = icon;

//        setBorder(new EmptyBorder(8, 5, 8, 5));
        this.setBackground(colorDefault);
        setBorderPainted(false);
        setOpaque(false);
        setContentAreaFilled(false);
        setIcon(ImagePath.loadWhiteIcon(icon));
        // Add event mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                if (!isEnabled()) return;
                setBackground(colorOver);
                setIcon(ImagePath.loadBlackIcon(icon));
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if (!isEnabled()) return;
                setBackground(colorDefault);
                setIcon(ImagePath.loadWhiteIcon(icon));
                over = false;
            }

            @Override
            public void mousePressed(MouseEvent me) {
                if (!isEnabled()) return;
                setBackground(colorClick);
                setIcon(ImagePath.loadWhiteIcon(icon));
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (!isEnabled()) return;
                if (over) {
                    setBackground(colorOver);
                    setIcon(ImagePath.loadBlackIcon(icon));
                } else {
                    setBackground(colorDefault);
                    setIcon(ImagePath.loadWhiteIcon(icon));
                }
            }
        });
    }

    /**
     * vẽ bo góc button
     */
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // Paint Border
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintComponent(g);
    }
}
