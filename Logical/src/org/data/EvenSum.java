package org.data;

public class EvenSum {
	
	////even sum 1 to 100 and count
	
	public static void main(String[] args) {
		
		int a = 0;
		
		int sum =0;
		int count =0;
		for (int i = 0; i <= 50; i++) {
			
			a=2*i;
			
			System.out.println(a);
			
			sum+=a;
			
			count++;
			
			
			
		}
		
		System.out.println(sum);
		
		System.out.println(count);
		
	}
	

}
