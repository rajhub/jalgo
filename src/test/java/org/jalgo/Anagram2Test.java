package org.jalgo;

import org.jalgo.string.Anagram2;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class Anagram2Test {

    @Test
    public void testIsAnagram() throws Exception {
        assertTrue(Anagram2.isAnagram("abc", "cab"));
        assertFalse(Anagram2.isAnagram("abc", "abcd"));
        assertFalse(Anagram2.isAnagram("abc", ""));
        assertFalse(Anagram2.isAnagram("abc", null));
    }
}