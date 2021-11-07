package com.company.lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lesson5Task2 {
    public static void main(String[] args) {
        buildDictionary();
    }


    public static void buildDictionary() {
        System.out.println("Write string");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        inputString = inputString.replace(" ", "");
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <= 25; i++) {
            map.put((char) ('A' + i), 0);
            map.put((char) ('a' + i), 0);
        }

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (map.containsKey(ch)) {
                int counter = map.get(ch);
                counter++;
                map.put(ch, counter);
            } else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
