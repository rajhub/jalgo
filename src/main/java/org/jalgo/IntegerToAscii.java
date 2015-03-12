package org.jalgo;

public class IntegerToAscii {

	public static void main(String[] args) {
		System.out.println(toAscii(1984));
	}

	private static String toAscii(int num) {
		String val = "";
		
		while (num > 0) {
			val =  num%10 + val;
			num = num/10;
		}
		return val;
	}
}
