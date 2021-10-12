package com.company.lesson1_2;

/**
 * Найти первый повторяющийся символ в строке стринг  "ВЕРЕВКА ДОСТАТОЧНОЙ ДЛИНЫ,ЧТОБЫ ВЫСТРЕЛИТЬ СЕБЕ В НОГУ"
 */
public class Lesson1_2Task8 {
    public static void main(String[] args) {
        String currentString = "ВЕРЕВКА ДОСТАТОЧНОЙ ДЛИНЫ,ЧТОБЫ ВЫСТРЕЛИТЬ СЕБЕ В НОГУ";
        System.out.println(currentString);
        for (int i = 1; i < currentString.length(); i++) {
            for (int j = i - 1; j > 0; j--) {
                if (currentString.charAt(i) == currentString.charAt(j)) {
                    System.out.println("The first repeating character is  " + currentString.charAt(i));
                    return;
                }
            }
        }
    }
}
