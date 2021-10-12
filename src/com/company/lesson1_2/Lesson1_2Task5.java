package com.company.lesson1_2;

import java.util.Scanner;

/**
 * Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе
 */
public class Lesson1_2Task5 {
    static int positiveNumbersCounter = 0;
    static int negativeNumbersCounter = 0;

    public  static void getNumberOfPositiveAndNegativeNumbers(int currentNumber) {
        if (currentNumber > 0) {
            positiveNumbersCounter++;
        } else if (currentNumber != 0) {
            negativeNumbersCounter++;
        }
    }

    public static void main(String[] args) {
        int firstIntNumber, secondIntNumber, thirdIntNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integer numbers ");
        firstIntNumber = sc.nextInt();
        secondIntNumber = sc.nextInt();
        thirdIntNumber = sc.nextInt();

        getNumberOfPositiveAndNegativeNumbers(firstIntNumber);
        getNumberOfPositiveAndNegativeNumbers(secondIntNumber);
        getNumberOfPositiveAndNegativeNumbers(thirdIntNumber);

        System.out.println("There are " + positiveNumbersCounter + " positive numbers in your list");
        System.out.println("There are " + negativeNumbersCounter + " negative numbers in your list");

        //with array
            /*int numbers[] = new int[3];
            int positiveNumbersCounter = 0;
            int negativeNumbersCounter = 0;
            System.out.println("Enter 3 numbers: ");
            for (int i = 0; i < numbers.length; ++i) {
                Scanner sc = new Scanner(System.in);
                numbers[i] = sc.nextInt();
                if(numbers[i] > 0) {
                    positiveNumbersCounter++;
                }
                else if(numbers[i] != 0 ) {
                    negativeNumbersCounter++;
                }
            }
            System.out.println("There are "+ positiveNumbersCounter + " positive numbers in your list");
            System.out.println("There are "+ negativeNumbersCounter + " negative numbers in your list");*/
    }
}
