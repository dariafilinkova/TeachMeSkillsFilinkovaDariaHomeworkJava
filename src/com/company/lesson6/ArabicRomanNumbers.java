package com.company.lesson6;

import java.util.LinkedHashMap;

public class ArabicRomanNumbers {
    static LinkedHashMap<Character, Integer> romanMap = new LinkedHashMap<>();

    {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    static LinkedHashMap<Integer, String> arabicMap = new LinkedHashMap<>();

    {
        arabicMap.put(1000, "M");
        arabicMap.put(900, "CM");
        arabicMap.put(500, "D");
        arabicMap.put(400, "CD");
        arabicMap.put(100, "C");
        arabicMap.put(90, "XC");
        arabicMap.put(50, "L");
        arabicMap.put(40, "XL");
        arabicMap.put(10, "X");
        arabicMap.put(9, "IX");
        arabicMap.put(5, "V");
        arabicMap.put(4, "IV");
        arabicMap.put(1, "I");
    }
}
