package org.jalgo;

public class Anagram2 {
    public static boolean isAnagram(String str1, String str2) {
        int[] LETTERS = new int[256];

        if (str1 == null || str2 == null)
            return false;
        if (str1.length() != str2.length())
            return false;

        int s1 = 0, s2 = 0;
        for (int i = 0; i < str1.length(); i++) {
            s1 ^= str1.charAt(i);
            s2 ^= str2.charAt(i);
        }

        return (s1 ^ s2) == 0;
    }
}
