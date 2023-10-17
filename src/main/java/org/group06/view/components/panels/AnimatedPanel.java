package org.group06.view.components.panels;


import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class AnimatedPanel extends ImagePanel {

    private List<URL> imagePaths;
    private Image image;
    private int width;
    private int height;

    public AnimatedPanel(List<URL> imagePaths, int width, int height) {
        super(imagePaths.get(0), width, height);
        this.imagePaths = imagePaths;
        this.width = width;
        this.height = height;
        setImage(imagePaths.get(0));
        Thread thread = new Thread(() -> {
            for (int i = 0; i < imagePaths.size(); i++) {
                changeImage(i);
                System.out.println("Change image " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i == imagePaths.size() - 1) {
                    i -= i + 1;
                }
            }
        });
        thread.start();
    }

    private void changeImage(int index) {
        setImage(imagePaths.get(index));
    }

    private void setImage(URL url) {
        try {
            image = ImageIO.read(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        paint(image.getGraphics());
    }

    public List<URL> getImagePaths() {
        return imagePaths;
    }

    public void setImagePaths(List<URL> imagePaths) {
        this.imagePaths = imagePaths;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
