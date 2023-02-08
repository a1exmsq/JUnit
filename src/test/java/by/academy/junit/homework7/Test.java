package by.academy.junit.homework7;
import org.junit.runner.JUnitCore;
public class Test {

    public static void main(String[] args) {
        JUnitCore jUnitTest = new JUnitCore();
        jUnitTest.addListener(new CalculatorTestListener());
        jUnitTest.run(MathTestSuit.class);
        jUnitTest.run(MyCalculatorTestDivide.class);
        jUnitTest.run(MyCalculatorTestSum.class);
        jUnitTest.run(MyCalculatorTestMultiply.class);
    }
}
