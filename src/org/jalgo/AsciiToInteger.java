package org.jalgo;

public class AsciiToInteger {
	public static void main(String[] args) {
		System.out.println(toInt("123"));
	}

	private static int toInt(String str) {

		// add null and empty string check here
		if (str == null || str.isEmpty()) 
			throw new IllegalArgumentException("String is null or empty");
		
		int val = 0;
		for (int i = 0; i < str.length(); i++) {
			int charVal = str.charAt(i) - '0';
			if (charVal >= 0 && charVal <= 9)
				val = val * 10 + str.charAt(i) - '0';
			else
				throw new IllegalArgumentException("String is not a number");
		}
		return val;
	}
}
