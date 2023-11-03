package org.group06.utils;

public class NumberStandard {

    /**
     * Chuyển đổi chuỗi sang kiểu int
     *
     * @param text Chuỗi cần chuyển đổi
     * @return Số int đã được chuyển đổi
     */
    public static int parseInt(String text) {
        int result = 0;
        try {
            result = Integer.parseInt(text.replaceAll(",", ""));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }


    /**
     * Chuyển đổi chuỗi sang kiểu double
     *
     * @param text Chuỗi cần chuyển đổi
     * @return Số double đã được chuyển đổi
     */
    public static double parseDouble(String text) {
        double result = 0;
        try {
            result = Double.parseDouble(text.replaceAll(",", ""));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Chuyển đổi chuỗi phần trăm sang kiểu double
     *
     * @param text Chuỗi cần chuyển đổi
     * @return Số double đã được chuyển đổi
     */
    public static double parsePercent(String text) {
        double result = 0;
        try {
            result = Double.parseDouble(text.replaceAll("%", "")) / 100;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Chuyển đổi tiền từ chuỗi sang kiểu double
     *
     * @param text Số tiền cần chuyển đổi
     * @return Số double đã được chuyển đổi
     */
    public static double parseMoney(String text) {
        double result = 0;
        try {
            result = Double.parseDouble(text.replaceAll(",", "").replaceAll(" VNĐ", ""));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Định dạng số nguyên thành phần trăm với 2 chữ số thập phân
     *
     * @param percent Số nguyên cần định dạng
     * @return Chuỗi đã được định dạng
     */
    public static String formatPercent(double percent) {
        return String.format("%.2f", percent * 100) + "%";
    }

    /**
     * Định dạng số tiền với đơn vị VNĐ
     *
     * @param money Số tiền cần định dạng
     * @return Chuỗi đã được định dạng
     */
    public static String formatMoney(double money) {
        return String.format("%,.0f", money) + " VNĐ";
    }

    /**
     * Chuẩn hóa số tiền theo các mệnh giá và làm tròn số tiền lên.
     * Ví dụ: 1,234,567 sẽ được chuẩn hóa thành 1,235,000
     *
     * @param soTien Số tiền cần chuẩn hóa và làm tròn.
     * @return Số tiền sau khi đã được chuẩn hóa và làm tròn.
     */
    public static double roundAndNormalizeMoney(double soTien) {
        return Math.ceil(soTien / 1000) * 1000;
    }

}
