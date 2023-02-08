package by.academy.junit.homework7;

import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener{

    public CalculatorTestListener(){
        super();
    }

    @Override
    public void testFinished(Description description) {
        System.out.println("test " + description.getMethodName() + " Successful ");
    }
}
