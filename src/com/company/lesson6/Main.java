package com.company.lesson6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String inputEquation = writeEquation();
        solveEquation(inputEquation);
        printTheResultOfEquation();
    }

    public static String writeEquation() {
        System.out.println("Example of the equation\n" +
                "5 + IV = \n" +
                "Enter urs : ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    static int firstNumber = 0, secondNumber = 0;
    static char operation = ' ';

    public static void solveEquation(String inputEquation) {


        Converter converter = new Converter();
        String[] formattedString = inputEquation.split(" ");

        for (String str : formattedString) {
            if (str.matches("^\\d+") && firstNumber == 0) {  //цифровой символ
                firstNumber = Integer.parseInt(str);
            }
            if (str.matches("^\\d+")) {  //цифровой символ
                secondNumber = Integer.parseInt(str);
            }
            if (str.matches("[a-zA-Z]+") && firstNumber == 0) {
                firstNumber = Converter.romanToArabic(str);
            }
            if (str.matches("[a-zA-Z]+")) {
                secondNumber = Converter.romanToArabic(str);
            }
            if (str.matches("[-+ * / ]")) {
                operation = str.charAt(0);
            }
        }
    }

    public static void printTheResultOfEquation() {
        int resultOfEquationInArabicForm = Computing.operations(firstNumber, operation, secondNumber);
        System.out.println("The result of ur equation in arabic form : " + resultOfEquationInArabicForm);
        String resultOfEquationInRomanForm = Converter.arabicToRoman(resultOfEquationInArabicForm);
        System.out.println("The result of ur equation in roman form : " + resultOfEquationInRomanForm);
    }
}
