package com.syntax.reviewclass4;

import java.util.Scanner;

public class HWShoppingThank {
public static void main(String[] args) {
	
	/*
	  Write a program to ask a user to enter item they want to buy and 
	  the price of that item. Every time user enters money, 
	  accumulate the amount and tell the user how much is left to pay off. 
	  If user give more money program should return a change.
	  Whenever a user done with payments program should say “Thank you for shopping!”
	 
	 */
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter Item name");
	String itemName = scan.next();
	System.out.println("Enter Item price");
	double itemPrice= scan.nextDouble();
	double totalPaid = 0;
	
	  
		
		while (totalPaid<itemPrice) {
		System.out.println("how much money you got");
		double singlePayment = scan.nextDouble();
		System.out.println("you have paid "+singlePayment);
		totalPaid= totalPaid+singlePayment;
		//totalPaid+=singlePayment;
		
		if (totalPaid<itemPrice) {
			System.out.println("Here is your balance "+(itemPrice-totalPaid)+".");
		} 
		else if (itemPrice==totalPaid) {
			System.out.println("You have paid the total amount of "+totalPaid+".");
		}		
		else{System.out.println("Here is your change of "+(itemPrice-totalPaid)*-1);
		} 
		}System.out.println("Thank you for shopping");
	
}
}

