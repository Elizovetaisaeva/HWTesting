package org.example.hwtesting.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ParametrizedCalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();

    Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, 3),
                Arguments.of(7, 5),
                Arguments.of(25, -13),
                Arguments.of(-103, -673));
    }

    @ParameterizedTest
    @MethodSource("data")
    void plus(int num1, int num2) {
        int expected = num1 + num2;
        Assertions.assertEquals(expected, calculatorService.plus(num1, num2));

    }

    @ParameterizedTest
    @MethodSource("data")
    void minus(int num1, int num2) {
        int expected = num1 - num2;
        Assertions.assertEquals(expected, calculatorService.minus(num1, num2));

    }

    @ParameterizedTest
    @MethodSource("data")
    void multiply(int num1, int num2) {
        int expected = num1 * num2;
        Assertions.assertEquals(expected,calculatorService.multiply(num1, num2));

    }

    @ParameterizedTest
    @MethodSource("data")
    void divide(int num1, int num2)
            throws Exception {
        int expected = num1 / num2;

    }
        }
