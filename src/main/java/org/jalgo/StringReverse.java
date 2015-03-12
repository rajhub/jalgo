package org.jalgo;

public class StringReverse {
	public static void main(String[] args) {
		StringReverse sr = new StringReverse();
		System.out.println(sr.reverse("hello world"));
	}
	
	public String reverse(String s) {
		char reverse[] = new char[s.length()];
		
		for(int i = s.length() -1, j=0; i >= 0; i--, j++) {
			reverse[j] = s.charAt(i);
		}
		
		return String.valueOf(reverse);
	}
}
