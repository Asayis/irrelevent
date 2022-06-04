package com.syntax.class05;

import java.util.Scanner;

public class DMVScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scan = new Scanner (System.in);
			
			System.out.println("Please enter your identifable age");
			int age= scan.nextInt();
			
			if (age >= 18) {
				System.out.println("issuing your driver license. Will be with you in the next 5 working days");
				
			} else {
				System.out.println("issuing your Learners permit. Will be with you in the next 5 working days");
			}
	}

}
