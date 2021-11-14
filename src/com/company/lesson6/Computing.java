package com.company.lesson6;

public class Computing {
    public static int operations(int firstNumber, char operation, int secondNumber) {
        int result = 0;
        switch (operation) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            default:
                break;
        }
        return result;
    }
}
