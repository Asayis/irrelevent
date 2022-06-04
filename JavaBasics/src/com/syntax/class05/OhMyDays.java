package com.syntax.class05;

import java.util.Scanner;

public class OhMyDays {

	public static void main(String[] args) {
	
	    Scanner input = new Scanner (System.in);
		
		System.out.println("What day is today? Please note 1 is Monday and Friday is 5");
		int day = input.nextInt();
		
		if (day <=5 ) {
			System.out.println("Its a weekday");
		}
		else if (day>5 && day <=7) {
			System.out.println("Its a weekend");
		}
		
		else {System.out.println("Invalid day");}

	}

}
