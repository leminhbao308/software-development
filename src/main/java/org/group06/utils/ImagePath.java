package org.group06.utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class ImagePath {
    // Icon path
    public static final URL ICON_LOGO = ImagePath.class.getResource("/images/icon/icon.png");
    public static final URL ICON_USER = ImagePath.class.getResource("/images/icon/user.png");
    public static final URL ICON_LOGOUT = ImagePath.class.getResource("/images/icon/logout.png");
    public static final URL ICON_CHART = ImagePath.class.getResource("/images/icon/chart.png");
    public static final URL ICON_EMPLOYEE = ImagePath.class.getResource("/images/icon/employee.png");
    public static final URL ICON_CUSTOMER = ImagePath.class.getResource("/images/icon/customer.png");
    public static final URL ICON_DRAFT = ImagePath.class.getResource("/images/icon/draft.png");
    public static final URL ICON_BILL = ImagePath.class.getResource("/images/icon/bill.png");
    public static final URL ICON_CLOTHES = ImagePath.class.getResource("/images/icon/clothes.png");
    public static final URL ICON_SELL = ImagePath.class.getResource("/images/icon/sell.png");
    public static final URL ICON_SEARCH = ImagePath.class.getResource("/images/icon/search.png");

    // Thumbnail path
    public static final URL THUMBNAIL_LOGIN = ImagePath.class.getResource("/images/thumbnail/login.jpg");
    public static final URL THUMBNAIL_LOGO = ImagePath.class.getResource("/images/logo/logo.png");

    private ImagePath() {
        // Để ngăn việc tạo đối tượng instance của lớp này
    }

    public static Image loadImage(URL iconLogo) {
        try {
            return ImageIO.read(iconLogo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Icon loadIcon(URL iconLogo) {
        return new ImageIcon(loadImage(iconLogo));
    }
}
