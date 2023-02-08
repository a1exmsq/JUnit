package by.academy.junit.homework7;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.TestClass;

public class TestRunner extends BlockJUnit4ClassRunner {
    private final CalculatorTestListener calculatorTestListener;

    public TestRunner(Class<CalculatorTestListener> clz) throws InitializationError {
        super(clz);
        calculatorTestListener = new CalculatorTestListener();
    }

    @Override
    public void run(RunNotifier notifier) {
        notifier.addListener(calculatorTestListener);
        super.run(notifier);
    }
}
