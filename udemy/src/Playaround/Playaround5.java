package Playaround;

import java.util.Scanner;

public class Playaround5 {
	public static void main(String[] args) {
		/*
		 * 
		 * TASK 1: create a scanner for user to input 2 colours red green or blue or
		 * yellow, based on 2 colours let the out put be as .e.g yellow banana and green
		 * peas.
		 * 
		 * TASK 2: input a number if the number is below 100 then divide by 2 and output
		 * print the result and if its above 100 then times it by 2 and print result
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first colour: (Red, Green, or Yellow)");
		String colour1 = scan.next();
		System.out.println("Please enter your Second colour: White, orange or purple");
		String colour2 = scan.next();
		
		if (colour1.equalsIgnoreCase("Yellow")) {
			colour1="Yellow Banana";
		} else if (colour1.equalsIgnoreCase("Green")) {
			colour1="Green Pea";

		} else if (colour1.equalsIgnoreCase("red")) {
			colour1="Red Apple";
			

		} else {
			System.out.println("Please select run again and enter: (Red, Green or Yellow)");
		}

		if (colour2.equalsIgnoreCase("White")) {colour2="white yogurt ";}
		 else if (colour2.equalsIgnoreCase("orange")) {
			colour2="Orange's orange";
		} else if (colour2.equalsIgnoreCase("purple")) {
			colour2="purple promogranite";

		} else {
			System.out.println("Please select run again and enter: (white, orange or purple)");
		}
		System.out.println(colour1 + " and " + colour2 + " are your two of your selections");
	}

}
