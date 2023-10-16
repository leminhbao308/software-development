package org.group06.view.components.buttons;

import org.group06.utils.ColorConstant;
import org.group06.view.components.animation.FancyBorderRadius;
import org.group06.view.components.animation.RippleEffect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serial;

public class RippleRoundButton extends JButton {
    @Serial
    private static final long serialVersionUID = -7128508965765743677L;
    Color colorDefault = ColorConstant.BUTTON_LOGIN_NORMAL;
    Color colorOver = ColorConstant.BUTTON_LOGIN_HOVER;
    Color colorClick = ColorConstant.BUTTON_LOGIN_CLICK;

    private final RippleEffect rippleEffect;
    private Shape shape;

    boolean over;

    /**
     * Khởi tạo button bo góc với tiêu đề và màu
     *
     * @param name         Tiêu đề
     * @param colorDefault Màu mặc định
     * @param colorOver    Màu khi di chuột vào
     * @param colorClick   Màu khi click
     */
    public RippleRoundButton(String name, Color colorDefault, Color colorOver, Color colorClick) {
        super(name);
        this.colorDefault = colorDefault;
        this.colorOver = colorOver;
        this.colorClick = colorClick;

        rippleEffect = new RippleEffect(this);
//        setBorder(new EmptyBorder(8, 5, 8, 5));
        this.setBackground(colorDefault);
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
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(ColorConstant.BUTTON_LOGIN_NORMAL);
        g2.fill(shape);
        rippleEffect.reder(g2, shape);
        g2.dispose();
        super.paintComponent(g);
    }

    @Override
    public void setBounds(int i, int i1, int i2, int i3) {
        super.setBounds(i, i1, i2, i3);
        shape = new FancyBorderRadius(getWidth(), getHeight(), "10% 10% 10% 10% / 35% 35% 35% 35%").getShape();
    }
}
