package org.group06.view.components.buttons;

import org.group06.utils.ColorConstant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serial;

public class RoundButton extends JButton {
    @Serial
    private static final long serialVersionUID = -7128508965765743677L;
    Color colorDefault = ColorConstant.BUTTON_NORMAL;
    Color colorOver = ColorConstant.BUTTON_HOVER;
    Color colorClick = ColorConstant.BUTTON_CLICK;
    Color borderColor = ColorConstant.BUTTON_NORMAL;
    boolean over;

    /**
     * Khởi tạo button bo góc với tiêu đề
     *
     * @param name Tiều dề của button
     */
    public RoundButton(String name) {
        super(name);
        setBorderPainted(false);
        setOpaque(false);

        setContentAreaFilled(false);
        // Add event mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(colorOver);
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(colorDefault);
                over = false;

            }

            @Override
            public void mousePressed(MouseEvent me) {
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (over) {
                    setBackground(colorOver);
                } else {
                    setBackground(colorDefault);
                }
            }
        });
    }

    public RoundButton(String name, Color colorDefault, Color colorOver, Color colorClick) {
        super(name);
        this.colorDefault = colorDefault;
        this.colorOver = colorOver;
        this.colorClick = colorClick;
        setBorderPainted(false);
        setOpaque(false);

        setContentAreaFilled(false);
        // Add event mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(colorOver);
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(colorDefault);
                over = false;

            }

            @Override
            public void mousePressed(MouseEvent me) {
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (over) {
                    setBackground(colorOver);
                } else {
                    setBackground(colorDefault);
                }
            }
        });
    }

    /**
     * Khởi tạo button bo góc với
     *
     * @param name   tên
     * @param width  chiều rộng
     * @param height chiều cao
     */
    public RoundButton(String name, int width, int height) {
        super(name);
        super.setSize(width, height);
        setBorderPainted(false);
        setOpaque(false);

        setContentAreaFilled(false);
        // Add event mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(colorOver);
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(colorDefault);
                over = false;

            }

            @Override
            public void mousePressed(MouseEvent me) {
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (over) {
                    setBackground(colorOver);
                } else {
                    setBackground(colorDefault);
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
