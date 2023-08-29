package org.group06.utils;

import java.net.URL;

public class ImagePath {
    // Icon path
    public static final URL ICON_LOGO = ImagePath.class.getResource("/images/icon/icon.png");
    public static final URL ICON_CANCEL = ImagePath.class.getResource("/images/icon/cancel.png");

    // Thumbnail path
    public static final URL THUMBNAIL_LOGIN = ImagePath.class.getResource("/images/thumbnail/login.jpg");

    private ImagePath() {
        // Để ngăn việc tạo đối tượng instance của lớp này
    }
}
