package by.academy.junit.homework7;

import org.junit.Assert;
import org.junit.Test;

public class MathTest2 extends Assert {

    @Test
    public void testSqr() {
        assertEquals(3, Math.sqrt(9.0), 0.001);
    }
}
