package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    void intSum() {
        double exp = 5 + 5;
        double act = calc.sum(5, 5);
        assertEquals(exp, act);
    }

    @Test
    void doubleSum() {
        double exp = 5.5 + 5.5;
        double act = calc.sum(5.5, 5.5);
        assertEquals(exp, act);
    }

    @Test
    void intSub() {
        double exp = 5 - 5;
        double act = calc.sub(5, 5);
        assertEquals(exp, act);
    }

    @Test
    void doubleSub() {
        double exp = 5.5 - 5.5;
        double act = calc.sub(5.5, 5.5);
        assertEquals(exp, act);
    }

    @Test
    void intMul() {
        double exp = 5 * 5;
        double act = calc.mul(5, 5);
        assertEquals(exp, act);
    }

    @Test
    void doubleMul() {
        double exp = 5.5 * 5.5;
        double act = calc.mul(5.5, 5.5);
        assertEquals(exp, act);
    }

    @Test
    void intDiv() {
        double exp = 5 * 5;
        double act = calc.mul(5, 5);
        assertEquals(exp, act);
    }

    @Test
    void doubleDiv() {
        double exp = 5.5 * 5.5;
        double act = calc.mul(5.5, 5.5);
        assertEquals(exp, act);
    }

    @Test
    void quadEquate() {
        double[] exp = new double[]{1, -4};
        double[] act = calc.quadEquate(1, 3, -4);
        assertArrayEquals(exp, act);

        exp = new double[]{-1};
        act = calc.quadEquate(1, 2, 1);
        assertArrayEquals(exp, act);

        exp = null;
        act = calc.quadEquate(1, -1, 3);
        assertArrayEquals(exp, act);
    }
}