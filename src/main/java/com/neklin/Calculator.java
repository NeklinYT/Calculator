package com.neklin;

public class Calculator {
    private float firstNumber;
    private float secondNumber;
    private float result;
//    private int thirdNumber;
    private String action;


//    public Calculator(String action, int firstNumber, int secondNumber, int thirdNumber) {
//        this.firstNumber = firstNumber;
//        this.secondNumber = secondNumber;
//        this.thirdNumber = thirdNumber;
//        this.action = action;
//    }

    public Calculator(float firstNumber, float secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
//        this.action = action;
    }

    public float Calculate(String action) {
        this.action = action;
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
                }
                else {
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
    public void getResult() {
        System.out.println(result);
    }
}
