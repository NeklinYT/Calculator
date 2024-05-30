package com.neklin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Calculator с тремя числами
        // TODO Числа не должны передаватся при создании обьекта из класса Calculator
        System.out.println("Calculator");
        System.out.println("Write first number, second number, action");
        System.out.println("example: 1   2   \nplus/minus/multiply/divide");
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("write first number, second number, action");
        float firstNumber = scanner.nextFloat();
        float secondNumber = scanner.nextFloat();
        String action = scanner.next();
        calculator.Calculate(firstNumber, secondNumber, action);
        calculator.getResult();
    }
}