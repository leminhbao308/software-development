package org.group06.view.components.tabbedPane;

import org.group06.model.entity.NhanVien;
import org.group06.utils.ImagePath;
import org.group06.view.components.panels.ImagePanel;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.*;

public class ButtonAddTabComponent extends JButton implements ActionListener {
    private final JTabbedPane pane;
    private final NhanVien nv;

    public ButtonAddTabComponent(final JTabbedPane pane, NhanVien nv) {
        super("Thêm đơn hàng mới");
        if (pane == null) {
            throw new NullPointerException("TabbedPane is null");
        }
        this.pane = pane;
        this.nv = nv;
        setFont(new Font("Segoe UI", Font.BOLD, 12));
        setToolTipText("Thêm đơn hàng mới.");
        //Make the button looks the same for all Laf's
        setUI(new BasicButtonUI());
        //Make it transparent
        setContentAreaFilled(false);
        //No need to be focusable
        setFocusable(false);
        setBorder(BorderFactory.createEtchedBorder());
        setBorderPainted(false);
        //Making nice rollover effect
        //we use the same listener for all buttons
        addMouseListener(buttonMouseListener);
        setRolloverEnabled(true);
        //Close the proper tab by clicking the button
        addActionListener(this);
        //add more space to the top of the component
        setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
    }

    public void actionPerformed(ActionEvent e) {
        int i = pane.indexOfTabComponent(ButtonAddTabComponent.this);
        if (i != -1) {
            // add new tab
            pane.addTab("Đơn hàng mới " + (i + 1), new TabBanHang_DatHang(nv, pane));
            pane.setTabComponentAt(i+1, new ButtonTabComponent(pane));
            pane.setSelectedIndex(i+1);
            pane.remove(i);
            // add ButtonAddTabComponent to add new tab
            pane.addTab("", new ImagePanel(ImagePath.THUMBNAIL_MAIN, 1920, 1080));
            // block this tab be selected
            pane.setEnabledAt(i + 1, false);
            pane.setTabComponentAt(i + 1, new ButtonAddTabComponent(pane, nv));
        }
    }

    //we don't want to update UI for this button
    public void updateUI() {
    }

    private final static MouseListener buttonMouseListener = new MouseAdapter() {
        public void mouseEntered(MouseEvent e) {
            Component component = e.getComponent();
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                button.setBorderPainted(true);
                button.setForeground(new Color(0, 0, 0, 100));
            }
        }

        public void mouseExited(MouseEvent e) {
            Component component = e.getComponent();
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                button.setBorderPainted(false);
                button.setForeground(Color.BLACK);
                button.setBackground(UIManager.getColor("control"));
            }
        }
    };
}