package org.jalgo.string;

public class Palindrome {

    public static boolean isPalindrome(String str) {

        if (str == null || str.length() == 0)
            return false;

        if (str.length() < 2) {
            return true;
        }

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            while (!Character.isAlphabetic(str.charAt(start)))
                start++;
            while (!Character.isAlphabetic(str.charAt(end)))
                end--;
            if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end)))
                return false;
            else {
                start++;
                end--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("able was i ere i saw elba"));
        System.out.println(isPalindrome("Red rum, sir, is murder"));
    }
}
