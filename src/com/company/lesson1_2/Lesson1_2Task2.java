package com.company.lesson1_2;

import java.util.Scanner;

/**
 * Треугольник существует только тогда, когда сумма любых двух его сторон
 * больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
 * стороны предполагаемого треугольника. Требуется сравнить длину каждого
 * отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
 * окажется больше суммы двух других, то треугольника с такими сторонами не
 * существует
 */

public class Lesson1_2Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1-st side a of triangle :");
        int firstSideOfTriangle = sc.nextInt();

        System.out.println("Enter the 2-st side b of triangle :");
        int secondSideOfTriangle = sc.nextInt();

        System.out.println("Enter the 3-st side c of triangle :");
        int thirdSideOfTriangle = sc.nextInt();

        if (firstSideOfTriangle >= secondSideOfTriangle + thirdSideOfTriangle ||
                secondSideOfTriangle >= firstSideOfTriangle + thirdSideOfTriangle || thirdSideOfTriangle >=
                firstSideOfTriangle + secondSideOfTriangle) {
            System.out.println("Such triangle doesn't exist");
        } else
            System.out.println("Such triangle exists");
    }
}
