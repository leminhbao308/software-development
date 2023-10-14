package org.group06.view.components.buttons;

import org.group06.utils.ColorConstant;
import org.group06.utils.FontConstant;
import org.group06.view.components.animation.FancyBorderRadius;
import org.group06.view.components.animation.RippleEffect;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RippleButton extends JButton {

    private final RippleEffect rippleEffect;
    private Shape shape;

    Color colorDefault = ColorConstant.BACKGROUND_SIDEBAR;
    Color colorOver = ColorConstant.BUTTON_HOVER;
    Color colorClick = ColorConstant.BUTTON_ACTIVE;

    boolean over;

    public RippleButton() {
        rippleEffect = new RippleEffect(this);
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(8, 5, 8, 5));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setBackground(colorDefault);
        setForeground(ColorConstant.WHITE);
        setFont(FontConstant.FONT_BUTTON);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setForeground(ColorConstant.BLACK);
                setBackground(colorOver);
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setForeground(ColorConstant.WHITE);
                setBackground(colorDefault);
                over = false;

            }

            @Override
            public void mousePressed(MouseEvent me) {
                setBackground(colorClick);
                setForeground(ColorConstant.BLACK);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (over) {
                    setBackground(colorOver);
                    setForeground(ColorConstant.BLACK);
                } else {
                    setBackground(colorDefault);
                    setForeground(ColorConstant.WHITE);
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(shape);
        rippleEffect.reder(g2, shape);
        g2.dispose();
        super.paintComponent(grphcs);
    }

    @Override
    public void setBounds(int i, int i1, int i2, int i3) {
        super.setBounds(i, i1, i2, i3);
        shape = new FancyBorderRadius(getWidth(), getHeight(), "0% 0% 0% 0% / 38% 29% 71% 62%").getShape();
    }

}
