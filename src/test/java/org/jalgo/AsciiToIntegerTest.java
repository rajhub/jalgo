package org.jalgo;

import org.jalgo.string.AsciiToInteger;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AsciiToIntegerTest {

    @Test
    public void testToInt() throws Exception {
        assertTrue(AsciiToInteger.toInt("123") == 123);
    }
}