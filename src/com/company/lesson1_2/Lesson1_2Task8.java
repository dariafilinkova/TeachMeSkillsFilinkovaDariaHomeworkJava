package com.company.lesson1_2;

/**
 * Найти первый повторяющийся символ в строке стринг  "ВЕРЕВКА ДОСТАТОЧНОЙ ДЛИНЫ,ЧТОБЫ ВЫСТРЕЛИТЬ СЕБЕ В НОГУ"
 */
public class Lesson1_2Task8 {
    public static void main(String[] args) {
        String currentString = "ВЕРЕВКА ДОСТАТОЧНОЙ ДЛИНЫ,ЧТОБЫ ВЫСТРЕЛИТЬ СЕБЕ В НОГУ";
        //String currentString = " Когда был шуг"; //for checking repeating char "space", the result should be "г"
        System.out.println(currentString);
        for (int i = 0; i < currentString.length(); i++) {
            for (int j = i + 1; j < currentString.length(); j++) {
                if (currentString.charAt(i) == currentString.charAt(j) && currentString.charAt(i) != 32) {
                    System.out.println("The first repeating character is  " + currentString.charAt(i));
                    return;
                }
            }
        }
    }
}
