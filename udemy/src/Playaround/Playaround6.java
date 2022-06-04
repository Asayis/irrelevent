package Playaround;

import java.util.Scanner;

public class Playaround6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * TASK 2: input a number if the number is below 100 then divide by 2 and output
		 * print the result and if its above 100 then times it by 2 and print result
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide a number: ");
		int number = scan.nextInt();

		if (number < 100) {
			 number = number / 2;
			System.out.println(number);
		} else {
			 number = number * 2;
			System.out.println(number);
		}

	}

}
