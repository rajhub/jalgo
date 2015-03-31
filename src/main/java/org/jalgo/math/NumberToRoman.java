package org.jalgo.math;

public class NumberToRoman {
	static int[] NUMBERS = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900,
			1000 };
	static String[] ROMAN_LETTERS = { "I", "IV", "V", "IX", "X", "XL", "L",
			"XC", "C", "CD", "D", "CM", "M" };

	public static void main(String[] args) {
		System.out.println(toRoman(1984));
	}

	private static String toRoman(int number) {
		
		String val = "";
		for (int i = NUMBERS.length - 1; i >= 0; i--) {
			while (number >= NUMBERS[i]) {
				val += ROMAN_LETTERS[i];
				number -= NUMBERS[i];
			}
		}
		return val;
	}
}
