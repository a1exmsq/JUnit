package by.academy.junit.homework7;

import by.academy.junit.homework7.task3.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;

public class MyCalculatorTestSum extends Assert {

    private double valueA;
    private double valueB;
    private double expected;

    public MyCalculatorTestSum(double valueA, double valueB, double expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name="{index}: sum {0} and {1} = {2}")
    public static Iterable<Double[]> dataForTest() {
        return Arrays.asList(
                new Double[][] {
                        { 1.0, 2.0, 3.0 },
                        { 1.0, 1.0, 2.0 },
                        { 2.5, 6.5, 9.0 },
                        { 10.0, 2.0, 12.0 },
                        { 20.1, 13.2, 33.3 },
                        { 111.0, 0.1, 111.1 } });
    }

    @Test
    public void paramTest() {
        assertEquals(expected, Calculator.sum(valueA, valueB), 0.01);
    }
}
