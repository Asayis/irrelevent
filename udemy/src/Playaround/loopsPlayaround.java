package Playaround;

import java.util.Scanner;

public class loopsPlayaround {

	public static void main(String[] args) {
		/*
		 * Write a program to ask a user to enter item they want to buy -- DONE and the
		 * price of that item. -- DONE Every time user enters money, accumulate the
		 * amount and tell the user how much is left to pay off. If user give more money
		 * program should return a change. Whenever a user done with payments program
		 * should say "Thank you for shopping!"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Item you want?");
		String item = scan.next();
		System.out.println("you have " + item + ". Please add the price");
		double price = scan.nextDouble();
		double accumulatedPayment = 0.00;

		// variable needed acummulatedPayments payment price change
		// (ItemPrice<accumulatedPayment) change=accumulatedPayments - price

		while (price > accumulatedPayment) {
			System.out.println("enter money");
			double entermoney = scan.nextDouble();
			accumulatedPayment += entermoney;
			
			if (accumulatedPayment==price) {
				System.out.println("Thank you for shopping");
				
				System.out.println("do you want to donate");
				String yes = scan.next();
				
				if (yes.equalsIgnoreCase("yes")) {
					
					System.out.println("How much would you like to donate: (Yes, ");
					int donate = scan.nextInt(); 
					System.out.println("Thank you for donating "+donate+ "Please visit www.asayis.com");
					
					
				} else {
					System.out.println("All good.");
				
				}
				
			} else if (accumulatedPayment<price) {
				System.out.println("you have paid me a sum of"+accumulatedPayment+" you owe me"+ (price-accumulatedPayment));
				
			} else {
				System.out.println("Your change is "+(accumulatedPayment-price));
			}
			
		}

	}

}
