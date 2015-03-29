package org.jalgo;

public class Anagram2 {
    public static boolean isAnagram(String str1, String str2) {
        int[] LETTERS = new int[256];

        if (str1 == null || str2 == null)
            return false;
        if (str1.length() != str2.length())
            return false;


        for (int i = 0; i < str1.length(); i++) {
            LETTERS[str1.charAt(i)]++;
            LETTERS[str2.charAt(i)]--;
        }

        for (int i = 0; i < LETTERS.length; i++) {
            if (LETTERS[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("123", "321"));
        System.out.println(isAnagram("123", ""));
        System.out.println(isAnagram("jar", "raj"));
    }
}
