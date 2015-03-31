package org.jalgo;

import org.jalgo.string.Anagram;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AnagramTest {

    @Test
    public void testIsAnagram() throws Exception {
        assertTrue(Anagram.isAnagram("abc", "cab"));
        assertFalse(Anagram.isAnagram("abc", "abcd"));
        assertFalse(Anagram.isAnagram("abc", ""));
        assertFalse(Anagram.isAnagram("abc", null));
    }
}