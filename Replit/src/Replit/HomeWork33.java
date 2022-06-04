package Replit;

import java.util.Scanner;

public class HomeWork33 {

	public static void main(String[] args) {

		/*
		 * Ask the user to enter any number if a user enters a number and it is even,
		 * print "Value is even", after that it should check if the number is greater
		 * than 1000 it should also print even number is large otherwise even value is
		 * just right. if number is not even it should print number is odd after that it
		 * should check if odd number is greater than 1000 it should say odd value is
		 * large otherwise odd value is just right
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any number");
		int number = scan.nextInt();
		
		int a = number % 2;

		if (a == 0) {
			System.out.println("Value is even");         
		if (a>1000) System.out.println("Even value is large");
		else System.out.println("Even value is just right");}
		
		else {System.out.println("Value is odd");
		if (a>1000) System.out.println("Odd value is large");
		else System.out.println("Odd value is just right");}
		
		}
	}
		
	


