package com.neklin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO
        System.out.println("Calculator");
        System.out.println("Write first number, second number, third number(if you like),  action");
        System.out.println("example: 1   2  3 \nplus/minus/multiply/divide");
        System.out.println("Do you like write three numbers? (y/n)");
        int amount = 2;
        Calculator calculator = getCalculator();
        calculator.getResult();
    }

    private static Calculator getCalculator() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char amountAnswer = scanner.next().charAt(0);
        float firstNumber = scanner.nextFloat();
        float secondNumber = scanner.nextFloat();
        if (amountAnswer == 'y') {
            float thirdNumber = scanner.nextFloat();
            String action = scanner.next();
            calculator.Calculate(firstNumber, secondNumber, thirdNumber, action);
        } else {
            String action = scanner.next();
            calculator.Calculate(firstNumber, secondNumber, action);
        }
        return calculator;
    }
}