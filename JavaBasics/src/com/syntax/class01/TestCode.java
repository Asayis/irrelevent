package com.syntax.class01;

import java.util.Scanner;

public class TestCode {

	public static void main(String[] args) {
	
	
	Scanner scan = new Scanner (System.in);
	
	 System.out.println("Please enter first number");
	 int x = scan.nextInt(); 
	 
	 System.out.println("Please enter second number");
	 int y = scan.nextInt();
	
	 if (x*y < 0) {
		 System.out.println("true");
		 
	 if (x*y > 0) {
		 System.out.println("false");
	 }
	 
	 System.out.println();
	}
}
}
