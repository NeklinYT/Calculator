package com.neklin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void normalDivideTest() {
        Calculator calculator0 = new Calculator(8, 4);
        float answer = calculator0.Calculate("divide");
        Assertions.assertEquals(2, answer);
    }
    @Test
    void divideByZeroTest() {
        Calculator calculator1 = new Calculator(8, 0);
        Assertions.assertThrows(ArithmeticException.class, () -> calculator1.Calculate("divide"));
    }
}
