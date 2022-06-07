package com.codurance.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FibonacciCalculatorShould {

    @Test
    void return_0_when_position_is_zero() {
        final FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        assertEquals(0, fibonacciCalculator.calculate(0));
    }

    @Test
    void return_1_when_position_is_1() {
        final FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        assertEquals(1, fibonacciCalculator.calculate(1));
    }

    @Test
    void return_1_when_position_is_2() {
        final FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        assertEquals(1, fibonacciCalculator.calculate(2));
    }

    @Test
    void return_2_when_position_is_3() {
        final FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        assertEquals(2, fibonacciCalculator.calculate(3));
    }

    @Test
    void return_3_when_position_is_4() {
        final FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        assertEquals(3, fibonacciCalculator.calculate(4));
    }

    @Test
    void return_5_when_position_is_5() {
        final FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        assertEquals(5, fibonacciCalculator.calculate(5));
    }


    @Test
    void return_8_when_position_is_6() {
        final FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        assertEquals(8, fibonacciCalculator.calculate(6));
    }

}
