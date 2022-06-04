package Replit;

import java.util.Scanner;

public class HomeWork23 {

	public static void main(String[] args) {
		
		/*
		 * Create a program that will ask a user to input boolean value "Input the boolean value"
		 * 
		 * If the input is true or false, then the output should look like below:
		 * 
		 */
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the boolean value");
		boolean a = scan.nextBoolean();
		
		
		if (a) {
		System.out.println("The value is true");
		} else {
			System.out.println("The value is false");
		}
		
	}

}
