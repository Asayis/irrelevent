package test1;

import java.util.Scanner;

public class HomeWorkShopping {

	public static void main(String[] args) {
		/* Write a program to ask user to enter value for sale: yes or no
		 * if there is no sale --> you are not going for shopping
		 * if there is sale ask user which item they want to buy and it’s price
		 * Based on the price you have to calculate the price of the item after the discount, discount rule: 
		 * if price is less than $20 --> apply 10%
		 * if price is between $20 & $100 --> 20%
		 * if price between $100 & $500 --> 30%
		 * otherwise apply 50% discount
		After discount ___ the price of the item reduce from __ to ___
                     */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter value for sale: yes or no");
		String YN= scan.next();
		double discount = 0.0;
		double perc=0.0;
		double price=0.0;
		
		if (YN.equalsIgnoreCase("Yes")); {
			System.out.println("Which Item do you want to buy");
			String item = scan.next();
			
			if (item<20) {
			discount= perc-(price*0.1);
			perc = 0.1;
			
			
			
			
			
			
			
			
			
			
			
			
			}
			
			
		}
		
	}
}


