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
            System.err.println("Lỗi định dạng số nguyên:\n" + e.getMessage() + "\n");
            System.err.println(e.getStackTrace()[0].toString());
        }
        return result;
    }

    /**
     * Định dạng số nguyên
     *
     * @param tongSoHoaDon Số nguyên cần định dạng
     * @return Chuỗi đã được định dạng
     */
    public static String formatInteger(int tongSoHoaDon) {
        return String.format("%,d", tongSoHoaDon);
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
            System.err.println("Lỗi định dạng số thực:\n" + e.getMessage() + "\n");
            System.err.println(e.getStackTrace()[0].toString());
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
            result = Double.parseDouble(text.replaceAll("%", ""));
        } catch (NumberFormatException e) {
            System.err.println("Lỗi định dạng phần trăm:\n" + e.getMessage() + "\n");
            System.err.println(e.getStackTrace()[0].toString());
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
            System.err.println("Lỗi định dạng tiền:\n" + e.getMessage() + "\n");
            System.err.println(e.getStackTrace()[0].toString());
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
        return String.format("%.2f", percent) + "%";
    }

    /**
     * Định dạng số tiền với đơn vị VNĐ
     *
     * @param money Số tiền cần định dạng
     * @return Chuỗi đã được định dạng
     */
    public static String formatMoney(double money) {
        return formatMoney(money, true);
    }

    /**
     * Định dạng số tiền với đơn vị VNĐ hoặc không
     *
     * @param money  Số tiền cần định dạng
     * @param hasVND Có thêm đơn vị VNĐ hay không
     * @return Chuỗi đã được định dạng
     */
    public static String formatMoney(double money, boolean hasVND) {
        String result = String.format("%,.0f", money);

        if (hasVND) {
            return result + " VNĐ";
        } else {
            return result;
        }
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
