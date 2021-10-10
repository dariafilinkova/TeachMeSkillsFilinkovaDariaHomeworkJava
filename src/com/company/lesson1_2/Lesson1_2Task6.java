package com.company.lesson1_2;

import java.util.Scanner;

/**
 * Даны 2 числа. Вывести большее из них
 */
public class Lesson1_2Task6 {
    public static void main(String[] args) {
        int firstIntNumber, secondIntNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integer numbers ");
        firstIntNumber = sc.nextInt();
        secondIntNumber = sc.nextInt();

        if (firstIntNumber > secondIntNumber) {
            System.out.println("Larger number is " + firstIntNumber);
        } else if (secondIntNumber > firstIntNumber) {
            System.out.println("Larger number is " + secondIntNumber);
        } else System.out.println("Your numbers are equal ");
    }
}
