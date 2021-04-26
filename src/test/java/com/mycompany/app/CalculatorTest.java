package com.mycompany.app;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    void sum() {
        assertEquals(5 + 5, calc.sum(5, 5));
        assertEquals(5.5 + 5.5, calc.sum(5.5, 5.5));
    }

    @Test
    void sub() {
        assertEquals(5 - 5, calc.sub(5, 5));
        assertEquals(5.5 - 5.5, calc.sub(5.5, 5.5));
    }

    @Test
    void mul() {
        assertEquals(5 * 5, calc.mul(5, 5));
        assertEquals(5.5 * 5.5, calc.mul(5.5, 5.5));
    }

    @Test
    void div() {
        assertEquals(5 / 5, calc.div(5, 5));
        assertEquals(5.5 / 5.5, calc.div(5.5, 5.5));
    }

    @Test
    void quadEquate() {
        // Корни уравнения x^2 + 3x - 4 = 0 равны 1 и -4
        assertEquals(true, Arrays.equals(new double[]{1, -4}, calc.quadEquate(1, 3, -4)));

        // Корней в уравнении x^2 - x + 3 = 0 нет
        assertEquals(null, calc.quadEquate(1, -1, 3));
    }
}