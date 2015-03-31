package org.jalgo.string;

public class Substring {
	public static void main(String[] args) {
		System.out.println(substring("hello world", "world"));
		System.out.println(substring("hello", "world"));
		System.out.println(substring(null, "world"));
		System.out.println(substring("hello", null));
	}

	private static int substring(String haystack, String needle) {
		if (haystack == null || needle == null)
			return -1;
		for (int i = 0; i < haystack.length(); i++) {
			int j = 0;
			for (; j < needle.length() && i + j < haystack.length(); j++) {
				if (haystack.charAt(i + j) != needle.charAt(j))
					break;
			}
			if (j == needle.length())
				return i;
		}
		return -1;
	}
}
