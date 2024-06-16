package com.neklin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO переместить getCalculator из Main в Calculator
        System.out.println("Calculator");
        System.out.println("Write first number, second number, third number(if you like)");
        int amount = 2;
        Calculator calculator = getCalculator();
        calculator.getResult();
    }

        private static Calculator getCalculator() {
            Scanner scanner = new Scanner(System.in);
            Calculator calculator = new Calculator();
            String[] inputs = scanner.nextLine().split(" "); // ввод чисел
            float[] numbers = new float[inputs.length]; // массив для хранения чисел
            for (int i = 0; i < inputs.length; i++) {
                numbers[i] = Float.parseFloat(inputs[i]); // парсинг строк в числа
            }
            System.out.println("example: plus/minus/multiply/divide");
            System.out.println("Write action: ");
            String action = scanner.next(); // ввод операции
            if (numbers.length == 2) {
                calculator.Calculate(numbers[0], numbers[1], action);
            } else if (numbers.length == 3) {
                calculator.Calculate(numbers[0], numbers[1], numbers[2], action);
            } else {
                System.out.println("Incorrect input");
            }
            return calculator;
    }
}