package com.syntax.class07;

import java.util.Scanner;

public class shopSwitch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		int x = scan.nextInt();
		
		System.out.println("Please enter 2nd number");
		int y= scan.nextInt();
		double outcome =0.0;
		
		System.out.println("Please enter your operator");
		char op= scan.next().charAt(0);
		int result = 0;
		String operator = null;
		
		
		switch (op) {
		case '*':
			result = x*y;
				break;
		case '/':
			result = x/y;
				break;
		case '+':
			result = x+y;
				break;
		case '-':
			result = x-y;
				break;
		default:
			System.out.println("Invalid Operator");
			operator = "invalid";
		}
		
		if (result !=0 || operator ==null) {
			System.out.println(x+ " " +op+ "" +y+ "" + result);
		}
		scan.close();
	}
	
}
