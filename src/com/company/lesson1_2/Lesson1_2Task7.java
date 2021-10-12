package com.company.lesson1_2;

import java.util.Scanner;

/**
 * В переменную записываете количество программистов. В
 *     зависимости от количества программистов необходимо вывести правильно
 *     окончание. Например:
 *     • 2 программиста
 *     • 1 программиста
 *     • 10 программистов
 *     • и т.д.
 */
public class Lesson1_2Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity of programmers  :");
        int programmers = sc.nextInt();

        if (programmers % 10 == 1 && !(programmers % 100 == 11)) { //check that ends on ...1 but not ....11
            System.out.println(programmers + " программист");
        } else if ((programmers % 10 > 1 && programmers % 10 < 5) && !(programmers % 100 > 10 && programmers % 100 < 15)) { //check that ends on 2,3,4 but not 11,12,13,14
            System.out.println(programmers + " программиста");
        } else System.out.println(programmers + " программистов");
    }
}
