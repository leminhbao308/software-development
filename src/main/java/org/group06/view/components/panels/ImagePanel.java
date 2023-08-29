package org.group06.view.components.panels;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Lớp ImagePanel dùng để hiển thị hình ảnh lên panel
 *
 * @author Lê Minh Bảo
 */
public class ImagePanel extends JPanel {
    private Image image;

    public ImagePanel(URL imagePath, int width, int height) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        image = imageIcon.getImage();

        // Thay đổi kích thước hình ảnh theo chiều rộng và chiều cao đã cho
        image = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        // Đặt kích thước của panel
        setPreferredSize(new Dimension(width, height));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Vẽ hình ảnh lên panel
        g.drawImage(image, 0, 0, this);
    }
}
