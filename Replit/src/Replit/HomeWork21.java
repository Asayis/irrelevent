package Replit;

import java.util.Scanner;

public class HomeWork21 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that asks the user's age: "Enter your age "
		 * 
		 * Then display it by adding 10 (i.e age + 10) in your final output.
		 * 
		 * Example Output:
		 * 
		 * Enter your age 30
		 * Your age after 10 years is 40
		 */
		
		Scanner EUA = new Scanner (System.in);
		System.out.println("Enter your age");
		
		int age = EUA.nextInt();
		int num1 = (age)+10;
		
		System.out.println("Your age after 10 years is "+(age+10));

	}

}
