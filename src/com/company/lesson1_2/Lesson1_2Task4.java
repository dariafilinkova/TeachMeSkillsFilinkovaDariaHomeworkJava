package com.company.lesson1_2;

import java.util.Scanner;

/**
 *  Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */
public class Lesson1_2Task4 {
    public static void main(String[] args) {
        int firstIntNumber, secondIntNumber, thirdIntNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integer numbers ");
        firstIntNumber = sc.nextInt();
        secondIntNumber = sc.nextInt();
        thirdIntNumber = sc.nextInt();
        int counterOfPositiveNumbers = 0;

        if (firstIntNumber > 0) counterOfPositiveNumbers++;
        if (secondIntNumber > 0) counterOfPositiveNumbers++;
        if (thirdIntNumber > 0) counterOfPositiveNumbers++;
        System.out.println("Number of positive numbers " + counterOfPositiveNumbers);

        //with array
            /*int numbers[] = new int[3];
            int counterOfPositiveNumbers=0;
            System.out.println("Enter 3 numbers: ");
            for (int i = 0; i < numbers.length; ++i) {
                Scanner sc = new Scanner(System.in);
                numbers[i] = sc.nextInt();
                if(numbers[i]>0) {
                    counterOfPositiveNumbers++;
                }
             }
            System.out.println(counterOfPositiveNumbers);*/
    }
}
