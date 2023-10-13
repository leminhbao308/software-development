package org.group06.view.components.textFields;

import lombok.Getter;
import org.group06.utils.ColorConstant;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class TextField extends JTextField {

    private final Animator animator;
    @Getter
    private String hint = "";
    private float animate;
    private boolean show = true;
    public TextField() {
        setOpaque(false);
        setBorder(new EmptyBorder(9, 1, 9, 1));
        setForeground(ColorConstant.BLACK);
        setSelectionColor(new Color(200, 200, 200, 100));
        animator = new Animator(350, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (show) {
                    animate = fraction;
                } else {
                    animate = 1f - fraction;
                }
                repaint();
            }

            @Override
            public void end() {
                show = !show;
                repaint();
            }

        });
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!getText().equals("")) {
                    if (show) {
                        if (animator.isRunning() == false) {
                            stop();
                            animator.start();
                        }
                    } else if (animator.isRunning()) {
                        stop();
                        animator.start();
                    }
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (getText().equals("")) {
                    stop();
                    animator.start();
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

    }

    public void setHint(String hint) {
        this.hint = hint;
        repaint();
    }

    private void stop() {
        if (animator.isRunning()) {
            float f = animator.getTimingFraction();
            animator.stop();
            animator.setStartFraction(1f - f);
        } else {
            animator.setStartFraction(0f);
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setColor(ColorConstant.TEXT_PLACEHOLDER);
        g2.drawLine(0, getHeight() - 3, getWidth(), getHeight() - 3);
        if (!hint.equals("")) {
            int h = getHeight();
            Insets ins = getInsets();
            FontMetrics fm = g.getFontMetrics();
            g2.setColor(ColorConstant.TEXT_PLACEHOLDER);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f - animate));
            g2.drawString(hint, ins.left + (animate * 30), h / 2 + fm.getAscent() / 2 - 1);
        }
        g2.dispose();
        super.paint(g);
    }
}
