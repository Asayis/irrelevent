package com.syntax.class09;

public class HomeWork {

	public static void main(String[] args) {
/*
 * Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
 */
		String[] carname = new String[6];

		carname[0] = "BMW";
		carname[1] = "TESLA";
		carname[2] = "TOGG";
		carname[3] = "TOYOTA";
		carname[4] = "STADIA";
		carname[5] = "PSCAR";

		for (String car : carname) {
			System.out.println(car + " ");}
			
			System.out.println("-----------------");
			
		 String [] carr = {"BMW","TESLA", "TOGG","TOYOTA", "STADIA", "PSCAR"};
		for(String carlo:carr) {System.out.print(carlo+" ");}
		

	}

}
