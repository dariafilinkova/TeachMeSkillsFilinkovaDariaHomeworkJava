package com.company.lesson1_2;

import java.util.Scanner;

/**
 * Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе
 */
public class Lesson1_2Task5 {
    public static void main(String[] args) {
        int firstIntNumber, secondIntNumber, thirdIntNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integer numbers ");
        firstIntNumber = sc.nextInt();
        secondIntNumber = sc.nextInt();
        thirdIntNumber = sc.nextInt();
        int counterOfPositiveNumbers = 0;
        int counterOfNegativeNumbers = 0;

        //maybe need to do one method because actions are repeated
        if (firstIntNumber > 0) counterOfPositiveNumbers++;
        else if (firstIntNumber != 0) counterOfNegativeNumbers++;

        if (secondIntNumber > 0) counterOfPositiveNumbers++;
        else if (secondIntNumber != 0) counterOfNegativeNumbers++;

        if (thirdIntNumber > 0) counterOfPositiveNumbers++;
        else if (thirdIntNumber != 0) counterOfNegativeNumbers++;

        System.out.println("There are " + counterOfPositiveNumbers + " positive numbers in your list");
        System.out.println("There are " + counterOfNegativeNumbers + " negative numbers in your list");

        //with array
            /*int numbers[] = new int[3];
            int counterOfPositiveNumbers=0;
            int counterOfNegativeNumbers=0;
            System.out.println("Enter 3 numbers: ");
            for (int i = 0; i < numbers.length; ++i) {
                Scanner sc = new Scanner(System.in);
                numbers[i] = sc.nextInt();
                if(numbers[i]>0) {
                    counterOfPositiveNumbers++;
                }
                else if(numbers[i]!=0 ) {
                    counterOfNegativeNumbers++;
                }
            }
            System.out.println("There are "+ counterOfPositiveNumbers + " positive numbers in your list");
            System.out.println("There are "+ counterOfNegativeNumbers + " negative numbers in your list");*/
    }
}
