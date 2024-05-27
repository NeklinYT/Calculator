package com.neklin;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
//    private int thirdNumber;
    private String action;


//    public Calculator(String action, int firstNumber, int secondNumber, int thirdNumber) {
//        this.firstNumber = firstNumber;
//        this.secondNumber = secondNumber;
//        this.thirdNumber = thirdNumber;
//        this.action = action;
//    }

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
//        this.action = action;
    }

    public void Calculate(String action) {
        this.action = action;
        switch (action) {
            case "plus":
                System.out.println(firstNumber + secondNumber);
                break;
            case "minus":
                System.out.println(firstNumber - secondNumber);
                break;
            case "multiply":
                System.out.println(firstNumber * secondNumber);
                break;
            case "divide":
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Incorrect action");
                break;
        }
    }

}
