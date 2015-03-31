package org.jalgo.string;

public class SentenceReverse {
	public static void main(String[] args) {
		SentenceReverse sr = new SentenceReverse();
		System.out.println(sr.reverse("hello san diego world"));
	}
	
	public String reverse(String s) {
        StringBuffer sb = new StringBuffer();

        int wordStart = 0;
        int wordEnd = s.length() - 1;
		for(int i = s.length() -1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                sb.append(s.substring(i+1, wordEnd + 1));
                wordEnd = i;
                sb.append(' ');
            }
            if (i == 0) {
                sb.append(s.substring(i, wordEnd + 1));
            }
		}
		
		return sb.toString();
	}
}
