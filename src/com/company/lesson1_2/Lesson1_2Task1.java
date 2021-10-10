package com.company.lesson1_2;

import java.util.Scanner;

/**
 * 1) В переменную записываем число. Надо вывести на экран сколько в этом
 * числе цифр и положительное оно или отрицательное. Например, "это
 * однозначное положительное число". Достаточно будет определить, является ли
 * число однозначным, "двухзначным или трехзначным и более.
 */

public  class Lesson1_2Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int currentNumber = sc.nextInt();
        int tmpNumber = currentNumber;
        int countOfDigits = 0;
        if (currentNumber == 0) countOfDigits++;
        while (currentNumber != 0) {
            countOfDigits++;
            currentNumber /= 10;
        }

        if (tmpNumber > 0) {
            System.out.println("Your number " + tmpNumber + " is positive " + countOfDigits + "-digit number");
        } else if (tmpNumber == 0) {
            System.out.println("Your number " + tmpNumber + " is neither positive nor negative " + countOfDigits + "-digit number");
        } else {
            System.out.println("Your number " + tmpNumber + " is negative " + countOfDigits + "-digit number");
        }
    }
}
