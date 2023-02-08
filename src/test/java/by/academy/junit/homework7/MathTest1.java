package by.academy.junit.homework7;

import org.junit.Assert;
import org.junit.Test;

public class MathTest1 extends Assert {

    @Test
    public void testAbs() {
        assertEquals(17, Math.abs(-17));
    }
}
