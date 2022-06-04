package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkTaskClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner input = new Scanner (System.in);
			
			System.out.println("What day is today? Please note 1 is Monday and Friday is 5");
			int day = input.nextInt();
			
			if (day <1 ) {
				System.out.println("Morning");
			}
			else if (day>5 && day <=7) {
				System.out.println("Its a weekend");
	}

	}
}
