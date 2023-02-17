package org.data;

public class Palindrome {

	public static void main(String[] args) {

		String d = "malayalam";

		String rev = "";

		for (int i = d.length() - 1; i >= 0; i--) {

			rev = rev + d.charAt(i);

		}
		if (d.equalsIgnoreCase(rev)) {

			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not palindrome");

		}

	}
}
