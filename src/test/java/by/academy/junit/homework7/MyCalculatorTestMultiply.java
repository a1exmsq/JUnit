package by.academy.junit.homework7;

import by.academy.junit.homework7.task3.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

public class MyCalculatorTestMultiply extends Assert {
    private double valueA;
    private double valueB;
    private double expected;

    public MyCalculatorTestMultiply(double valueA, double valueB, double expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: {0} * {1} = {2}")
    public static Iterable<Double[]> parametersForTest() {
        return Arrays.asList(new Double[][] {
                { 3.3, 3.0, 9.9 },
                { -5.0, -6.0, 30.0 },
                { -1.0, 3.0, -3.0 } });
    }

    @Test
    public void testMultiplication() {
        assertEquals(expected, Calculator.multiply(valueA, valueB), 0.001);
    }
}
