package org.jalgo.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TwoSumTest {

    @Test
    public void testTwoSum() throws Exception {
        int[] array = {2, 5, 7, 11, 3, 6};
        int[] ret = TwoSum.twoSum(array, 18);
        assertTrue(ret[0] == 3);
        assertTrue(ret[1] == 4);
    }
}