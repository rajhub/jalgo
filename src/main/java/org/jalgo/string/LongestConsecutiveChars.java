package org.jalgo.string;

import java.util.ArrayList;
import java.util.List;

public class LongestConsecutiveChars {

    public static void main(String args[]) {
        System.out.println(getLongestConsecutiveChars("aaaabbbbcccc"));
        System.out.println(getLongestConsecutiveChars("abc"));
        System.out.println(getLongestConsecutiveChars("abcdd"));
        System.out.println(getLongestConsecutiveChars("abcabcaabc"));
    }

    public static List<Character> getLongestConsecutiveChars(String str) {

        List<Character> list = new ArrayList<Character>();

        if (str == null || str.isEmpty())
            return list;

        int strLen = str.length();

        if (strLen == 1) {
            list.add(str.charAt(0));
            return list;
        }
        int max = 0;
        int len = 1;

        for (int i = 0; i < strLen - 1; i++) {

            while (i < strLen - 1 && str.charAt(i) == str.charAt(i + 1)) {
                i++;
                len++;
            }

            if (len > max) {
                max = len;
                list.clear();
                list.add(str.charAt(i));
            } else if (len == max) {
                list.add(str.charAt(i));
            }
            len = 1;
        }

        return list;
    }
}
