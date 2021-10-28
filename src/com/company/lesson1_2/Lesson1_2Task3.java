package com.company.lesson1_2;

import java.util.Scanner;

/**
 * Дано целое число. Если оно является положительным, то прибавить к нему 1.
 * Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10. Вывести полученное число
 */
public class Lesson1_2Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int currentNumber = sc.nextInt();

        if (currentNumber > 0) {
            currentNumber++;
        } else if (currentNumber < 0) {
            currentNumber -= 2;
        } else currentNumber = 10;

        System.out.println(currentNumber);
    }
}
