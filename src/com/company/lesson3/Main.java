package com.company.lesson3;

/**
 * Создать класс компьютер.
 * Поля:
 * isOn boolean
 * - процессор    Boolean
 * - оперативка Boolean
 * - жесткий диск Boolean
 * - ресурс полных циклов работы (включений/выключений) int
 * Методы:
 * - метод описание(вывод всех полей)
 * вывод:  [“есть”, “есть”, “есть”, 18 циклов]
 * - метод включить, при включении может произойти сбой, при вызове метода
 * рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
 * угадали комп включается, если нет сгорает. Если комп сгорел, при попытке
 * включить нужно выдать сообщение что ему конец
 * - выключить (аналогично включению)
 * - при превышении лимита ресурса комп сгорает
 */

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer(true, true, true, 5);
        System.out.println(comp1.toString());
        comp1.computerDescription();
        comp1.turnOn();
        comp1.turnOff();

        Computer comp2 = new Computer(false, true, true, 4);
        comp2.computerDescription();
        comp2.turnOn();

        Computer comp3 = new Computer(false, true, true, 4);
        comp3.computerDescription();
        System.out.println(comp2.equals(comp3));
    }
}
