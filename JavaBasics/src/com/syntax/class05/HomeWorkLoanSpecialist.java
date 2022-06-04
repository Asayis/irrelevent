package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkLoanSpecialist {

	/*
	 * You are a loan specialist and you need to ask user what 
	 * is the amount of loan is needed. If loan is 
	 * less or equal to 200,000 then you would lend the 
	 * money otherwise you would reject the client.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("what is the amount of loan is needed");
		int loan = scan.nextInt();
		
		if (loan >= 200000) {
			System.out.println("APPROVED");}
		 else if (loan <= 199999) {
		System.out.println("NEGATIVE");}
	}

	}

