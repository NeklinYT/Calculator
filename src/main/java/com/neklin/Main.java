package com.neklin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Calculator with three numbers
        // TODO Junit Mockito AutoTests
        System.out.println("Calculator");
        System.out.println("Write first number, second number, action");
        System.out.println("example: 1   2   \nplus/minus/multiply/divide");
        System.out.println("write numbers:");
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator(scanner.nextInt(), scanner.nextInt());
        System.out.println("write action");
        String action = scanner.next();
        calculator.Calculate(action);
    }
}