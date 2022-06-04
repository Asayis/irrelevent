package com.syntax.class05;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("do you have credit card?");
		String creditcard=scan.nextLine();
		
		if (creditcard.equals("no")) {
			
		}
		 else {
			System.out.println("doesn't matter. What's your balance");
		 }
				
		
		System.out.println(creditcard);
	
		System.out.println("what is balance on the card?");
		
		int balance=scan.nextInt();
		System.out.println(balance);
		
		if (balance>=600 ) {
			System.out.println("they can spend more");
		}else {
			System.out.println("pleae pay off immedietly");
		}
		
		
		}
		
	}


