package org.group06.utils;

import java.util.ArrayList;

public class NameStandard {

    /**
     * Định dạng lại In Hoa chữ cái đầu tiên của mỗi từ trong chuỗi
     *
     * @param text Chuỗi cần chuẩn hóa
     * @return Chuỗi đã được chuẩn hóa
     */
    public static String formatCapitalize(String text) {
        String resultFormat = "";
        String trimText = text.trim();
        String lowerText = trimText.toLowerCase();
        ArrayList<String> splitResult = new ArrayList<>();
        String[] splitText = lowerText.split(" ");
        for (int i = 0; i < splitText.length; i++) {
            if (!splitText[i].isEmpty()) {
                splitResult.add(splitText[i]);
            }
        }

        for (String item : splitResult) {
            resultFormat += item.substring(0, 1).toUpperCase() + item.substring(1) + " ";

        }
        return resultFormat.trim();
    }

    /**
     * Loại bỏ dấu tiếng Việt trong chuỗi
     *
     * @param input Chuỗi cần loại bỏ dấu
     * @return Chuỗi đã được loại bỏ dấu
     */
    public static String removeDiacritics(String input) {
        String regex = "\\p{InCombiningDiacriticalMarks}+";
        String textWithoutDiacritics = java.text.Normalizer.normalize(input, java.text.Normalizer.Form.NFD)
                .replaceAll(regex, "");
        return textWithoutDiacritics;
    }
}
