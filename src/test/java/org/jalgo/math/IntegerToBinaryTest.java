package org.jalgo.math;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class IntegerToBinaryTest {

    @Test
    public void testToBinary() throws Exception {
        assertTrue(IntegerToBinary.toBinary(5).equals("101"));
        assertTrue(IntegerToBinary.toBinary(8).equals("1000"));
        assertTrue(IntegerToBinary.toBinary(15).equals("1111"));
        assertTrue(IntegerToBinary.toBinary(33).equals("100001"));
    }
}