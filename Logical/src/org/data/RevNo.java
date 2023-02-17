package org.data;

public class RevNo {

	public static void main(String[] args) {
		int num = 12321;
		
		int count = 0;

		int rev = 0;

		int temp = num;
		while (num > 0) {

			int n = num % 10;

			rev = (rev * 10) + n;
 
			num = num / 10;
			
			count++;

		}
		if (temp == rev) {

			System.out.println("it is palindrome");

		} else {
			System.out.println("it is not palindrome");

		}
		System.out.println(count);

		

	}

}
