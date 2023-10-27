package org.group06.utils;

import java.util.ArrayList;

public class NameStandard {

    /**
     * @param formatCapitilize Định dạng lại In Hoa chữ cái đầu
     */

    public static String formatCapitilize(String text) {
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
     * @param removeDiacritics Loại bỏ dấu tiếng Việt
     */
    public static String removeDiacritics(String input) {
        String regex = "\\p{InCombiningDiacriticalMarks}+";
        String textWithoutDiacritics = java.text.Normalizer.normalize(input, java.text.Normalizer.Form.NFD)
                .replaceAll(regex, "");
        return textWithoutDiacritics;
    }
}
