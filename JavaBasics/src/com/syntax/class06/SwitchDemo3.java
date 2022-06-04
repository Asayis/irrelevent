package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		/*
		 * let's ask a usder is he from
		 * based on the country we will define favorite food
		 * 
		 */

		Scanner scan = new Scanner (System.in);
		String country, favoriteFood;
		
		System.out.println("Please tell me where are you from?");
		country = scan.nextLine();	
		
		switch (country) {
		
		case "Turkey":
			favoriteFood="Menemen";
			break;
		case "Pakistan":
			favoriteFood="shorrm";
			break;
		case "Mexico":
			favoriteFood="taco";
			break;
		default: 
			favoriteFood="go to google.com";
			
		}
		System.out.println("you are from "+country+" and your favorite food is "+favoriteFood);
	}

}
