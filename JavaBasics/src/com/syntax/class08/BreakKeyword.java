package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {


		for (int i=1; i<=5; i++) {
			System.out.println("Hello");
			if (i==1)
			break;
		}
		
		

		boolean summer = true;
		int temp=95;
		
		while (summer) {
			
			if (temp<70) {
			System.out.println("It is not Hot");
			break;
		}
			System.out.println("It is hot");
		temp-=10;	
		
	}

}
}
