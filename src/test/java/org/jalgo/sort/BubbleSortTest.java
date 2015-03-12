package org.jalgo.sort;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BubbleSortTest {

    @Test
    public void testSort() throws Exception {
        int array[] = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        BubbleSort.sort(array);
        for (int i = 0; i < array.length; i++) {
            assertTrue(array[i] == i);
        }
    }
}