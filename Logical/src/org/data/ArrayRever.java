package org.data;

public class ArrayRever {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };

		int i = 0, j = a.length - 1;

		while (i < j) {

			int temp = a[i];
			
			
			a[i] = a[j];

			
			a[j] = temp;

			i++;

			j--;
			
}
		
		for (int j2 = 0; j2 < a.length; j2++) {
			
			System.out.println(a[j2]);
			
		}
		
		

	}

}
