package org.example.hwtesting.service;

import net.bytebuddy.implementation.bytecode.Division;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    void plusPositive() {
        int num1 = 10;
        int num2 = 5;
        int actual = calculatorService.plus(num1, num2);

        Assertions.assertEquals(15, actual);
    }

    @Test
    void plusNegative() {
        int num1 = -25;
        int num2 = -15;
        int actual = calculatorService.plus(num1, num2);

        Assertions.assertEquals(-40, actual);
    }

    @Test
    void minusPositive() {
        int num1 = 15;
        int num2 = 20;
        int actual = calculatorService.minus(num1, num2);

        Assertions.assertEquals(-5, actual);
    }

    @Test
    void minusNegative() {
        int num1 = 25;
        int num2 = 15;
        int actual = calculatorService.minus(num1, num2);

        Assertions.assertEquals(10, actual);
    }

    @Test
    void multiplyPositive() {
        int num1 = 10;
        int num2 = 5;
        int actual = calculatorService.multiply(num1, num2);

        Assertions.assertEquals(50, actual);
    }

    @Test
    void multiplyNegative() {
        int num1 = -10;
        int num2 = 3;
        int actual = calculatorService.multiply(num1, num2);

        Assertions.assertEquals(-30, actual);
    }

    @Test
    void dividePositive() {
        int num1 = 10;
        int num2 = 5;
        int actual = (int) calculatorService.divide(num1, num2);

        Assertions.assertEquals(2, actual);
    }

    @Test
    void divideNegative() {
        int num1 = -30;
        int num2 = 10;
        double actual = calculatorService.divide(num1, num2);

        Assertions.assertEquals(-3, actual);

    }
}
