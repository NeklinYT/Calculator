package com.neklin;

public class Calculator {
    private float firstNumber;
    private float secondNumber;
    private float result;
    private float thirdNumber;
    private String action;


    public float Calculate(float firstNumber, float secondNumber, String action) {
        this.action = action;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        switch (action) {
            case "plus":
                result = firstNumber + secondNumber;
                break;
            case "minus":
                result = firstNumber - secondNumber;
                break;
            case "multiply":
                if (firstNumber == 0 || secondNumber == 0) {
                    throw new ArithmeticException("Cannot multiply by zero");
                } else {
                    result = firstNumber * secondNumber;
                }
                break;
            case "divide":
                if (firstNumber == 0 || secondNumber == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                } else {
                    result = firstNumber / secondNumber;
                }
                break;
            default:
                System.out.println("Incorrect action");
                break;
        }
        return result;
    }

    public float Calculate(float firstNumber, float secondNumber, float thirdNumber, String action) {
        this.action = action;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        switch (action) {
            case "plus":
                result = firstNumber + secondNumber + thirdNumber;
                break;
            case "minus":
                result = firstNumber - secondNumber - thirdNumber;
                break;
            case "multiply":
                if (firstNumber == 0 || secondNumber == 0 || thirdNumber == 0) {
                    throw new ArithmeticException("Cannot multiply by zero");
                } else {
                    result = firstNumber * secondNumber * thirdNumber;
                }
                break;
            case "divide":
                if (firstNumber == 0 || secondNumber == 0 || thirdNumber == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                } else {
                    result = firstNumber / secondNumber / thirdNumber;
                }
                break;
            default:
                System.out.println("Incorrect action");
                break;
        }
        return result;
    }
    public void getResult() {
        System.out.println(result);
    }
}

