package org.jalgo.math;

public class RomanToNumber {
	static int[] NUMBERS = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900,
			1000 };
	static String[] ROMAN_LETTERS = { "I", "IV", "V", "IX", "X", "XL", "L",
			"XC", "C", "CD", "D", "CM", "M" };

	public static void main(String[] args) {
		System.out.println(toNum("MCMLXXXIV"));
	}

	private static int toNum(String roman) {
		int offset = 0;
		int val = 0;
		while (offset < roman.length()) {
			for (int i = ROMAN_LETTERS.length - 1; i >= 0; i--) {
				if (roman.startsWith(ROMAN_LETTERS[i], offset)) {
					val += NUMBERS[i];
					offset += ROMAN_LETTERS[i].length();
				}
			}
		}
		return val;
	}
}
