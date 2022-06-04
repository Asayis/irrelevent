package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkAnnualSalary {
	
	public static void main(String[] args) {
		
	/*	Write a program to ask user to enter numbers of worked years and annual salary. 
	 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
	 * otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, 
	 * otherwise bonus=3000.
	*/
		Scanner input = new Scanner (System.in);
		
		
		
		
		
		
		
		System.out.println("5 years? true or false");
		boolean yes = input.nextBoolean();
		
		if (yes) {
			System.out.println("How much money you make?");
			int b=input.nextInt();
		  if (b>50000) 
			System.out.println("5000");
		 else if (b<499999) 
			System.out.println("3000");
			
		 }
		
		else System.out.println("Mate man..");
		
		
		

	}
}



