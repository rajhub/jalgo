package org.jalgo.math;

public class ReverseNumber {
    public static int reverse(int num) {
        int reversed = 0;
        while(num > 0) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }
        return reversed;
    }

    public static void main(String args[]) {
        System.out.println(ReverseNumber.reverse(1234));
    }
}
