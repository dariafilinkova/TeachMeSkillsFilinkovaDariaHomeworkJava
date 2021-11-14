package com.company.lesson6;

public class Converter extends ArabicRomanNumbers {

    public static int romanToArabic(String romanNumber) {
        int sum = 0;
        int len = romanNumber.length() - 1;
        for (int i = 0; i < len; i++) {
            if (romanMap.get(romanNumber.charAt(i)) < romanMap.get(romanNumber.charAt(i + 1))) {
                sum -= romanMap.get(romanNumber.charAt(i));
            } else {
                sum += romanMap.get(romanNumber.charAt(i));
            }
        }
        sum += romanMap.get(romanNumber.charAt(len));
        return sum;
    }

    public static String arabicToRoman(int arabicNum) {
        StringBuilder roman = new StringBuilder("");
        for (int i : arabicMap.keySet()) {
            for (int j = 1; j <= arabicNum / i; j++) {
                roman.append(arabicMap.get(i));
            }
            arabicNum %= i;
        }
        return roman.toString();
    }
}
