package org.data;

public class Count {
	
	
	public static void main(String[] args) {
		
		String d  = "Harish";
		 
		int count =0;
		
		for (int i = d.length()-1; i >= 0; i--) {
			
			System.out.println(d.charAt(i));
			     
			count++;

		}
		 
		
		System.out.print(count);
			
	}

}
