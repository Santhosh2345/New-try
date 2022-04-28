package org.java;

public class Nested_For {
	public static void main(String[] args) {
		
		for (int i = 0; i <=4 ; i++) {
			int a = i>(4/2)?4-i:i;
			int b = (4/2)-a;
			for (int j =0; j<a; j++) 
				
			{
				System.out.print(" ");	
			}
		 
			for (int j = 0; j <=b; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		
	}
}
	



