package org.jalgo.math;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ReverseNumberTest {

    @Test
    public void testReverse() throws Exception {
        assertTrue(ReverseNumber.reverse(123) == 321);
    }
}