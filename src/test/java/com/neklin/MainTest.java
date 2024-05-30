package com.neklin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void normalDivideTest() {
        float answer = calculator.Calculate(8, 4, "divide");
        Assertions.assertEquals(2, answer);
    }
    @Test
    void divideByZeroTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.Calculate(8, 0, "divide"));
    }
    @Test
    void multiplyByZeroTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.Calculate(8, 0, "multiply"));
    }
}
