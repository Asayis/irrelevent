package Playaround;

import java.util.Scanner;

public class playaroundloops {

	public static void main(String[] args) {
		/*
		 * Write a program to ask a user to enter item they want to buy -- DONE and the
		 * price of that item. -- DONE Every time user enters money, accumulate the
		 * amount and tell the user how much is left to pay off. If user give more money
		 * program should return a change. Whenever a user done with payments program
		 * should say "Thank you for shopping!"
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("What item do you want to purchase");
		String item = scan.next();
		System.out.println("What amount is your item");
		double price = scan.nextDouble();

		
		
		while (price>0) {
		System.out.println("enter money:");
		double inputMoney = scan.nextDouble();
		price-=inputMoney;
		
		
		
		
		
		
			}
		}
}
		
		
		
		
		
		
		
		
		

