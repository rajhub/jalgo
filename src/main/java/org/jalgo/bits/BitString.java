package org.jalgo.bits;

/**
 * Created by raj on 4/8/15.
 */
public class BitString {
    public static int bitStringToNum(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            num <<= 1;
            num |= str.charAt(i) - '0';
        }
        return num;
    }

    public static String numToBitString(int num) {
        StringBuffer sb = new StringBuffer();
        if (num < 0)
            return null;

        while (num > 0) {
            sb.append(num % 2 + "");
            num /= 2;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(bitStringToNum("1000"));
        System.out.println(numToBitString(9));
    }
}
