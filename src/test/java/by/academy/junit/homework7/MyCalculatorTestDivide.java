package by.academy.junit.homework7;

import by.academy.junit.homework7.task3.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

public class MyCalculatorTestDivide extends Assert {

    private double valueA;
    private double valueB;
    private double expected;

    public MyCalculatorTestDivide(double valueA, double valueB, double expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: {0} / {1} = {2}")
    public static Iterable<Double[]> parametersForTest() {
        return Arrays.asList(new Double[][] {
                { 3.0, 3.0, 1.0 },
                { 1.0, 0.0, Double.POSITIVE_INFINITY },
                { -1.0, 0.0, Double.NEGATIVE_INFINITY },
                { -0.0, 0.0, Double.NaN } });
    }

    @Test
    public void testDivide() {
        assertEquals(expected, Calculator.divide(valueA, valueB), 0.00000001);
    }
}
