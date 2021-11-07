package com.company.lesson5;

import java.util.Scanner;

/**
 * Создать программу, которая позволяет ввести с клавиа-туры массив размером n и отсортировать его по убыванию. Т.е.:
 * 1. Нужно считать с клавиатуры значение числа "n"(раз-мер массива), используя метод makeMassiveUsingKeyboard();
 * 2.1 Ввести значения, которые будут добавлены в массив (при размере массива, равном «n», необходимо ввести элементы
 * массива «n» раз).
 * 2.2 Далее вывести массив, который мы создали, каждый элемент через запятую и пробел, используя метод printMassive()}.
 * 3. Отсортировать базовый массив по убыванию сорти-ровкой Пузырька, используя метод sortMassiveByBubbleWay()}.
 * 4. Вывести отсортированный массив, используя метод printSortedDescMassive()}.
 */
public class Lesson5Task1 {
    static int[] array;

    public static void main(String[] args) {
        makeArrayUsingKeyboard();
        printArray();
        sortArrayByBubbleSort();
        printSortedDescArray();
    }

    public static void makeArrayUsingKeyboard() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array : ");

        int arraySize = scan.nextInt();
        array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = scan.nextInt();
        }
    }

    public static void printArray() {
        System.out.println("\nYour base array is :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }

    public static void sortArrayByBubbleSort() {
        int buf;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    buf = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buf;
                }
            }
        }
    }

    public static void printSortedDescArray() {
        System.out.print("Sorted array DESC :\n[");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array[i] + "]");
            } else
                System.out.print(array[i] + ", ");
        }
    }
}
